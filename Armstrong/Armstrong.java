import java.util.Scanner;
class Armstrong_Ex2 {
	
	int start, end;
	Scanner scan;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		System.out.println("Find Armstrong Numbers..");
		
		System.out.println("\nEnter the Staring value : ");
		start = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the End value : ");
		end = Integer.parseInt(scan.nextLine());
	}
 
	void armstrong() {
		
		System.out.println();
		
		for(int i=start; i<end; i++) {
			
			int temp = i;
			int sum = 0;
			int mod = 0;
			
			while(temp != 0) {
				
				mod = temp % 10;
				sum = sum + (mod * mod * mod);
				temp = temp / 10;
			}
			
			if(sum == i) 
				System.out.println(i + " is an Armstrong number");
		}		
	}
}
 
public class Armstrong{
	
	public static void main(String args[]) {
		
		Armstrong_Ex2 obj = new Armstrong_Ex2();
		
		obj.getVal();
		obj.armstrong();
	}
}