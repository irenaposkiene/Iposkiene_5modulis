import java.util.Scanner;

public class uzd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		  System.out.print("dėžutės, kurių išoriniai matmenys yra: ");
		  int a= (int) reader.nextDouble();
		  int b= (int) reader.nextDouble();
		  int c= (int) reader.nextDouble();
		  System.out.print("ir: ");
		  int a1= (int) reader.nextDouble();
		  int b1= (int) reader.nextDouble();
		  int c1= (int) reader.nextDouble();
		  
		  if ((a<100||b<100||c<100)&&(a1<100||b1<100||c1<100)&&(a<a1&&b<b1&&c<c1)) {
			  
			  System.out.print("pirma dezutetelpa i antra: ");
		  }
		  else if ((a<100||b<100||c<100)&&(a1<100||b1<100||c1<100)&&(a==a1||b==b1||c1==c))
		  {
			  System.out.print("dezutes vienodos: ");
		  }
		  else if ((a<100||b<100||c<100)&&(a1<100||b1<100||c1<100)&&(a1<a&&b1<b&&c1<c))
		  {
			  System.out.print("antra dezute telpa i pirma: ");
		  }
		
	}

}
