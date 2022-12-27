public class Question52 {
    static void recursionReverseStringByWords(String string, int i){
        String[] arr = string.split(" ");
        int j = arr.length-1;

        if(i>=j-i){
            System.out.println(string);
            return;
        }

        String temp = arr[i];
        arr[i] = arr[j-i];
        arr[j-i] = temp;

        string = String.join(" ", arr);

        recursionReverseStringByWords(string, i+1);
    }

    public static void main(String[] args) {
        recursionReverseStringByWords("one two three", 0);

    }
}