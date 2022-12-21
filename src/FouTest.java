import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FouTest {

    @Test
    final void test_FOU_BLANC_Diagonale_BAS_GAUCHE_à_HAUT_DROITE() {

        int cpt = 1;

        //TEST FOU BLANCS

        //"déplacement FOU BLANC : DE en bas à gauche A en haut à droite"


        //case d'arrivée = case VIDE

        int[][] échiquier_FouBLANC_vers_CASE_VIDE =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle sur la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE");


        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };


        //case d'arrivée = case VIDE  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CASE_VIDE_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour BLANCHE");


        //case d'arrivée = PION NOIR
        int[][] échiquier_FouBLANC_vers_PION_NOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle sur la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR");


        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case PION NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_NOIR_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = tour BLANCHE");


        //case d'arrivée = CAVALIER NOIR
        int[][] échiqiuer_FouBLANC_vers_CAVALIER_NOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiqiuer_FouBLANC_vers_CAVALIER_NOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR");


        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };


        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case CAVALIER NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR+ obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR+ obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_NOIR_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = tour BLANCHE");


        //case d'arrivée =FOU NOIR
        int[][] échiquier_FouBLANC_vers_FouNOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacempent
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FouNOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR");

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        ///case d'arrivée = case FOU NOIR  + une autre pièce dans la diagonale de déplacement

        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FOU_NOIR_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour BLANCHE");


        //case d'arrivée =TOUR NOIRE
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacempent
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = TOUR NOIRE");

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        ///case d'arrivée = case TOUR NOIR  + une autre pièce dans la diagonale de déplacement

        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_NOIRE_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIRE + obstacle = tour BLANCHE");


        //case d'arrivée = PIÈCE BLANCHE
        int[][] échiquier_FouBLANC_vers_PION_BLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_BLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FouBLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_BLANCHE =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},

                };


        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_PION_BLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_CAVALIER_BLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_FouBLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouBLANC_vers_TOUR_BLANCHE, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE");

    }

    @Test
    final void test_FOU_NOIR_Diagonale_BAS_GAUCHE_à_HAUT_DROITE() {
        int cpt = 2;

        //TEST FOU BLANCS

        //"déplacement FOU BLANC : DE en bas à gauche A en haut à droite"


        //case d'arrivée = case VIDE

        int[][] échiquier_FouNOIR_vers_CASE_VIDE =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle sur la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE");


        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CASE_VIDE_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };


        //case d'arrivée = case VIDE  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CASE_VIDE_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour BLANCHE");


        //case d'arrivée = PION BLANC
        int[][] échiquier_FouNOIR_vers_PION_BLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle sur la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC");


        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_PION_BLANC_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case PION BLANC  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_BLANC_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion BLANC + obstacle = tour BLANCHE");


        //case d'arrivée = CAVALIER NOIR
        int[][] échiqiuer_FouNOIR_vers_CAVALIER_BLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 2, 3, 6, échiqiuer_FouNOIR_vers_CAVALIER_BLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC");


        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };


        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 3, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case CAVALIER BLANC  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_BLANC_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC + obstacle = tour BLANCHE");


        //case d'arrivée =FOU BLANC
        int[][] échiquier_FouNOIR_vers_FouBLANC =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacempent
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FouBLANC, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC");

        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_FOU_BLANC_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 4, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        ///case d'arrivée = case FOU BLANC  + une autre pièce dans la diagonale de déplacement

        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FOU_BLANC_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou BLANC + obstacle = tour BLANCHE");


        //case d'arrivée =TOUR BLANCHE
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacempent
        assertTrue(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = TOUR BLANCHE");

        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstaclePB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstaclePN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleCB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleCN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleFB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleFN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleTB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleTN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 2, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        ///case d'arrivée = case TOUR BLANCHE  + une autre pièce dans la diagonale de déplacement

        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstaclePN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstaclePB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleCN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleCB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleFN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleFB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleTN, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_BLANCHE_obstacleTB, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE + obstacle = tour BLANCHE");


        //case d'arrivée = PIÈCE NOIRE
        int[][] échiquier_FouNOIR_vers_PION_NOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -1, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_CAVALIER_NOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -3, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_FouNOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -4, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouNOIR_vers_TOUR_NOIR =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, -2, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},

                };


        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_PION_NOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = pion NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_CAVALIER_NOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_FouNOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = fou NOIR");
        assertFalse(Fou.fou(7, 2, 3, 6, échiquier_FouNOIR_vers_TOUR_NOIR, cpt), " cas : ligneD > ligneA && colonneD < colonneA + case d'arrivée = tour NOIR");

    }

    final void test_FOU_BLANC_Diagonale_HAUT_DROIRE_à_BAS_GAUCHE() {

        int cpt = 1;

        //"déplacement FOU BLANC : DE en haut à droite A en bas à gauche"


        //case d'arrivée = case VIDE
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE");


        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case VIDE  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_PN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = pion NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_PB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_CN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_CB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_FN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = fou NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_FB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_TN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CASE_VIDE_2_obstacle_TB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = tour BLANCHE");


        //case d'arrivée = pion NOIR
        int[][] échiquier_FouBLANC_vers_PION_NOIR_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR");


        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = pion NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_PN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_PB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_CN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_CB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_FN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_FB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_TN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_NOIR_2_obstacle_TB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = tour BLANCHE");

        //case d'arrivée = cavalier NOIR
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR");

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = cavalier NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_PN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_PB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_CN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_CB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_FN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_FB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_TN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_2_obstacle_TB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = tour BLANCHE");

        //case d'arrivée = fou NOIR
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR");


        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = fou NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_PN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_PB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_CN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_CB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_FN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_FB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_TN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_NOIR_2_obstacle_TB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour BLANCHE");


        //case d'arrivée = tour NOIRE
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = tour NOIR");


        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -3, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, -2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = tour NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_PN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_PB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_CN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_CB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_FN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_FB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_TN, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_2_obstacle_TB, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour BLANCHE");


        //case d'arrivée = PIÈCE BLANCHE
        int[][] échiquier_FouBLANC_vers_PION_BLANC_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_BLANC_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_BLANC_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_BLANCHE_2 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = PIÈCE BLANCHE
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_PION_BLANC_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = pion BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_CAVALIER_BLANC_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = cavalier BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_FOU_BLANC_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = fou BLANC");
        assertFalse(Fou.fou(1, 5, 6, 0, échiquier_FouBLANC_vers_TOUR_BLANCHE_2, cpt), "ligneD < ligneA && colonneD > colonneA + case d'arrivée = tour BLANCHE");

    }


    final void test_FOU_BLANC_Diagonale_BAS_DROITE_à_HAUT_GAUCHE() {

        int cpt = 1;
        //"déplacement FOU BLANC : DE en bas à droite A en haut à gauche"


        //case d'arrivée = case VIDE
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE");

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        //case d'arrivée = case VIDE  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_PN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_PB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_CN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_CB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_FN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_FB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_TN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CASE_VIDE_3_obstacle_TB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = case VIDE + obstacle = tour BLANCHE");


        //case d'arrivée = pion NOIR
        int[][] échiquier_FouBLANC_vers_PION_NOIR_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = PION NOIR");

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        //case d'arrivée = pion NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_PN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_PB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_CN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_CB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_FN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_FB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_TN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_NOIR_3_obstacle_TB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion NOIR + obstacle = tour BLANCHE");


        //case d'arrivée = cavalier NOIR

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };


        // + pad d'obstacle dans la diagonale de délacement
        assertTrue(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR ");

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };


        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        //case d'arrivée = cavalier NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_PN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_PB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_CN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_CB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_FN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_FB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_TN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_NOIR_3_obstacle_TB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier NOIR + obstacle = tour BLANCHE");


        // case d'arrivée = FOU NOIR
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR ");

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        //case d'arrivée = fou NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_PN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_PB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_CN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_CB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_FN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_FB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_TN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3_obstacle_TB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR + obstacle = tour BLANCHE");


        // case d'arrivée = TOUR NOIRE
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_NOIR_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou NOIR ");

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {-2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, -2, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        //case d'arrivée = fou NOIR  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_PN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = pion NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_PB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_CN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_CB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_FN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = fou NOIR");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_FB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_TN, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_NOIRE_3_obstacle_TB, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour NOIRE+ obstacle = tour BLANCHE");


        //case d'arrivée = PIÈCHE BLANCHE
        int[][] échiquier_FouBLANC_vers_PION_BLANC_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_BLANC_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_BLANC_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_BLANCHE_3 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},

                };


        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_PION_BLANC_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = pion BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_CAVALIER_BLANC_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = cavalier BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_FOU_BLANC_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = fou BLANC");
        assertFalse(Fou.fou(7, 5, 2, 0, échiquier_FouBLANC_vers_TOUR_BLANCHE_3, cpt), "ligneD > ligneA && colonneD > colonneA + case d'arrivée = tour BLANCHE");


    }

    final void test_FOU_BLANC_Diagonale_HAUT_GAUCHE_à_BAS_DROITE() {

        int cpt = 1;
        //"déplacement FOU BLANC : DE en haut à gauche A en bas à droite"


        //case d'arrivée = case VIDE
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE");

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -3, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -4, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -2, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = case VIDE  + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_PN, cpt), "ligneD < ligneA && colonneD < colonneA  + case d'arrivée = case VIDE + obstacle = pion NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_PB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_CN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_CB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_FN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_FB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_TN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour NOIRE");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CASE_VIDE_4_obstacle_TB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = case VIDE + obstacle = tour BLANCHE");


        //case d'arrivée = pion NOIR
        int[][] échiquier_FouBLANC_vers_PION_NOIR_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR");


        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = pion NOIR + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_PN, cpt), "ligneD < ligneA && colonneD < colonneA  + case d'arrivée = pion NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_PB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_CN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_CB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_FN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_FB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_TN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_NOIR_4_obstacle_TB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion NOIR + obstacle = tour BLANCHE");


        // case d'arrivée = cavalier NOIR
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR");

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -3, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = cavalier NOIR + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_PN, cpt), "ligneD < ligneA && colonneD < colonneA  + case d'arrivée = cavalier NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_PB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_CN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_CB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_FN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_FB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_TN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = tour NOIRE");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_NOIR_4_obstacle_TB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier NOIR + obstacle = tour BLANCHE");


        //case d'arrivée = fou NOIR
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR");

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -4, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = fou NOIR + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_PN, cpt), "ligneD < ligneA && colonneD < colonneA  + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_PB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_CN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_CB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_FN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_FB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_TN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour NORIE");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_NOIR_4_obstacle_TB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");


        //case d'arrivée = tour NOIRE
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        // + pas d'obstacle dans la diagonale de déplacement
        assertTrue(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = tour NOIR");

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_PB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };
        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_PN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -1, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_CB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_CN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -3, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_FB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_FN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -4, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_TB =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_TN =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, -2, 0, 0, 0},
                        {0, 0, 0, 0, 0, -2, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        //case d'arrivée = fou NOIR + une autre pièce dans la diagonale de déplacement
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_PN, cpt), "ligneD < ligneA && colonneD < colonneA  + case d'arrivée = fou NOIR + obstacle = pion NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_PB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_CN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_CB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_FN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou NOIR");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_FB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_TN, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour NORIE");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_NOIRE_4_obstacle_TB, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou NOIR + obstacle = tour NOIRE");


        // case d'arrivée = pion BLANC
        int[][] échiquier_FouBLANC_vers_PION_BLANC_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_CAVALIER_BLANC_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 3, 0, 0},
                        {3, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_FOU_BLANC_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };

        int[][] échiquier_FouBLANC_vers_TOUR_BLANCHE_4 =
                {
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {0, 0, 4, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 4, 0, 0},
                        {4, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},

                };


        //case d'arrivée = PIÈCE BLANCHE
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_PION_BLANC_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = pion BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_CAVALIER_BLANC_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = cavalier BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_FOU_BLANC_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = fou BLANC");
        assertFalse(Fou.fou(2, 2, 5, 5, échiquier_FouBLANC_vers_TOUR_BLANCHE_4, cpt), "ligneD < ligneA && colonneD < colonneA + case d'arrivée = tour BLANCHE");

    }

    // FOU NOIR*/

}


