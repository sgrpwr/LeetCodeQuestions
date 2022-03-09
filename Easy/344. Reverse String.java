package Java.Basic.String;

public class StringReverse {
    public static void main(String[] args) {
        char[] str = {'s', 'a', 'g', 'a', 'r'};
        System.out.println(reverse(str));
    }

    //simplest way to reverse a character array in O(n)
    private static char[] reverse(char[] chars){
        for(int i=0; i<chars.length/2; i++){
            char temp = chars[i];
            temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        return chars;
    }
    
    //Now we have to think how it would have been solved if it was a String not a character array?
}
