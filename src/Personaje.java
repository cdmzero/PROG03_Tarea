
//# Llamamos a la liberia utils de Java
import java.util.Scanner;

/**
 * @author Jose Funez
 */
//# Vamos a crear una clase con una estructura básica
public class Personaje {

    //# Constructor por defecto del objeto sin parametros * Ejercicio 3 y 7,1
    Personaje() {

        nombre = "Desconocido";
        edad = 0;
        altura = 0;
        inteligencia = 0;
        fuerza = 0;

        numeroPersonajes++;
    }

    //# Constructor con parametros
    Personaje(String a, int b, int c, int d, int e) {

        nombre = a;
        edad = b;
        altura = c;
        inteligencia = d;
        fuerza = e;

        numeroPersonajes++;
    }

    //# Constantes de nuestro personaje
    final int MAX_FUERZA = 100;
    final int MAX_INTELIGENCIA = 100;

    void consultaMaxFuerza() {

        System.out.println("La fuerza maxima es:" + MAX_FUERZA);

    }

    //# Variable estatica que se ira incrementando con cada nuevo personaje instanciado
    static int numeroPersonajes;

    //Atributos de la clase
    String nombre;
    int edad;
    int altura;
    int inteligencia;
    int fuerza;

    
    //# Metodos para consultar el valor de los atributos  
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

    
    //# Metodos para cambiar el valor de los atributos del objeto   
    void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }

    void cambiaEdad(int edad) {
        this.edad = edad;
    }

    void cambiaAltura(int altura) {
        this.altura = altura;
    }

    void cambiaInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    void cambiaFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    //# Recogemos las variables  * Ejercicio 5
    
    public String toString(String a, int b, int c, int d, int e){
         
        String var ="Nombre:"+ a +"; Edad: "+ b +"; Altura: "+ c +" cm; Inteligencia: "+ d +"; Fuerza:" + e +"\n";
        
        return var;
    }
    
   
    //# Recogemos por objeto  * Ejercicio 6
    public String toString(Personaje ob) {

        String str = "Nombre:" + nombre + "; Edad: " + edad + "; Altura: " + altura + " cm; Inteligencia: " + inteligencia + "; Fuerza: " + fuerza +   "\n";

        return str;
    }

    public int sumarFuerza(Personaje p) {

        // Ejercicio 7 
        
        int fuerzaTotal = this.fuerza + p.fuerza;

        // System.out.println(p.fuerza + "\n");

        /* 
        // Ejercicio 6
        
        Personaje p = new Personaje();
         
         int fuerzaActual = this.fuerza;
         int fuerzaClase = p.fuerza;
    
  
        int fuerzaTotal = fuerzaClase + fuerzaActual;
       
        System.out.println(fuerzaTotal);
        
         */
        return fuerzaTotal;
    }

    
    
    
    
    public static void main(String[] args) {

        
    /*
// Ejercicio 1 y 2
    
        Personaje person = new Personaje();
        
       
       //# Llamamos a la liberia java.util para poder instanciar un objeto de la clase Scanner
        Scanner sc          = new Scanner( System.in );
        
       //# Invocacion de los metodos para cambiar los atributos mediante teclado
       //# Recogemos por teclado el valor de las direfentes variables 
       
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
        
       //# Por ultimo llamamos a los metodos y les pasamos como parametro la variable recogida por teclado
       
       person.cambiaNombre(strNombre);person.cambiaEdad(intEdad); person.cambiaAltura(intAltura);person.cambiaInteligencia(intInteligencia);person.cambiaFuerza(intFuerza);
        
  
        // Mostramos por pantalla el resultado final
        System.out.println("Resultado: Nombre:"+ strNombre +" Edad:"+ intEdad +" Altura:"+ intAltura +" Inteligencia:"+ intInteligencia+" Fuerza:"+ intFuerza);
        */
    
//Ejercicio 3 

/*
       
        //# Inicializamos por defecto el objeto

        Personaje person    = new Personaje();

        //# Consultamos al objeto
        System.out.println("Atributos desde el Objeto nombre:"+ person.nombre +" Edad:"+ person.edad +" Altura:"+ person.altura +" Inteligencia:"+ person.inteligencia +" Fuerza:"+ person.fuerza);

        //# Consultamos con metodos los atributos del objeto

        String strNombre      = person.consultaNombre();
        int intEdad           = person.consultaEdad();
        int intAltura         = person.consultaAltura();
        int intInteligencia   = person.consultaInteligencia();
        int intFuerza         = person.consultaFuerza();
        
       
        System.out.println("Atributos desde los metodos Nombre:"+ strNombre +" Edad:"+ intEdad +" Altura:"+ intAltura +" Nuevo Inteligencia:"+ intInteligencia +"Fuerza:"+ intFuerza);
       
        //# Cambiamos con metodos los atributos del objeto

         person.cambiaNombre("Pepito");
         person.cambiaEdad(12);
         person.cambiaAltura(162);
         person.cambiaInteligencia(33);
         person.cambiaFuerza(44);
         
         
        strNombre           = person.consultaNombre();
        intEdad             = person.consultaEdad();
        intAltura           = person.consultaAltura();
        intInteligencia     = person.consultaInteligencia();
        intFuerza           = person.consultaFuerza();
         

   
        // Mostramos por pantalla el resultado final
        System.out.println("Nuevo nombre:"+ strNombre +"\nNuevo Edad:"+ intEdad +"\nNuevo Altura:"+ intAltura +"\nNuevo Inteligencia:"+ intInteligencia+"\nNuevo Fuerza:"+ intFuerza);

 */

/* 
 //Ejercicio 4 y 5
 
     
        //# Inicializamos los objetos con parametros 
       
          Personaje person1    = new Personaje ("Frodo",33,126,98,38);
          Personaje person2    = new Personaje ("Aragorn",45,185,88,92);
          Personaje person3    = new Personaje ("Legolas",2931,178,93,84);
        
        //# Llamamos al metodo toString para que genere una cadena a partir de parametros 
       
          String str1 = person1.toString("Frodo",33,126,98,38);
          String str2 = person2.toString("Aragorn",45,185,88,92);
          String str3 = person3.toString("Legolas",2931,178,93,84);
         
       
          System.out.println(str1+str2+str3);
        
 */       
      
 /* 
    //Ejercicio 6
        
         
       //# Creamos el metodo SumarFuerza(Personaje p)
     
           Personaje p = new Personaje("Para Sumar",33,126,98,38);;
           p.sumarFuerza(p);
            
         */

/*
    //Ejercicio 7
        
        //# 1 Crea un personaje sin parametros
        
        Personaje p = new Personaje();
        String str = p.toString(p);
 
        System.out.println(str);
 
        //# 2 Crea 3 personajes
        
        
         Personaje person1          = new Personaje ("Frodo",33,126,98,38);
         Personaje person2          = new Personaje ("Aragorn",45,185,88,92);
         Personaje person3          = new Personaje ("Legolas",2931,178,93,84);
        
        //# 3 Muestra todos los datos
        
         String str1                = person1.toString(person1);
         String str2                = person2.toString(person2);
         String str3                = person3.toString(person3);
         
         System.out.println(str1 + str2 + str3);
 
        //# 4 Cambia sus datos con los metodos creados en el ejercicio 2
 
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
         
         
 
        //# 5 Muestra con ToString
        
         str1                       = person1.toString(person1);
         str2                       = person2.toString(person2);
         str3                       = person3.toString(person3);
 
         System.out.println(str1 + str2 + str3);
         
        //# 6 Crea un personaje inventado y muestra sus datos con toString();
 
         Personaje inventado        = new Personaje ("Inventado",26,189,92,192);
         String strInventado        = inventado.toString(inventado);
         
         System.out.println(strInventado);

        //# 7 Cambia sus propiedas y muestralo de nuevo
 
         inventado.cambiaNombre("Inventado Inven");
         inventado.cambiaEdad(27);
         inventado.cambiaAltura(153);
         inventado.cambiaInteligencia(323);
         inventado.cambiaFuerza(234);
 
         strInventado               = inventado.toString(inventado);
         System.out.println(strInventado);

 
        //# 8 Muestra por pantalla la suma de fuerzas
 
       
        int fuerzaPerson1           = person1.sumarFuerza(person1);
        int fuerzaPerson2           = person2.sumarFuerza(person2);
        int fuerzaTotal             = fuerzaPerson1 + fuerzaPerson2;

        System.out.println("La suma de fuerza de " + person1.nombre + " y " + person2.nombre + " es: " + fuerzaTotal + "\n");

 
        //# 9 - 10 - 11 Cada vez que se crea un personaje se debe incrementar +1 la variable
        System.out.println("Total de personajes creados: " + numeroPersonajes);
     
        p.consultaMaxFuerza();
 */
    
    }

}
