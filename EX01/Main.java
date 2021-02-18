import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Company c = new Company("CoE");
        c.addEmployee(new FullTime("Jane", 30000));
        c.addEmployee(new SalesMan("John",0.1,10000,150000));
        c.addEmployee(new FullTime("Randy",18000));
        c.addEmployee(new PartTime("Josh",150,80));
        c.addEmployee(new PartTime("Marry",100,60));
        c.print();        

    }
}