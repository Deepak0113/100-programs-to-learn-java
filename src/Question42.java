import java.util.HashMap;

public class Question42 {
    static void frequencyOfArrayElements(int[] arr){
        HashMap<Integer,Integer> hmap = new HashMap();

        for(int n: arr){
            if(hmap.containsKey(n)){
                hmap.put(n, hmap.get(n)+1);
            } else{
                hmap.put(n,1);
            }
        }

        for(int key: hmap.keySet()){
            System.out.println(key+": "+hmap.get(key));
        }
    }

    public static void main(String[] args) {
        frequencyOfArrayElements(new int[]{1,2,3,4,5,3,2,5,1,2,2,4});
    }
}