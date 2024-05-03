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

                        }

                }
                return tablero;
        }else{
                System.out.println("Esa casilla esta ocupada, vuelva a intentar");
            }


        return tablero;
    }



    public void hayEmpate(){

    }


    public boolean hayGanador(){


        return revisarColumnas() || reviarFilas() || revisarDiagonales();
    }


    public boolean revisarColumnas(){
        for (int i = 0; i < 3; i++) {
            if (tablero [0][i] !='-' && tablero[0][i] == tablero[1][i] && tablero[1][i] ==tablero[2][i]){
                return true;


            }
        }
        return false;
    }


    public boolean reviarFilas(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[j][0] !='-' && tablero [j][0] == tablero [j][1] && tablero [j][1]== tablero [j][2]){
                    return  true;
                }
            }

        }
        return false;
    }


    public boolean revisarDiagonales(){

        if (tablero [0][0] !='-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]){
            if(tablero [2][2] != '-' && tablero [2][2] == tablero[1][1] && tablero [1][1]== tablero [0][0]){
                return true;
            }
        }
        return false;
    }

}
