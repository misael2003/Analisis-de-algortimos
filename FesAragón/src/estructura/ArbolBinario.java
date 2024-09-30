package estructura;
import alumno.Alumno;

public class ArbolBinario {
    private NodoArbol raiz;
    private int tamaño;
    
    public ArbolBinario(){this.tamaño = 0;}
     
    public void agregar(Alumno dato){
        if(getTamaño() == 0){
            this.raiz = new NodoArbol(dato);//T(n) = 1
            this.tamaño++;
        }else{
            this.raiz.insertarNuevoNodo(dato); // T(n) = log n
            this.tamaño++;
        }
    } // Por tanto la complejidad de esta función es => O(log n)
    
    public Alumno buscarAlumno(int cuenta){
        if(this.tamaño == 0){ // T(n) => 1
            return null;
        }
        // si el tamaño es mayor o igual a 1
        if(this.raiz.getDato().getCuenta() == cuenta){
            return this.raiz.getDato(); // T(n) => 1
        }else{
            return this.raiz.buscarNodo(cuenta); // T(n) => log n
        }
    } // Por tanto la complejidad de la busqueda es de => O(log n)
    
    // metodos de accesos
    public int getTamaño(){return this.tamaño;}
    public NodoArbol getRaiz(){return this.raiz;}
}
