// creamos la parte inicial de la BD

package inicio;
import estructura.ArbolBinario;
import alumno.*;
import java.util.Scanner;

public class Inicio {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        boolean control = true;
        int desicion = 0;
        ArbolBinario arbol = new ArbolBinario();
        Alumno alumnos[];
        
        // generamos los 100 alumnos
        
        Archivos archivos = new Archivos();
        alumnos = archivos.aleatorio();
        
        for(int i = 50;i>=0;i--){arbol.agregar(alumnos[i]);}
        
        for(int x = 51;x<=99;x++){arbol.agregar(alumnos[x]);}
        
        // entradas alumno
        
        int cuenta = 0,edad = 0,semestre = 0;
        double promedio = 0.0;
        String nombre,correo,Materia;
        String materias [] = new String[5];
        
        String menu = """
                      ------------------------------
                      1. Salir
                      2. Insertar alumno.
                      3. Consultar alumno.
                      4. Materias totales
                      """;
        
        System.out.println("FACULTAD DE ESTUDIOS SUPERIORES ARAGÓN");
        
        while(control){
            System.out.print(menu);
            desicion = entrada.nextInt();
            
            switch(desicion){
                case 1:
                    control = false;
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    nombre = entrada.next();
                    
                    System.out.print("Edad: ");
                    edad = entrada.nextInt();
                    
                    System.out.print("Correo: ");
                    correo = entrada.next();
                    
                    System.out.print("Numero de cuenta: ");
                    cuenta = entrada.nextInt();
                    
                    System.out.print("Semestre: ");
                    semestre = entrada.nextInt();
                    
                    System.out.print("Promedio: ");
                    promedio = entrada.nextDouble();
                    
                    for(int i= 0; i<materias.length;i++){
                        System.out.print("Ingresar materia:");
                        Materia = entrada.next();
                        materias[i] = Materia;
                    }
                    
                    Alumno alumno = new Alumno(nombre,edad,correo,cuenta,semestre,promedio,materias);
                    arbol.agregar(alumno);
                    break;
                case 3:
                    System.out.print("Cuenta: ");
                    cuenta = entrada.nextInt();
                    Alumno al = arbol.buscarAlumno(cuenta);
                    
                    if(al == null){
                        System.out.println("El alumno no existe en la plataforma");
                    }else{
                        String mt [] = al.getMaterias();
                        
                        System.out.println("Nombre: " + al.getNombre());
                        System.out.println("Numero de cuenta: " + al.getCuenta());
                        System.out.println("promedio: " + al.getPromedio());
                        System.out.println("Semestre: " + al.getSemestre());
                        
                        for(int i = 0; i< mt.length;i++){
                            System.out.println("Materia: " + mt[i]);
                        }
                    }
                    break;
                           
                default:
                    System.out.println("Opción invalida");
            }
        }
    }       
}
