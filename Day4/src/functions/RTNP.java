package functions;

public class RTNP {
	
	public void add()
	{
		int a=3;
		int b=2;
		int c=a+b;
		return c;
		
	}
	public void sub()
	{
		int a=5;
		int b=2;
		int c=a-b;
		return c;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NRWP a1=new NRWP();
		
		a1.add();
		System.out.println();
		a1.sub(5, 2);
		System.out.println();

	}

}
