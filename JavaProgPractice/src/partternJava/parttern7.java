package partternJava;

public class parttern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=4; i++)
		{
			for(int j= 3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k= 1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}