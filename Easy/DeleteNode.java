class Solution {
    public int majorityElement(int[] nums) {
        //Moore voting algo
        int count=0, res=0;
        for(int num : nums){
            if(count==0) res=num;
            if(res!=num) count++;
            else count--;
        }

        return res;
    }
}

/*2
count=0
res = 0

for num=2
res = 2
res!=num => 2!=2 false
count=-1

for num=2
res!=num => 2!=2 false
count=-2

for num=1
res!=num => 2!=1 true
count=-1

for num=1
res!=num => 2!=1 true
count=0
res = 1

for num=1
res!=num => 1==1 true
count=0

for num=2
count=0, res=2
res!=num => 2!=2 false
count=1

for num=2
count=0, res=2
res!=num => 2!=2 false
count=0

res=2;

*/