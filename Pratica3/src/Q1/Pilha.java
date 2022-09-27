package Q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) throws FileNotFoundException{
		Stack pilha = new Stack();
		String frase [] = new String[10]; 
		
		Scanner ler = new Scanner(new File("caminho do arquivo"));
        while (ler.hasNextLine()){
            pilha.push(ler.nextLine());
        }
        for (int i=0;i<10;i++) {
            frase[i] = (String) pilha.pop();
            System.out.println("As frases mais buscadas são: "+frase[i]);       
        while(!pilha.empty()){
		        System.out.println(pilha.pop());
		    }
	}
}
}