import java.util.*;
public class Hamilton {
	static int n;
	static int a[][];
	
	static int x[];
	public static void main(String[] args){
		System.out.println("enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the value of a");
		a =new int [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		x=new int[n];
		x[0]=0;
		for(int i=1;i<n;i++){
			x[i]=-1;
		}
		getHcycle(1);
	}

public static void getHcycle(int k){
	while(true){
		nextvalue(k);
		if(x[k]==-1)
			return;
		if(k==n-1){
			System.out.println("\nsolution");
			for(int i=0;i<n;i++){
				System.out.println((x[i]+1)+" ");
				System.out.println(1);
			}
		}
		else
			getHcycle(k+1);
	}
}
		

	public static void nextvalue(int k){
		int i=0;
		while(true){
			x[k]=x[k]+1;
			if(x[k]==n){
				x[k]=-1;
			}
			if(x[k]==-1)
				return;
			if(a[x[k-1]][x[k]]==1){
				for(i=0;i<n;i++){
					if(x[i]==x[k])
						break;
				}
			if(i==k)
				if(k<n-1||k==n-1 && a[x[n-1]][0]==1)
					return;
			}
		}
	}
}
