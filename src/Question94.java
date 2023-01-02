import java.util.Arrays;

public class Question94 {
    static boolean isAnagram(String s1, String s2){
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1res = new String(ch1);
        String s2res = new String(ch2);

        return s1res.equals(s2res);
    }

    static boolean isAnagramAlt(String s1, String s2){
        int len1 = s1.length(), len2 = s2.length();
        if(len2 != len1) return false;

        int[] map = new int[26];
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i=0; i<len1; i++){
            map[(int) s1.charAt(i) - 97] += 1;
            map[(int) s2.charAt(i) - 97] -= 1;
        }

        for(int i=0; i<26; i++){
            if(map[i] == 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "EARTH";
        String s2 = "HEART";
        System.out.println(isAnagram(s1,s2));
        System.out.println(isAnagramAlt(s1,s2));
    }
}