public class Question60 {
    static void sumOfSeries(int n){
        String term = "";
        long sum = 0;
        while(n>0){
            term += "1";
            sum += Long.parseLong(term);
            n--;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfSeries(10);
    }
}