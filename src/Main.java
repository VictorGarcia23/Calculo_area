import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Dame el radio: ");
        int radio = s.nextInt();
        double area = (radio * radio)  * (Math.PI);
                System.out.println(area + " metros cuadrados");
    }
}
 // calculo de la area de una esfera