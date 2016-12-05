package fractions;

public class Fraction {
	
	private int n, d;
	
	public Fraction(){
		this.n=0;
		this.d=1;
	}
	
	public Fraction(int n){
		this.n=n;
		this.d=1;
	}
	
	public Fraction(int n, int d) {
        this.n = (d < 0 ? -n : n);
        if (d == 0) {
            this.d = 1;
        }
        this.d = (d < 0 ? -d : d);
        reduire();
	}
	
	public void finInit(){
		if (d==0)
			throw new ArithmeticException("dénominateur nul");
		if (d<0){
			d *= -1;
			n *= -1;
			}
		reduire();
	}	
	
	public Fraction(String s){
		String[] temp = s.split("/");
		this.n=Integer.valueOf(temp[0]);
		this.d=Integer.valueOf(temp[1]);
		finInit();
	}
	
	// PGCD Non-recursif
	private int pgcd_nr(int a, int b) 
	   {
	      int factor = b;
	      while (b != 0) {
	         factor = b; 
	         b = a % b; 
	         a = factor; 
	      }
	      return a;
	   }

	private int ppcm(int a, int b){
		return a/pgcd_nr(a,b)*b;
	}
	
	private Fraction reduire()
	   {
	      int commun = 0;
	      // get absolute values for numerator and denominator
	      int num = Math.abs(n);
	      int den = Math.abs(d);
	      // figure out which is less, numerator or denominator
	      if (num > den)
	         commun = pgcd_nr(num, den);
	      else if (num < den)
	    	 commun = pgcd_nr(den, num);
	      else  // if both are the same, don't need to call pgcd
	    	 commun = num;

	      // set result based on common factor derived from pgcd
	      this.n = n / commun;
	      this.d = d / commun;
	      return this;
	   }
	
	public String toString(){
		return String.valueOf(this.n)+"/"+String.valueOf(this.d);
	}
	
	public int getNominateur() {
		return n;
	}

	public void setNominateur(int n) {
		this.n = n;
		reduire();
	}

	public int getDenominateur() {
		return d;
	}

	public void setDenominateur(int d) {
		if (d > 0) {
            this.d = d;
            reduire();
        }
        else if (d < 0) {
            this.n = -this.n;
            this.d = -d;
            reduire();
        }
	}
	
	public static Fraction valueOf(String s){
		Fraction resultat = new Fraction(s);
		return resultat;
	}
	
	public Fraction plus(Fraction f){
		Fraction resultat = new Fraction();
		int p=ppcm(this.d, f.d);
		
		resultat.setNominateur(this.n*p/this.d+f.n*p/f.d);
		resultat.setDenominateur(p);
		
		return resultat.reduire();
	}
	
	public Fraction moins(Fraction f){
		Fraction resultat = new Fraction();
		int p=ppcm(this.d, f.d);
		
		resultat.setNominateur(this.n*p/this.d-f.n*p/f.d);
		resultat.setDenominateur(p);
		
		return resultat.reduire();
	}
	
	public Fraction fois(Fraction f){
		Fraction resultat = new Fraction();
		
		resultat.setNominateur(this.n*f.n);
		resultat.setDenominateur(this.d*f.d);
		
		return resultat.reduire();
	}
	
	public Fraction divisePar(Fraction f){
		Fraction resultat = new Fraction();
		int p=ppcm(this.d, f.d);
		
		resultat.setNominateur(this.n*f.d);
		resultat.setDenominateur(this.d*f.n);
		
		return resultat.reduire();
	}
	
	public int compareTo(Fraction f){
		return this.n*f.d-f.n*this.d;
	}

	public boolean equals(Object obj){
		if (obj == this)
	    {
	        return true;
	    }
	    if (obj == null)
	    {
	        return false;
	    }
		if (obj instanceof Fraction)
	    {
	        Fraction other = (Fraction) obj;
	        return String.valueOf(this.n).equals(other.n) && String.valueOf(this.d).equals(other.d);
	    }
		else
	    {
	        return false;
	    }
	}
	
	public static Fraction calculFraction(String s) {
		Fraction a = new Fraction();
		Fraction b = new Fraction();
		int indexOp = 0;
		char estOp = 0;
		char tempOp;
		int i;
		int j;
		
		for (i = 0; i < s.length(); i++){ 
			if ((s.charAt(i) == '+') || (s.charAt(i) == '-') || (s.charAt(i) == '*') || (s.charAt(i) == ':')) {
				estOp = s.charAt(i);
				break;
			}
		}
		indexOp = i; 
		a = new Fraction(s.substring(0, indexOp));
	
		for (j = indexOp + 1; j < s.length() - 1; j++) {
			if ((s.charAt(j) == '+') || (s.charAt(j) == '-') || (s.charAt(j) == '*') || (s.charAt(j) == ':')) {
				tempOp = s.charAt(j); 
				b = new Fraction(s.substring(indexOp + 1, j));
				a = operation(estOp, a, b);
				estOp = tempOp;
				i = j;
			}

			indexOp = i;
		}
		b = new Fraction(s.substring(indexOp+1, s.length()));
		a = operation(estOp, a, b);
		
		return a; 
		}
	
	public static Fraction operation (char op, Fraction a, Fraction b)
	{
		switch (op) {
			case '+':
				a = a.plus(b); break;
			case '-':
				a = a.moins(b); break;
			case '*':
				a = a.fois(b); break;
			case ':':
				a = a.divisePar(b); break; 
		}
		return a;
	}	
}
