import java.util.Scanner;;

public class Test {
    public void prueba1() {
        Sodoku sodoku1 = new Sodoku(2, 6);
        sodoku1.generateArray();
        System.out.println("Tablero, dificultad 2 dimension 6: ");
        sodoku1.printBoard();
        
        System.out.println("\nSolucion: ");
        sodoku1.printBoardSolution();

        Sodoku sodoku2 = new Sodoku(3, 9);
        sodoku2.generateArray();
        System.out.println("Tablero, dificultad 3 dimension 9: ");
        sodoku2.printBoard();
        System.out.println("\nSolucion: ");
        sodoku2.printBoardSolution();
    }

    public void prueba2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dificultad: ");
        int dif = sc.nextInt();
        System.out.println("Ingrese la dimension(6 o 9): ");
        int dim = sc.nextInt();

        Sodoku sodoku3 = new Sodoku(dif, dim);
        sodoku3.generateArray();
        System.out.println("Tablero: ");
        sodoku3.printBoard();

        System.out.println("Tablero solucionado: ");
        sodoku3.printBoardSolution();
        sc.close();
    }
}
