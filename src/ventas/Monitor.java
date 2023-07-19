package ventas;

public class Monitor extends Producto{
    private int tamanio;
    public Monitor(String marca, String modelo, double precio,int tamanio) {
        super(marca, modelo, precio);
        this.tamanio=tamanio;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor "+super.toString()+"{" + "tamanio=" + tamanio + '}';
    }
}
