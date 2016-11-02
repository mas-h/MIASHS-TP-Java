package tp1;

import java.util.Scanner;

public class tp1 {

	public tp1() {
		// TODO Auto-generated constructor stub

	}

	public static void exercice1() {
		// TODO Auto-generated method stub
		// exercice1 () ;
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int somme;
		somme = j + i;
		System.out.println("la somme est de " + somme);

	}

	public static void exercice2() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un montant en euro");
		double sommeEnEuro = sc.nextDouble();
		System.out.println("Veuillez saisir votre taux de change");
		double tauxDeChange = sc.nextDouble();
		double sommeDeviseEtrangere;
		sommeDeviseEtrangere = (sommeEnEuro / tauxDeChange);
		System.out.println("Votre montant est de " + sommeDeviseEtrangere);

	}

	public static void exercice3() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir 3 nombres : a, b et c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double moyenne;
		double max1 = 0;
		double max2 = 0;

		if ((a >= b) && (b >= c)) {
			max1 = a;
			max2 = b;
		}

		if ((b >= a) && (a >= c)) {
			max1 = b;
			max2 = a;
		}

		if ((b >= c) && (c >= a)) {
			max1 = b;
			max2 = c;
		}

		if ((c >= b) && (b >= a)) {
			max1 = c;
			max2 = b;
		}

		if ((a >= c) && (c >= b)) {
			max1 = a;
			max2 = c;
		}

		if ((c >= a) && (a >= b)) {
			max1 = c;
			max2 = a;
		}

		moyenne = ((max1 + max2) / 2);
		System.out.println("la moyenne des 2 plus grandes valeurs est " + moyenne);
	}

	public static void exercice4() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir une durée : heure, minute et seconde");
		int h = sc.nextInt();
		int min = sc.nextInt();
		int s = sc.nextInt();

		if ((h == 23) && (s == 59) && (min == 59)) {
			h = 0;
			min = 0;
			s = 0;
		}

		if ((s == 59) && (min == 59)) {
			h = h + 1;
			min = 0;
			s = 0;
		}
		if (s == 59) {
			min = min + 1;
			s = 0;
		}

		System.out.println(h + " h " + min + " min et " + s + " s");

	}

	public static void exercice5() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("veuillez saisir une durée : heure, minute et seconde");
		int h1 = sc.nextInt();
		int min1 = sc.nextInt();
		int s1 = sc.nextInt();
		
		if ((h1==23) && (s1==59) && (min1==59)){
			h1=0;
			min1=0;
			s1=0;}
		
			if ((s1==59) && (min1==59)){
				h1=h1+1;
				min1=0;
				s1=0;}
				if (s1 == 59){
					min1= min1 +1;
					s1=0;}
		
		System.out.println(h1+" h "+min1+ " min et "+ s1 + " s");
		
		System.out.println("veuillez saisir un deuxième triplet : heure, minute et seconde");
		int h2 = sc.nextInt();
		int min2 = sc.nextInt();
		int s2 = sc.nextInt();
		
		if ((h2==23) && (s2==59) && (min2==59)){
			h2=0;
			min2=0;
			s2=0;}
		
			if ((s2==59) && (min2==59)){
				h2=h2+1;
				min2=0;
				s2=0;}
				if (s2 == 59){
					min2= min2 +1;
					s2=0;}
		
		System.out.println(h2+" h "+min2+ " min et "+ s2 + " s");
		
		int ns = h1*3600+min1*60+s1+h2*3600+min2*60+s2;
		
		int h = ns / 3600;
		int r = ns % 3600;
		int min= r / 60; 
		int s = r % 60;
		
		 System.out.println( "l'addition des deux heures est "+ h + "h " +min+ " min et "+ s + " s");
	
		 
		
		
	}

	public static void exercice6() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 10;
		int somme = 0;
		int moyenne = 0;
		for (int i = 1; i <= n; i++) {
			int nbr = sc.nextInt();
			somme = somme + nbr;
			System.out.println("somme egale " + somme);

		}
		moyenne = (somme / n);
		System.out.println("moyenne egale " + moyenne);
	}
	
	public static void exercice7() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int somme = 0;
		int moyenne = 0;
		int compteur = 0;
		System.out.println("Veuillez insérer une suite de nombre entiers, pour finir la suite entrez le chiffre 0");
		int nbr = 1;
		
		while (nbr !=0) {
			nbr = sc.nextInt();
			nbr= nbr < 0 ? -nbr:nbr;
			compteur = compteur +1;
			somme = somme + nbr;
			
			
		}
		System.out.println("nombre d' entiers lus = " + (compteur-1));
		moyenne = (somme / (compteur-1));
		System.out.println("moyenne = " + moyenne);
		System.out.println("somme = " + somme);
	}

	public static void main(String[] args) {
		exercice7();
	}
}
