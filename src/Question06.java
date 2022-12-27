public class Question06 {
    static void splitFourGroups(int n){
        int start = 101, end = start+n-1;
        for(int i=0; i<4; i++) {
            System.out.println("Group: "+i);
            for (int j=start+i; j<=end; j+=4) {
                System.out.println(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        splitFourGroups(20);
    }
}
