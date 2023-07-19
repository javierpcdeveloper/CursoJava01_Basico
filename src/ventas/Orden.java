package ventas;

public class Orden {
    private final int idorden;
    private Producto[] productos;//array con los productos que contiene la orden
    private int[] cantidades;
    private static int contadorOrdenes;//estatic porque es común a todas las órdenes
    private int contadorProductos;//cuenta los productos que contiene la orden
    private final static int MAX_PRODUCTOS=10;//static porque es común a todas las órdenes y final porque es una constante
    
    public Orden(){
        this.idorden=++Orden.contadorOrdenes;//asignamos como id el número de órdenes que existen
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
        this.cantidades=new int[Orden.MAX_PRODUCTOS];
    }

    public int getIdorden() {
        return idorden;
    }    
    public void agrearProducto(Producto producto,int cantidad){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){//comprueba si no se ha superado el límite del array
            this.productos[this.contadorProductos]=producto;
            this.cantidades[this.contadorProductos++]=cantidad;//primero se asigna el valor y luego se incrementa el contador
        }else{
            System.out.println("Se ha superado el máximo de productos de la orden");
        }
    }
    public double calcularTotal(){
        double total=0;
        for(int i=0;i<this.contadorProductos;i++){
            total+=this.productos[i].getPrecio()*this.cantidades[i];//operador de composición
        }
        return total;
    }
    public void mostrarOrden(){//usamos la estructura FOR tradicional
        System.out.println("Id de la orden: "+this.idorden);
        System.out.println("Productos de la orden:");
        for(int i=0;i<this.contadorProductos;i++){
            System.out.println("Producto "+(i+1)+" de "+this.contadorProductos+": "+this.cantidades[i]+" x "+this.productos[i]);
        }
        System.out.println("Total precio: "+this.calcularTotal()+"€");
    }
}
