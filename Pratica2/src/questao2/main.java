package questao2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("");
		
		List<Integer> list1 = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
        	list1.add(i);
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
        	list2.add(i);
        }
        
        List<Integer> concatenated_list = new ArrayList<Integer>();
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);
        
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Concatenated list: " + concatenated_list);
		
	}

}
