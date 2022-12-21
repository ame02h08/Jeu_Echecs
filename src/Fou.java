public class Fou {

    public static boolean fou(int ligneD, int colonneD, int ligneA, int colonneA, int[][] tab, int cpt_tour) {


        if (cpt_tour % 2 != 0) {
            if (tab[ligneA][colonneA] > 0) {
                return false;
            }

        } else {
            if (tab[ligneA][colonneA] < 0) {
                return false;
            }
        }

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
            if (ligneD > ligneA && (colonneD > colonneA)) {
                int cpt = 1;


                while (cpt < compteurcolonne) {
                    if (tab[ligneD - cpt][colonneD - cpt] == Constantes.CASE_VIDE) {
                        cpt++;
                    } else
                        return false;
                }

                return true;
            }

            if (ligneD > ligneA && colonneD < colonneA) {
                int cpt = 1;

                while (cpt < compteurcolonne) {
                    if (tab[ligneD - cpt][colonneD + cpt] == Constantes.CASE_VIDE) {
                        cpt++;
                    } else
                        return false;
                }

                return true;
            }


            if (ligneD < ligneA && colonneD > colonneA) {
                int cpt = 1;


                while (cpt < compteurcolonne) {
                    if (tab[ligneD + cpt][colonneD - cpt] == Constantes.CASE_VIDE) {
                        cpt++;

                    } else
                        return false;
                }

                return true;
            }

            if (ligneD < ligneA && colonneD < colonneA) {
                int cpt = 1;


                while (cpt < compteurcolonne) {
                    if (tab[ligneD + cpt][colonneD + cpt] == Constantes.CASE_VIDE) {
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
