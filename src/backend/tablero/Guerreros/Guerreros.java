package backend.tablero.Guerreros;

public abstract class Guerreros {

    double factorMuerte;
    int lugaresOcupados;

    public double getFactorMuerte() {
        return factorMuerte;
    }

    public void setFactorMuerte(double factorMuerte) {
        this.factorMuerte = factorMuerte;
    }

    public int getLugaresOcupados() {
        return lugaresOcupados;
    }

    public void setLugaresOcupados(int lugaresOcupados) {
        this.lugaresOcupados = lugaresOcupados;
    }
}
