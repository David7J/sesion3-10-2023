import java.util.Scanner;

public class App {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //Metodos sobre cargados o sobre carga de metodos
        //Consiste en utilizar o reutilizar el nombre de un metodo pero con distintas listas de parametros de entrada
        mostrarHora();
        mostrarHora(2, 15, 36);
        mostrarHora(2, 0);
        

        lector.close();
    }
    //Declaracion de metodos
    public static void mostrarHora(){ //Version sin  parametros de entrada
        System.out.println("Horas: ");
        int hr = lector.nextInt();

        System.out.println("Minutos: ");
        int min = lector.nextInt();

        System.out.println("Minutos: ");
        int seg = lector.nextInt();

        System.out.println("La hora es " + hr + ":" + min + ":" + seg);

    }
    //Sobre cargar el metodo mostrarHora()
    public static void mostrarHora(int hr, int min, int seg){
        System.out.println("La hora es " + hr + ":" + min + ":" + seg);

    }

    public static void mostrarHora(int hr, int min){
        int seg = 46;
        System.out.println("La hora es " + hr + ":" + min + ":" +seg);
    }
}
