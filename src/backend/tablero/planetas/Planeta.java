package backend.tablero.planetas;

public class Planeta {
    protected String nombre;
    protected double porcentajeMuerte;
    protected int cantidadDinero;
    protected int cantidadConstructores;
    protected int cantidadNaves;
    protected int cantidadGuerreros;
    protected double probabilidadAparicion;
    protected int guerrerosProducidos;
    protected int dineroGenerado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentajeMuerte() {
        this.porcentajeMuerte = (Math.floor(Math.random()*(999-1)+1));
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getCantidadConstructores() {
        return cantidadConstructores;
    }

    public void setCantidadConstructores(int cantidadConstructores) {
        this.cantidadConstructores = cantidadConstructores;
    }

    public int getCantidadNaves() {
        return cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }

    public int getCantidadGuerreros() {
        return cantidadGuerreros;
    }

    public void setCantidadGuerreros(int cantidadGuerreros) {
        this.cantidadGuerreros = cantidadGuerreros;
    }

    public int getGuerrerosProducidos() {
        return guerrerosProducidos;
    }

    public void setGuerrerosProducidos(int guerrerosProducidos) {
        this.guerrerosProducidos = guerrerosProducidos;
    }

    public int getDineroGenerado() {
        return dineroGenerado;
    }

}
