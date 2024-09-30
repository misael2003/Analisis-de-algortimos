// representamos el nodo de un arbol binario

package estructura;
import alumno.Alumno;

public class NodoArbol {
    
    private Alumno dato;
    private NodoArbol derecho,izquierdo;
    
    public NodoArbol(Alumno dato){
        this.dato = dato;
        this.derecho = null;
        this.izquierdo = null;
    }
    
    public void insertarNuevoNodo(Alumno dato){
        if(dato.getCuenta() < this.dato.getCuenta()){
            // insertamos elementos en la izquierda del arbol
            if(this.izquierdo == null){
                this.izquierdo = new NodoArbol(dato);
            }else{
                this.izquierdo.insertarNuevoNodo(dato);
            }
        }
        
        if(dato.getCuenta() > this.dato.getCuenta()){
            // insertamos elementos en la derecha del arbol
            if(this.derecho == null){
                this.derecho = new NodoArbol(dato);
            }else{
                this.derecho.insertarNuevoNodo(dato);
            }
        }
    } // O(log n) es la complejidad de la insercion
    
    public Alumno buscarNodo(int cuenta){
        
        // buscamos en el nodo izquierdo
        
        if(this.izquierdo == null){return null;}
        
        if(cuenta < this.dato.getCuenta()){
            if(cuenta == this.izquierdo.getDato().getCuenta()){
                return this.izquierdo.getDato();
            }else{
                return this.izquierdo.buscarNodo(cuenta);
            }
        }
        
        // buscamos en el nodo derecho
        
        if(this.derecho == null){return null;}
        
        if(cuenta > this.dato.getCuenta()){
            if(cuenta == this.derecho.getDato().getCuenta()){
                return this.derecho.getDato();
            }else{
              return this.derecho.buscarNodo(cuenta);
            }
        }else{
            return null;  
        }
    } // O(log n) es la complejidad de la busqueda
         
    // metodos de acceso y de cambio
        
    public NodoArbol getDerecho(){return this.derecho;}
    public NodoArbol getIzquierdo(){return this.izquierdo;}
    public Alumno getDato(){return this.dato;}
}
