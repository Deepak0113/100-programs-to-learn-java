import java.util.Arrays;

public class Question10 {
    static void sortMaxMin(int[] arr){
        Arrays.sort(arr);
        int len = arr.length;
        int[] arrRes = new int[len];
        int i=0, j=len-1, ind=0;

        while(i<=j){
            if(i==j){
                arrRes[ind] = arr[i];
            } else{
                arrRes[ind] = arr[j];
                arrRes[++ind] = arr[i];
            }
            ind++;
            j--;
            i++;
        }

        System.out.println(Arrays.toString(arrRes));
    }

    public static void main(String[] args) {
        sortMaxMin(new int[]{7,6,5,4,3,2,1,8});
    }
}