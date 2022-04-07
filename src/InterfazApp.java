/**
* @author Josué Romero
* @date 28/Mayo/2021
* @contact josueromram@uotlook.es
* @matter Estructuras de Datos
* @teacher Giovanni Fajardo Utria
*/

import java.util.Scanner;

public class InterfazApp {
    
    public InterfazApp() {
        /*Constructor por buenas practicas*/
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Ingrese los números: ");
        x = sc.nextInt();
        System.out.println("La suma es = " + sumaRecursiva(x) + "\n");
    }
    
    public static int sumaRecursiva(int n) {
        if (n < 10) {//x=20
            return n;
        }
        return sumaRecursiva(n/10)+(n%10);//2 
    }
}
