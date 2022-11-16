package Binaria;


public class PesquisaBinaria<T extends Comparable<T>> {
    private T content;
    private PesquisaBinaria<T> leftChild, rightChild;

    public PesquisaBinaria()
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public T getContent()
    {
        if (!isEmpty() ) {
            return content;
        } else {
            throw new RuntimeException();
        }
    }


    public int size()
    {
        if ( isEmpty() ) {
            return 0;
        }
        return 1 + leftChild.size() + rightChild.size();
    }

    public int height() {
        if(isEmpty()) {
            return 0;
        }

        int left = leftChild.height();
        int right = rightChild.height();
        if(left > right) {
            return left + 1;
        }
        return right + 1;
    }

    public PesquisaBinaria<T> getLeftChild() {return leftChild;}
    public PesquisaBinaria<T> getRightChild() {return rightChild;}

    public boolean isEmpty()
    {
        return content == null;
    }

    public boolean isLeaf()
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void add( T t )
    {
        if ( isEmpty() ) {
            content = t;
            leftChild = new PesquisaBinaria<T>();
            rightChild = new PesquisaBinaria<T>();
        }
        else {
            if ( content.compareTo( t ) > 0 )
            {
                leftChild.add( t );
            }
            else if ( content.compareTo( t ) < 0 )
            {
                rightChild.add( t );
            }
        }
    }

    public void show()
    {
        if ( !isEmpty() )
        {
            leftChild.show();
            System.out.println( content );
            rightChild.show();
        }
    }
}
