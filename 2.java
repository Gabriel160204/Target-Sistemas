import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
		sc.close();
        int a = 0, b = 1, c;
        boolean encontrado = false;
        while (b <= numero) {
            if (b == numero) {
                encontrado = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
        if (encontrado) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
