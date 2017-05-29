import java.util.Scanner;
class MatrixAdd
  {
       public static void main(String args[])
  {
       
       int r,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the num of rows");
       r=sc.nextInt();
       
       Scanner sc1=new Scanner(System.in);
       System.out.println("Enter the num of cols");
       
       c=sc1.nextInt();
       
       int one[][]=new int[r][c];
       int two[][]=new int[r][c];
       int three[][]=new int[r][c];
       
       
       System.out.println("Enter the elements of matrix a");
       
       
       for(int i=0;i<r;i++)
    {
		       for(int j=0;j<c;j++)
		    {
		       one[i][j]=sc1.nextInt();
		    }
    }
       System.out.println("Enter the elements of matrix b");
       
       
       for(int i=0;i<r;i++)
    {
			       for(int j=0;j<c;j++)
			    {
			       two[i][j]=sc1.nextInt();
			    }
    }
       
       
       System.out.println("Adding matrices...");
    {
       for(int i=0;i<r;i++)
    {
       for(int j=0;j<c;j++)
    {
		       
		       three[i][j]=one[i][j]+two[i][j];
		  
    }
    }
       System.out.println("the sum is:");
       
       
       for(int i=0;i<r;i++)
    {
		       for(int j=0;j<c;j++)
		    {
		       System.out.print(three[i][j]+"   ");
		    }
		       System.out.println();
       
    }
       
    }
  }
  }
    
  