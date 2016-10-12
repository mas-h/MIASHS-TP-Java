package tp3;
import java.util.Scanner;
public class TP3 {

	public TP3() {
		// TODO Auto-generated constructor stub
	}

	public static void exercice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de caracteres");
		String myString = sc.next();
		System.out.println(myString);
		String reverseString = new StringBuffer(myString).reverse().toString();
		System.out.println(reverseString);
	}
	public static void exercice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre entier en binaire");
		String binaryNumber = sc.next();
		int stringLen = binaryNumber.length(); // longueur du chiffre binaire utilisee pour la boucle
		int charInt = Integer.parseInt(binaryNumber); // Convertir chaine en int pour pouvoir effectuer les calculs
		double decimalValue = 0; // var qui stocke notre resultat en valeur decimale
		for (int i = 0; i < binaryNumber.length() ; i++) {
			decimalValue =+ decimalValue; // On ajoute les valeurs entre elles pour le resultat, valeur par defaut : 0
			String currentChar = binaryNumber.substring(stringLen - 1, stringLen);
			double currentInt = Integer.parseInt(currentChar); // convertir la chaine en int (pour pouvoir faire les calculs)
			stringLen = stringLen - 1; // Decrementer 1 a la longueur 
			double pow2 = (Math.pow(2, i)); // Valeur puissance 2 pour calculer decimal via binaire
			decimalValue = decimalValue + (currentInt * pow2);
		}
		System.out.println(binaryNumber + " est " + decimalValue + " en valeur decimale");
	}
	public static void exercice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de caracteres");
		String sToConv = sc.next();
		for (int i = 0; i < sToConv.length(); i++) {
			char charCode = sToConv.charAt(i);
			int charUp = (char)charCode - 'a' + 'A';
			if (charUp > 58) { // Char est minuscule
				System.out.print((char)charUp);
			}
			else {
				System.out.print(charCode);
			}
		}
	}
	public static void exercice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de caracteres");
		String sToConv = sc.next();
		for (int i = 0; i < sToConv.length(); i++) {
			char charCode = sToConv.charAt(i);
			int charUp = (char)charCode - 'a' + 'A';
			int charDown = (char)charCode + 'a' - 'A';
			if ((i % 2 == 0) & (charUp > 58)) { // Char est en position pair et en min
				System.out.print((char)charUp);
			}
			else if ((i % 2 == 0) & (charUp < 58)) { // Char est en position pair et en maj
				System.out.print(charCode);
			}
			else if ((i % 2 != 0) & (charUp < 58)) {
				System.out.print((char)charDown); // Char est en position impair et en maj
			}
			else {
				System.out.print(charCode);
			}
		}
	}
	public static void exercice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de caracteres");
		String s = sc.next();
		System.out.println("Saisir le caractere a compter dans la chaine");
		String charToCount = sc.next();
		int occur = 0; // Valeur par defaut est 0 car c'est l'occurence du char
		for (int i = 0; i < s.length(); i++) {
			char c = charToCount.charAt(0);
			if (c == s.charAt(i)) { // Si char actuel est le meme que le char recherche
				occur = occur + 1;
			}
		}
		System.out.println(occur);
	}
	public static void exercice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de caracteres");
		String s = sc.next();
		System.out.println("Saisir le caractere a compter dans la chaine");
		String charToFind = sc.next();
		for (int i = 0; i < s.length(); i++) {
			char c = charToFind.charAt(0);
			if (c != s.charAt(i)) { // Si char actuel est different du char recherche
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) { 
		// exercice1();
		// exercice2();
		// exercice3 ();
		// exercice4();
		// exercice5();
		// exercice6();
	}

}
