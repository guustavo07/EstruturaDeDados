package questao1;
import java.util.Random;

public class buscaSequencial {

	public static void main(String[] args) {
		  buscaSequencial bin = new buscaSequencial();
		  Random numrandomico = new Random(); //declara variavel do tipo randomico
		int vetor[]; //declara��o do vetor
		vetor = new int[50];//aloca��o de mem�ria
		
		bin.pesquisarNumero(20, vetor);
		
		for(int i=0;i<vetor.length;i++){
			vetor[i]= numrandomico.nextInt(999);	
		}
		
	}
	
	public void pesquisarNumero(int x, int[] vetor) {
	    int inicio = 0;         //Posi��o inicial do vetor.
	    int meio = 0;          //Posi��o do meio do vetor.
	    int fim = vetor.length - 1;
	    while(inicio <= fim) {
	    	meio = (fim + inicio) / 2;
	    	System.out.println("Inicio: " + vetor[inicio] + " - Meio: " + vetor[meio] + " - Fim: " + vetor[fim]);
		    if(vetor[meio] == x) {
		        System.out.println("Encontrou o n�mero " + x);
			    break;	        
		      }
		    if(vetor[meio] < x) {
		        inicio = meio + 1;
		      } else {
		        /* Se o valor que est� no meio do vetor for maior que o valor de x, 
		          ent�o o fim do vetor ser� igual a posi��o do meio - 1. */
		        fim = meio - 1;
		      }
		    if(inicio > fim) {
			      System.out.println("N�o encontrou o n�mero " + x);
			    }
		    }
	    }
	    

}
