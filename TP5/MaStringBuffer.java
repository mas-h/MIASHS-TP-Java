package mesStrings;

public class MaStringBuffer{
	 private char[] lesCaracteres;
	 private int n; // nombre de caractères effectifs
	 public MaStringBuffer(int l) {
		 n = 0;
		 lesCaracteres = new char[l];
	 }
	 public MaStringBuffer() {
		 this(16);
	 }
	 
	 public MaStringBuffer(MaString ms) {
		 n = ms.length();
		 lesCaracteres = new char[n + 16];
		 for (int i = 0; i < n; i ++) {
			 lesCaracteres[i] = ms.charAt(i); // ??
		 }
	 }
	 
	 // Methodes 
	 public int length() {
		 return n; 
	 }
	 public int capacity() {
		 return lesCaracteres.length;
	 }
	 public void ensureCapacity(int capMin) {
		 if (capMin <= lesCaracteres.length) {
			 return;
		 }
		 char[] t = new char[capMin];
		 for(int i = 0; i < n; i++) {
			 t[i] = lesCaracteres[i];
			 lesCaracteres = t;
		 }
	 }
	 public MaStringBuffer append(MaString ms) {
		 ensureCapacity(ms.length());
		 for (int i = 0; i < ms.length(); i++) {
			 // Ajouter les car
			 n = n + ms.length();
		 }
				 // ms.chartAt(i);
		 return this;
	 }
	 public MaStringBuffer(int d, int f, MaString ms) {
		 int diff = ms.length() - f + d;
		 ensureCapacity(n + diff);
		 if (diff < 0) {
			 for (int i = f; i < n; i++) {
				 lesCaracteres[i + diff] = lesCaracteres[i];
			 }
		 }
		else if (diff > 0) {
			for (int i = n - 1; i >= f; i--) {
					lesCaracteres[i + diff] = lesCaracteres[i];
			}
		}
		for (int i = 0; i < ms.length(); i++) {
			lesCaracteres[i + diff] = lesCaracteres;
		}
	 }
	 public String toString(){
	 return new String(lesCaracteres, 0, n);
	 }
	 public static void main(String[] args) {
	 }
}