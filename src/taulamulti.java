import java.util.Scanner;

public class taulamulti{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = s.nextLine();

        System.out.println("Hola " + nombre + "!");

        System.out.println("Ingresa la tabla que quieres multiplicar");
        int tabla = s.nextInt();

        System.out.println( "Tabla del numero" + tabla);

        int i = 10;
        int resultado = 0;

        while(i <= 0) {
            resultado = tabla * i;
            System.out.println(tabla + " * " + i + " = " + resultado);
            i--;
        }
        System.out.println("Aquí tienes la tabla de multiplicar de " + tabla);

        s.close();
    }
}
	
	
	
	