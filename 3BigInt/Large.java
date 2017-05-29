// Program to check the biggest number between three given integers.

class Large
	{
    	 public int x=5;
     	 public int y=5;
      	 public int z=5;


   		public static void main(String args[])
   			{
				Large obj=new Large();
      
       
				

     	   
 
      if ( obj.x > obj.y && obj.x > obj.z )
         System.out.println("First number is largest.");
      else if ( obj.y > obj.x && obj.y > obj.z )
         System.out.println("Second number is largest.");
      else if ( obj.z > obj.x && obj.z > obj.y )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}