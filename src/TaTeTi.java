import java.util.Scanner;

public class TaTeTi {



    public TaTeTi(){





    }




    public void jugar(){
        Scanner sc = new Scanner(System.in);
        int fila = 0,columna = 0;
        Jugador jugadorx=new Jugador('x');
        Jugador jugadoro=new Jugador('o');
        char [][] tableroinicial = new char[3][3];
        Tablero tablero = new Tablero(tableroinicial);
        tablero.inicioTablero();
        tablero.mostrarTablero();
        do {

        System.out.println("Jugador " + jugadorx.getIdentificador() + " Ingresa la fila.0 -2 :");
        fila=sc.nextInt();
        System.out.println("Jugador " + jugadorx.getIdentificador() + "  Ingresa la columna.0 -2 :");
        columna=sc.nextInt();
        char [][]tableroMarcado= tablero.marcartablero(fila,columna,jugadorx);
        tablero.mostrarTableroActualizado(tableroMarcado);



        }while (true);

    }
}


