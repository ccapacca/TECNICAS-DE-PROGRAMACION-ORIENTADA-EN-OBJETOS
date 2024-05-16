
package pkg121;

public class Main {

  
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2=new Alumno(25,"luis"," de chavez");
        
        System.out.println(" la edad del alumno es : "+alu2.getDato());
        System.out.println("el nombre del alumno es : "+alu2.getNombre());
        System.out.println(" el apellido del añumno es : "+alu2.getApellido());
        
       
        
        alu1.setDato(8);
        alu1.setNombre("juanito");
        alu1.setApellido("ccapacca");
        
         System.out.println(" la edad del alumno es : "+alu1.getDato());
        System.out.println("el nombre del alumno es : "+alu1.getNombre());
        System.out.println(" el apellido del añumno es : "+alu1.getApellido());
       
        System.out.println("---------------------------");
        
        alu2.setNombre("anthony");
        alu2.setApellido("ccapacca");
        alu2.setDato(20);
         System.out.println(" la edad del alumno es : "+alu2.getDato());
        System.out.println("el nombre del alumno es : "+alu2.getNombre());
        System.out.println(" el apellido del añumno es : "+alu2.getApellido());
        System.out.println("---------------------------");
        
        
    }
    
}
