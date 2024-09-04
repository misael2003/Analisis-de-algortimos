package tarea2;

public class Combinaciones {
    
    public static void main(String[] args){
        //  probamos con diferentes arreglos
        int a [] = {2,4,6}; 
        int b [] = {10,20,30,40}; 
        
        System.out.println("Prueba 1"); 
        combinar(a); 
        
        System.out.println("Prueba 2:");
        combinar(b);
    }
    
    public static void combinar(int numeros[]){
        for(int i = 0; i < numeros.length; i++){
            // t(n) = n
            for(int z = 0; z < numeros.length; z++){
                // t(n) =  n²
                System.out.println("(" + numeros[i] + "," + numeros[z] + ")");
            }
        }
        
        // complejidad del algoritmo
        // t(n) = n + n² = n²
        // O(n) = n²
    }
}
