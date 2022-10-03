import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double raio;
        double area;
        final double PI = 3.1416;

        System.out.println("Escreva o valor do raio");
        raio = console.nextFloat();

        area = PI * (raio * raio);

        System.out.println("A sua área é de " + area);

    }
}
