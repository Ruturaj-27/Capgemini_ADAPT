import java.util.*;
import java.io.*;

class Doctor
{
    private int doctorId;
    private String doctorName, location;

    Doctor(int i,String n,String l)
    {
        doctorId = i;
        doctorName = n;
        location = l;
    }

    public void setDoctorId(int i) {
        doctorId = i;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Location: "+location);
    }
}

class SpecialistDoctor extends Doctor
{
    private String specialist;

    public void setSpecialist(String s) {
        this.specialist = s;
    }

    public String getSpecialist() {
        return specialist;
    }

    SpecialistDoctor(int i,String n,String l,String s)
    {
        super(i, n, l);
        specialist = s;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("Specialist: "+specialist);
    }
}

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();

        if(t.equalsIgnoreCase("Specialist"))
        {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else if(t.equalsIgnoreCase("Doctor"))
        {
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }
}
