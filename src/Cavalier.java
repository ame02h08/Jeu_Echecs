public class Cavalier {

    public static boolean cavalier(int ligneD, int colonneD, int ligneA, int colonneA, int[][] tab) {

        if ((ligneA == ligneD - 1 || ligneA == ligneD + 1) && (colonneA == colonneD - 2 || colonneA == colonneD + 2)
                || (ligneA == ligneD - 2 || ligneA == ligneD + 2) && (colonneA == colonneD - 1 || colonneA == colonneD + 1))
            return true;
        return false;
    }
}
