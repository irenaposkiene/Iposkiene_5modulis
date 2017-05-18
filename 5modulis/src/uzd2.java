import java.util.Scanner;

public class uzd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		  System.out.print("Iveskite kubo kraštinės ilgį: ");
		  double a= reader.nextDouble();
		
		
		  System.out.print("Iveskite rutulio skersmenį : ");
		  double b= reader.nextDouble();
	
		 			 				
				System.out.print("Atsakymas: vandens turis "+turis(a,b)+"\n");
				
				System.out.print("Atsakymas: dezutes turis "+kturis (b)+"\n");
				
				System.out.print("Atsakymas: ritulio turis "+rturis (a)+"\n");
				
			}
	
	
	public static double kturis (double x) {
		double kt=Math.pow(x, 3);
		return kt;
		
			

}
	
	public static double rturis (double y) {
		double r =y/2;
		
		double pi=3.14159265359;
		double rt=4 *  pi * r * r * r / 3;
		return rt;
		
	}
	
	public static double turis (double x, double y) {
		
		
		double kt=Math.pow(x, 3);
		
		
		double r =y/2;
	
		double pi=3.14159265359;
		double rt=4 *  pi * r * r * r / 3;
		
		
		double vt= kt-rt;
		return vt;
		

}
}