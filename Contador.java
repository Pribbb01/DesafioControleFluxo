package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parametro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametroDois = terminal.nextInt();


            try {

                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parametro deve ser maior que o primeiro");

            }
        } 
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção, se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    /**
     * @param message
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
