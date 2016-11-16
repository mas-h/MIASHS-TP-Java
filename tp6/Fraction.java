package fractions;

public class Fraction {
	private int numerateur;
	private int denominateur;
	
	
	
	public Fraction() { // constructeur 1
		this (0,1);
	}

	public Fraction(int n) {// constructeur 2
		this (n,1);
	}
	public Fraction(int n, int d) {// constructeur 3
		numerateur=n;
		denominateur=d;
		finInitialisation();
	}
	
	public Fraction (String s) { // constructeur 4
		String [] separation = s.split("/");
		this.numerateur = Integer.parseInt(separation [0]);
		this.denominateur = Integer.parseInt(separation [1]);
		finInitialisation();
	}
	
	private void finInitialisation() {
		if (denominateur == 0){
			throw new ArithmeticException (" Dénominateur nul");
		}
		if (denominateur < 0) {
			denominateur = - denominateur;
			numerateur = - numerateur;
		}
		reduire();
	}
	
	public static int calculePgcd(int a, int b){
		
		int r = a%b;
		int pgcd;
		if (r == 0) {
			 pgcd = b;
			 return pgcd;
		}
		else {
			while (r != 0) {
				a = b;
				b = r;
				r = a%b;
			}
			pgcd = b;
			return pgcd;
		}
		
	} 
//public static int calculePgcdbis(int a, int b){
//		
//		int r = a%b;
//		int pgcd;
//		if (r == 0) {
//			 pgcd = b;
//			 
//		}
//		else { calculePgcdbis(b,r);
//			
//		}
//		return pgcd;
//} 
public void reduire (){ // réduis la fraction à son max
	int pgcd = calculePgcd (this.getNumerateur(),this.getDenominateur() );
	System.out.println (pgcd +" "+ this.getNumerateur() + " "+ this.getDenominateur() );
	this.numerateur=((this.getNumerateur())/pgcd); 
	this.denominateur=((this.getDenominateur())/pgcd);
}

public static int  calculePpcm (int a, int b){ // calcule le denominateur commun entre deux denominateur
		
	return (a/calculePgcd(a,b)*b);
	}

	public String toString(){
		return (this.numerateur + "/" + this.denominateur)  ; // retourne une String contenant l'expression this
	}
	
	public int getNumerateur () { // Accesseur en lecture du nominateur 
		return this.numerateur;
	}
	public int getDenominateur (){ // Accesseur en lecture du denominateur
		return this.denominateur;
		}
	public void setNumerateur (int n) { // Accesseur en écriture du nominateur
		this.numerateur = n;

	}
	public void setDenominateur (int d) {// Accesseur en écriture du denominateur
		this.denominateur = d;

	}
	public static Fraction valueOf (String s){ // retourne une Fraction dont l'expression est dans s, s est de la forme ... 
		
		return (new Fraction (s)); 
	}
	public Fraction plus (Fraction f){ // retourne le résultat de l' addition de this et f
		
		int p = calculePpcm (this.getDenominateur(), f.getDenominateur());
		int n = (this.getNumerateur()*p) + (f.getNumerateur()*p);
		int d =p;
		Fraction resultat = new Fraction (n,d);
		return resultat;
	
	}
	
	public Fraction moins (Fraction f){ // retourne le résultat de la soustraction de this et f
		int p = calculePpcm (this.getDenominateur(), f.getDenominateur());
		int n = (this.getNumerateur()*p) - (f.getNumerateur()*p);
		int d = p;
		return new Fraction (n,d);
	}
	
	public Fraction fois (Fraction f){ //retourne le résultat de la multiplication de this et f
		int n = this.getNumerateur() * f.getNumerateur();
		int d = this.getDenominateur()* f.getDenominateur();
		Fraction resultat = new Fraction (n,d);
		return resultat;	
	}
	
	public Fraction diviseePar (Fraction f){ //retourne le résultat de la division de this et f
		int n = this.getNumerateur() * f.getDenominateur();
		int d = this.getDenominateur()* f.getNumerateur();
		Fraction resultat = new Fraction (n,d);
		return resultat;	
	}
	
	public int compareTo (Fraction f){ // retourne int neg si this inf à f; int pos si sup à f, 0 si this equivalent à f
		return moins(f).numerateur;
		//		int produit1 = (this.getNumerateur())*(f.getDenominateur());
//		int produit2 = (f.getNumerateur())*(this.getDenominateur());
//		System.out.println("produit1:"+ produit1 + " produit2:"+ produit2);
//		return (produit1-produit2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "9/3";
		Fraction x = new Fraction(9,3);
		Fraction a = new Fraction(9,3);
		System.out.println (x.toString());
		int numn= x.getNumerateur();
		int numd= x.getDenominateur();
		System.out.println(numn+" "+numd );
		int test = calculePgcd (12,4);
		System.out.println(x);
		System.out.println(a.compareTo (x));
		System.out.println(valueOf(s));
		
	}

}
