
package ejercicio18_cap3;
import java.util.Scanner;

/*
18. Se tiene la siguiente información de un empleado:
 · código del empleado,
 · nombres,
 · número de horas trabajadas al mes,
 · valor hora trabajada,
 · porcentaje de retención en la fuente.
 Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. 
*/
public class EJERCICIO18_CAP3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el código del empleado: ");
        int codigoEmp = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Introduce los nombres del empleado: ");
        String nombres = scanner.nextLine();
        
        System.out.print("Introduce el número de horas trabajadas al mes: ");
        double horasmes = scanner.nextDouble();
        
        System.out.print("Introduce el valor de la hora trabajada: ");
        double valorhora = scanner.nextDouble();
        
        System.out.print("Introduce el porcentaje de retención en la fuente: ");
        int retencion = scanner.nextInt();
                
        Empleado e1 = new Empleado(codigoEmp, nombres, horasmes, valorhora, retencion);
        e1.MostrarDatos();
        scanner.close();
    }
    
}
