package ventas;

public class Teclado extends DispositivoEntrada{
    public int numTeclas;
    
    public Teclado(String marca, String modelo, double precio, TiposConexion t,int numTeclas) {
        super(marca, modelo, precio, t);
        this.numTeclas=numTeclas;
    }
    public int getNumTeclas() {
        return numTeclas;
    }
    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }
    @Override
    public String toString() {
        return "Teclado "+super.toString() + " { numTeclas=" + numTeclas + '}';
    }
}
