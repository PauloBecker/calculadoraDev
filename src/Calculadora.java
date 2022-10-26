import java.util.Scanner;

public class Calculadora {
    public void init(){


        String opc = "";

        while (!opc.equalsIgnoreCase("N")){

            System.out.println("Informe o calculo desejado!");
            String txt = tc.nextLine();
            String operacao[] = new String[4];
            operacao = txt.split(" ");
            float valor1 = Float.parseFloat(operacao[0]);
            float valor2 = Float.parseFloat(operacao[2]);

            switch (operacao[1]){
                case "+":
                    System.out.println(txt + " = " + this.adicao(valor1, valor2));
                    break;
                case "-":
                    System.out.println(txt + " = " + this.subtracao(valor1,valor2));
                    break;
                case "*":
                    System.out.println(txt + " = " + this.multiplicacao(valor1,valor2));
                    break;
                case "/":
                    System.out.println(txt + " = " + this.divisao(valor1,valor2));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja fazer outra operação? \n" +
                    "Digite [S] para continuar: " +
                    "\nDigite [N] para encerrar o sistema: "
                    );
            opc = tc.nextLine();
        }

        System.out.println("Encerrando o sistema...\n" +
                "Até logo!");

    }


    Scanner tc = new Scanner(System.in);


    public float adicao(float v1, float v2){

        return v1 + v2;
    }

    public float subtracao(float v1, float v2){

        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2){

        return v1 * v2;
    }

    public float divisao(float v1, float v2){

        return v1 / v2;
    }

}
