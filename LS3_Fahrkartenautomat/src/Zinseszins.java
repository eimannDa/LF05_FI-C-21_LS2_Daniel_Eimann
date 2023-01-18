import java.util.Scanner;
public class Zinseszins {

	public static void main(String[] args) {
		double zinsbetrag;
		double zwischenkapital;
		double zwischenschritt;
		double endkapital = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Laufzeit für den Vertrag an (In Jahren): ");
		int laufzeit = sc.nextInt();
		System.out.println("Bitte geben Sie an, wie viel Kapital Sie anlegen: "); 
		double kapital = sc.nextDouble();
		System.out.println("Bitte geben sie den Zinssatz an: "); 
		int zinssatz = sc.nextInt();
		zwischenkapital = kapital;
		//Für den Ersten Durchlauf der Zinserrechnung
		zinsbetrag = kapital/100.00*zinssatz;
		for(int i = 1; i <= laufzeit; i++) {
			zwischenkapital = zwischenkapital + zinsbetrag;
			//Errechnung des Zinseszins
			zinsbetrag = zwischenkapital/100.00*zinssatz;
			zwischenschritt = zwischenkapital;
			if(i==laufzeit) {
				endkapital = zwischenschritt;
			}
		}
		System.out.printf("Eingezahltes Kapital: " +"%.2f",kapital);
		System.out.println(" ");
		System.out.printf("Ausgezahltes Kapital: " +"%.2f",endkapital);
	}
}
