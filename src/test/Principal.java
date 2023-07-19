package test;

import ventas.*;

public class Principal {
    public static void main(String[] args) {
        Monitor m1=new Monitor("Samsung","Syncmaster",69.99,17);
        Teclado t1=new Teclado("Logitech","KB110",15.75,TiposConexion.USB,102);
        Raton r1=new Raton("Trust","Laser Mouse 200",25.99,TiposConexion.PS_2,1600);
        Ordenador pc1=new Ordenador("HP","Workstation 240",245.99,m1,t1,r1);
        Orden o1=new Orden();
        o1.agrearProducto(pc1,2);
        Teclado t2=new Teclado("Acer","BT-Keyboard",35.99,TiposConexion.Bluetooth,102);
        Monitor m2=new Monitor("LG","PureView22",125.99,22);
        o1.agrearProducto(t2,1);
        o1.agrearProducto(m2,1);
        o1.mostrarOrden();
        //Argumentos variables. Métodos que aceptan diferente cantidad de parámetros
        System.out.println("Suma parcial 1: "+sumarPrecios(m1,m2));
        System.out.println("Suma parcial 2: "+sumarPrecios(t1,t2,r1));
        //imprimimos el listado de ordenes
        Orden o2=new Orden();
        o2.agrearProducto(t1, 10);
        o2.agrearProducto(r1, 10);
        Orden o3=new Orden();
        Orden[] registroOrdenes={o1,o2,o3};
        System.out.println("Listado de órdenes existentes:");
        //Utilizamos la estructura FOR EACH
        for(Orden o:registroOrdenes){
            System.out.println("Nº orden: "+o.getIdorden()+" - Total:"+o.calcularTotal());
        }
        //autoboxing: convertir una variable de tipo primitivo en un objeto de su clase envolvente
        int entero=10;
        System.out.println("Valor del int:"+entero);
        Integer entero2=entero;
        System.out.println("Valor del Integer:"+entero2.toString());
        //unboxing: convertir un objeto de una clase envolvente a su tipo primitivo correspondiente
        int entero3=entero2;
        System.out.println("Valor del int final:"+entero3);
    }
    public static double sumarPrecios(Producto... productos){
        double parcial=0;
        for(int i=0;i<productos.length;i++){
            parcial+=productos[i].getPrecio();
        }
        return parcial;
    }
}