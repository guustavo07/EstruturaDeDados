package questao1;

public class Element {
	private int valElement;
    private Element proximo;

    public Element(int novoVal){
        this.valElement = novoVal;
    }
    public int getValor_element() {
        return valElement;
    }
    public void setValor_element(int valElement) {
        this.valElement = valElement;
    }
    public Element getProximo() {
        return proximo;
    }
    public void setProximo(Element proximo) {
        this.proximo = proximo;
    }
}
