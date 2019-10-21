
import java.text.DecimalFormat;
import java.util.Scanner;
public class shaperr{
public static void main (String []args){
Scanner nad= new Scanner(System.in);
DecimalFormat nadd = new DecimalFormat("#.##");
while(true){
try{
System.out.println("Select your choice and enter the number option");
System.out.println("(1)circle-----(2)triangle----- (3)square----- (4)rectangle ");
System.out.print("Enter shape: ");
int shape = nad.nextInt();
int circle = 1;
int Triangle = 2;
int Square = 3;
int Rectangle = 4;
if(shape<=0 || shape>=5 ){
System.out.println("INVALID INPUT!!!");
}else if(shape==1){
System.out.print("Enter radius: ");
double radius = nad.nextDouble();
double radiuss = radius*radius;
double areaCircle = Math.PI*radiuss;
System.out.println("Area circle: "+  nadd.format(areaCircle));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}else if(shape==2){
System.out.print("Enter base: ");
double base = nad.nextInt();
double height = nad.nextDouble();
double areaTriangle = base*height;
System.out.println("Area of triangle: "+ nadd.format(areaTriangle));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;

}
}else if(shape==3){
System.out.print("Enter side: ");
double sidee = nad.nextDouble();
double areaSquare = sidee*sidee;
System.out.println("Area of Square: "+ nadd.format(areaSquare));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}else if(shape==4){
System.out.print("Enter base: ");
double basee = nad.nextDouble();
System.out.print("Enter height: ");
double heightt = nad.nextInt();
double areaRectangle = basee*heightt;
System.out.println("Area of rectangle: "+ nadd.format(areaRectangle));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}
}catch(Exception a){
System.out.println("INVALID INPUT!!!");
nad.next();
}
}
}
}
