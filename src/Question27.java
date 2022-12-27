public class Question27 {
    static void swapValues(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1: "+n1+" n2: "+n2);
    }

    public static void main(String[] args) {
        swapValues(10,5);
    }
}