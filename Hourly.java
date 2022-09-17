 
public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String eName, String eAdress, String ePhone, String socNumber, double Rate) {
        super(eName, eAdress, ePhone, socNumber, Rate);
        hoursWorked = 0;
    }
    
    public void addHours(int moreHours){
        hoursWorked += moreHours;
    }
    @Override
    public double pay(){
        double payment = payRate*hoursWorked;
        hoursWorked = 0;
        return payment;
    }
    @Override
    public String toString(){
        String result = super.toString();
        result +="\nCurrent hours: "+hoursWorked;
        return result;
    }
    
}
