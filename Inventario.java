import java.util.ArrayList;
public class Inventario{
    ArrayList<Objeto> inventario = new ArrayList<>();

    public void InsertarObjeto(String nombre, double precio, int existencia){
        inventario.add(new Objeto( nombre, precio, existencia));
    }

    public int tamañoAct(){
        return inventario.size();
    }

    public double ValorTotal(){
        double acumulador=0;
        for(Objeto obj:inventario){
            acumulador=acumulador+(obj.precio*obj.existencia);
        }
        return acumulador;
    }

    public boolean Actualizar(String nombre, double nuevoPrecio, int nuevaExistencia){
        Objeto obj=Busqueda(nombre);
        if (obj != null) {
            obj.precio = nuevoPrecio;
            obj.existencia = nuevaExistencia;
            return true;
        }
        return false;
    }

    public  Objeto Busqueda(String nombre){
        for (Objeto obj:inventario){
            if (obj.nombre.equals(nombre)){
                return obj;
            }         
        }
        return null;    
    }
}