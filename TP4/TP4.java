package tp4;
import java.util.Scanner;

public class TP4 {
	// Les tests sont commentes, decommentez pour tester les differentes actions

	public TP4() {
	}
	public static int[] nouveauTab(int taille, int vMin, int vMax) {
		int[] tab = new int[taille];
		int etendue = vMax - vMin + 1; // Car la borne superieure est toujours exclue
		for (int i = 0; i < taille; i++ ) {
			tab[i] = (int)(Math.random() * etendue + vMin); // On obtient une valeur entre 0 et etendue + 1
		}
		return tab;
	}
	public static String tabEnChaine(int[] tab) {
		if (tab.length == 0) {
			return "[]"; 
		}
		String contenu = "[" + tab[0];
		for (int i = 1; i < tab.length; i++) {
			contenu += ", " + tab[i];
		}
		return contenu + "]";
	}
	public static void changerValeurs (int[] tab, int val) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = val;
		}
	}
	public static void incrValeurs(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = tab[i]+1;
		}
	}
	public static int sommeValeurs(int[] tab) {
		int total = 0;
		for (int i = 0; i < tab.length; i++) {
			total += tab[i];
		}
		return total;
	}
	public static double ratioPairs(int[] tab) {
		double evenNumber = 0.0; // Var qui stocke le nombre de pairs (0 par defaut)
		if (tab.length == 0) {
			System.out.println("Erreur tableau vide");
		}
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] % 2 == 0) {
				evenNumber = evenNumber + 1;
			}
		}
		double percent = (evenNumber * 100.) / tab.length; // On rajoute un point pour avoir un reel et donc la precision dans la div
		return percent;
	}
	public static int maxValue(int[] tab) {
		if (tab.length == 0) {
			System.out.println("Erreur tableau vide");
		}
		int maxVal = tab[0]; // On definit la var de la valeur max a l'indice 0 car on a besoin d'un point de comparaison
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > maxVal) {
				maxVal = tab[i];
			}
		}
		return maxVal;
	}
	public static boolean appartient(int val, int[] tab) {
		boolean result = false; // Faux par defaut
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] == val) {
				result = true;
			}
		}
//		System.out.println(result);
		return result;
		
	}
	public static boolean estTrie(int[] tab) {
		// Methode d'Andy
		boolean tri = true; // True par defaut
		if(tab.length >= 1) {
            for(int i = 1; i < tab.length; i++) {
                if(tab[i] < tab[i - 1]) {
                	tri = false;
                }
            }
		}
//		System.out.println(tri);
		return tri;
	}
	public static boolean tousEgaux(int[] tab) {
		boolean equal = false;
		if(tab.length >= 1) {
			for (int i = 1; i < tab.length; i++) {
				if(tab[i] == tab[i - 1]) {
					equal = true;
				}
			}
		}
//		System.out.println(equal);
		return equal;
	}
	public static void inverse(int[] tab){
        int[] tabbis;
        tabbis = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            tabbis[i] = tab[tab.length-i-1];
            }
        for(int j = 0; j < tab.length; j++){
            tab[j] = tabbis[j];
//            System.out.println(tab[j]);
        }
    }
	public static void main(String[] args) {
		int[] t = nouveauTab(4, 9, 10);
//		System.out.println(tabEnChaine(t));
//		changerValeurs(t, 2);
//		incrValeurs(t);
//		System.out.println(tabEnChaine(t));
//		System.out.println("La somme des valeurs est " + sommeValeurs(t));
//		System.out.println(ratioPairs(t) + "% de nombres pairs dans le tableau");
//		System.out.println(maxValue(t));
//		appartient(1, t);
//		estTrie(t);
//		tousEgaux(t);
//		inverse(t);
	}

}
