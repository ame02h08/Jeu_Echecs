public class Fou {

    public static boolean fou(int ligneD, int colonneD, int ligneA, int colonneA, int[][] tab) {


        int compteurligne, compteurcolonne;

        if (ligneD < ligneA)
            compteurligne = ligneA - ligneD;
        else
            compteurligne = ligneD - ligneA;

        if (colonneD < colonneA)
            compteurcolonne = (colonneA - colonneD);
        else
            compteurcolonne = (colonneD - colonneA);

        if (compteurligne == compteurcolonne) {
            if (ligneD > ligneA && (colonneD > colonneA || colonneD < colonneA)) {
                int cptColonne_verifCaseVide = colonneD;
                int cpt = 1;


                while (cptColonne_verifCaseVide > colonneA) {
                    if (tab[ligneD - cpt][colonneD - cpt] == Constantes.CASE_VIDE) {
                        cptColonne_verifCaseVide--;
                        cpt++;
                    } else
                        return false;
                }

                return true;
            }

            if (ligneD > ligneA && colonneD < colonneA) {
                int cptColonne_verifCaseVide = colonneD;
                int cpt = 1;

                while (cptColonne_verifCaseVide > colonneA) {
                    if (tab[ligneD - cpt][colonneD + cpt] == Constantes.CASE_VIDE) {
                        cptColonne_verifCaseVide--;
                        cpt++;
                    } else
                        return false;
                }

                return true;
            }


            if (ligneD < ligneA && colonneD > colonneA) {
                int cptColonne_verifCaseVide = colonneD;
                int cpt = 1;


                while (cptColonne_verifCaseVide < colonneA) {
                    if (tab[ligneD + cpt][colonneD - cpt] == Constantes.CASE_VIDE) {
                        cptColonne_verifCaseVide++;
                        cpt++;

                    } else
                        return false;
                }

                return true;
            }

            if (ligneD < ligneA && colonneD < colonneA) {
                int cptColonne_verifCaseVide = colonneD;
                int cpt = 1;


                while (cptColonne_verifCaseVide < colonneA) {
                    if (tab[ligneD + cpt][colonneD + cpt] == Constantes.CASE_VIDE) {
                        cptColonne_verifCaseVide++;
                        cpt++;

                    } else
                        return false;
                }

                return true;
            }

        }
        return false;

    }

}
