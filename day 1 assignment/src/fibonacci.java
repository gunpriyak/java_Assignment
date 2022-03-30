
public class fibonacci {
		public static void main(String args[]) {
			int i,j,n1=1,n2=1,n3,total,count=20;
			int a[]= {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};
			int n=20;
			total=1;
			for(i=0;i<n;i++) {
				total+=a[i];
			}
			System.out.println("Average is:"+total/(float)n);
			System.out.println(n1+" "+n2);
			for(i=2;i<count;++i) {
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
			
		}

	}