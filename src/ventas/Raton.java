package ventas;

public class Raton extends DispositivoEntrada{
    public double dpi;
    
    public Raton(String marca, String modelo, double precio, TiposConexion t,double dpi) {
        super(marca, modelo, precio, t);
        this.dpi=dpi;
    }

    public double getDpi() {
        return dpi;
    }

    public void setDpi(double dpi) {
        this.dpi = dpi;
    }
    @Override
    public String toString() {
        return "Raton "+super.toString() + " { dpi=" + dpi + '}';
    }
}
