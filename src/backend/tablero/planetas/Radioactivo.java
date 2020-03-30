package backend.tablero.planetas;

public class Radioactivo extends Planeta {

    //generar FISION GUY

    double probabilidadAparicion = (double) 25/100;

    @Override
    public void setDineroGenerado() {
        int max = 180;
        int min = 90;
        this.dineroGenerado += ((Math.floor(Math.random()*(max-min))+min)/1000);
    }

}
