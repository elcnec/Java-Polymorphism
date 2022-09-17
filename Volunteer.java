 
 
public class Volunteer extends StaffMember {

    public Volunteer(String eName, String eAdress, String ePhone) {
        super(eName, eAdress, ePhone);
    }
    
    @Override
    public double pay(){
        return 0.0;
    }
    
    
    
}
