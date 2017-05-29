//Program to display whether a given number is palindrome?


import java.util.Scanner;

class Palindrome
{  
  public int r=0;
  public int sum=0;
  public int temp;    
  public int n=454;
 public static void main(String args[])
{  
  Palindrome obj=new Palindrome();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=sc.nextInt();

  
	
  obj.temp=obj.n;    
  while(obj.n>0){    
   obj.r=obj.n%10;  //getting remainder  
   obj.sum=(obj.sum*10)+obj.r;    
   obj.n=obj.n/10;    
  }    
  if(obj.temp==obj.sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  