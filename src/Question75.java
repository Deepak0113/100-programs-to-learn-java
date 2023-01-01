import java.util.ArrayList;

public class Question75 {
    static void displayOddEven(int[] arr){
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        ArrayList<Integer> evenArrayList = new ArrayList<>();

        for(int item: arr){
            if(item%2==0){
                evenArrayList.add(item);
            } else{
                oddArrayList.add(item);
            }
        }

        System.out.println("Odd: "+oddArrayList.toString());
        System.out.println("Even: "+evenArrayList.toString());
    }

    public static void main(String[] args) {
        displayOddEven(new int[]{1,2,3,4,5});
    }
}