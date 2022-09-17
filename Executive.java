 
 
public class Executive  extends Employee {
    
    private double bonus;

    public Executive(String eName, String eAdress, String ePhone, String socNumber, double Rate) {
        super(eName, eAdress, ePhone, socNumber, Rate);
        bonus =0;
        
    }
    public void awardBonus(double execBonus){
        bonus =execBonus;
    }
    @Override
    public double pay(){
        double payment =super.pay()+bonus;
        bonus =0;
        return payment;
    }
    
}
