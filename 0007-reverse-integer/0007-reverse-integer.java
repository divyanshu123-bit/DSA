class Solution {
    public int reverse(int x) {
        int sum = 0;
       while( x != 0)
       {
            int lastdigit = x % 10;
             if(sum > Integer.MAX_VALUE / 10 ||
   (sum == Integer.MAX_VALUE / 10 && lastdigit > 7))
    {
     return 0;
    }

    if(sum < Integer.MIN_VALUE / 10 ||
        (sum == Integer.MIN_VALUE / 10 && lastdigit < -8))
    {
        return 0;
    }
            sum = lastdigit + (sum * 10);
            x = x / 10;
           

       } 
        
       return sum;
    }
}