package statement2;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] num= {5,1,13,2,5};
   int n=num.length;
   int sum = num[0];
   for(int i=0;i<n-1 ;i++)
   {	  
	   sum =sum+num[i+1];	 
   }
		System.out.println(sum);
	}

}
