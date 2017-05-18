import java.util.Scanner;

public class uzd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		  System.out.print("Įveskite mokiniu skaiciu: ");
		  int x= (int) reader.nextDouble();
		

		int y = 1;
		if (x<49||y>0) {
			x = (1/7*x)+(1/3*x)+(1/2*x)+(y*x);
		
		}
		System.out.print("Gavo penketus: "+(x/7));
		System.out.print("Gavo ketvertus: "+(x/3));
		System.out.print("Gavo trejetus: "+(x/2));
		System.out.print("Gavo nepatenkinamus paz: "+y);
		
	
	}

}
