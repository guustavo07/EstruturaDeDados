package questao1;

public class main {

	public static void main(String[] args) {
		List fila = new List();
		List filaPrioridade = new List();
	    
	    for(int i=0; i < 200; i++) {
	    	if(i%2==0){
	    		fila.adicionar(i);
	    		}
	    	else{
	    		filaPrioridade.adicionar(i);
	            }
	        }
	    
	    for(int i=0; i < filaPrioridade.getTamanho(); i++) {
	    	System.out.println(filaPrioridade.get_valor_na_posicao(i));
	        }
	    }
	}
