package interfaceMetier;

import java.util.ArrayList;
import java.util.List;





//Bank.java
//Class Bank

class Bank {
 private static List<Account> accounts=null;

 public Bank() {
     accounts = new ArrayList<>();
 }

 public void addAccount(Account account) {
     accounts.add(account);
 }

 public void removeAccount(Account account) {
     accounts.remove(account);
 }

 public void deposit(Account account, double amount) {
     account.deposit(amount);
 }

 public void withdraw(Account account, double amount) {
     account.withdraw(amount);
 }

 public void printAccountBalances(Account account) {
	 System.out.println("Balance =  "+account.getBalance());
 }
 
 public static void printAccount(Account account){
	 try {
		
		
			System.out.println("Liste des comptes : ");
		 System.out.println("Balance =  "+account.getBalance());
		
		 if(account instanceof SavingsAccount){
		     System.out.println("le compte est saving account ,le Rate ="+ ((SavingsAccount)account).getInterestRate());
		 }
		 if(account instanceof CurrentAccount){
System.out.println("compte courrant : Overdraft="+ ((CurrentAccount)account).getOverdraftLimit());
		 } 
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
