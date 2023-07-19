package ventas;

public enum TiposConexion {
    USB(5),
    Bluetooth(4),
    Radiofrecuencia(2),
    USB_C(50),
    PS_2(2);
    private final int velocidad;
    
    TiposConexion(int velocidad){
        this.velocidad=velocidad;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
}
