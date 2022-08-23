package questao3;
import java.util.Random;

public class bubbleSort {

	public static void main(String[] args) {
		Random numrandomico = new Random();
		int aux=0;
		int i=0;
		int vetor[];
		vetor = new int[5];
		for(i= 0;i<5;i++){
			vetor[i]= numrandomico.nextInt(9);				
			System.out.println(" "+vetor[i]);	
		}
		System.out.println(" ");
		
		for(i = 0; i<5; i++){
			for(int j = 0; j<4; j++){
				if(vetor[j] > vetor[j + 1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
			System.out.println("Vetor organizado:");
			for(i = 0; i<5; i++){
				System.out.println(" "+vetor[i]);
			}
		}

	}

}
