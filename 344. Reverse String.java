package Java.Basic.String;

public class StringReverse {
    public static void main(String[] args) {
        char[] str = {'s', 'a', 'g', 'a', 'r'};
        System.out.println(reverse(str));
    }

    private static char[] reverse(char[] chars){
        for(int i=0; i<chars.length/2; i++){
            char temp = chars[i];
            temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        return chars;
    }
}
