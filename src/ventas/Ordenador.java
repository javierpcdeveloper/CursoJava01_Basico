package ventas;

public class Ordenador extends Producto{
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    public Ordenador(String marca, String modelo, double precio,Monitor monitor,Teclado teclado,Raton raton) {
        super(marca, modelo, precio);
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }

    @Override
    public String toString() {
        return "Ordenador "+super.toString()+"{" + "\n\t" + monitor + ", \n\t" + teclado + ",\n\t" + raton + '}';
    }
    
}
