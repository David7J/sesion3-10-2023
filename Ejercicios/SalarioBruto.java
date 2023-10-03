import java.util.Scanner;

public class SalarioBruto {
    
    static Scanner lector = new Scanner(System.in);
    public static void main(String []args){

        CalcularTodo(0.07, 15.6, 0.01, 22.5);
        PedirSalario();

        lector.close();
    }

    public static void PedirSalario(){

    System.out.println("Ingrese su salario Bruto: ");
    double salarioBruto = lector.nextInt();

    double Ant = 0.15;

    double ingresoAntg = salarioBruto * Ant;

    double ingresoTotal = salarioBruto + ingresoAntg;
    //////////////////////////////////////////////////////////////////////

    
    double inss = 0.07, iR = 15.6, montoAfiliacion = 0.01, inssPat = 22.5;

    double inss1 = ingresoTotal*inss;
    double iR1 = ingresoTotal * iR/100;
    double afiliacion = montoAfiliacion*salarioBruto;
    double inssPat1 = ingresoTotal * inssPat/100;
    double deducciones = inss1 + iR1 + afiliacion + inssPat1;

    double ingNeto = ingresoTotal-deducciones;

    System.out.println("El inss del empleado es: " + inss1);
    System.out.println("El IR del empleado es: " +iR1);
    System.out.println("La afiliacion del empleado es: " +afiliacion);
    System.out.println("El inss patronal del empleado es: " + inssPat1);
    System.out.println(" ");
    System.out.println("Total deducciones: " + deducciones);
    System.out.println("EL ingreso neto es: " + ingNeto);

    }
    public static void CalcularTodo(double inss1, double iR1, double afiliacion, double inssPat1){
        System.out.println("Las deducciones son: ");
        System.out.println("Inss: " + inss1);
        System.out.println("IR: " + iR1);
        System.out.println("Afiliacion: " + afiliacion);
        System.out.println("Inss Patronal: " + inssPat1);
        System.out.println(" ");
    }
}
