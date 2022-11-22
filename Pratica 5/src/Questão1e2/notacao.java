package Questão1e2;

import java.util.Stack;

public class notacao {
	static boolean operador(String op) {
        return op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*");
    }

    static int operacao(int first, int second, String operator) {
        if (operator.equals("+")) {
            int temp = second + first;
            return temp;
        } else if (operator.equals("-")) {
            if ((first < 0) || (second < 0)) {
                int firstV2 = Math.abs(first);
                int secondV2 = Math.abs(second);
                int temp = secondV2 - firstV2;

                return temp;
            }
            int temp = second - first;
            return temp;
        }

        if (operator.equals("*")) {
            int temp = second * first;
            return temp;
        }

        if (operator.equals("/")) {
            int temp = second / first;
            return temp;
        }

        return 0;
    }

    public static int gerarNotacao(String[] expressao) {
        Stack<Integer> pilha = new Stack<>();
        String operadorTemp = "";

        for (String s : expressao) {
            if (operador(s)) {
                if(pilha.size() <= 1) {
                	operadorTemp = s;
                    continue;
                }

                if(!operadorTemp.isEmpty()) {
                    int first = pilha.pop();
                    int second = pilha.pop();

                    int result = operacao(first, second, operadorTemp);
                    pilha.push(result);

                    if(pilha.size() <= 1) {
                    	operadorTemp = s;
                        continue;
                    } else {
                    	operadorTemp = "";
                    }
                }

                int first = pilha.pop();
                int second = pilha.pop();

                int resultado = operacao(first, second, s);
                pilha.push(resultado);
            } else {
            	pilha.push(Integer.parseInt(s));
            }

            System.out.println(pilha.peek());
        }

        if(pilha.size() == 2) {
            int first = pilha.pop();
            int second = pilha.pop();

            int resultado = operacao(first, second, operadorTemp);
            pilha.push(resultado);
        }

        return pilha.pop();
    }
}
