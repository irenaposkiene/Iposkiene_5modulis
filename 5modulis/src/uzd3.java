import java.util.Scanner;

public class uzd3 {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	  System.out.print("Įveskite temperatūrą Kelvino skalėje: ");
	  double a= reader.nextDouble();
	

		
	System.out.print("Celsijaus laipsnių "+cel(a)+"\n");
	

	System.out.print("Farenheito laipsnių "+far(cel(a))+"\n");
	
	
	System.out.print("Reomiūro laipsnių\r\n" + 	" "+reo(cel(a))+"\n");
	
	
	
	}
		public static double cel (double x) {
			double kt= x-273.16;
			return kt;
	}
		
		public static double far (double x) {

			/*9·°C = 5·(°F – 32)*/
			double kt=  ((x *9)/5)+32;
			return kt;
	}
		
		public static double reo (double x) {

			double kt=x*0.8;
			return kt;
	}
	  
}
