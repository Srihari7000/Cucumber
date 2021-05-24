import java.util.Scanner;

public class Area_of_circle {class Area
{
	double area;
	Area(double r)
	{
	 area= (22*r*r)/7;
 
	}
}
static class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
     
      System.out.println("Area of Circle is: " );      
   }
 }

}
