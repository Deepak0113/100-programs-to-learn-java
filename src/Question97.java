import java.util.Arrays;

public class Question97 {
    static boolean binarySearch(String string, char ch){
        char[] charArr = string.toCharArray();
        Arrays.sort(charArr);

        int start=0 , end=charArr.length-1;
        int mid;
        while(start <= end){
            mid = (start+end)/2;
            if(charArr[mid] == ch) return true;

            if(charArr[mid] < ch){
                start = mid+1;
            } else{
                end = mid;
            }
        }

        return false;
    }

    static boolean binarySearchRecursive(char[] charArr, char ch, int start, int end){
        if(start > end){
            return false;
        }

        int mid = (start+end)/2;
        if(charArr[mid] == ch) return true;
        if(charArr[mid] < ch)
            return binarySearchRecursive(charArr, ch, mid+1, end);
        return binarySearchRecursive(charArr, ch, start, mid);
    }

    static boolean binarySearchAlt(String string, char ch){
        return binarySearchRecursive(string.toCharArray(), ch, 0, string.length()-1);
    }

    public static void main(String[] args) {
        String string = "working";
        System.out.println(binarySearch(string,'k'));
        System.out.println(binarySearchAlt(string,'k'));
    }
}