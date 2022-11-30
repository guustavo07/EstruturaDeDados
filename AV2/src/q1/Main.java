package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FullStackException, FileNotFoundException {
            ArrayStack<String> pilha = new ArrayStack<>();
            LinkedList<String> lista = new LinkedList<>();
            Scanner Ler = new Scanner(new File("C:\\Users/12110603/IdeaProjects/AV2/src/q1/nomes.txt"));

            while(Ler.hasNextLine()){
                pilha.push(Ler.nextLine());
            }

            while(pilha.size() != 0){
                lista.add(pilha.pop());
            }

            ListIterator<String> iterador = lista.listIterator(0);
            while(iterador.hasNext()){
                String nome = iterador.next();
                System.out.println(nome);
            }

        }

    }

