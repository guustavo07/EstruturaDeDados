package questao1;
import java.util.Random;

public class buscaSequencial {

	public static void main(String[] args) {
		  buscaSequencial bin = new buscaSequencial();
		  Random numrandomico = new Random(); //declara variavel do tipo randomico
		int vetor[]; //declaração do vetor
		vetor = new int[50];//alocação de memória
		
		bin.pesquisarNumero(20, vetor);
		
		for(int i=0;i<vetor.length;i++){
			vetor[i]= numrandomico.nextInt(999);	
		}
		
	}
	
	public void pesquisarNumero(int x, int[] vetor) {
	    int inicio = 0;         //Posição inicial do vetor.
	    int meio = 0;          //Posição do meio do vetor.
	    int fim = vetor.length - 1;
	    while(inicio <= fim) {
	    	meio = (fim + inicio) / 2;
	    	System.out.println("Inicio: " + vetor[inicio] + " - Meio: " + vetor[meio] + " - Fim: " + vetor[fim]);
		    if(vetor[meio] == x) {
		        System.out.println("Encontrou o número " + x);
			    break;	        
		      }
		    if(vetor[meio] < x) {
		        inicio = meio + 1;
		      } else {
		        /* Se o valor que está no meio do vetor for maior que o valor de x, 
		          então o fim do vetor será igual a posição do meio - 1. */
		        fim = meio - 1;
		      }
		    if(inicio > fim) {
			      System.out.println("Não encontrou o número " + x);
			    }
		    }
	    }
	    

}
