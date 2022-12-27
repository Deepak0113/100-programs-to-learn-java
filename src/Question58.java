public class Question58 {
    static void patternUnderscoreInsideStar(int size){
        String line, starRepeat, underscoreRepeat;
        for(int i=0; i<size; i++){
            starRepeat = "*".repeat(size-i);
            underscoreRepeat = "_".repeat(i);
            line =  starRepeat + underscoreRepeat + underscoreRepeat + starRepeat;
            System.out.println(line);
        }
        for(int i=size-2; i>=0; i--){
            starRepeat = "*".repeat(size-i);
            underscoreRepeat = "_".repeat(i);
            line =  starRepeat + underscoreRepeat + underscoreRepeat + starRepeat;
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        patternUnderscoreInsideStar(4);

    }
}