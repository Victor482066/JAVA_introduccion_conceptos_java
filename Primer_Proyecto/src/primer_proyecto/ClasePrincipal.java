package primer_proyecto;

import java.util.Scanner;


//Todo nuestro codifgo estará dentro de la clase principal 
public class ClasePrincipal {
    
    
         //Inicializamos un obbjeto de la clase Scanner para guardar datos
         Scanner valor = new Scanner(System.in);
         Controlador opciones = new Controlador();
         Ventanas ventana = new Ventanas();
  
         
   
         private int variable =0;
         public void principal(){
             
             while(variable !=11){
                 
                 System.out.println("");
                 System.out.println("------------------------------Bienvenido al menu-----------------------------");
                 System.out.println("1. Tipos de Variables");
                 System.out.println("2. Condicional If y If else");
                 System.out.println("3. Tipos de buckles (for, while, do while)");
                 System.out.println("4. Condicional switch");
                 System.out.println("5. Correccion de errores (Try Catch)");
                 System.out.println("6. Matrices y vectores");
                 System.out.println("7. Metodos de ordenamiento");
                 System.out.println("8. Objetos en java y metodo constructor");
                 System.out.println("9. Ventanas Simples(JPanel , JLabel, JFrame)");
                 System.out.println("10. Creditos");
                 System.out.println("11. Salir");
                 System.out.println("Escojan una opcion:");
                 
                 try{
                     variable = valor.nextInt();
                 }catch(Exception e){
                     System.out.println("Por favor escriba un valor numerico");
                     valor.next();
                     System.out.println("");
                     continue;
                 }
                 
                 switch(variable){
                     
                     case 1:
                         opciones.tiposVar();
                         break;
                     case 2:
                         opciones.Condicional_If();
                         break;
                     case 3:
                         opciones.Buckles();
                         break;
                      case 4:
                          opciones.CondicionalSwitch();
                         break;
                      case 5:
                          opciones.TryCatch();
                         break;
                      case 6:
                          opciones.Matrices();
                         break;
                      case 7:
                          opciones.Ordenamientos();
                         break;
                      case 8:
                          opciones.MetodoConstructor();
                         break;
                      case 9:
                          ventana.setVisible(true);
                         break;
                      case 10:
                          System.out.println("");
                          System.out.println("__________________________________________________________");
                          System.out.println("Creado por : Ing. Sistemas" +
                                                    "\n             Victor Reyes");
                          System.out.println("");
                         break;
                      case 11:
                          System.out.println("ESTUDIAR ES LA LLAVE DEL EXITO");
                          return;
                      default:
                          System.out.println("Escriba una opcion valida");
                     
                 }
                 
             }
         }
}
