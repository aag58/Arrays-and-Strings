package Strings;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "HelloWorld";

//        StringBuilder sb1 = new StringBuilder();
//
//        sb1.append(s1);
//        sb1.reverse();
//        System.out.println(sb1);

        char[] arr = s1.toCharArray();
        char temp;
        for (int i = 0; i <arr.length/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

//        System.out.println(arr);


        String s2 = "123456";

//        System.out.println(s2.matches(""));

        String v = "aeiouAEIOU";
        String n = "12";
        String Test = "HelloWorld";
        int count = 0;
        for(int i = 0; i < Test.length(); i++){
            if(v.contains(Test.charAt(i)+"")){
                count++;
            }
        }

//        System.out.println(count+", "+ (Test.length()-count));


    }
}
