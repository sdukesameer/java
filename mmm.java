import java.util.*;
import java.text.DecimalFormat;
class mmm{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];

        for (int i = 0; i < input1; i++) {
            input2[i] = in.nextInt();
        }

        Arrays.sort(input2);
        double median;
        if(input1%2==0){
            median=(input2[input1/2-1]+input2[input1/2])/2;
        }else{
            median=(input2[input1/2]);
        }
        double sum=0;
        LinkedHashMap<Integer,Integer> h= new LinkedHashMap<>();
        for(int i=0;i<input1;i++){
            sum+=input2[i];
            if(h.containsKey(input2[i])){
                h.put(input2[i],h.get(input2[i])+1);
            }else{
                h.put(input2[i],1);
            }
        }
        double mean = sum / input1;

        int maxkey = 0, maxval = 0, val;
        for (int key : h.keySet()) {
            val = h.get(key);
            if (val > maxval) {
                maxval = val;
                maxkey = key;
            }
        }

        //Result res = new Result(String.format("%.6f", new Double(mean)), String.format("%.6f", new Double(median)), maxkey);
        //return res;
        System.out.println(String.format("%.6f", new Double(mean))+" "+ String.format("%.6f", new Double(median))+" "+ maxkey);
    }
}
