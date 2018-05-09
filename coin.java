import java.util.*;
public class Coin 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of change ");
		int change = sc.nextInt();

			int ten = change/10;
			change=change%10;
			int five =change/5;
			change = change%5;
			int two=change/2;
			change=change%2;
			int one = change;
		System.out.println(ten +" " +five +" " +two +" " +one);
	}
}
