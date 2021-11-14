
import java.util.Scanner;

/**
 *
 * @author Jose Funez
 */
public class Personaje {
    
    
    //Constructor Principal
    
     Personaje(){
    
    nombre         = "Desconocido";
    edad           = 0;
    altura         = 0;
    inteligencia   = 0;
    fuerza         = 0;
    }
     
     
    //Constructor con parametros
    
    Personaje(String a, int b, int c, int d, int e){
    
    nombre         = a;
    edad           = b;
    altura         = c;
    inteligencia   = d;
    fuerza         = e;
    }
    
    //Constantes de nuestro personaje

    final int MAX_FUERZA=100;
    final int MAX_INTELIGENCIA=100;

    //Variable estatica que se ira incrementando con cada nuevo personaje
    
    static  int numeroPersonajes;
    
    //Atributos de la clase
    
    String nombre;
    int edad; 
    int altura;
    int inteligencia;
    int fuerza;
    
    
     //Metodos para consultar el valor de los atributos  
    String consultaNombre() {
        return this.nombre;
    }
    
    int consultaEdad() {
        return this.edad;
    }
       
    int consultaAltura() {
        return this.altura;
    }
    
    int consultaInteligencia() {
        return this.inteligencia;
    }

    int consultaFuerza() {
        return this.fuerza;
    }
    
    
    //Metodos para cambiar el valor de los atributos    
    void cambiaNombre(String nombre){
        this.nombre=nombre;
    }
     
    void cambiaEdad(int edad){
        this.edad=edad; 
    }
    
    void cambiaAltura(int altura){
        this.altura=altura; 
    }
    
    void cambiaInteligencia(int inteligencia){
        this.inteligencia=inteligencia; 
    }
    
    
    void cambiaFuerza(int fuerza){
        this.fuerza=fuerza;
    }
    
    public String toString(String a, int b, int c, int d, int e){
    
        String bb = String.valueOf(b);
        String cc = String.valueOf(c);
        String dd = String.valueOf(d);
        String ee = String.valueOf(e);
       
        
        String var ="Nombre:"+ a +"; Edad: "+ bb +"; Altura: "+ cc +" cm; Inteligencia: "+ dd +"; Fuerza:" + ee;
        
        return var;
    }
   
    
   
    public int sumarFuerza(Personaje p){
      
        
        Personaje p1 = new Personaje();
         
         int fuerzaActual = this.fuerza;
         int fuerzaClase = p1.fuerza;
    
  
      
       int fuerzaTotal = fuerzaClase + fuerzaActual;
       
      //System.out.println(fuerzaTotal);
     
        return fuerzaTotal;
    }
   
    
   
    

    
    public static void main(String[] args){
        
 
    
        
        // Inicializamos los objetos
        
       // Sin parametros
   
      //  Personaje person    = new Personaje();
       
       // Con parametros
       
          Personaje person    = new Personaje ("Frodo",33,126,98,38);
       
          person.sumarFuerza(person);
      
       //String toString = person.toString("Frodo",33,126,98,38);
       
       //System.out.println(toString);
        
       /*  
        Scanner sc          = new Scanner( System.in );
        
        
        //Recogemos por teclado el valor de las direfentes variables 
        
       
        System.out.println("Nombre del personaje:");
        String strNombre            = sc.nextLine();
        
        
        System.out.println("Edad del personaje:");
        int intEdad                 = sc.nextInt();
        
        
        System.out.println("Altura del personaje:");
        int intAltura               = sc.nextInt();
        
        System.out.println("Inteligencia del personaje:");
        int intInteligencia         = sc.nextInt();
        
        
        System.out.println("Fuerza del personaje:");
        int intFuerza       = sc.nextInt();
        
        */
        
        // Invocacion de los metodos para cambiar los atributos mediante teclado
        
        // person.cambiaNombre(strNombre);person.cambiaEdad(intEdad); person.cambiaAltura(intAltura);person.cambiaInteligencia(intInteligencia);person.cambiaFuerza(intFuerza);
       
        // Invocacion de los metodos para cambiar los atributos mediante parametros



        //Invocacion de los metodos para consultar los atributos
        /* 
        String nNombre      = person.consultaNombre();
        int nEdad           = person.consultaEdad();
        int nAltura         = person.consultaAltura();
        int nInteligencia   = person.consultaInteligencia();
        int nFuerza         = person.consultaFuerza();
        */
      
        
        
        // Mostramos por pantalla el resultado final
        //System.out.println("Nuevo nombre:"+ nNombre +"\nNuevo Edad:"+ nEdad +"\nNuevo Altura:"+ nAltura +"\nNuevo Inteligencia:"+ nInteligencia+"\nNuevo Fuerza:"+ nFuerza);
    }


}
