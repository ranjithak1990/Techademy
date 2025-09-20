package statement3;

public class Case1 {
	static int length;
	 static int breadth;
	public Case1()	
	{
		this.length=10;
		this.breadth=10;
	}
	public Case1(int length,int breadth)	
	{
		this.length=length;
		this.breadth=breadth;
	}

	public static void main(String[] args) {

      Case1 cas=new Case1();   
      System.out.println(length+ " "+breadth);	
      

      Case1 cas1=new Case1(15,16);   
      System.out.println(length+ " "+breadth);	

		
	}

}
