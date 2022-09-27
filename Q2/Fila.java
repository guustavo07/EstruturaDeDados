package Q2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Fila {
		public static void main(String[] args) throws FileNotFoundException {
		    Random random = new Random();
		    
			Queue<String> ingressosVendidos = new LinkedList<>();
			
			Scanner ler = new Scanner(new File("caminho do arquivo.txt"));
			 while (ler.hasNextLine()){
		            ingressosVendidos.add(ler.nextLine());
		        }

		        for (int i=0; i < 10; i++){
		            System.out.println("VIP : " + ingressosVendidos.poll());
		        }

		        List<String> ingressosNVip = new ArrayList<>(ingressosVendidos);
		        int sorteio = random.nextInt( ingressosNVip.size() - 1);

		        System.out.println("O sorteado foi: "+ ingressosNVip.get(sorteio));

}
}
