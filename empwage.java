import java.util.Random;
import java.io.*;

class empwage
{

	public static boolean isPresent()
	{
		Random rand=new Random();
		int random=rand.nextInt(100)%2;
		return random==1?true:false; 
	}

	public static void main(String[] args)
		{
		System.out.println("Computation");
			if(isPresent())
			{
				System.out.println("Present");
			}
			else
			{
				System.out.println("Absent");
			}
		}
}
