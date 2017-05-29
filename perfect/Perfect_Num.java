import java.util.Scanner;
class Perfect_Num
{
public static void main(String[] args)
{

 int n=0;
 int num;
 String str;

System.out.println("Enter a Number:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
str=sc.next();
for(int i=1;i<=num/2;i++)
{
if(num%i==0)
{
n=n+i;
}
}
if(n==num)
{
System.out.println("It is a Perfect Number");
}
else
{
System.out.println("It is Not a Perfect Number");
}
}
}

