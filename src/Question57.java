public class Question57 {
    static void patternStingAsX(String string){
        int len = string.length();
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(i==j){
                    System.out.print(string.charAt(i));
                } else if(j+i == len-1){
                    System.out.print(string.charAt(j));
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternStingAsX("12345");

    }
}