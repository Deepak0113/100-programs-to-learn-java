import java.util.*;

public class Question72 {
    static int[] removeDuplicates(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int item: arr){
            if(hashMap.containsKey(item)){
                hashMap.put(item, hashMap.get(item)+1);
            } else{
                hashMap.put(item, 1);
            }
        }

        return hashMap.keySet().stream().mapToInt(i -> i).toArray();
    }

    static int[] removeDuplicatesAlt(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int val: arr){
            set.add(val);
        }

        return set.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,4,5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
        System.out.println(Arrays.toString(removeDuplicatesAlt(arr)));
    }
}
