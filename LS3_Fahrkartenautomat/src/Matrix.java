import java.util.Scanner;
public class Matrix {
	
	public static void main(String[] args) {
		System.out.println("Bitte geben sie eine Zahl zwischen 2 und 9 ein: ");
		//Quersummen Berechnung folgt noch!!! 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<=99; i++) {
			String s = String.valueOf(i);
			//Ersetze alle Zahlen (bzw. Zeichen), die ohne rest durch 0 teilbar sind,
			//oder den Wert n beinhalten oder die Quersumme = n ist.
			//s.contains schaut in diesem Fall nach, ob das gewünschte Element im String
			//zu finden ist. Hierzu wird der Wert von n mittels String.valueOf(arg) in einen
			//String umgewandelt
			if(i%n == 0|| s.contains(String.valueOf(n))) {
				s = "*";
			}
			System.out.printf("%5s",s);
			//Setze bitte bei den 9er Stellen einen Umbruch
			if((i+1)%10 == 0) {
				System.out.println(" ");
			}
		}
	}
}
