import java.util.ArrayList;;

public class Sodoku {
    ArrayList<ArrayList<Integer>> tablero = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> mostrarTablero = new ArrayList<ArrayList<Integer>>();
    int tipoTablero;
    int dificulty = 1;
    ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();

    public Sodoku(int d, int dim) {
        this.dificulty = d;
        this.tipoTablero = dim;
    }

    public void generateArray() {
        if (this.tipoTablero == 6) {
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            ArrayList<Integer> row2 = new ArrayList<Integer>();
            ArrayList<Integer> row3 = new ArrayList<Integer>();
            ArrayList<Integer> row4 = new ArrayList<Integer>();
            ArrayList<Integer> row5 = new ArrayList<Integer>();
            ArrayList<Integer> row6 = new ArrayList<Integer>();

            ArrayList<Integer> rows1 = new ArrayList<Integer>();
            ArrayList<Integer> rows2 = new ArrayList<Integer>();
            ArrayList<Integer> rows3 = new ArrayList<Integer>();
            ArrayList<Integer> rows4 = new ArrayList<Integer>();
            ArrayList<Integer> rows5 = new ArrayList<Integer>();
            ArrayList<Integer> rows6 = new ArrayList<Integer>();

            int[] rowi1 = { 1, 2, 3, 4, 5, 6 };
            int[] rowi2 = { 4, 5, 6, 1, 2, 3 };
            int[] rowi3 = { 2, 1, 4, 3, 6, 5 };
            int[] rowi4 = { 6, 3, 5, 2, 1, 4 };
            int[] rowi5 = { 3, 6, 1, 5, 4, 2 };
            int[] rowi6 = { 5, 4, 2, 6, 3, 1 };

            for (int i = 0; i <= 5; i++) {
                row1.add(rowi1[i]);
                row2.add(rowi2[i]);
                row3.add(rowi3[i]);
                row4.add(rowi4[i]);
                row5.add(rowi5[i]);
                row6.add(rowi6[i]);
                rows1.add(rowi1[i]);
                rows2.add(rowi2[i]);
                rows3.add(rowi3[i]);
                rows4.add(rowi4[i]);
                rows5.add(rowi5[i]);
                rows6.add(rowi6[i]);
            }

            rows.add(row1);
            rows.add(row2);
            rows.add(row3);
            rows.add(row4);
            rows.add(row5);
            rows.add(row6);

            tablero.add(rows1);
            tablero.add(rows2);
            tablero.add(rows3);
            tablero.add(rows4);
            tablero.add(rows5);
            tablero.add(rows6);

            if (randbool() == true) {
                rows.set(0, row2);
                rows.set(1, row1);
                tablero.set(0, rows2);
                tablero.set(1, rows1);
            }
            if (randbool() == true) {
                rows.set(2, row4);
                rows.set(3, row3);
                tablero.set(2, rows4);
                tablero.set(3, rows3);
            }
            if (randbool() == true) {
                rows.set(4, row6);
                rows.set(5, row5);
                tablero.set(4, rows6);
                tablero.set(5, rows5);
            }
            if (randbool() == true) {
                rows.set(4, row3);
                rows.set(5, row2);
                rows.set(2, row6);
                rows.set(3, row5);
                tablero.set(4, rows3);
                tablero.set(5, rows2);
                tablero.set(2, rows6);
                tablero.set(3, rows5);
            }

            mostrarTablero = rows;
            if (dificulty == 1) {
                for (int i = 0; i <= 4; i++) {
                    int rand = (int) (Math.random() * 5);
                    int randnum = (int) (Math.random() * 5);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
            if (dificulty == 2) {
                for (int i = 0; i <= 10; i++) {
                    int rand = (int) (Math.random() * 5);
                    int randnum = (int) (Math.random() * 5);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
            if (dificulty == 3) {
                for (int i = 0; i <= 18; i++) {
                    int rand = (int) (Math.random() * 5);
                    int randnum = (int) (Math.random() * 5);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
        }

        if (this.tipoTablero == 9) {
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            ArrayList<Integer> row2 = new ArrayList<Integer>();
            ArrayList<Integer> row3 = new ArrayList<Integer>();
            ArrayList<Integer> row4 = new ArrayList<Integer>();
            ArrayList<Integer> row5 = new ArrayList<Integer>();
            ArrayList<Integer> row6 = new ArrayList<Integer>();
            ArrayList<Integer> row7 = new ArrayList<Integer>();
            ArrayList<Integer> row8 = new ArrayList<Integer>();
            ArrayList<Integer> row9 = new ArrayList<Integer>();

            ArrayList<Integer> rows1 = new ArrayList<Integer>();
            ArrayList<Integer> rows2 = new ArrayList<Integer>();
            ArrayList<Integer> rows3 = new ArrayList<Integer>();
            ArrayList<Integer> rows4 = new ArrayList<Integer>();
            ArrayList<Integer> rows5 = new ArrayList<Integer>();
            ArrayList<Integer> rows6 = new ArrayList<Integer>();
            ArrayList<Integer> rows7 = new ArrayList<Integer>();
            ArrayList<Integer> rows8 = new ArrayList<Integer>();
            ArrayList<Integer> rows9 = new ArrayList<Integer>();

            int[] rowi1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] rowi2 = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
            int[] rowi3 = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
            int[] rowi4 = { 5, 1, 2, 6, 4, 7, 9, 3, 8 };
            int[] rowi5 = { 9, 3, 4, 8, 1, 5, 2, 6, 7 };
            int[] rowi6 = { 8, 6, 7, 9, 3, 2, 5, 1, 4 };
            int[] rowi7 = { 2, 4, 8, 3, 7, 1, 6, 9, 5 };
            int[] rowi8 = { 3, 9, 5, 2, 6, 4, 8, 7, 1 };
            int[] rowi9 = { 6, 7, 1, 5, 9, 8, 3, 4, 2 };

            for (int i = 0; i <= 8; i++) {
                row1.add(rowi1[i]);
                row2.add(rowi2[i]);
                row3.add(rowi3[i]);
                row4.add(rowi4[i]);
                row5.add(rowi5[i]);
                row6.add(rowi6[i]);
                row7.add(rowi7[i]);
                row8.add(rowi8[i]);
                row9.add(rowi9[i]);
                rows1.add(rowi1[i]);
                rows2.add(rowi2[i]);
                rows3.add(rowi3[i]);
                rows4.add(rowi4[i]);
                rows5.add(rowi5[i]);
                rows6.add(rowi6[i]);
                rows7.add(rowi7[i]);
                rows8.add(rowi8[i]);
                rows9.add(rowi9[i]);
            }

            rows.add(row1);
            rows.add(row2);
            rows.add(row3);
            rows.add(row4);
            rows.add(row5);
            rows.add(row6);
            rows.add(row7);
            rows.add(row8);
            rows.add(row9);

            tablero.add(rows1);
            tablero.add(rows2);
            tablero.add(rows3);
            tablero.add(rows4);
            tablero.add(rows5);
            tablero.add(rows6);
            tablero.add(rows7);
            tablero.add(rows8);
            tablero.add(rows9);

            if (randbool() == true) {
                rows.set(0, row2);
                rows.set(1, row1);
                tablero.set(0, rows2);
                tablero.set(1, rows1);
            }
            if (randbool() == true) {
                rows.set(2, row4);
                rows.set(3, row3);
                tablero.set(2, rows4);
                tablero.set(3, rows3);
            }
            if (randbool() == true) {
                rows.set(4, row6);
                rows.set(5, row5);
                tablero.set(4, rows6);
                tablero.set(5, rows5);
            }
            if (randbool() == true) {
                rows.set(4, row3);
                rows.set(5, row2);
                rows.set(6, row1);
                rows.set(1, row6);
                rows.set(2, row5);
                rows.set(3, row4);
                tablero.set(4, rows3);
                tablero.set(5, rows2);
                tablero.set(6, rows1);
                tablero.set(0, rows6);
                tablero.set(1, rows5);
                tablero.set(2, rows4);
            } else if (randbool() == true) {
                rows.set(6, row3);
                rows.set(7, row2);
                rows.set(8, row1);
                rows.set(0, row6);
                rows.set(1, row5);
                rows.set(2, row4);
                tablero.set(6, rows3);
                tablero.set(7, rows2);
                tablero.set(8, rows1);
                tablero.set(0, rows6);
                tablero.set(1, rows5);
                tablero.set(2, rows4);
            }

            this.mostrarTablero = rows;
            if (dificulty == 1) {
                for (int i = 0; i <= 8; i++) {
                    int rand = (int) (Math.random() * 8);
                    int randnum = (int) (Math.random() * 8);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
            if (dificulty == 2) {
                for (int i = 0; i <= 20; i++) {
                    int rand = (int) (Math.random() * 8);
                    int randnum = (int) (Math.random() * 8);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
            if (dificulty == 3) {

                for (int i = 0; i <= 40; i++) {
                    int rand = (int) (Math.random() * 9);
                    int randnum = (int) (Math.random() * 9);
                    mostrarTablero.get(rand).set(randnum, 0);
                }
            }
        }
    }

    private boolean randbool() {
        boolean r = false;
        double num = Math.random() * 2;
        if (num > 1) {
            r = true;
        }
        return r;
    }

    public void printBoard() {
        for (int x = 0; x < mostrarTablero.size(); x++) {
            for (int y = 0; y < mostrarTablero.size(); y++) {
                System.out.print("|" + this.mostrarTablero.get(x).get(y));
            }
            System.out.println("");
        }
    }

    public void printBoardSolution() {
        for (int x = 0; x < tablero.size(); x++) {
            for (int y = 0; y < tablero.size(); y++) {
                System.out.print("|" + tablero.get(x).get(y));
            }
            System.out.println("");
        }
    }
}