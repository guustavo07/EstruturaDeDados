package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class deputados {
         public static void main(String[] args) throws FileNotFoundException {
             Queue<String> depFederais = new LinkedList<>();
             Scanner ler = new Scanner(new File("deputadosfederais.txt"));
             while (ler.hasNextLine()){
                 depFederais.add(ler.nextLine());
             }
             for (int i=0; i < 20; i++){
                 System.out.println ("Primeira Fileira: " + depFederais.poll());
             }
             for (int i=20; i < 40; i++){
                 System.out.println ("Segunda Fileira: " + depFederais.poll());
             }
             System.out.println ("Terceira Fileira: " + depFederais.poll());
         }
}

