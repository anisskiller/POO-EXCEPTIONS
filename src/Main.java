import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Saisir votre 1er entiers");
		
		String chiffre1 = sc.nextLine();
		 int result = 0;
		 
		 
		 while(!chiffre1.isEmpty()) {
			 
			 try {
			
				 result += Integer.parseInt(chiffre1);
				 System.out.println("Total :" + result);
			
				 System.out.println("Saisir d'autres entiers");
				 chiffre1 = sc.nextLine();
			
			 }
			 
			 catch(NumberFormatException e){
		
					chiffre1 = "0";
				}
			
		}
		 System.out.println("Fin du programme total = " + result);
			 
	 }
	
	
	
}


