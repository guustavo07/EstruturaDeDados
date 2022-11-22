package p7;

import java.util.Scanner;
import java.util.Random;

public class Main {
		
		private static final Scanner ler = new Scanner(System.in);

	    public static void main(String[] args) {
	        int options;
	        Tree tree = chooseParams();
	        Scanner ler = new Scanner(System.in);
	        char ch;

	        do {
	            System.out.println("O que deseja: \n1- Menor elemento \n2- Maior elemento \n3- As �rvores s�o identicas? \n4- Altura da �rvore \n5- Est� balanceada? ");
	            options = ler.nextInt();
	            switch (options) {
	                case 1:
	                	System.out.println("Menor elemento: " + tree.min());
	                	break;
	                case 2:
	                	System.out.println("Maior elemento: " + tree.max());
	                	break;
	                case 3:
	                    System.out.println("Informe uma nova �rvore para comparar");
	                    Tree tree2 = chooseParams();
	                    System.out.println("Id�nticas: " + tree.equals(tree2));
	                    break;
	                case 4:
	                	System.out.println("Altura da �rvore: " + tree.altura());
	                	break;
	                case 5:
	                	System.out.println("Est� Balanceada: " + tree.isBalanced());
	                	break;
	                default: 
	                	System.out.println("Op��o inv�lida!");
	            }

	            System.out.println("\nPara continuar insira 's' ou 'n') \n");
	            ch = ler.next().charAt(0);
	        } while (ch == 'S'|| ch == 's');

	        ler.close();
	    }
	    private static Tree chooseParams() {
	        int valPermitido, val;
	        Tree arvBinaria = new Tree();

	        System.out.print("Quantos elementos deseja inserir na �rvore: ");
	        val = ler.nextInt();
	        System.out.print("Valor m�ximo permitido [INTEGER]: ");
	        valPermitido = ler.nextInt();
	        fillTree(arvBinaria,val,valPermitido);

	        return arvBinaria;
	    }

	    private static void fillTree(Tree arvBinaria, int val, int valPermitido) {
	        Random random = new Random();
	        int num;
	        System.out.println();
	        while (val > 0) {
	            num = random.nextInt(valPermitido);
	            arvBinaria.insert(num);
	            System.out.println("Valor inserido: " + num);
	            val--;
	        }
	        System.out.println();
	    }
	}

