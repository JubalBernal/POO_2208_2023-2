import java.util.Scanner;
public class Tarea2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca su nombre, profesión y por último su nacionalidad: ");

        String sc = s.nextLine();
        String[] valores = sc.split(" ");

        String nombre = valores[0].toUpperCase();
        String profesion = valores[1].toUpperCase();
        String nacionalidad = valores[2].toUpperCase();

        System.out.println("Nombre: " +nombre);
        System.out.println("Profesión: " +profesion);
        System.out.println("Nacionalidad: " +nacionalidad);
    }
}
