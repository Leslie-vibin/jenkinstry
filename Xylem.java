
import java.util.Scanner;
class Xylem 
{ static  Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("welcome to xylem");
		int number= sc.nextInt();
		int last= number%10;
	
		int num=0;
                
         ////need to do
		 
         number/=10;

		while(number>9)
		{
           num=num+(number%10);
			number/=10;
			}
		
  if ((number+last)==num)
		{
			System.out.println("the number is xylem");
		}
		else{
			System.out.println("the number is not a xylem");
		}




	}
}
