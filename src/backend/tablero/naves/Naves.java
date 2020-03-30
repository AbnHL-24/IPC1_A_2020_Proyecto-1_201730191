package backend.tablero.naves;

public abstract class Naves {

    int espacios;
    int costoProduccion;
    double velocidad;

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public int getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(int costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
