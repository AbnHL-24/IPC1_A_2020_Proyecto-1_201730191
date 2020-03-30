package backend.tablero.constructores;

public abstract class Constructores {

    int turnosParaConstruir;
    int precioTienda;
    int precioVenta;

    public int getTurnosParaConstruir() {
        return turnosParaConstruir;
    }

    public void setTurnosParaConstruir(int turnosParaConstruir) {
        this.turnosParaConstruir = turnosParaConstruir;
    }

    public int getPrecioTienda() {
        return precioTienda;
    }

    public void setPrecioTienda(int precioTienda) {
        this.precioTienda = precioTienda;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
}
