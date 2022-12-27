import java.util.ArrayList;

public class Question56 {
    static void patternTriangleIncrement(int size){
        int count=1, val=1;
        boolean flag = false;
        String line;
        ArrayList<String> strArr = new ArrayList<>();

        while(true) {
            line = "";
            for (int i=0; i<count; i++) {
                line += val + " ";
                val++;

                if(val == size+1){
                    flag = true;
                    break;
                }
            }
            strArr.add(line);
            if(flag) break;
            count++;
        }

        for(int i=0; i<count; i++){
            line = " ".repeat(count-i-1) + strArr.get(i);
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        patternTriangleIncrement(10);

    }
}