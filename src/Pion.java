public class Pion {

    public static boolean pionBlanc(int ligneD, int colonneD, int ligneA, int colonneA, int[][] tab) {

        if (tab[ligneD][colonneD] != Constantes.PION_BLANC)
            return false;

        //Autorisation du déplacement de 2 cases (1er tour pour le pion)
        if (ligneD == 6 && ligneA == ligneD - 2 && colonneA == colonneD)
            return true;

        //Déplacement : "le pion avance d'une case"
        if (ligneA == ligneD - 1
                && colonneA == colonneD
                && tab[ligneA][colonneA] == Constantes.CASE_VIDE) {
            return true;
        }

        //Autorsier le piont blanc à manger le pion noir en diagonale

        if ((colonneA == colonneD + 1) || (colonneA == colonneD - 1) && tab[ligneA][colonneA] == Constantes.PION_NOIR) {
            return true;

        }

        return false;
    }


    public static boolean pionNoir(int ligneD, int colonneD, int ligneA, int colonneA, int[][] tab) {

        if (tab[ligneD][colonneD] != Constantes.PION_NOIR)
            return false;

        if (ligneD == 1 && ligneA == ligneD + 2 && colonneA == colonneD)
            return true;


        //Déplacement : "le pion avance d'une case"
        if (ligneA == ligneD + 1
                && colonneA == colonneD
                && tab[ligneA][colonneA] == Constantes.CASE_VIDE)
            return true;


        //Autorsier le piont noir à manger le pion blanc en diagonale


        if ((colonneA == colonneD + 1) || (colonneA == colonneD - 1) && tab[ligneA][colonneA] == Constantes.PION_BLANC) {
            return true;

        }


        return false;
    }

}
