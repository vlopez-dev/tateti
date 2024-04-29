import java.util.Scanner;

public class TaTeTi {
    private char [][]  tablero;
    private char jugador;

    public TaTeTi(){
        tablero= new char[3][3];
        inicioTablero();
        jugador = 'X';

    }




    public void jugar(){
        int fila, columna;
        Scanner sc =new Scanner(System.in);
        do {


        mostrarTablero();
        System.out.println("Jugador " + jugador + " Ingresa la fila.0 -2 :");
        fila=sc.nextInt();
        System.out.println("Jugador " + jugador + " columna la columna.0 -2 :");
        columna=sc.nextInt();
        marcartablero(fila,columna,jugador);

        }while (true);
    }

    public void mostrarTablero(){
        System.out.println("Tablero");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }


    }


    public void marcartablero(int fila,int columna,char jugador){
        if (tablero[fila][columna] == '-'){


            for (int i = 0; i <tablero.length ; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    tablero[fila][columna]=jugador;

                }

            }

        }else {
            jugador = jugador == 'X' ? 'O':'X';// Tengo un problema simpre sale jugador x y tendria que ser o deberia retornar el jugador?
            System.out.println(jugador);
            System.out.println("Error posicion ocupada vuelva a intentar");

        }

    }

    public void inicioTablero(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]='-';
            }
        }
    }



    public void hayGanador(){

        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j <tablero.length ; j++) {

            }
        }

    }


    public void hayEmpate(){

        }






}
