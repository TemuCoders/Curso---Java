class Alumno{
    private String nombre;
    private String apellido;
    private double nota;
    
    public Alumno(String nombre, String apellido, double nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }
    
    // Getter
    public double getNota(){
        return nota;
    }
    
    // Setter
    public void setNota(double nueva_nota){
        if(nueva_nota > 0){
            nota = nueva_nota;
        } else {
            System.out.println("Nota es invalida");
        }
    }
    
    // Getter
    public String getNombre(){
        return nombre;
    }
    
}

public class Main
{
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno("Juan", "Perez", 09.5);
		
		System.out.println("Nota actual: " + alumno.getNota());
		
		alumno.setNota(-1);
		alumno.setNota(15);
		
		System.out.println("Nota actual: " + alumno.getNota());
		
	}
}
