import java.util.ArrayList;

public class Question09 {
    static void sortFromTwoSortedArray(int[] arr1, int[] arr2){
        int len1 = arr1.length, len2 = arr2.length;
        int i=0, j=0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(i<len1 && j<len2){
            if(arr1[i] < arr2[j]){
                arr.add(arr1[i]);
                i++;
            } else if(arr1[i] > arr2[j]){
                arr.add(arr2[j]);
                j++;
            } else {
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i<len1){
            arr.add(arr1[i]);
            i++;
        }

        while(j<len2){
            arr.add(arr2[j]);
            j++;
        }

        System.out.println(arr.toString());
    }

    public static void main(String[] args) {
        sortFromTwoSortedArray(new int[]{2,4,5,6,7,9,10,13}, new int[]{2,3,4,5,6,7,8,9,11,13,15});
    }
}