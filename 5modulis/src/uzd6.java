import java.util.Scanner;

public class uzd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		  System.out.print("Kada autobusas išvyko iš Vilniaus: ");
		  int vi= (int) reader.nextDouble();
		
		  int mi= (int) reader.nextDouble();
			
		  System.out.print("Kiek laiko autobusas važiavo iš Vilniaus į Panevėžį");
		  int vp= (int) reader.nextDouble();
			
		  int mp= (int) reader.nextDouble();
			
		  System.out.print("Kelias minutes autobusas stovėjo Panevėžyje?");
		  int ms= (int) reader.nextDouble();
		  
		  
	
		  System.out.print("Kiek laiko autobusas važiavo iš Panevėžį i R");
		  int vr= (int) reader.nextDouble();
			
		  int mr= (int) reader.nextDouble();
		  
		/* int x=(vi*60)+mi+(vp*60)+mp+ms+(vr*60)+mr;*/
		 
		 int x=(vi)+(mi/60)+(vp)+(mp/60)+(ms/60)+(vr)+(mr/60);
		 
		 if (x>24||x==24) {
			 x=x-24;
			 System.out.print(" Autobusas į Rygą atvyks" +x);
				
		 }
		  
		 	/*		 System.out.print(" Autobusas į Rygą atvyks" +x);*/
		 
	
	}
}
