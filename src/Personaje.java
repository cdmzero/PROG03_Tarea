
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
    
    numeroPersonajes++;
    }
     
     
    //Constructor con parametros
    
    Personaje(String a, int b, int c, int d, int e){
    
    nombre         = a;
    edad           = b;
    altura         = c;
    inteligencia   = d;
    fuerza         = e;
    
     numeroPersonajes++;
    }
    
    //Constantes de nuestro personaje

    final int MAX_FUERZA=100;
    final int MAX_INTELIGENCIA=100;
    
    void consultaMaxFuerza() {
   
        System.out.println("La fuerza maxima es:"+MAX_FUERZA);
    
    }

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
/*
   
    public String toString(String a, int b, int c, int d, int e){
         
        String var ="Nombre:"+ a +"; Edad: "+ b +"; Altura: "+ c +" cm; Inteligencia: "+ d +"; Fuerza:" + e;
        
        return var;
    }
   
 */
    
       public String toString(Personaje ob){
           
        
         
        String var ="Nombre:"+ nombre +"; Edad: "+ edad +"; Altura: "+ altura +" cm; Inteligencia: "+ inteligencia +"; Fuerza: " + fuerza +"\n";
        
        return var;
    }
    
   
    public int sumarFuerza(Personaje p){
      
        int fuerzaTotal = this.fuerza + p.fuerza;
        
        System.out.println(p.fuerza+"\n");
        
        
        /*
        Personaje p1 = new Personaje();
         
         int fuerzaActual = this.fuerza;
         int fuerzaClase = p1.fuerza;
    
  
      
       int fuerzaTotal = fuerzaClase + fuerzaActual;
       
      //System.out.println(fuerzaTotal);
        
        */
     
        return fuerzaTotal;
    }
   
    
   
    

    
    public static void main(String[] args){
        
 
    
        
        // Inicializamos los objetos
        
       // Sin parametros
   
      //  Personaje person    = new Personaje();
       
       // Con parametros
       
          Personaje person1    = new Personaje ("Frodo",33,126,98,38);
          Personaje person2    = new Personaje ("Aragorn",45,185,88,92);
          Personaje person3    = new Personaje ("Legolas",2931,178,93,84);
          Personaje inventado  = new Personaje ("Inventado",26,189,92,192);
          
          
          
            /*
       Suma de enteros de dos objetos
       */
       
        int fuerzaPerson1       = person1.sumarFuerza(person1);
        int fuerzaPerson2       = person2.sumarFuerza(person2);
        int fuerzaTotal         = fuerzaPerson1 + fuerzaPerson2;
        
        System.out.println("La suma de Fuerza de "+person1.nombre+" y "+person2.nombre +" es: "+ fuerzaTotal+"\n"  );
          
       
          
       
      //    person.sumarFuerza(person);
      
      // String toString = person.toString(person);
       
       String toString1 = person1.toString(person1);
       String toString2 = person2.toString(person2);
       String toString3 = person3.toString(person3);
       String toStringInventado = inventado.toString(inventado);
       
       System.out.println(toString1+toString2+toString3+toStringInventado);
        
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

         person1.cambiaNombre("Pepito");
         person1.cambiaEdad(12);
         person1.cambiaAltura(162);
         person1.cambiaInteligencia(33);
         person1.cambiaFuerza(44);
         
         person2.cambiaNombre("Juan");
         person2.cambiaEdad(32);
         person2.cambiaAltura(122);
         person2.cambiaInteligencia(31);
         person2.cambiaFuerza(94);
         
         person3.cambiaNombre("Maria");
         person3.cambiaEdad(21);
         person3.cambiaAltura(152);
         person3.cambiaInteligencia(3);
         person3.cambiaFuerza(41);
        
         inventado.cambiaNombre("Inventado Inven");
         inventado.cambiaEdad(27);
         inventado.cambiaAltura(153);
         inventado.cambiaInteligencia(323);
         inventado.cambiaFuerza(234);
         
         
         String vartoString1             = person1.toString(person1);
         String vartoString2             = person2.toString(person2);
         String vartoString3             = person3.toString(person3);
         String vartoStringInventado     = inventado.toString(inventado);
         
       System.out.println(vartoString1+vartoString2+vartoString3+vartoStringInventado);


      System.out.println("Total de personajes creados: "+numeroPersonajes);
      
      
      person1.consultaMaxFuerza();
      
    
         
  
       
       
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
