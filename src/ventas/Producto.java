package ventas;

public class Producto {
    private final int idProducto;
    private String marca;
    private String modelo;
    private double precio;
    private static int contadorProductos;
    
    static{
        //Bloque de código que se ejecuta antes del constructor (sólo la 1ª vez que se crea un objeto Producto)
        //accedemos a variables estáticas de la clase
        Producto.contadorProductos=0;
        System.out.println("Inicializamos el contador de productos a 0");
    }
    {
        //Bloque de código que se ejecuta cada vez antes del constructor
        //accedemos a variables estáticas y no estáticas
        Producto.contadorProductos++;
        System.out.println("Incrementamos el contador de productos");
    }
    private Producto(){
        this.idProducto=Producto.contadorProductos;
    }
    public Producto(String marca,String modelo,double precio){
        this();
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "{" + "idProducto=" + idProducto + ", marca=" + marca + ", modelo="+modelo+", precio=" + precio + '}';
    }
}
