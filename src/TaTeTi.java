import java.util.ArrayList;
import java.util.Collections;


public class TaTeTi {
    private ArrayList <String> tablero;
    public TaTeTi(){
        this.tablero=tablero;
    }

    public void jugar(){
         tablero=new ArrayList<>(9);
        Collections.fill(tablero, "-");

        mostrarTablero(tablero);




    }

    public void mostrarTablero(ArrayList<String> tablero){
        System.out.println("Entre a mostrar tablero");
        if (this.tablero.isEmpty()){
            System.out.println("El tablero esta vacio");
        }else {
            for (String s: this.tablero) {
                System.out.println(s);

            }
        }


    }

    public void hayGanador(){

    }


    public void hayEmpate(){

        }






}
