
import java.util.Scanner;

public class uzd1 {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		  System.out.print("Iveskite skelsmeni : ");
		  double d= reader.nextDouble();
		
		
		  System.out.print("Iveskite ap. zieves stori : ");
		  double a= reader.nextDouble();
	
		  
		  plotas(d,a);
		  
		  System.out.print("Atsakymas: "+   plotas(d,a));
		
	}
		
		public static double plotas (double x, double y) {
			
			double p=3.14159265359;
			
			double r =x/2-y; 
			
			return 4* (p*Math.pow(r, 3))/3;	
			
			

	}
		
		
	}