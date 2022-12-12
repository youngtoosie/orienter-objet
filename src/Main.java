public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FIRSTCLASS myobjet = new FIRSTCLASS ();
        System.out.println(myobjet.x);
        FIRSTCLASS mySObjet2 = new FIRSTCLASS ();  // Object2
        System.out.println((mySObjet2.x)*2);
       SecondClass mySObj = new SecondClass();  //Object2
        System.out.println(mySObj.x);

        Etudiant NJIDJEU = new Etudiant();
        System.out.println("je m'appelle : " + NJIDJEU.Nom + " , " +NJIDJEU.Prenom + " de matricule " + NJIDJEU.MatricuLe+"."+ "je suis de sexe" + NJIDJEU.sexe + " et mon numrero de telephone est" + NJIDJEU.Numerotelephone + ".");
        Enseignant SPENCERJAMES= new Enseignant();
        System.out.println("je m'appelle : " + SPENCERJAMES.Nom + " , " +SPENCERJAMES.Prenom + " de matricule " +NJIDJEU.MatricuLe+"."+ "je suis de sexe" + NJIDJEU.sexe + " et mon numrero de telephone est" + NJIDJEU.Numerotelephone + ".");

        myMethod();
    }
         static void myMethod() {
            System.out.println("Hello world!");
        }
    }



}