/**
* @Autor - GitHub: JosuéRomeroJ
* @Fecha: 28/Mayo/2021
* @Contacto: josueromram@uotlook.es
* @Materia: Estructuras de Datos
* @Profesor: Giovanni Fajardo Utria
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

//public class InterfazApp
//{
//    public static void main(String[] args) 
//    {   
//        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numero :: "));
//        JOptionPane.showMessageDialog(null, "Suma Total >> " + sumaRecursiva(aux));
//    }
//    
//    public static int sumaRecursiva(int n)
//    {   if (n < 10){
//            return n;
//        }
//        return sumaRecursiva(n/10)+(n%10); 
//    }

/*Esta seria otra forma, debes quitar los comentarios de la linea 12-25*/
public class InterfazApp
{ private int num;
    
    public InterfazApp() {
    }
    
    public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
        int jrj;
        System.out.print("Ingrese los numeros :: "); jrj = sc.nextInt();
        System.out.println("La suma es => " + sumaRecursiva(jrj) + "\n");
        
    }
    
    public static int sumaRecursiva(int n)
    {   if (n < 10){
            return n;
        }
        return sumaRecursiva(n/10)+(n%10); 
    }        
}