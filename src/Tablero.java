public class Tablero  {
    private char [][]  tablero;

    public Tablero(char [][] tablero){
        this.tablero=tablero;
    }




    public void inicioTablero(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]='-';
            }
        }
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


    public void mostrarTableroActualizado(char [][] tablero){
        System.out.println("Tablero");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }






    public char [][] marcartablero(int fila, int columna, Jugador jugador){
            if (tablero[fila][columna]=='-'){
                for (int i = 0; i < 3 ; i++) {
                    for (int j = 0; j < 3; j++) {
                        tablero[fila][columna]=jugador.getIdentificador();
                        if (jugador.getIdentificador()=='x'){
                            jugador.cambioDeJugador();
                        }


                    }

                }
                return tablero;
        }else{
                System.out.println("Esa casilla esta ocupada, vuelva a intentar");
            }


        return tablero;
    }




}
