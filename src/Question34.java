public class Question34 {
    static void largestInArray(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }

    static void sumOfArrayElements(int[] arr) {
        int sum = 0;
        for(int n: arr){
            sum+=n;
        }

        System.out.println(sum);
    }

    static void sumOfArrayAndLargest(int[] arr){
        System.out.println("Largest:");
        largestInArray(arr);
        System.out.println("Sum:");
        sumOfArrayElements(arr);
    }

    public static void main(String[] args) {
        sumOfArrayAndLargest(new int[]{1,2,3,4,5});

    }
}