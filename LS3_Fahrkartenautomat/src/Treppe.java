import java.util.Scanner;
public class Treppe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben sie die gewuenschte Höhe an: ");
		int height = sc.nextInt();
		System.out.print("\nBitte geben sie die gewuenschte Treppenbreite an: ");
		int width = sc.nextInt();
		//Für die Robustheit
		if(height <=0) {
			System.out.println("Geben sie bitte Wert > 0 an.");
			System.out.print("Bitte geben sie die gewuenschte Höhe an: ");
			height = sc.nextInt();
		}
		if(width <=0) {
			System.out.println("Geben sie bitte Wert > 0 an.");
			System.out.print("Bitte geben sie die gewuenschte Treppenbreite an: ");
			width = sc.nextInt();
		}
		createStairs(height,width);
	}
	public static void createStairs(int h, int b) {
		System.out.println("Treppenhoehe: " + h);
		System.out.println("Stufenbreite: " + b);
		String stairStart = "*";
		String stairs = "";
		String spaceStart =" ";
		String space = " ";
		String print;
		//Gibt die Zeichenkette für die Weite an
		for(int i = 1; i<b+1; i++) {
			stairs = stairs+stairStart;
		}
		//Fügt Leerzeichen für korrekte Formatierung ein
		for(int i = 1; i<h; i++) {
			spaceStart = spaceStart+space;
		}
		System.out.printf("%-8s        ", spaceStart);
		//print = spaceStart + stairs;
		//System.out.printf("%-5s",stairs);
		//System.out.println(print);
	}
}
