import java.util.Scanner;
public class Tarea5_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese una cadena de 9 caracteres (solo X, O o _): ");
            String cadena = sc.nextLine();
            if (cadena.length() != 9) {
                System.out.println("La cadena ingresada no tiene 9 caracteres.");
                return;
            }
            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);
                if (c != 'X' && c != 'O' && c != '_') {
                    System.out.println("La cadena ingresada contiene caracteres inválidos.");
                    return;
                }
            }
            System.out.println("Cadena ingresada: " + cadena);
            System.out.println("-------");
            for (int i = 0; i < 9; i += 3) {
                System.out.println("|" + cadena.charAt(i) + "|" + cadena.charAt(i+1) + "|" + cadena.charAt(i+2) + "|");
            }
            System.out.println("-------");
        }
    }




