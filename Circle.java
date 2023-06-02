// Creating the class circle and declaring its variables
public class Circle{
    double radius;
// Creating the class constructor
public  Circle(double radius){
    this.radius=radius;
}
// getter radius
private double getRadius(){
    return radius;}
// setter for radius
private void setRadius(double radius){
   this.radius=radius;
}

// method for finding the area
private double Area(){
 return  3.14*Math.pow(radius,2);
}
// method for finding the circumference
private double Circumference(){
    return  2*3.14*radius;
   }
// Creating objects
public static void main(String[] args) {
Circle circle1=new Circle(1.4);
circle1.setRadius(1.5);
System.out.println(circle1.getRadius());
System.out.println("Area = "+circle1.Area());
System.out.println("Circumference = "+circle1.Circumference());

}

}