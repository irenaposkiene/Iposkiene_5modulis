import java.util.Scanner;

public class uzd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		  System.out.print("tris atkarpos : ");
		  int a= (int) reader.nextDouble();
		  int b= (int) reader.nextDouble();
		  int c= (int) reader.nextDouble();
		 
		  if (Math.pow(a, 2)== Math.pow(b, 2)+Math.pow(c, 2)||Math.pow(b, 2)== Math.pow(a, 2)+Math.pow(c, 2)||Math.pow(c, 2)== Math.pow(b, 2)+Math.pow(a, 2)) {
			  System.out.print("trikampis statusis ");
		  }
		  else if (a==b&&b==c&&a==c)
		  {
			  System.out.print("trikampis lygiakrastis: ");
		  }
		  else if (a==b||b==c||a==c)
		  {
			  System.out.print("trikampis lygiasonis: ");
		  }
		  else if (a!=b ||b!=c||a!=c)
		  {
			  System.out.print("trikampis ivairiasonis: ");
		  }
		  else if (a+b>c||a+c>b||a+c>a)
		  {
			  System.out.print("trikampis : ");
		  }
		  else
			  System.out.print("trikampio sudaryti negalima  ");
	}

}
