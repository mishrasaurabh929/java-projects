import java.util.*;
public class Dijkstra {
	static int n;
	static int a[][]=new int[100][100];
	static int s;
	static int vt[]=new int[100];
	static int p[]=new int[100];
	static int d[]=new int [100];
	public static void main(String args[]){
		System.out.println("enter the value of n\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the adjacency matrix\n");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the source\n");
		s=sc.nextInt();
		dijk(a,s,n);
		display(s,n);
		
	}
	static void dijk(int a[][],int s,int n){
		int u=-1,v,i,j,min;
		for(i=0;i<n;i++){
			vt[i]=0;
			p[i]=-1;
			d[i]=999;		
		}
		d[s]=0;
		for(i=0;i<n;i++){
			min=999;
			for(j=0;j<n;j++){
				if(d[j]<min && vt[j]==0){
					min=d[j];
					u=j;
				}
			}
			vt[u]=1;
			for(v=0;v<n;v++){
				if((d[u]+a[u][v]<d[v]) && (u!=v && vt[v]==0)){
					d[v]=d[u]+a[u][v];
					p[v]=u;
				}
			}
		}
	}
	static void path(int v,int s){
		if(p[v]!=-1){
			path(p[v],s);
			if(v!=s){
				System.out.println(v);
			}
		}
	}
	static void display(int s,int n){
		for(int i=0; i<n ;i++){
			if(i!=s){
				System.out.println(s);
				path(i,s);
				System.out.println("="+d[i]+"\n");
				
			}
		}
	}
}
