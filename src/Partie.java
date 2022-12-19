import java.util.ArrayList;
import java.util.Scanner;

public class Partie {

    public static boolean Joueur(int[][] échiquier, ArrayList<Integer> mpb, ArrayList<Integer> mpn, int cpt) {
        Scanner scanner = new Scanner(System.in);


        // Vairables des coordonnées de la position de départ de la pièce et celle de l'arrivée
        int ligneD, colonneD, ligneA, colonneA;

        //Affichage (alternance des tours BLANCS/NOIRS)
        if (cpt % 2 != 0)
            System.out.println("au tour des BLANCS");
        else
            System.out.println("au tour des NOIRS");

        do {

            System.out.println("entrez la ligne de la pièce a bouger!");
            ligneD = scanner.nextInt();

            System.out.println("entrez la colonne de la pièce a bouger!");
            colonneD = scanner.nextInt();

            /* Vérification d'une case correcte :
            --> dans les dimensions de l'échiquier
            + vérification que la case de départ contient un pion :
            --> le joueur doit sélectionner une case avec un pion dessus pour jouer */

        } while (!siCaseCorrecte(échiquier, ligneD, colonneD) || siCaseVide(échiquier, ligneD, colonneD));

        do {
            System.out.println("entrez la ligne d'arrivée");
            ligneA = scanner.nextInt();

            System.out.println("entrez la colonne d'arrivée");
            colonneA = scanner.nextInt();

            /* Vérification d'une case correcte :
            --> dans les dimensions de l'échiquier
             /!\ la case d"arrivée peut être vide */

        } while (!siCaseCorrecte(échiquier, ligneD, colonneD));


        //on s'intérresse à la pièce sur la case de départ
        switch (échiquier[ligneD][colonneD]) {

            //cas déplacement d'un pion noir
            case Constantes.PION_NOIR:
                if (Pion.pionNoir(ligneD, colonneD, ligneA, colonneA, échiquier)) {
                    déplacementPionsEchiquier(échiquier, ligneD, colonneD, ligneA, colonneA, mpb, mpn, cpt);
                    return true;
                } else
                    System.out.println("déplacement pion noir impossible !");
                break;

            //cas déplacement d'un pion blanc
            case Constantes.PION_BLANC:
                if (Pion.pionBlanc(ligneD, colonneD, ligneA, colonneA, échiquier)) {
                    déplacementPionsEchiquier(échiquier, ligneD, colonneD, ligneA, colonneA, mpb, mpn, cpt);
                    return true;
                } else
                    System.out.println("déplacement pion impossible !");
                break;

            case Constantes.TOUR_NOIR:
                break;

            case Constantes.TOUR_BLANC:
                break;


            case Constantes.CAVALIER_NOIR, Constantes.CAVALIER_BLANC:
                if (Cavalier.cavalier(ligneD, colonneD, ligneA, colonneA, échiquier)) {
                    déplacementPionsEchiquier(échiquier, ligneD, colonneD, ligneA, colonneA, mpb, mpn, cpt);
                    return true;
                } else
                    System.out.println("déplacement impossible !");
                break;

            //cas déplacement d'un fou
            case Constantes.FOU_NOIR, Constantes.FOU_BLANC:
                if (Fou.fou(ligneD, colonneD, ligneA, colonneA, échiquier)) {
                    déplacementPionsEchiquier(échiquier, ligneD, colonneD, ligneA, colonneA, mpb, mpn, cpt);
                    return true;
                } else
                    System.out.println("déplacement impossible !");
                break;

        }
        return false;
    }


    //MÉTHODE qui reçpot en paramètre un n° de ligne et n° de colonne et qui renvoit vrai si ces coordonnées correspondent à des cases de l'échiquier
    public static boolean siCaseCorrecte(int[][] échiquier, int ligne, int colonne) {
        if (ligne < 0 || ligne > échiquier.length - 1) {
            System.out.println("case incorrecte");
            return false;
        }
        if (colonne < 0 || ligne > échiquier.length - 1) {
            System.out.println("case incorrecte");
            return false;
        }
        return true;
    }

    //MÉTHODE qui reçpot en paramètre un tn° de ligne et n° de colonne et qui renvoit vrai si ces coordonnées correspondent à des cases du tableau
    public static boolean siCaseVide(int[][] échiquier, int ligne, int colonne) {
        if (échiquier[ligne][colonne] == Constantes.CASE_VIDE) {
            System.out.println("case vide !");
            return true;
        }
        return false;
    }

    /*MÉTHODE qui effectue le déplacement des pièces sur l'échiquier :
    si la case d'arrivée est vide:  elle met la pièce de la case de départ dans la case d'arrivée et libère la case de départ
    si la case de de départ est occupée par une pièce BLANCE et que celle d'arrivée par une pièce NOIRE :
        sachant que le déplacement est autorisée en amont la méthode :
        met la pièce de la case de départ PIÈCE BLANCHE dans la case d'arrivée et libère la case de départ
        et elle place la pièce mangée (pièce NOIRE) dans l'ArrayListe "pions Mangés par les BLANCS"

   même principe si la case de de départ est occupée par une pièce NOIRE et que celle d'arrivée par une pièce BLANCHE :

     */

    public static void déplacementPionsEchiquier(int[][] échiqiuer, int ligneD, int colonneD, int ligneA, int colonneA, ArrayList<Integer> mpb, ArrayList<Integer> mpn, int cpt) {
        if (échiqiuer[ligneA][colonneA] == Constantes.CASE_VIDE) {
            échiqiuer[ligneA][colonneA] = échiqiuer[ligneD][colonneD];
            échiqiuer[ligneD][colonneD] = Constantes.CASE_VIDE;
        }

        if (échiqiuer[ligneD][colonneD] > 0) {
            if (échiqiuer[ligneA][colonneA] < 0 && échiqiuer[ligneA][colonneA] != Constantes.ROI_NOIR) {
                int pièceMangée = échiqiuer[ligneA][colonneA];
                échiqiuer[ligneA][colonneA] = échiqiuer[ligneD][colonneD];
                échiqiuer[ligneD][colonneD] = Constantes.CASE_VIDE;
                mpb.add(pièceMangée);
            }
        }

        if (échiqiuer[ligneD][colonneD] < 0) {
            if (échiqiuer[ligneA][colonneA] > 0 && échiqiuer[ligneA][colonneA] != Constantes.ROI_BLANC) {
                int pièceMangée = échiqiuer[ligneA][colonneA];
                échiqiuer[ligneA][colonneA] = échiqiuer[ligneD][colonneD];
                échiqiuer[ligneD][colonneD] = Constantes.CASE_VIDE;
                mpn.add(pièceMangée);
            }
        }

        System.out.println("fin tour n°" + cpt);

    }


}



