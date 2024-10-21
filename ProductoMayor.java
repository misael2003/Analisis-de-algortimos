// Encontramos el producto mayor de un arreglo usando el divide y venceras
package productoMayor;
public class ProductoMayor {
    public static void main(String [] args){
        int numeros[] = {-9,3,5,-2,100,-7,4,8,6};
        int numeros1[] = {3,7,9,-43,12,2,4,6};
        productoMayorD(numeros);
        productoMayorD(numeros1);
    }
    public static void productoMayorD(int numeros[]){
        int mayor1 =0, mayor2=0, divide = (numeros.length)/2;
        int temporal = 0,temporal1 = 0, numeroTemporal,numeroTemporal1;
        int numeroDerecha = 0, numeroIzquierdo = 0;
        int derecha [];
        int izquierda[];
        
        // aplicamos el slicing
        
        if((numeros.length)%2 != 0){
            // si la divicion es impar
            divide = (numeros.length-1)/2;
            izquierda = new int[divide+1];
            derecha= new int[divide];
        }else{
             derecha= new int[divide];
             izquierda = new int[divide];
        }
            
        int indiceDerecha = 0, indiceIzquierda = 0;     
        while(indiceDerecha <= divide){
            if(indiceDerecha == derecha.length){break;} else{
                derecha[indiceDerecha] = numeros[indiceDerecha];
                indiceDerecha++;
            }
        }
        while(divide <= numeros.length-1){
            if(indiceIzquierda ==  izquierda.length){break;} else{
                izquierda[indiceIzquierda] = numeros[divide];
                indiceIzquierda++;
                divide++;
            }
        }     
        // obtenemos el mayor
        
        for(int i = 0;i<derecha.length;i++){
            temporal = mayor1;
            numeroTemporal = numeroDerecha;
            numeroDerecha = derecha[i];
            mayor1 = derecha[i] * derecha[i];
          if(mayor1 < temporal){
              mayor1 = temporal;
              numeroDerecha = temporal;
          }
        }
        
        for(int z = 0;z<izquierda.length;z++){
            temporal1 = mayor2;
            numeroTemporal1 = numeroIzquierdo;
            numeroIzquierdo = izquierda[z];
            mayor2 = izquierda[z] * izquierda[z];
            if(mayor2<temporal1){
                mayor2 = temporal1;
                numeroIzquierdo = numeroTemporal1;
            }
        }
        
        // presentamos el resultado
        
        if(mayor1 > mayor2){
            System.out.print("El producto que da un numero mayor es el:");
            System.out.print(" " + numeroDerecha + " x " + numeroDerecha + " = " + mayor1);
        }else{
            System.out.print("El producto que da un numero mayor es el:");
            System.out.println(" " + numeroIzquierdo + " x " + numeroIzquierdo + " = " + mayor2);
        }
    };
}
