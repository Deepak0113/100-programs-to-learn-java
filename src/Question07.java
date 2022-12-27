public class Question07 {
    static void patternXFromString(String string){
        String line = "";
        int len = string.length();
        int mid = len/2;
        int sideSpace = 0, midSpace = len-2;
        boolean flag = false;

        for(int i=0; i<len; i++){
            if(i==mid){
                line = " ".repeat(2) + string.charAt(i) + " ".repeat(2);
                flag = true;
            } else{
                line = " ".repeat(sideSpace) + string.charAt(i) + " ".repeat(midSpace) + string.charAt(i) + " ".repeat(sideSpace);
            }

            if(flag){
                sideSpace--;
                midSpace+=2;
            } else{
                sideSpace++;
                midSpace-=2;
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        patternXFromString("12345");
    }
}