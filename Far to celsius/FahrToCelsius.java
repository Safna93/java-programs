//program to find the farenaheat value of a given celcious value.


import java.util.Scanner;
 
class FahrToCelsius

 {
  public static void main(String[] args)


 {
    float temp;

    Scanner sc = new Scanner(System.in);      
    System.out.println("Enter temperatue in Fahrenheit");
    temp=sc.nextFloat();
 
    temp=((temp-32)*5)/9;
 
    System.out.println("Temperatue in Celsius = " + temp);
  }
}