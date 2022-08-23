package questao2;
import java.util.Random;

public class matriz {

	public static void main(String[] args) {
		
		int[][] numAleatorio = new int [3][4];
	     Random numeroRandom = new Random();
	  
	     for (int i = 0; i < numAleatorio.length; i++){
	         for (int j = 0; j < numAleatorio[i].length; j++){
	             numAleatorio[i][j] = numeroRandom.nextInt(100);//gera numero aleatorio de 0 a 100
	         }
	     }
	  
	  int menor = Integer.MAX_VALUE;
	  int maior = Integer.MIN_VALUE;
	  
	  for (int i = 0; i < numAleatorio.length; i++){
	      for (int j = 0; j < numAleatorio[i].length; j++){
	          if(numAleatorio[i][j] > maior){
	              maior = numAleatorio[i][j];
	          }
	          if(numAleatorio[i][j] < menor) {
	        	  menor=numAleatorio[i][j];
	          }
	      }
	  }
	  
	  System.out.print("\t\tMatriz\n");
	  for (int i = 0; i < numAleatorio.length; i++){
	      for (int j = 0; j < numAleatorio[i].length; j++){
	          System.out.print("\t"+numAleatorio[i][j]+" ");
	      }
	      System.out.println();
	  }
	  System.out.println("\nMaior valor = "+maior);
	  System.out.println("\nMenor valor = "+menor);
	 }

	}

