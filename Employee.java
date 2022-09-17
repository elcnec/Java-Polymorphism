 
package firm;

 
public class Employee extends StaffMember {
    
    protected String socialNumber;
    protected double payRate;

    public Employee( String eName, String eAdress, String ePhone,String socNumber, double Rate) {
        super(eName, eAdress, ePhone);
        socialNumber = socNumber;
        payRate = Rate;
    }

    @Override
    public String toString() {
        
        String result = super.toString();
        result += "\nSocial number: "+socialNumber;
        return result;
    }
    
    @Override
    public double pay(){
        return payRate;
    }
    
}
