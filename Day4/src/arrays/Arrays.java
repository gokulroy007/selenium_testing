package arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]= {{"testing tools", "Qtp", "UFT"}, {"A", "B", "C"}};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
			System.out.println(a[i][j]+" ");
			System.out.println();
			}
		}

	}

}
