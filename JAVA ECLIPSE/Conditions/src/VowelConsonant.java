import java.util.Scanner;
public class VowelConsonant
{
public static void main(String[] args)
{
	char m;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character");
	m=sc.next().charAt(0);
	
	
	if(m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
	{
		System.out.println("it is vowel");
	}
	else
	{
		System.out.println("it is consonant");
	}
}
}
	
	 
	 
	
	
	
	
	
