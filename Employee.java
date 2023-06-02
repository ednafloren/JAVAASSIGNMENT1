public class Employee {
    String name,jobtitle;
    double salary;

public Employee(String name,String jobtitle,double salary){
    this.name=name;
    this.jobtitle=jobtitle;
    this.salary=salary;
}

// getter for salary
private double getSalary(){
    return salary;
}

// method for  updating
private void  setSalary(double salary){
    this.salary=salary;
}
// method for calculating the salary 
private void  calculateSalary(double percentage){
    salary= salary+salary*percentage/100;
    
}
public static void main(String[]args) {
// Creating objects
Employee employee1=new Employee("JOHN", "Manager",3000);
// Updating salary
employee1.setSalary(4000);
System.out.println(employee1.getSalary());

// Calculating the salary raise
employee1.calculateSalary(20);

System.out.println("New salary");
System.out.println(employee1.getSalary());

}
}

