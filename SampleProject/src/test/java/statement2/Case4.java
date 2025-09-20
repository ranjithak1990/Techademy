package statement2;

public class Case4 {

	public static void main(String[] args) {

		int a[][]= {{10,20},{30,40,50},{60}};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
		    {
				System.out.print(a[i][j]+" ");
		    }
			System.out.println();
		}
		
	}

}
