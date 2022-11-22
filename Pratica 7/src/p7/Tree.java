package p7;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static class Node {
        private final int valor;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.valor = value;
        }

        @Override
        public String toString() {
            return "Node=" + valor;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.valor) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.valor)
                current = current.leftChild;
            else if (value > current.valor)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void InOrder() {
        InOrder(root);
    }

    private void InOrder(Node root) {
        if (root == null)
            return;

        InOrder(root.leftChild);
        System.out.println(root.valor);
        InOrder(root.rightChild);
    }

    public void PreOrder() {
    	PreOrder(root);
    }

    private void PreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.valor);
        PreOrder(root.leftChild);
        PreOrder(root.rightChild);
    }

    public void PostOrder() {
    	PostOrder(root);
    }

    private void PostOrder(Node root) {
        if (root == null)
            return;

        PostOrder(root.leftChild);
        PostOrder(root.rightChild);
        System.out.println(root.valor);
    }

    public int altura() {
        return altura(root);
    }

    private int altura(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(altura(root.leftChild),altura(root.rightChild));
    }

    public int min() {
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.valor;
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.valor;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left,right),root.valor);
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root,other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.valor == second.valor
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean arvBinaria() {
        return arvBinaria(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean arvBinaria(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.valor < min || root.valor > max)
            return false;

        return arvBinaria(root.leftChild, min, root.valor - 1)
                && arvBinaria(root.rightChild, root.valor + 1, max);
    }

    public ArrayList<Integer> getNodes(int distancia) {
        var list = new ArrayList<Integer>();
        getNodes(root,distancia,list);
        return list;
    }

    public void getNodes(Node root, int distancia, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (distancia == 0) {
            list.add(root.valor);
            return;
        }

        getNodes(root.leftChild,distancia - 1, list);
        getNodes(root.rightChild, distancia - 1, list);
    }

    public void traverseLevelOrder() {
        for (int i = 0; i <= altura(); i++) {
            for (var value : getNodes(i))
                System.out.println(value);
        }
    }

    public int tamanho() {
        return tamanho(root);
    }

    private int tamanho(Node root) {
        if (root == null)
            return 0;

        if (isLeaf(root))
            return 1;

        return 1 + tamanho(root.leftChild) + tamanho(root.rightChild);
    }

    public int contFolhas() {
        return contFolhas(root);
    }

    private int contFolhas(Node root) {
        if (root == null)
            return 0;

        if (isLeaf(root))
            return 1;

        return contFolhas(root.leftChild) + contFolhas(root.rightChild);
    }

    public int max() {
        if (root == null)
            throw new IllegalStateException();

        return max(root);
    }

    private int max(Node root) {
        if (root.rightChild == null)
            return root.valor;

        return max(root.rightChild);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if (root == null)
            return false;

        if (root.valor == value)
            return true;

        return contains(root.leftChild, value) || contains(root.rightChild, value);
    }

    public boolean areSibling(int first, int second) {
        return areSibling(root, first, second);
    }

    private boolean areSibling(Node root, int first, int second) {
        if (root == null)
            return false;

        var areSibling = false;
        if (root.leftChild != null && root.rightChild != null) {
            areSibling = (root.leftChild.valor == first && root.rightChild.valor == second) ||
                    (root.rightChild.valor == first && root.leftChild.valor == second);
        }

        return areSibling ||
                areSibling(root.leftChild, first, second) ||
                areSibling(root.rightChild, first, second);
    }

    public List<Integer> getAnt(int value) {
        var list = new ArrayList<Integer>();
        getAnt(root, value, list);
        return list;
    }

    private boolean getAnt(Node root, int value, List<Integer> list) {
        if (root == null)
            return false;

        if (root.valor == value)
            return true;
        if (getAnt(root.leftChild, value, list) ||
        		getAnt(root.rightChild, value, list)) {
            list.add(root.valor);
            return true;
        }

        return false;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node root) {
        if (root == null)
            return true;

        var balanceFactor = altura(root.leftChild) - altura(root.rightChild);

        return Math.abs(balanceFactor) <= 1 &&
                isBalanced(root.leftChild) &&
                isBalanced(root.rightChild);
    }

    public boolean isPerfect() {
        return tamanho() == (Math.pow(2, altura() + 1) - 1);
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }
}