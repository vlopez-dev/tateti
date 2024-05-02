public class Jugador {

    private char identificador;



    public Jugador(char identificador){
        this.identificador=identificador;

    }






    public char getIdentificador(){
        return identificador;
    }


    //Deberia crear un metodo para cambiar jugador???



    public void hayEmpate(){

    }


    public boolean hayGanador(){


    return revisarColumnas(tablero) || reviarFilas(tablero) || revisarDiagonales(tablero);
    }


    public boolean revisarColumnas(){
        for (int i = 0; i < 3; i++) {
            if (tablero [0][i] !='-' && tablero[0][i] == tablero[1][i] && tablero[2][i]){
                return true;


            }
        }
        return false;
    }


    public boolean reviarFilas(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[j][0] !='-' && tablero [j][0]== tablero [j][1] && tablero [j][2]){
                    return  true;
                }
            }

        }
        return false;
    }

    
    public boolean revisarDiagonales(){

    if (tablero [0][0] !='-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]){

    }
}
