class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList();
        int i = 1;
        while(n-->0){
            if(i%3==0 && i%5==0) answer.add("FizzBuzz");
            else if(i%3==0) answer.add("Fizz");
            else if(i%5==0) answer.add("Buzz");
            else answer.add(Integer.toString(i));
            i++;
        }

        return answer;
    }
}
