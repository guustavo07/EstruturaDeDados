package Q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner;
		Stack pilha = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("caminho do arquivo"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
       System.out.println("Pilha de Nomes");
        while(!pilha.empty())
		   {
		        System.out.println(pilha.pop());
		    }
	}


}
