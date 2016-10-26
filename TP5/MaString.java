package mesStrings;

public class MaString {
    private char[] lesCaracteres;

    public MaString() {
        lesCaracteres = new char[0];
    }

    public MaString(char[] tab, int d, int f) {
        lesCaracteres = new char[f - d];
        for (int i = d; i < f; i++)
            lesCaracteres[i - d] = tab[i];
    }

    public MaString(MaString ms) {
        lesCaracteres = ms.lesCaracteres;
    }

    public int length() {
        return lesCaracteres.length;
    }

    public boolean isEmpty() {
        return lesCaracteres.length == 0;
    }

    public char charAt(int i) {
        return lesCaracteres[i];
    }

    public MaString substring(int d, int f) {
        return new MaString(lesCaracteres, d, f);
    }

    public int compareTo(MaString ms) {
        int lmin = ms.length() < length() ? ms.length() : length();
        for (int i = 0; i < lmin; i++) {
            if ((charAt(i) != ms.charAt(i)))
                return charAt(i) - ms.charAt(i);
        }
        return length() - ms.length();
    }

    public boolean equals(MaString ms) {
        return (this.compareTo(ms) == 0);
    }

    public boolean startsWith(MaString prefixe) {
        if (prefixe.length() > this.length())
            return false;
        for (int i = 0; i < prefixe.length(); i++)
            if (prefixe.charAt(i) != charAt(i))
                return false;
        return true;
    }

    public int indexOf(char c, int i) {
        for (; i < this.length(); i++)
            if (charAt(i) == c)
                return i;
        return -1;
    }

    public int indexOf(char c) {
        return indexOf(c, 0);
    }

    public String toString() {
        return new String(lesCaracteres);
    }
    
    public MaString concat(MaString ms) {
        char[] t = new char[lesCaracteres.length + ms.lesCaracteres.length];
        for (int i = 0; i < length(); i++)
            t[i] = lesCaracteres[i];
        for (int i = 0; i < ms.length(); i++)
            t[i + lesCaracteres.length] = ms.charAt(i);
        return new MaString(t, 0, t.length);
    }

    
      ///méthodes de class 
      public static MaString valueOf(boolean b) { 
          if(b)
              return ChaineTrue; return ChaineFalse; }
      
      public static MaString ChaineTrue = new MaString(new char[] {'t', 'r',
      'u', 'e'}, 0, 4); public static MaString ChaineFalse = new MaString(new
      char[] {'f', 'a', 'l', 's', 'e'}, 0, 5);
      
     
    public static void main(String[] args) {
        char[] t = {'t', 'e', 's', 't'};        // création d'un tableau sur lequel on va construire une MaString
        MaString ms = new MaString(t, 0, 4);    // Création d'une MaString à partir du tableau t
        System.out.println("ms = > " + ms + " <");
        int lg = ms.length();
        System.out.println("Longueur = " + lg);
        System.out.println("MaString est-elle vide ? " + ms.isEmpty());
        char premier = ms.charAt(0);
        System.out.println("Premier caractere = " + premier);
        MaString sousms = ms.substring(2,4);
        System.out.println("Souschaine de 2 à 4 = " + sousms);
        System.out.println("Compare la souschaine à MaString = " + sousms.compareTo(ms));
        System.out.println("Souschaine = MaString ? " + sousms.equals(ms));
        System.out.println("La souschaine est un préfixe de MaString ? " + ms.startsWith(sousms));
        System.out.println("Index de t depuis 2 : " + ms.indexOf('t', 2)); // indexOf(c, 2)
        System.out.println("Index de s : " + ms.indexOf('s')); // indexOf(c)
        MaString cc = ms.concat(sousms);
        System.out.println("Concaténation de MaString et sa souschaine : " + cc);
    }
}