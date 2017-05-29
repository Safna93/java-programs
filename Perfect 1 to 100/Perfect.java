

//display all the perfect numbers from 1 to 100



public class Perfect
{


  public static void main(String[] args)
  {
int number=0;
int total=0;
int LIMIT=100;

    


    for(number=1;number<=LIMIT;number++)
    {
      if((number!= 1) &&(total==(number-1)))
      System.out.println((number-1)+"is a perfect number");
      total=0;
      for(int divider=1;divider<number;divider++)
      {
        if((number%divider)==0)
      total+=divider;
      }
    }
  }
}