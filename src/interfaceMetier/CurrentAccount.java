package interfaceMetier;
//CurrentAccount.java
//Class CurrentAccount

class CurrentAccount implements Account {
 private double balance;
 private double overdraftLimit;

 public double getOverdraftLimit() {
	return overdraftLimit;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public CurrentAccount(double initialDeposit, double overdraftLimit) {
     this.balance = initialDeposit;
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }

 public void setOverdraftLimit(double overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }
}
