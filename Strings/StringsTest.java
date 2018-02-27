package Strings;

import java.util.Arrays;

public class StringsTest {
    public static void main(String[] args) {
        String s = "00110011";
        int[] groups = new int[s.length()];
        int count = 1;
        int j =0;
        for (int i = 0; i < s.length()-1 ; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                groups[j++] = count;
                count = 1;
            }
        }
        groups[j] = count;
        System.out.println(Arrays.toString(groups));
        int res = 0;
        for (int i = 0; i < groups.length -1 ; i++) {
            if(groups[i]<groups[i+1]){
                res = res + groups[i];
            }else{
                res = res + groups[i+1];
            }
        }

        System.out.println(res);
    }


}
