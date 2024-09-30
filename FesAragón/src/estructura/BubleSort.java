package estructura;
public class BubleSort {
    // Aplicamos el algoritmo de la burbuja para ordenar los datos
    public static int [] bubleSort(int data[]){
        int puntero = data.length - 1;
        for(int x = 0; x< (data.length) -1; x++){
            int y = 0;
            while(y < puntero){
                if(data[y] > data[y +1]){
                    int temporal = data[y];
                    data[y] = data[y+1];
                    data[y+1] = temporal;
                }
                y++;
            }
            puntero --;
        }
        return data;
    } // O(n) es la complejidad de esta función de ordenamiento
}
