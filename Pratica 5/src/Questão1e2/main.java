package Questão1e2;

public class main {

	 public static void main(String[] args)  {
	        String expressao = "2 * 1 + 3";
	        String[] expressaoArray = expressao.split(" ");

	        System.out.println("Expressão: " + expressao);
	        int resultado = notacao.gerarNotacao(expressaoArray);
	        System.out.println("O resultado é: " + resultado);
	    }

}
