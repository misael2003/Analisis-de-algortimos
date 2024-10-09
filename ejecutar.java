package productoMayor;
class ejecutar{
    public static void main(String [] args){
        //int numeros[] = {3,7,9,43,12,2,4,6};
        int numeros[] = {-9,3,5,-2,100,-7,4,8,6};
        productoMayor(numeros);
    }
    public static void productoMayor(int numeros[]){
        int mayor = 0,temporal,numero=0,temporal1; // T(n) = 1
        for(int i = 0;i<numeros.length;i++){ // T(n) = n^2
            for(int z = 0;z<numeros.length;z++){ // T(n) = n
                temporal = mayor;
                mayor = numeros[i]*numeros[z];
                temporal1 = numero;
                numero = numeros[i];
                if(temporal > mayor){
                    mayor = temporal;
                    numero = temporal1;
                }
            }
        }// O(n^2) => es la complejidad de este algoritmo
        System.out.print("El producto que da un numero mayor es el:");
        System.out.print(" " + numero + " x " + numero + " = " + mayor);
    }
}