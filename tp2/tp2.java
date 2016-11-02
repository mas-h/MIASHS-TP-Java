package tp2;

import java.util.Scanner;

public class tp2 {

	public tp2() {
		// TODO Auto-generated constructor stub
	}

	public static void exercice1a() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int max;
		max = i > j ? i : j;
		System.out.println(max);
	}

	public static void exercice1b() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int max;
		max = i > j ? i : j;
		int k = sc.nextInt();
		max = k > max ? k : max;
		System.out.println(max);

	}

	public static void exercice1c() {
		// TODO Auto-generated method stub
		// max de 4 valeurs
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int max;
		max = i > j ? i : j;
		int k = sc.nextInt();
		max = k > max ? k : max;
		int h = sc.nextInt();
		max = h > max ? h : max;
		System.out.println(max);
	}

	public static void exercice1d() {
		// TODO Auto-generated method stub
		// affichage dans l'ordre croissant 2 entiers
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int max;
		int min;

		if (i > j) {
			max = i;
			min = j;
		} else {
			max = j;
			min = i;
		}

		System.out.println(min + " , " + max);

	}

	public static void exercice1e() {
		// TODO Auto-generated method stub
		// affichage dans l'ordre croissant 3 entiers
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 3 nombres a, b et c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		int min;

		if (a > b) {
			max = a;
			min = b;

		} else {
			max = b;
			min = a;

		}
		if (c > max) {

			max = c;

		} else {
			min = c;

		}

		int intermediaire = (a + b + c) - (min + max);
		System.out.println(min + " , " + intermediaire + " , " + max);

	}

	public static void exercice2a() {
		// TODO Auto-generated method stub
		// a*b
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 2 nombres a et b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int valeurabs = b < 0 ? -b : b;
		int produit = 0;
		for (int i = 0; i < valeurabs; i++) {
			produit = produit + a;
			System.out.println("Votre produit est de  " + produit);
		}
		produit = b < 0 ? -produit : produit;
		System.out.println("Votre produit est de  " + produit);

	}

	public static void exercice2b() {
		// TODO Auto-generated method stub
		// a élevé à la puissance b ;

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir 2 nombres a et b ");
		int a = sc.nextInt();
		int puissance = sc.nextInt();
		int produit1 = 0;
		int produit2 = 0;
		int valeurabspuissance = puissance < 0 ? -puissance : puissance;
		
		for (int j = 0; j < valeurabspuissance; j++) {
			produit1 =  produit1 + a; // a*a
			for (int i = 0; i < (a); i++) {
			produit2=  (produit1)+ (produit2) ;
			
			 
				
				
				System.out.println("Votre produit1 est de  " + produit1);
				System.out.println("Votre produit2 est de  " + produit2);
			}
		}
			

		//	produit = b < 0 ? -produit : produit;
			
			
		}

		
	
	
	public static void exercice2c() {
		// TODO Auto-generated method stub
		// a % b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 2 nombres a et b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (a>=b){
			 a = a -b;
			System.out.println("Votre reste est de  " + a);
		}
		
		System.out.println("Votre reste est de  " + a);

	}
	
	public static void exercice2d() {
		// TODO Auto-generated method stub
		// a % b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 2 nombres a et b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= 0;
		
		
		while (a>=b){
			 a = a -b;
			 c=c+1;
			System.out.println("Votre quotient est de  " + c);
		}
		
		System.out.println("Votre reste est de  " + c);

	}

	public static void exercice3a() {
		// TODO Auto-generated method stub
		//Calculer le nombre de chiffres d'un nombre entier positif saisi au clavier

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 1 nombre a supérieur à 0");
		int a = sc.nextInt(); // le nombre saisi par l'utilisateur, données
		int nbchiffre;  //Le nombre de chiffres dans a, résultat
		
		for ( nbchiffre = 1; a>9; nbchiffre ++){
			a = a/10;
		}
		
			System.out.println("il y a  " + nbchiffre + " chiffres dans votre nombre");
		}
		
	public static void exercice3b() {
		// TODO Auto-generated method stub
		//Calculer la somme des chiffres d'un nombre entier positif saisi au clavier
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 1 nombre a supérieur à 0");
		int a = sc.nextInt(); // le nombre saisi par l'utilisateur, données
		int nbchiffre;  //Le nombre de chiffres dans a, résultat
		int somme=0;
		
		for ( somme = 0, nbchiffre = 0; a>0; somme = somme + a%10, a=a/10,nbchiffre ++ ){
		
		}
		
			System.out.println("il y a "+ nbchiffre+" chiffres dans votre nombre et la somme est de "+ somme);
   
	}
	
	public static void exercice3c() {
		// TODO Auto-generated method stub
		//Un  nombre  d'Armstrong  de  3  chiffres  est  un  nombre  égal  à  la  somme  des  cubes  de  ses chiffres (exemple 153 = 13+ 53+ 33). Afficher tous les nombres d'Armstrong de 3 chiffres.
		
		
		Scanner sc = new Scanner(System.in);
		
		 
		int cubeC;  // cube des centaines 
		int cubeD;  // cube des dizaines
		int cubeU;  // cube des unités 
		int sommecube; 
		
		for ( int depart  = 100 ; depart < 1000; depart++ ){
			cubeC= depart / 100;
			cubeD=(depart / 10)%10;
			cubeU= depart % 10;
			sommecube = (cubeC*cubeC*cubeC)+(cubeD*cubeD*cubeD)+(cubeU*cubeU*cubeU);
			if (depart == sommecube ){
				System.out.println(depart + " ");}
			}
		
		}
		
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercice3b();
	}

}
