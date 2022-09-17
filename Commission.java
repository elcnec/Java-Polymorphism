  
 
public class Commission extends Hourly{
    private double totalSales;
    private double commissionsRate;

    public Commission(String eName, String eAdress, String ePhone, String socNumber, double Rate,double commissionsRate) {
        super(eName, eAdress, ePhone, socNumber, Rate);
        this.commissionsRate = commissionsRate;
    }
     public void addSales(double totalSales){
         this.totalSales += totalSales;
     }
    @Override
    public double pay(){
        double payment = super.pay()+(commissionsRate*totalSales);
        totalSales = 0;
        return payment;
    }
    @Override
     public String toString(){
         String result = super.toString();
         result+="\nTotal sales: "+totalSales;
         return result;
         
     }
}
