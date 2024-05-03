package hotelsystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Waiter extends Employee  implements OvertimeEmployee
{
  
    private static final double BasicSalary=1500;
    private double OvertimeHours;
    private static final double HourRate=50;
    private double d;
    private double TotalSalary;
    public Waiter() 
    {
        
    }
    public Waiter(int OvertimeHours, double d, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender)
    {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.OvertimeHours = OvertimeHours;
        this.d =d;
    }
public Waiter(Waiter w)
{
    super(w);
    this.OvertimeHours = w.OvertimeHours;
    this.d = w.d;
}
      @Override
    public double GetTotalSalary(double OvertimeHours,double d)
    {
        TotalSalary=BasicSalary+(OvertimeHours*HourRate)-d;
        return TotalSalary;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }
    
    
    @Override
    public String toString() 
    {
        return "Waiter\n" + "OvertimeHours= " + OvertimeHours + "\ndeductions= " +d+ "\nTotalSalary= " + GetTotalSalary(OvertimeHours,d) ;
    }
    @Override
    public void info()
    {
         String name=JOptionPane.showInputDialog(null,"Enter Name");
          int nationalId=Integer.parseInt(JOptionPane.showInputDialog(null, "enter national id"));
           int number=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your number"));
            String nationality=JOptionPane.showInputDialog(null,"enter nationality");
             String email=JOptionPane.showInputDialog(null,"Enter email");
             int age=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your age"));
               String gender=JOptionPane.showInputDialog(null,"Enter gender");
                int overtime=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your overtime"));
                 int deduction=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your deduction"));
                 String address=JOptionPane.showInputDialog(null,"enter your address");
                 int id=Integer.parseInt(JOptionPane.showInputDialog(null,"entyer your id"));
            Waiter x= new Waiter(overtime,deduction,address,id,name,nationalId,number,nationality,email,age,gender);
            JOptionPane.showMessageDialog(null, x.toString());
    }
}
