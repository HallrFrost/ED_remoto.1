import java.util.Scanner;

public class cosa4 {
    public static void main (String [] args) {
        double valor1;
        double valor2;
        Scanner miTeclado = new Scanner(System.in);
        System.out.println("Introduce valor 1");
        valor1 = miTeclado.nextFloat();

        System.out.println("Introduce valor 2");
        valor2 = miTeclado.nextFloat();

        if (valor1 > valor2 ) {
            System.out.println (valor2);
            System.out.println (valor1);
        }else if(valor2 > valor1){
            System.out.println (valor1);
            System.out.println (valor2);

        }else{
            System.out.println("Los valores son iguales");
        }
    }
}

