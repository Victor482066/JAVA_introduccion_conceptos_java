package primer_proyecto;

import java.util.Scanner;


public class Controlador {
    
    Scanner dato = new Scanner(System.in);
    Persona[] persona = new Persona[100];
    
    public void tiposVar(){
         //-----------------------Tipos de Variables------------------------------------------------------------------
         //Variable de tipo entero admiten solo numeros enteros
         int entero= 3; 
         //La variable String siempre es un texto
         String texto1= "Hola soy un texto";
         //Los valores booleanos siempre son true o false 
         boolean booleano = true;
         //La variable Double es para decimales
         double decimal = 3.1416;
         
         //-----------------------------------------------------------------------------------------------------------------
         String texto2 = " encadenando"; //Texto secundario
         
         //----------------Escribiedo en la consola de Java------------------------------------------------------

                  // Tu primer Hola mundo escrito en consola
                  System.out.println("hola mundo");

                  //Podemos imprimir cualquier tipo de variable en la consola
                  System.out.println("Valor de la variable texto1: " + texto1 + "\n" +
                                             "Valor de la variable entero: " + entero + "\n" +
                                             "Valor de la variable boolena: " + booleano + "\n" +
                                             "Valor de la variable decimal: " + decimal + "\n" +
                                            "________________________________________");
                  System.out.println("");

                  //Las variables son como numeros y los podemos encadenar
                  String encadenado = texto1+texto2;
                  System.out.println(encadenado);
                  System.out.println("");
    }
    
    public void Condicional_If(){
        
        int entero = 3;
         //--------------------------------------If  y  If else----------------------------------------------        

                  //El if es un condicional de verdadero o falso
                  System.out.println("Condicional If y If else");
                  System.out.println("Definamos el valor de la variable entero:");
                  try{
                      entero = dato.nextInt();
                  }catch(Exception e){
                      System.out.println("Tiene que ser un valor numerico");
                  }
                  System.out.println("");
                  
                  System.out.println("En el if verificamos si entero tiene el valor de 3");
                  if(entero == 3){
                  //Estamos validando que si entero tiene el valor de 3 enrtonces sigue las siguientes intrucciones
                  System.out.println("El valor de la variable entero es: 3 " );
                  }else{
                      //Si la respuesta es diferente de 3 entonces nos dira esta otra opcion
                      System.out.println("El valor de la variable entero no es: " + entero);
                      
                  }
        
                  // Un IF anidado consiste en tener un if dentro de otro if como una doble condicionante
                  String texto="";
                  System.out.println("");
                  System.out.println("Volvamos a definir la variable entero ");
                  try{
                      entero = dato.nextInt();
                      dato.nextLine();
                  }catch(Exception e){
                      System.out.println("Tiene que ser un valor numerico");
                  }
                  System.out.println("Bien ahora definamos el valor de la variable texto");
                  try{
                      texto = dato.nextLine();
                  }catch(Exception e){
                      System.out.println("Tiene que ser un valor numerico");
                  }
                  
                  System.out.println("");
                  //Si entero y texto tienen el mismo valor  que pide el condicional If nos dira el texto
                  if(entero == 3){
                      if(texto.equalsIgnoreCase("Hola")){
                          //si se cumplen cambas condiciones 
                          System.out.println(texto + "  el numero es: " + entero);
                      }
                  }
                  //si no se cumple una de las dos condiciones se ignorara el if
                  System.out.println("______________________________________________");
                  System.out.println("");

    }
    
    public void Buckles(){
        //------------------------------Bucle para (for)--------------------------------------------------------
                 
                 System.out.println("Bucle For");
                 for(int a =1; a<=3; a++){
                     //si el valor de a es menor o igual a 3 entonces se ejecutara el siglo para mientras la consicion se cumpla
                     System.out.print(a + " ");
                 }
                 //bucle for invertido
                 System.out.println(" \nBucle for invertido");
                 //El bucle for invertido en lugar de sumar resta a la variable
                 for(int a=5; a>=3; a--){
                     System.out.print(a +" ");
                 }
                 
                 System.out.println("");
                 //-----------------------------------Bucle While y Do While-----------------------------------------------------
                 
                 //El do while siempre se ejecutara una vez
                 int entero = 2;
                 //mientras entero sea menor a 
                 System.out.println("Buckle Do While");
                 do{
                     
                    System.out.print(entero + " ");
                     
                     entero++;
                     
                 }while(entero < 10);
                 
                 entero =1;
                 System.out.println("");
                 
                 //El while se puede ejecutar una o ninguna vez
                 System.out.println("Buckle While");
                 while(entero < 5){
                     System.out.print(entero + " " );
                     entero++;
                 }
    }
    
    public void CondicionalSwitch(){
        
        //----------------------------------------------Bucle Swictch----------------------------------------------------
                 int numero = 0;
                 while(numero == 0){
                     try{
                         System.out.println("Dijite un numero del 1 al 5");
                          numero = dato.nextInt();
                 }catch(Exception e){
                     System.out.println("Diite un valor numerico" + e);
                         dato.next();
                     
                 }
                      if(numero <=0){
                          continue;
                     }else if(numero >0){
                     }
                 }
                 //El swicth tiene distintos casos para los distintos valores de una variable
                 switch(numero){
                     
                     case 1: 
                         System.out.println("Eres el 1");
                         break;
                     case 2: 
                         System.out.println("Eres el 2");
                         break;
                     case 3:
                         System.out.println("Eres el 3");
                         break;
                     case 4:
                         System.out.println("Eres el 4");
                         break;
                     case 5:
                         System.out.println("Eres el 5");
                         break;
                         //El default nos indica el caso donde si ninguna de las anteriores se cumple entonces
                         //se hara la siguiente instruccion
                     default:
                         System.out.println("No eres un numero del 1-5");     
                 }
    }
    
    public void TryCatch(){
        
        //El try catch nos ayuda a evitar errores el momento de escribir o cambiar valores
        int entero;
        System.out.println("Escribe una letra para la variable entero");
        try{
            entero = dato.nextInt();
        }catch(Exception e){
            System.out.println("El valor no es un numero entero");
        }
        dato.next();
        //Bien ahora que pasa si no usamos el try catch
        System.out.println("Perfecto ahora vuelve a escribir una letra");
        entero = dato.nextInt();
        //El programa no lo pudo procesar y callo
        
    }
    public void Matrices(){
        
        //-------------------------------Matrices y vectores----------------------------
                 
                 //Se puede inprimir cualquier valor
                 //una matriz puede ser de n dijitos y su determinada casilla es n-1
                 
                 //Vectores
                 int[] vector = {10, 4, 2, 2, 6};
                 //Los vectores son matrices de 1x1
                 System.out.println("Ejemplo de un vector");
                  for(int a = 0; a<=4; a++){
                    System.out.print(vector[a] + " ");
                  }
                  System.out.println("");
                  
                  //Matrices
                  //Bien ahora veamos como se ve una matriz de 2x2
                  System.out.println("Ejemplo de una matriz de 2x2");
                  //Esta es una forma de definior una matriz 
                 int[][] matriz = { {1, 2, 3}, //fila 0
                                        {4, 5, 6}};   //fila 1
                 
                 for(int a=0; a<matriz.length; a++){
                     for(int c=0; c<matriz[a].length; c++){
                         System.out.print(matriz[a][c] + " ");
                     }
                     System.out.println("");
                 }
        
    }
    public void Ordenamientos(){
        
        //-----------------------------Metodo de ordenamiento---------------------
                 
                 //Metodo de la burbuja
                 int bandera = 0;
                 int[] matrix = {10, 4, 2, 2, 6};
                 //Este ordemaniento compára la posicion actual con la posicion siguiente
                System.out.println("Imprimimos el vector antes de ordenarlo");
                 for(int a=0; a<matrix.length;  a++){
                     System.out.print(matrix[a] + " ");
                 }
                 System.out.println("");
                //Lo empezamos a oprdenar
                 for(int i = 0; i<=4; i++ ){
                     for(int j = 0; j<=3; j++){
                         if(matrix[j] > matrix [j+1]){
                             bandera = matrix[j];
                             matrix[j] = matrix[j+1];
                             matrix[j+1] = bandera;
                             //Esta parter no es obligatoria solo para ver como fuinciona el ordenamiento
                             System.out.print("[ ");
                             for(int k=0; k<matrix.length; k++){
                                 System.out.print( matrix[k] + " ");
                             }
                             System.out.println(" ]");
                             //Esta parter no es obligatoria solo para ver como fuinciona el ordenamiento
                         }
                     }
                 }
                 //metodo de insercion
    }
    public void MetodoConstructor(){
        
        //------------------------------------Creacion de un objeto---------------------------------
                 int id;
                 String nombre;
                 int edad;
                 String sexo;
                 
                 System.out.println("");
                 System.out.println("Dime tu ID");
                 id = dato.nextInt();
                 dato.nextLine();
                 System.out.println("Dime tu nombre");
                 nombre = dato.nextLine();
                 System.out.println("Dime tu edad");
                 edad = dato.nextInt();
                 dato.nextLine();   
                 System.out.println("Dime tu sexo");
                 sexo = dato.next();
                 
                 for(int i = 0; i<persona.length; i++){
                     Persona p = new Persona(id, nombre, edad, sexo);
                     if(persona[i] == null){
                         persona[i] = p;
                        System.out.println("Persona guardada correctamente");
                        break;
                     }
                 }
                 
                 String name = " ";
                 //Bien ahora solicitemos encontrar los datos guardados
                 System.out.println("Escribe un nombre guardado");
                 try{
                     name = dato.next();
                 }catch(Exception w){
                     System.out.println("Esto es u error");
                 }
                 
                 for(int a=0 ; a<persona.length; a++){
                     if(persona[a] != null  && persona[a].getNombre() != null){
                         //Comando trim ignora los posibles espacios accidentales
                         if(persona[a].getNombre().trim().equalsIgnoreCase(name.trim())){  
                         System.out.println("Nombre: " + persona[a].getNombre() + 
                                            "\nID: " + persona[a].getId() +
                                            " \nEdad: " + persona[a].getEdad() +
                                            "\nSexo: " + persona[a].getSexo());
                         break;
                        }
                     }
                 }
                 
    }
}
