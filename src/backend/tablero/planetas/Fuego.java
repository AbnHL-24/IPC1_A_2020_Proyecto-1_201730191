package backend.tablero.planetas;

public class Fuego extends Planeta {

    //generar Magma

    double probabilidadAparicion = (double) 25/100;

    public void setDineroGenerado() {
        int max = 140;
        int min = 70;
        this.dineroGenerado += ((Math.floor(Math.random()*(max-min))+min)/1000);
    }

}
