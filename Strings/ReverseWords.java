package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is the best programming Language";
        s = " " + s;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i =s.length()-1; i>= 0; i--){
            if(s.charAt(i) != ' '){

                sb1.append(s.charAt(i)+"");
            }else{

                sb1.append(" ");
                sb1.reverse();
                res.append(sb1);
                sb1.setLength(0);
            }

        }
        System.out.println(res);
    }
}
