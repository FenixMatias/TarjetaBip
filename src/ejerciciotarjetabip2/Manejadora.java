
package ejerciciotarjetabip2;

import java.util.ArrayList;
public class Manejadora {
    
    private ArrayList <TarjetaBip> tar=new ArrayList <TarjetaBip>();

    public Manejadora() {
    }

    public ArrayList<TarjetaBip> getTar() {
        return tar;
    }

    public void setTar(ArrayList<TarjetaBip> tar) {
        this.tar = tar;
    }

    public int buscartarjeta(String codigo)
    {
       for (int i = 0; i < tar.size(); i++) 
       {
           if(codigo.compareToIgnoreCase(tar.get(i).getCodigo())==0)
               return i;     
       }
       return -1;
    }
    
    public String ingresartarjeta(TarjetaBip bip)
    {
        if(buscartarjeta(bip.getCodigo())==-1)
        {
            tar.add(bip);
            return "Tarjeta Creada Satisfactoriamente";
        }
        else
            return "Tarjeta ya Existe";
    }
   
    public String eliminartarjeta(String codigo)
    {
        int pos=buscartarjeta(codigo);
        if(pos!=-1)
        {
           tar.remove(pos);
           return "Tarjeta Eliminada";
        }
        else
            return "Tarjeta no Existe";
    }
    
    public String viajar(String codigo, int valorpasaje)
    {
        int pos=buscartarjeta(codigo);
        if(pos!=-1)
        {
        return tar.get(pos).viaje(valorpasaje);
        }
        else
        {
        return "Tarjeta no Existe"; 
        }
    }
    
    public String cargartarjeta(String codigo, int carga)
    {
        int pos=buscartarjeta(codigo);
        if(pos!=-1)
        {
            tar.get(pos).cargartarjeta(carga);
        return "La Carga Realizada es de $"+carga+" su Saldo es de $"+tar.get(pos).getTotaldinero();
        }
        else
        {
        return "Tarjeta no Existe"; 
        }
    }
    
}
