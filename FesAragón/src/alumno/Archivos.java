package alumno;
import java.io.*;
import estructura.*;
import java.util.Random;


public class Archivos {
    
    private double PROMEDIOS[] = {5,5.5,6,6.5,7,7.5,8,8.5,9,9.5,10};
    private int SEMESTRES [] = {1,2,3,4,5,6,7,8,9};
    private int EDADES [] ={18,19,20,21,22,23,24};
    private String CORREO = "@.unam.mx"; 
    // datos obtenidos de los archivos
    
    private String MATERIAS[],NOMBRES[];
    private int CUENTAS[];
    private Random random = new Random();
    FileReader archivo;
    BufferedReader lectura;
    
    public Alumno[] aleatorio(){
        
        Alumno alumnos[] = new Alumno[100];
        
        // Generamos 100 alumnos de forma aleatorio
        
        this.MATERIAS = leerArchivo("/home/misael/Escritorio/trabajosChuy/FesAragón/src/datos/materias.txt");
        this.NOMBRES = leerArchivo("/home/misael/Escritorio/trabajosChuy/FesAragón/src/datos/nombres.txt");
        this.CUENTAS = leerCuenta("/home/misael/Escritorio/trabajosChuy/FesAragón/src/datos/cuentas.txt");
        this.CUENTAS = BubleSort.bubleSort(this.CUENTAS);
        
        int indiceEdades = 0,indiceSemestres = 0,indicePromedios = 0;
        int indiceMaterias = 0;
        
        for(int i = 0; i<100;i++){
            
            indiceEdades = random.nextInt(7);
            indiceSemestres = random.nextInt(9);
            indicePromedios = random.nextInt(11);
            String correA = this.NOMBRES[i] + CORREO;
            
            String materias[] = new String[5];
            materias = ingresarMateria(materias);
            
            Alumno alumno = new Alumno(this.NOMBRES[i],this.EDADES[indiceEdades],correA,this.CUENTAS[i],
                    this.SEMESTRES[indiceSemestres],this.PROMEDIOS[indicePromedios],materias
            );
            
            alumnos[i] = alumno;
        }
        return alumnos;
    } // O(100) = O(1) es la complejidad de esta función, ya que siempre se ejecutará 100 veces en su estructura interna
    
    private String[] ingresarMateria(String materias[]){
        for(int i = 0; i<5;i++){
            int indiceMaterias = random.nextInt(30);
            materias[i] = this.MATERIAS[indiceMaterias];
            if(i!= 0 && materias[i-1] == this.MATERIAS[indiceMaterias]){
                ingresarMateria(materias);
            }
        }
        return materias;
    } // O(5) => O(1)
        
    private  int[] leerCuenta(String ruta){
        
            int informacion[] = new int[100];
            int i = 0;
            try {
                FileReader archivos = new FileReader(ruta);
                BufferedReader lecturas = new BufferedReader(archivos);
                String lineas = "";

                while(lineas != null){
                    try {
                        lineas = lecturas.readLine();
                        if(lineas != null){
                            informacion[i] = Integer.parseInt(lineas);
                        }
                    } catch (IOException ex) {
                        System.out.println("Error de lectura!!!");
                        break;
                    }
                    i++;
                }
                return informacion; 
            } catch (FileNotFoundException ex) {
                System.out.println("Archivo no encontrado");
                return null;
            }
    } // O(30) => O(1)
    
    private String []  leerArchivo(String ruta){
        String informacion[];
        
        if(ruta.equals("/home/misael/Escritorio/trabajosChuy/FesAragón/src/datos/materias.txt")){
            informacion = new String[30];
        }else{
            informacion = new String[100];
        }
        
        try {
            archivo = new FileReader(ruta);
            lectura = new BufferedReader(archivo);
            String lineas= "";
            int i = 0;
            
            while(lineas != null){
                try {
                    lineas = lectura.readLine();
                    if(lineas != null){
                        informacion[i] = lineas;
                    }
                } catch (IOException ex) {
                    System.out.println("Error de lectura");
                    break;
                }
                i++;
            }
            return informacion;
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado");
            return null;
        }
    } // O(100) => O(1)
}
