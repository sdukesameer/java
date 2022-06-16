import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class l2b2_remove_duplicates {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements to be entered in the arraylist: ");
        n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d index element: ",i);
            list.add(sc.nextInt());
        }
        System.out.println("The array before removing duplicates is " + list + " and length is " + list.size());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if (Collections.frequency(list,list.get(i))>1) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("The array after removing duplicates is" + list + " and length is " + list.size());
        sc.close();
    }
}
