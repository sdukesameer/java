import java.util.*;

public class infor_q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<String, Integer> TreeMap = new TreeMap<String, Integer>(Collections.reverseOrder());
        // Splitting to find the word
        String arr[] = str.split(" ");

        // Loop to iterate over the words
        for (int i = 0; i < arr.length; i++) {
            // Condition to check if the
            // array element is present
            // the hash-map
            if (TreeMap.containsKey(arr[i])) {
                TreeMap.put(arr[i], TreeMap.get(arr[i]) + 1);
            } else {
                TreeMap.put(arr[i], 1);
            }
        }
        extracted(TreeMap);
        // Loop to iterate over the
        // elements of the map
        /*for (Map.Entry<String, Integer> entry : TreeMap.entrySet()) {
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
        }*/
    }

    private static void extracted(Map<String, Integer> TreeMap) {
        TreeMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(System.out::println);
    }
}
