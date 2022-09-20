package Q2;
import java.util.Random;
import java.util.Stack;

public class Fila {
		public static void main(String[] args) {
			Stack filaShow = new Stack(); 

			    Random random = new Random();
			    for (int i=0;i<5;i++){
			        System.out.println("Inserindo na pilha: " + filaShow.push(random.nextInt(100)));
			    }
			    System.out.println("\n");
			    for(int i= 0; filaShow.size()<=3;i++){
			        System.out.println("Entrada vip para: "+filaShow.toString());
			    }
			}
}
