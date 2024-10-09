package patron;
public class Patronn {
    public static void main(String [] args){
        int A[] = {0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,1,1,0,1};
        int P[] = {0,1,1,0,1};
        patron(P,A); // complejidad del algoritmo => O(n^2)
    }     
    public static void patron(int P[],int A[]){
        boolean encontrado = false;
        int tamañoControl = P.length-1;
        for(int i = 0;i<A.length;i++){
            int encontrar = 0,x = i,control = 0;
            while(control <=tamañoControl){
                if(A[x] == P[control] && x!=A.length){
                    encontrar++;
                }else{break;}
                control++;
                x++;
            }
            if(encontrar== P.length){
                encontrado = true;
                break;
            }
        }
        if(encontrado == true){System.out.println("El patron se ha encontrado correctamente!!");}else{
            System.out.println("No hay coincidencias con el patron");
        }
    }
}
