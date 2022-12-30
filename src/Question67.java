import java.util.HashMap;

public class Question67 {
    static void duplicateInArray(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: arr){
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            } else{
                hashMap.put(i, 1);
            }
        }

        for(int key: hashMap.keySet()){
            if(hashMap.get(key) > 1)
                System.out.print(key+" ");
        }
    }

    public static void main(String[] args) {
        duplicateInArray(new int[]{1,2,5,4,2,6,8,5,2,1,4,5,6,7});
    }
}
