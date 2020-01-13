package staff;


public abstract class Employee {
    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        if(amount > 0){
            this.salary += amount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
