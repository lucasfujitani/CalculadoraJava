
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int indice= 0;
        System.out.println("Bem vindo a calculadora");
        while (indice == 0){
            System.out.println("=================================");
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.println("=================================");

            Scanner entrada = new Scanner(System.in);
            int num = entrada.nextInt();

            Scanner numero1 = new Scanner(System.in);
            Scanner numero2 = new Scanner(System.in);

            int num1 = 0;
            int num2 = 0;
            int result = 0;

            switch (num) {
                case 1:
                    System.out.println("Escolha o primeiro numero: ");
                    num1 = numero1.nextInt();

                    System.out.println("Escolha o segundo numero: ");
                    num2 = numero2.nextInt();


                    result = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + result);
                    break;


                case 2:

                    System.out.println("Escolha o primeiro numero: ");
                    num1 = numero1.nextInt();

                    System.out.println("Escolha o segundo numero: ");
                    num2 = numero2.nextInt();


                    result = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + result);
                    break;


                case 3:

                    System.out.println("Escolha o primeiro numero: ");
                    num1 = numero1.nextInt();

                    System.out.println("Escolha o segundo numero: ");
                    num2 = numero2.nextInt();


                    result = num1 * num2;
                    System.out.println(num1 + "x" + num2 + "=" + result);
                    break;


                case 4:
                    System.out.println("Escolha o primeiro numero: ");
                    num1 = numero1.nextInt();

                    System.out.println("Escolha o segundo numero: ");
                    num2 = numero2.nextInt();

                    if(num2 == 0 || num1== 0){
                        System.out.println("erro, nao pode fazer divisao com 0 ");
                    }else {
                        result = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "=" + result);
                    }

                    break;

                case 5:
                    System.out.println("Saindo da Calculadora....");
                    indice++;
                break;


            }
        }
    }
}


