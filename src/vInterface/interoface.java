package vInterface;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



interface Student
{
	public void data();
	void printSt(avi i);
}
class avi implements Student
{
	int id;
	String nom;
	String prenom;
	Double age;
	
	public void data ()
	{
		String name="avinash";
		int rollno=68;
		System.out.println(name);
		System.out.println(rollno);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		System.out.println(""+ "\n" +"Affichage avec Tostring");
		
		
		return  "id = " + id + "" + "\n" +
				"nom = " + nom + "" + "\n" 
				+ "prenom = " + prenom + " " + "\n" 
				+ "age = " + age + "";
	}
	@Override
	public void printSt(avi i) {
		// TODO Auto-generated method stub
		
	}
	public avi(int id, String nom, String prenom, Double age) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public avi() {
		super();
	}
	
}
public class interoface
{
	public static void main (String args [])
	{
		avi h= new avi();
		System.out.println(" 1  2  3  4  5  6  7  8  9" + "\n" + "----------Separateur de ligne ------------------"	+ "\n" +"Nom :"  );

		h.data();
		
		avi v=new avi(1,"fdg","hk",12.3);
		System.out.println(v.toString());
		
		//afichage format json  \n\r
		System.out.println("Affichage format json  : "  );
	            try {
					System.out.println(toJson(v));
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
	        }
	        	 
	}
	 public static String toJson(Object o) throws JsonProcessingException {
		    ObjectMapper objectMapper=new ObjectMapper();
		     return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);

     }
}
