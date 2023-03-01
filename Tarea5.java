import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        System.out.println("Introduce la cadena: ");
        Scanner vita = new Scanner(System.in);
        String entrada = vita.nextLine();
        System.out.println(entrada);

        System.out.println("------");
        System.out.println("_|X|O");
        System.out.println("X|_|O");
        System.out.println("_|O|X");
        System.out.println("-------");

    }
}
