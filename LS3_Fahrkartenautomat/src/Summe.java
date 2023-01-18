import java.util.Scanner;
public class Summe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie eine Zahl ein: ");
		int n = sc.nextInt();
		int j = n; //für die 2. Schleife
		System.out.println("Die Zahl wird (vorwaerts) addiert.");
		int summe = n;
		while(n>0) {
			System.out.println(n);
			summe = summe+n-1;
			n--;
		}
		System.out.println("Ihr Ergebnis betraegt: " + summe +"\n");
		summe = j; //Summe zurücksetzen, damit sie korrekt wiedergegeben wird.
		System.out.println("Die Zahl wird (rueckwaerts) addiert");
		for(int i = 1; j > 0; i++) {
			System.out.println(j-j+i);
			summe = summe+j-1;
			j--;
		}
		System.out.println("Ihr Ergebnis betraegt: " + summe);
	}
}