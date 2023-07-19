package ventas;

public class DispositivoEntrada extends Producto{
    private TiposConexion tipoConexion;
    
    public DispositivoEntrada(String marca, String modelo, double precio,TiposConexion t) {
        super(marca, modelo, precio);
        this.tipoConexion=t;
    }
    public TiposConexion getTipoConexion() {
        return tipoConexion;
    }
    public void setTipoConexion(TiposConexion tipoConexion) {
        this.tipoConexion = tipoConexion;
    }
    @Override
    public String toString() {
        return super.toString()+"Tipo conexion=" + tipoConexion +", Velocidad:"+this.tipoConexion.getVelocidad()+ "Mpbs}";
    }
}
