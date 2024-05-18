import java.util.Arrays;
public class TableauxClasse {
    public static void main(String[] args) {
//        int[]chiffrAffaire;

        //création du tableau et taille du tableau

//        chiffrAffaire = new int[12];

//        //initialisation du premier élément
//        chiffrAffaire [1] = 1234;
//        chiffrAffaire [2] = 8798;
//        chiffrAffaire [3] = 4545;
//        chiffrAffaire [4] = 4141;
//        chiffrAffaire [5] = 8989;
//        chiffrAffaire [6] = 3636;
//        chiffrAffaire [7] = 5656;
//        chiffrAffaire [8] = 2222;
//        chiffrAffaire [9] = 3202;
//        chiffrAffaire [10] = 2828;
//        chiffrAffaire [11] = 7896;
//        chiffrAffaire [12] = 5631;


        //Création et initialisation du tableau
        int[]chiffrAffaire = {1234, 568,2541,25,1664,38,9873,35876,746,956,2563,45653};

        //Trie du tableau dans l'ordre croissant
        Arrays.sort(chiffrAffaire);

        //Affichage du tableau
        System.out.println(Arrays.binarySearch(chiffrAffaire,  38));
    }
}
