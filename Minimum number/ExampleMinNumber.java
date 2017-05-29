public class ExampleMinNumber{ 
   /** returns the minimum of two numbers */
   public static int less(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }

   
   public static void main(String[] args) {
      int a = 11;
      int b = 6;
      int c = less(a, b);
      System.out.println("Minimum Value = " + c);
   }

}