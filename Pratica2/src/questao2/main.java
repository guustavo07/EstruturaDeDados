package questao2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.mostrarLista();
	    lista.inserirInicio(new Integer(3));
	    lista.inserirFinal(new Integer(7));
	    lista.inserirMeio(new Integer(5),2);
	    lista.inserirMeio(new Integer(4),2);
	    lista.inserirMeio(new Integer(6),4);
	    lista.mostrarLista();
	    System.out.println("Total de n�s: " + lista.contarNos());
	    
	    lista.remover(new Integer(3));
	    lista.remover(new Integer(7));
	    System.out.println("N�s ap�s remo��o: " + lista.contarNos());
	    lista.mostrarLista();
	    
	    System.out.println("O n�mero '6' est� na lista: " + lista.buscaNo(6));
	    }

}
