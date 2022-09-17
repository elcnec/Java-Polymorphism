 
 
public class Staff {
    
    StaffMember [] staffList;
    public Staff(){
        staffList    = new StaffMember[8];
        staffList[0] = new Executive("Ahmed", "Abha 10205", "0505623840", "1102499249", 5);
        staffList[1] = new Employee("Ali", "Jubail", "050864777", "110233366", 6);
        staffList[2] = new Employee("Abdul", "Dammam 2012", "0552367856", "11023666", 9);
        staffList[3] = new Hourly("Jane", "Los Angeles 11033.", "769 2522 588 ", "6695575", 4);
        staffList[4] = new Volunteer("John", "NY 9985", " 98605080 ");
        staffList[5] = new Commission("Lina", "Miami 12255", "1123699 ", "1212271", 5, 9);
        staffList[6] = new Commission("Alia", "Delhi 15266", "121212","545656", 6, 7);
        staffList[7]= new Commission("Ulay", "5566", "77896669", "41144101", 4, 99);
        
        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);
        
        ((Commission)staffList[6]).addHours(35);
        ((Commission)staffList[6]).addSales(400);
        
        ((Commission)staffList[7]).addHours(40);
        ((Commission)staffList[7]).addSales(950);
    }
    
    public void payday(){
        double amount;
        for (int count = 0; count<staffList.length;count++){
            System.out.println(staffList[count]);
            amount = staffList[count].pay();
            if(amount ==0){
                System.out.println("Thanks: ");
                
            }
            else {
                System.out.println("Paid: "+amount);
            }
            System.out.println("------------------------------------");
        }
        
    }
}
