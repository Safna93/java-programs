import java.util.Scanner;
public class Armstrong 
{
public static void main(String[] args) 
{
	int i,j,sum=0,n;
	
	for(j=100;j<500;j++)
	{
	n=j;
	while(n>0)
	{
		i=n%10;
		sum=sum+(i*i*i);
		n=n/10;
	
	}
	if(sum==j){
	
	System.out.println(+j);}
	sum=0;
	
	
	
}
}}
