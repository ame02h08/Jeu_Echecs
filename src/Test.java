import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        int[][] tab = new int[8][8];


        tab[4][3] = 3;
        tab[2][4] = -2;
        affichertab(tab);
        ArrayList<Integer> pb = new ArrayList<>();
        if (Cavalier.cavalier(4, 3, 2, 4, tab)) {
            if (tab[2][4] == Constantes.CASE_VIDE) {
                tab[2][4] = Constantes.CAVALIER_BLANC;
                tab[4][3] = Constantes.CASE_VIDE;
            }
            if (tab[2][4] == Constantes.PION_NOIR) {
                int pièceMangée = tab[2][4];
                tab[2][4] = Constantes.CAVALIER_BLANC;
                tab[4][3] = Constantes.CASE_VIDE;
                pb.add(pièceMangée);
            }
        }


        affichertab(tab);
        afficherliste(pb);
    }


    public static void zeroPartour(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = 0;
            }
        }
    }

    public static void affichertab(int[][] échiquier) {

        System.out.println("    0    1    2    3    4    5    6");
        System.out.println();
        String pièce = "";
        for (int ligne = 0; ligne < échiquier.length; ligne++) {
            System.out.print(ligne + "\t");
            for (int colonne = 0; colonne < échiquier[ligne].length; colonne++) {

                System.out.print(" " + échiquier[ligne][colonne] + "\t|");
            }
            System.out.println();

            System.out.println("    ---------------------------------");
        }
        System.out.println();

    }

    public static void afficherliste(ArrayList<Integer> liste) {
        System.out.println("---------------------------------------");
        System.out.println("Pièces Mangées par les BLANCS :");
        for (int val : liste)
            System.out.println(val + "\t");
        System.out.println("---------------------------------------");
    }


    /*
    FOU :

    4 SITUATIONS/DÉPLACEMENT :

          0   1   2
        -------------
    0   |   |   |   |
        -------------
    1   |   |   |   |
        -------------
    2   |   |   |   |
        -------------

    ligneD > ligneA && colonneD > colonneA : " DE en bas à droite A en haut à gauche" Exemple [2][2] --> [0][0]

    ligneD < ligneA && colonneD < colonneA : " DE en haut à gauche A en bas à droite " Exemple [0][0] --> [2][2]

    ligneD > ligneA && colonneD < colonneA : " DE en bas à gauche A en haut à droite" Exemple [2][0] --> [0][2]

    ligneD < ligneA && colonneD > colonneA : " DE en haut à droite A en bas à gauche" Exemple [0][2] --> [2][0]


     */
}
