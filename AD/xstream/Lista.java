package xstream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam205
 */
public class Lista {
    //Clase de lista generica con 
    //constructor getter, settet y toString
    private List<Object> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }
    
    @Override
    public String toString() {
        return lista.toString();
    }
    
}
