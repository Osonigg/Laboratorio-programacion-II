import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // instancia de obejto de entrada de datos  
        String fin; // declaracion de variable

        System.out.println("Semaforo en rojo"); 
        fin = input.nextLine();
       
        while (!"fin".equals(fin)) { // crea la condicion repetitiva con la comparacion de la variable fin
            System.out.println("Semaforo en amarillo");
            String x = input.nextLine(); // guarada el valor de entrada en x
            if (!"fin".equals(x)) {
                System.out.println("Semaforo en verde");
                String y =input.nextLine(); //guarda el valor de entrada en y
                if (!"fin".equals(y)) { 
                    System.out.println("Semaforo en rojo");
                    String z = input.nextLine(); // guarda el valor de entrada en z
                    y = z; // iguala el valor de y a z
                }
                x = y; // iguala el valor de x a y
            }
            fin = x; // iguala valor de fin a x
        };
    }
}