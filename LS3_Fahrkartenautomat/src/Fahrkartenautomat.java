import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag = 0;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
		double ticketpreis = 0.0;
		double anzahlTickets;
		double zwischenSumme = 0.0;
		double summe;
		int ticketChoice = 0;
		int[] auswahl = new int[]{1,2,3,4,9};
		
		/*//Ticketpreis eingeben
		System.out.println("Ticketpreis: (Euro)");
		ticketpreis = tastatur.nextDouble();
		if(ticketpreis <=0) {
			System.out.println("Fehlerhafte Eingabe. Ticketpreis wird auf 1 gesetzt");
			ticketpreis = 1;
		}*/
		
		//Ticketauswahl
		while(ticketChoice != 9) {
		System.out.println("-----------------------------------------------");
		System.out.println("Waehlen Sie Ihre Wunschfahrkarte aus:");
		System.out.println("Kurzstrecke AB [2,00 EUR] (1)");
		System.out.println("Einzelfahrschein AB [3,00 EUR] (2)");
		System.out.println("Tageskarte AB [8,80 EUR] (3)");
		System.out.println("4-Fahrten-Karte AB [9,40 EUR] (4)");
		System.out.println("Bezahlen (9)");
		System.out.println("----------------------------------------------\n");
		ticketChoice = tastatur.nextInt();
		System.out.println("Ihre Wahl: " + ticketChoice);
		if(ticketChoice != 9) {
			System.out.println("Anzahl der Tickets: ");
			anzahlTickets = tastatur.nextDouble();
			while(anzahlTickets < 1 || anzahlTickets > 10) {
				System.out.println("Waehlen sie bitte eine Anzahl von 1-10 aus");
				anzahlTickets = tastatur.nextDouble();
			}
			zwischenSumme = ticketpreis * anzahlTickets;
			zuZahlenderBetrag = zuZahlenderBetrag + zwischenSumme;
			System.out.println("\nIhre Zwischensumme betraegt " + zuZahlenderBetrag + "\n");
			}
		while(ticketChoice > 4) {
			if(ticketChoice == 9) {
				break;
			}
			System.out.println(">>falsche Eingabe<<");
			ticketChoice = tastatur.nextInt();
		}
		switch(ticketChoice) {
		
		case 1: 
			ticketpreis = 2.00;
			break;
		case 2:
			ticketpreis = 3.00;
			break;
		case 3:
			ticketpreis = 8.80;
			break;
		case 4:
			ticketpreis = 9.40;
			break;
		case 9: 
			System.out.println("Ihr Bezahlvorgang wir vorbereitet\n");
			eingezahlterGesamtbetrag = 0.0;
			nochZuZahlen = zwischenSumme;
			while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
				zuZahlenderBetrag = zuZahlenderBetrag - eingezahlterGesamtbetrag;
				System.out.printf("%s Euro\n","Noch zu zahlen: " + nochZuZahlen);
				System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
				eingeworfeneMuenze = tastatur.nextDouble();
			}
			break;
		default:
			ticketpreis = 0;
			break;
		}
		
		
		//Anzahl der Tickets angeben
		/*System.out.println("Anzahl der Tickets: ");
		anzahlTickets = tastatur.nextDouble();
		while(anzahlTickets < 1 || anzahlTickets > 10) {
			System.out.println("Waehlen sie bitte eine Anzahl von 1-10 aus");
			anzahlTickets = tastatur.nextDouble();
		}*/
		
		//Geldbetrag errechnen
		/*System.out.print("Zu zahlender Betrag (Euro): ");
		
		switch(ticketChoice) {
		
		case 1: 
			ticketpreis = 2.00;
			break;
		case 2:
			ticketpreis = 3.00;
			break;
		case 3: ticketpreis = 8.80;
			break;
		case 4: ticketpreis = 9.40;
			break;
		default:
			ticketpreis = 0;
			break;
		}
		zuZahlenderBetrag = ticketpreis * anzahlTickets; */
		

		//Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("%s Euro\n","Noch zu zahlen: " + nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			/*}
			else if(eingeworfeneMuenze != 0.1) {
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 0.2) {
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 0.5) {
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 1) {
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 2) {	
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 5) {	
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 10) {	
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}
			else if(eingeworfeneMuenze != 20) {	
				System.out.println("Ungültige Zahlungsmethode");
				continue;
			}*/
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}
		
		//Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		//Rückgeldberechnung und Ausgabe
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}
}
