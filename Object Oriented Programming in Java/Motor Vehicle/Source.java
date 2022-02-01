abstract class MotorVehicle 
{
    public String DriveStatus; 
    public abstract String DriveVehicle(); 
    MotorVehicle()
    {
        DriveStatus="Preparing for drive"; 
    } 

    public void setDriveStatus(String s) { 
        DriveStatus=s; 
    } 
    public String getDriveStatus() {
        return DriveStatus;
    }
}
class TwoWheeler extends MotorVehicle 
{ 
    public String DriveVehicle()
    {
        return "You are driving two wheeler";
    }
}
    
class FourWheeler extends MotorVehicle 
{
    public String DriveVehicle()
    {
        return "You are driving four wheeler";
    }
} 

public class Source
{
    public static void main(String[] args) {
        
        TwoWheeler t=new TwoWheeler();
        System.out.println(t.DriveStatus); 
        System.out.println(t.DriveVehicle());

        FourWheeler f=new FourWheeler();
        System.out.println(f.DriveStatus); 
        System.out.println(f.DriveVehicle());
    }
}


