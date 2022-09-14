package questao2;

import java.io.IOException;

public class Lista {
	private No primeiro;
    private No ultimo;
    
    public Lista() {
        primeiro = null;
        ultimo = null;
    }
    public boolean listaVazia (){
        if (primeiro == null){
            return true;
        } else {
            return false;
        }
    }
    public void inserirInicio (Object elemento){
        No novoNo = new No(elemento);
        if (listaVazia()){
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
        }
        primeiro = novoNo;
    }
    public void inserirFinal (Object elemento){
        No novoNo = new No(elemento);
        if (listaVazia()){
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
        }
        ultimo = novoNo;
    }
    public int contarNos (){
        int tamanho = 0;
        No noTemp = primeiro;
        while (noTemp != null){
            tamanho = tamanho + 1;
            noTemp = noTemp.proximo;
        }
        return tamanho;
    }
    public void inserirMeio(Object elemento, int position)
    {
        No novoNo = new No(elemento);
        No noTemp = primeiro;
        int numNos, positionAux=1;
        numNos = contarNos();
        if (position<=1){
            inserirInicio(novoNo);
        } else {
            if (position>numNos){
                inserirFinal(novoNo);
            } else {
                while (positionAux<(position-1))
                {
                    noTemp = noTemp.proximo;
                    positionAux = positionAux + 1;
                }
                novoNo.proximo = noTemp.proximo;
                noTemp.proximo = novoNo;
            }
        }
    }
    public void remover( Object elemento){
        No noTemp = primeiro;
        No noAnterior = null;
        if (primeiro.elemento.equals(elemento)){
            primeiro = primeiro.proximo;
        } else {
            while ((noTemp != null) && (!noTemp.elemento.equals(elemento))){
            	noAnterior = noTemp;
                noTemp = noTemp.proximo;
            }
            if (noTemp != null){
            	noAnterior.proximo = noTemp.proximo;
            }
            if (noTemp == ultimo){
                ultimo = noAnterior;
            }
        }
    }
    public Object elementoInicio() throws IOException {
        if (!listaVazia()){
            return primeiro.elemento;
        } else {
            throw new IOException();
        }
    }
    public Object elementoFinal() throws IOException {
        if (!listaVazia()){
            return ultimo.elemento;
        } else {
            throw new IOException();
        }
    }
    public boolean buscaNo(Object elemento){
        No noTemp = primeiro;
        boolean found=false;
        while ((noTemp!=null) && (!found)){
            if (noTemp.elemento.equals(elemento)){
                found = true;
            } else {
                noTemp = noTemp.proximo;
            }
        }
        return found;
    }
    public void mostrarLista ( ){
        int i = 1;
        No noTemp = primeiro;
        while (noTemp != null){
            System.out.println("O Elemento "+ noTemp.elemento+ "esta na posição "+i);
            noTemp = noTemp.proximo;
            i++;
        }
    }

}
