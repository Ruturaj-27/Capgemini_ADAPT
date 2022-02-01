import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SalariedEmployee 
{
	private double salary; 													//annual
	
	public SalariedEmployee() {
		salary = 0;
	}
	public SalariedEmployee(double theSalary) {
		this.salary = theSalary;
	}
	public SalariedEmployee(SalariedEmployee originalObject) {
		salary = originalObject.salary;
	}
	public double getSalary() {
		return salary;
	}
	public double getPay() {
		return salary/12;
	}
	public void setSalary( double newSalary) {
		if (newSalary >= 0)
        salary = newSalary;
	}
	public String toString() {
		return ( salary + " per year");
	}
	public boolean equals(SalariedEmployee other) {
		return (salary == other.salary);
	}
}

class Doctor extends SalariedEmployee
{
    String newline = System.lineSeparator();
     private String special;
     private double fee;
     
     Doctor() {}
     
     Doctor(String special, double fee, double pay) {
         super(pay);
         this.special = special;
         this.fee = fee;
     }
     void setSpecial(String special) {
         this.special = special;
        }
        String getSpecial() {
            return special;
        }
        void setFee(double fee) {
            this.fee = fee;
        }
        double getFee() {
            return fee;
        }
        public String toString()
        {
           return "Doctor specialty is:"+getSpecial()+newline+"Pay of Doctor:"+getPay()+newline+"Visitor Fee:"+getFee(); 
        }   
        public boolean equals(Doctor other)
        {
           return (getSalary() == other.getSalary() && special.equals(other.special));
        }
   }
   
   
   // Class name should be "Source",
   // otherwise solution won't be accepted
   public class Source {
       public static void main(String args[] ) throws Exception {
           /* Enter your code here. Read input from STDIN. Print output to STDOUT */
           Doctor doc1 = new Doctor("Obstetrician", 500, 2250.3);
           Doctor doc2 = new Doctor();
           doc2.setFee(500);
           doc2.setSalary(2250.3);
           doc2.setSpecial("Obstetrician");

           System.out.println("\nDoctor 1\n" + doc1.toString()); 
           System.out.println("\nDoctor 2\n\nDoctor Speciality is:"+ doc2.getSpecial() + "\nPayof Doctor: " + doc2.getSalary() + "\nVisit Fee:"+doc2.getFee());
           System.out.println("\nDoctor 1 Equals to Doctor 2?"+doc1);
       }
   }