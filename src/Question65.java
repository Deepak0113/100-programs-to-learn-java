//65.Java Program to find the frequency of each element in the array

import java.util.HashMap;
public class Question65 {
    static void frequencyOfElements(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: arr){
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            } else{
                hashMap.put(i, 1);
            }
        }

        for(int key: hashMap.keySet()){
            System.out.println(key+" "+hashMap.get(key));
        }
    }

    public static void main(String[] args) {
        frequencyOfElements(new int[]{1,2,5,4,2,6,8,5,2,1,4,5,6});
    }
}
