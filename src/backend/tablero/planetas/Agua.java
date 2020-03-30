package backend.tablero.planetas;

public class Agua extends Planeta {

    //generar NEMO

    double probabilidadAparicion = (double) 25/100;

    @Override
    public void setDineroGenerado() {
        int max = 120;
        int min = 60;
        this.dineroGenerado += ((Math.floor(Math.random()*(max-min))+min));
    }

}
