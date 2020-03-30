package backend.tablero.planetas;

public class Tierra extends Planeta {

    //generar MOLE

    double probabilidadAparicion = (double) 45/100;

    public void setDineroGenerado() {
        int max = 100;
        int min = 50;
        this.dineroGenerado += ((Math.floor(Math.random()*(max-min))+min)/1000);
    }

}
