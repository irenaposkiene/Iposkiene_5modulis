import java.util.Scanner;

public class uzd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		  System.out.print("Įveskite saldainių maišelio kainą: ");
		  int x= (int) reader.nextDouble();
		  
		  System.out.print("Įveskite pinigų sumą skirtą saldainiams pirkti: ");
		  int y= (int) reader.nextDouble();
		  
		  
		  int k=40*y/27*x;
		  
		System.out.print("Gavo nepatenkinamus paz: "+k);
		  
		
	}

}
