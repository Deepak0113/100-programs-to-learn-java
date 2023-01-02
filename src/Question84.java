//84.Java Program to find the frequency of odd & even numbers in the given matrix

public class Question84 {
    static void freqOddEven(int[] arr){
        int odd=0, even=0;

        for(int item: arr){
            if(item%2==0){
                even++;
            } else{
                odd++;
            }
        }

        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        freqOddEven(arr);
    }
}