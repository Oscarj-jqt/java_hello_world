public class EnumerationClasse {
    public static void main(String[] args) {

        //Déclaration de l'énumération
        enum Mois {
            JANVIER,
            FEVRIER,
            MARS,
            AVRIL,
            MAI,
            JUIN,
            JUILLET,
            AOUT,
            SEPTEMBRE,
            OCTOBRE,
            NOVEMBRE,
            DECEMBRE
        }
        //affichage de janvier
        Mois janvier = Mois.JANVIER;
        System.out.println("Le premier mois de l'année est le mois de "+ janvier);
    }
}
