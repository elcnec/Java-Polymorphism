 
public abstract class StaffMember {
    
    protected String name;
    protected String adress;
    protected String phone;
    
    public StaffMember(String eName,String eAdress,String ePhone){
        name = eName;
        adress = eAdress;
        phone = ePhone;
        
    }

    @Override
    public String toString() {
        
        String result = "Name: "+name+"\n";
        result += "Adress: "+adress+"\n";
        result += "Phone: "+phone;
        return result;
    }
    public abstract double pay();
        
    
}
