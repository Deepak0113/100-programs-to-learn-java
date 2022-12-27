public class Question53 {
    static void expandString(String string){
        String repString="", res="";
        int count = 0;
        char ch;
        for(int i=0; i<string.length(); i++){
            ch = string.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(count != 0){
                    res += repString.repeat(count);
                    count = 0;
                }
                repString = String.valueOf(ch);
            } else{
                count = count*10 + Integer.parseInt(String.valueOf(ch));
            }
        }

        if(count!=0){
            res += repString.repeat(count);
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        expandString("a1b10");

    }
}