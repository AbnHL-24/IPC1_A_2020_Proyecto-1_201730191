package backend.tablero.planetas;

public class Organico extends Planeta {

    //generar Groot

    double probabilidadAparicion = (double) 25/100;

    @Override
    public void setDineroGenerado() {
        int max = 160;
        int min = 80;
        this.dineroGenerado += ((Math.floor(Math.random()*(max-min))+min)/1000);
    }

}
