# Rivera-Activities-1stSem2019-2020
“ Be yourself; everyone else is already taken.”  -oscar wilde
import java.text.DecimalFormat;
import java.util.Scanner;
public class shaperr{
public static void main (String []args){
DecimalFormat nadd = new DecimalFormat("#.##");
Scanner nad= new Scanner(System.in);
while(true){
try{
System.out.println("Select your choice and enter the number option");
System.out.println("(1)Circle-----(2)Triangle----- (3)Square----- (4)Rectangle ");
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
double areaCircle = Math.PI*radius*radius;
System.out.println("Area circle: "+  nadd.format(areaCircle));
System.out.print("Do you want to try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}else if(shape==2){
System.out.print("Enter base: ");
double base = nad.nextInt();
System.out.print("Enter Height: ");
double height = nad.nextDouble();
if(base <0||height <0){
System.out.println("INVALID INPUT!!!");
}else{
double areaTriangle = base*height;
System.out.println("Area of triangle: "+ nadd.format(areaTriangle));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}
}else if(shape==3){
System.out.print("Enter side: ");
double sidee = nad.nextDouble();
if(sidee<=-1){
System.out.println("INVALID VALUE!!!");
}else{
double areaSquare = sidee*sidee;
System.out.println("Area of Square: "+ nadd.format(areaSquare));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}
}else if(shape==4){
System.out.print("Enter base: ");
double basee = nad.nextDouble();
System.out.print("Enter height: ");
double heightt = nad.nextDouble();
if(basee<=-1 || heightt<=-1){
System.out.println("INVALID VALUE!!!");
}else{


double areaRectangle = basee*heightt;
System.out.println("Area of rectangle: "+ nadd.format(areaRectangle));
System.out.print("Try again?(yes/no): ");
String answer = nad.next();
if(answer.equalsIgnoreCase("no")){
System.out.println("done!");
break;
}
}
}
}catch(Exception a){
System.out.println("INVALID INPUT!!!");
nad.next();
}
}
}
}

On Mon, Oct 14, 2019 at 12:04 PM Nad nhad <antoniojham123@gmail.com> wrote:
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
