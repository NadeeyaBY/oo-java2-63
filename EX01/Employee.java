public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public abstract double getExpense();
    public String toString(){;
        return name;
    }
}
class FullTime extends Employee{
    private double salary;
    public FullTime(String name, double salary){
        super(name);
        this.salary = salary;
    }
    public double getExpense(){
        return salary;
    }
    public String toString(){
        return super.toString() + " " + (int)salary + "";
    }
}
 class PartTime extends Employee {
    private double cost;
    private double hours;
    public PartTime (String name, double cost, double hours){
        super(name);
        this.cost = cost;
        this.hours = hours;
    }
    public double getExpense(){
        return hours*cost;
    }
    public String toString(){
        return super.toString() + " " + (int)cost + " x " + (int)hours + " = " + (int)(hours*cost); 
    }
 }

 class SalesMan extends Employee {
    private double divide;    
    private double salary;
    private double sales;
    public SalesMan(String name, double divide, double salary, double sales) {
        super(name);
        this.divide = divide;
        this.salary = salary;
        this.sales = sales;
    }
    public double getExpense(){
        return salary+(divide*sales);
    }
    public String toString(){
        return super.toString() + " " + (int)salary + " + " + "(" + divide + " x " + (int)sales + ") = " + (int)(salary +(divide*sales));
    }
 }