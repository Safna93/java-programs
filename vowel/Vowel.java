// Program to check a given character is vowel or consonant?


class Vowel
{

	char ch='a';
	public static void main(String[] args)
	{
		Vowel obj=new Vowel();
		
		char c=obj.ch;

		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("vowel");
		}
		else
			System.out.println("consonant");


	}
}
