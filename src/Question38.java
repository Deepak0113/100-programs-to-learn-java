public class Question38 {
    static void largestInArray(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        largestInArray(new int[]{1,2,3,4,5});

    }
}