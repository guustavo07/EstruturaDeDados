package questao1;

public class List {
	private Element primeiraPosicao;
    private Element ultimaPosicao;
    private int tamanho;

    public List(){
        this.tamanho = 0;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void adicionar(int novoVal){
        Element newElement = new Element(novoVal);
        if (this.primeiraPosicao == null && this.primeiraPosicao == null){
            this.primeiraPosicao = newElement;
            this.ultimaPosicao = newElement;
        }else{
            this.ultimaPosicao.setProximo(newElement);
            this.ultimaPosicao = newElement;
        }
        this.tamanho++;
    }
    public int get_valor_na_posicao(int posicao){
        Element atual = this.primeiraPosicao;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual.getValor_element();
    }
}
