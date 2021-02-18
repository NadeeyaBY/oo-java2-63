import java.util.*;
public class Company{
    private String title;
    private ArrayList<Employee> employees;

    public Company(String title){
        this.title = title;
        this.employees = new ArrayList<Employee>();
        
    }

    public String getTitle(){
        return title;
    }

    public void addEmployee(Employee e){
        this.employees.add(e);

    }

    public double getTotalExpense(){
        double total = 0;
        for(Employee employee : this.employees){
            total += employee.getExpense();
        }
        return total;
    }
    

    public void print(){
        double total = getTotalExpense();
        for(Employee employee : this.employees){
            System.out.println(employee);
        }
        System.out.printf("%s = %.0f\n", this.title,total);
    }
}