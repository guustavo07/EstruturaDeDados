package Binaria;

import java.util.Scanner;

public class ArvoreBinaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        PesquisaBinaria<Integer> treeVisualization = new PesquisaBinaria<>();
        Tree arv = new Tree();
        int opcao;
        long x;
        System.out.print("\n Programa Arvore binaria de long");
        do {
            System.out.print("\n***********************************");
            System.out.print("\nEntre com a opção:");
            System.out.print("\n ----1: Inserir");
            System.out.print("\n ----2: Excluir");
            System.out.print("\n ----3: Pesquisar");
            System.out.print("\n ----4: Exibir");
            System.out.print("\n ----5: Desenhar Árvore");
            System.out.print("\n ----6: Sair do programa");
            System.out.print("\n***********************************");
            System.out.print("\n-> ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.print("\n Informe o valor (int) -> ");
                    x = ler.nextLong();
                    arv.inserir(x);
                    treeVisualization.add((int) x);
                    break;
                }
                case 2: {
                    System.out.print("\n Informe o valor (int) -> ");
                    x = ler.nextLong();
                    if (!arv.remover(x))
                        System.out.print("\n Valor não foi encontrado!");
                    ;
                    break;
                }
                case 3: {
                    System.out.print("\n Informe o valor (int) -> ");
                    x = ler.nextLong();
                    if (arv.buscar(x) != null)
                        System.out.print("\n Valor foi Encontrado");
                    else
                        System.out.print("\n Valor não foi encontrado!");
                    break;
                }
                case 4: {
                    arv.caminhar();
                    break;
                }
                case 5: {
                    DesenharArvore.startDrawing(treeVisualization);
                    break;
                }
            }
        } while (opcao != 6);
    }
}
