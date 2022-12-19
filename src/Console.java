import java.util.ArrayList;

public class Console {
    public static void afficherEchiquier(int[][] échiquier) {

        System.out.println("    0    1    2    3    4    5    6");
        System.out.println();
        String pièce = "";
        for (int ligne = 0; ligne < échiquier.length; ligne++) {
            System.out.print(ligne + "\t");
            for (int colonne = 0; colonne < échiquier[ligne].length; colonne++) {

                switch (échiquier[ligne][colonne]) {
                    case Constantes.CASE_VIDE:
                        pièce = " ";
                        break;

                    case Constantes.PION_NOIR:
                        pièce = ((char) 9817) + "";
                        break;

                    case Constantes.PION_BLANC:
                        pièce = ((char) 9823) + "";
                        break;

                    case Constantes.CAVALIER_NOIR:
                        pièce = ((char) 9816) + "";
                        break;

                    case Constantes.CAVALIER_BLANC:
                        pièce = ((char) 9822) + "";
                        break;

                    case Constantes.FOU_BLANC:
                        pièce = ((char) 9821) + "";
                        break;

                    case Constantes.FOU_NOIR:
                        pièce = ((char) 9815) + "";
                        break;

                }
                System.out.print(" " + pièce + "\t|");
            }
            System.out.println();

            System.out.println("    ---------------------------------");
        }
        System.out.println();

    }


    public static void afficherMPB(ArrayList<Integer> liste) {
        System.out.println("---------------------------------------");
        System.out.println("Pièces Mangées par les BLANCS :");
        /*for (Integer val : liste)
            System.out.println(val + "\t");*/
        String pion = "";
        for (Integer val : liste)
            if (val == Constantes.PION_NOIR)
                pion = " " + ((char) 9817) + "";
        System.out.println(pion + "\t");
        System.out.println("---------------------------------------");
    }

    public static void afficherMPN(ArrayList<Integer> liste) {
        System.out.println("---------------------------------------");
        System.out.println("Pièces Mangées par les NOIRS :");
        String pion = "";
        for (int val : liste)
            if (val == Constantes.PION_BLANC)
                pion = "" + ((char) 9823) + "";
        System.out.println(pion + "\t");
        System.out.println("---------------------------------------");
    }


}
