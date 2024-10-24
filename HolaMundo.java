import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
        public static void main(String[] args) {
            System.out.println( "10"); //el println imprime las cosas entre parrafos, mientras que el print lo hace de corrido
           System.out.print("cuantos subs tienes hoy");
           System.out.print(10);
           System.out.print(10.5);
           System.out.print('A');
           System.out.println();
            System.out.printf("Aqui va una cadena: %s%n","1.000.000");
            System.out.printf("Aqui va un entero: %d%n",20);
            System.out.printf("Minombre es %s y tengo %d años%n","Foxispro",20 );
            var entrada =new Scanner (System.in); 
            System.out.print("Por favor ingrese su nombre:");
            var entero = entrada.nextLine();
            System.out.println(entero);
            entrada.close();

}        
    }
