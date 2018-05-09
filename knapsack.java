import java.util.*;
public class Knapsack {
	public static void main(String[] args)
	{	double size;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the capasity of knapsack");
		size=sc.nextDouble();
		System.out.println("enter the number of items");
		int n=sc.nextInt();
		double w[]=new double[n];
		double p[]=new double[n];
		System.out.println("enter the weight of the elements");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the weight of element 	" +(i+1));
			w[i]=sc.nextDouble();
		}
		System.out.println("enter the profit of the elements");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the profit of element 	" +(i+1));
			p[i]=sc.nextDouble();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if((p[j]/w[j])<(p[j+1]/w[j+1]))
				{
					double temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
					double tem=w[j];
					w[j]=w[j+1];
					w[j+1]=tem;
				}
			}
		}
		int i=0;
		double weight=0,profit=0,f=0;
		while(size>=w[i])
		{
			weight=w[i]+weight;
			profit=profit+p[i];
			size=size-w[i];
			i++;
			if(i>=n)
				break;
			
		}
		if(size<w[i])
		{
			f=(size/w[i]);
			profit=profit+(f*p[i]);
			size=size-w[i];
			i++;
		}
		System.out.println("the profit is " +profit);
		}
}
