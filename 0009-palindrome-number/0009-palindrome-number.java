class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int original = x;
        if(x < 0)
        {
            return false;
        }
        while(x != 0)
        {
            int lastdigit = x % 10;
            sum = lastdigit + (sum * 10);
            x = x / 10;
        }
        return original == sum;
    }
}