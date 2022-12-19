import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] échiquier =
                {
                        {0, -3, -4, 0, 0, -4, -3, 0},
                        {-1, -1, -1, -1, -1, -1, -1, -1},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1, 1, 1, 1},
                        {0, 3, 4, 0, 0, 4, 3, 0},

                };
        ArrayList<Integer> mangéesParBLANCS = new ArrayList<>();
        ArrayList<Integer> mangéesParNOIRS = new ArrayList<>();
        int cpt_tour = 1;


        while (cpt_tour < 12) {
            Console.afficherEchiquier(échiquier);
            Console.afficherMPB(mangéesParBLANCS);
            Console.afficherMPN(mangéesParNOIRS);
            System.out.println("tour " + cpt_tour);
            if (Partie.Joueur(échiquier, mangéesParBLANCS, mangéesParNOIRS, cpt_tour)) {
                cpt_tour++;
            } else
                System.out.println("rejouez");

            System.out.println();
        }

    }

}
