public class ConstanceClasse
{
    public static void main(String[] args) {

        //Initialisation et déclaration de lac constante
        final double TAUXTVA = 1.196;

        //Déclaration et intialisation des autres variables
        int prixHT = 10;
        double prixTTC;

        //Utilisation de la constante
        prixTTC = prixHT * TAUXTVA;

        //Calcule
        System.out.println(prixTTC);gg
    }
}
