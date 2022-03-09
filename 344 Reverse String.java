package Java.Basic;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,10);
        map.put(3,10);

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        try{
            int i=10;
            int res = i/0;
        } catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
