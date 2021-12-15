
package ejerciciotarjetabip2;


public class TarjetaBip {
    
    private String codigo;
    private int totaldinero;
    private int cantidadviajes;

    public TarjetaBip(String codigo, int totaldinero, int cantidadviajes) {
        this.codigo = codigo;
        this.totaldinero = totaldinero;
        cantidadviajes = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getTotaldinero() {
        return totaldinero;
    }

    public int getCantidadviajes() {
        return cantidadviajes;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTotaldinero(int totaldinero) {
        this.totaldinero = totaldinero;
        
    }

    public void setCantidadviajes(int cantidadviajes) {
        this.cantidadviajes = cantidadviajes;
    }
    
    public int cargartarjeta(int carga)
    {
        return totaldinero=totaldinero+carga;
    }
    
    public String viaje(int valorpasaje)
    {
       if(totaldinero >= valorpasaje)
       {
          totaldinero=totaldinero-valorpasaje;
          cantidadviajes++;           
       return "Que Tenga Buen Viaje";
       }
       else
       {
       return "Saldo Insuficiente"; 
       }
    }
    
    public String toString()
    {
        return "\n|Codigo Tarjeta: "+codigo+
                " |Saldo: $"+totaldinero+
                " |Cantidad de Viajes: "+cantidadviajes; 
    }
    
}
