package alumno;
public class Alumno {
    
    private int numCuenta,semestre,edad;
    private double promedio;
    private String nombre, correo;
    private String materias[] =  new String [5];
    
    public Alumno(String nombre,int edad,String correo,int numCuenta,int semestre,double promedio,String materias[]){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.numCuenta = numCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
        this.materias = materias;
    }
    
    public void mostrarMaterias(){
        for(int i = 0; i<this.materias.length;i++){
            System.out.println(materias[i]);
        }
    }
        
    // metodos de acceso
    
    public String getNombre(){return this.nombre;}
    public String getCorreo(){return this.correo;}
    public int  getCuenta(){return this.numCuenta;}
    public int getSemestre(){return this.semestre;}
    public int getEdad(){return this.edad;}
    public double getPromedio(){return this.promedio;}
    public String [] getMaterias(){return this.materias;}
}