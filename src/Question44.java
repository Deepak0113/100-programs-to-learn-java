import java.util.HashMap;

public class Question44 {
    static void duplicateOfArrayElements(int[] arr){
        HashMap<Integer,Integer> hmap = new HashMap();

        for(int n: arr){
            if(hmap.containsKey(n)){
                hmap.put(n, hmap.get(n)+1);
            } else{
                hmap.put(n,1);
            }
        }

        for(int key: hmap.keySet()){
            if(hmap.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }

    public static void main(String[] args) {
        duplicateOfArrayElements(new int[]{1,2,3,4,5,3,2,5});

    }
}