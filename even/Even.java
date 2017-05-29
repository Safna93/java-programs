//Program to display all even numbers from 1 to 50.

public class Even
 { public int limit = 50;
public int i;
 
        public static void main(String[] args) {
               
                Even obj=new Even();
                
               
                System.out.println("Printing Even numbers between 1 and 50"+obj.limit);
               
                for(obj.i=1;obj.i<=obj.limit;obj.i++)
{
                       
                        
                        if( obj.i % 2 == 0){
                                System.out.print(obj.i + " ");
                        }
                }
        }
}
 