class Solution {
    public int minMovesToMakePalindrome(String s) {
        
        int ans = 0;
        
        int start = 0 , end = s.length() - 1;
        
        char ch[] = s.toCharArray();
        
        while(start < end)
        {
           
            int r = end;
            
            if(ch[start] == ch[end])
            {
                start++;
                end--;
                continue;
            }
            
            while(ch[start] != ch[r])
            {
                r--; 
            }// aabb l is pointing at 0 th index while r is pointing to b which is not equal to a so r-- by doing this we are searching whether any a is present there other than the one which l is pointing
            
            if(start == r) // means no a is present other than first index
            {
                //swap them
               
                swap(ch,r,r+1);
                ans++;
               
            }
            else 
            {
                while(r<end)
                {
                    swap(ch,r,r+1);
                    ans++;
                    r++;
                }
               
            }
            
            
        }
        return ans;
    }
    
    private void swap(char ch[] , int i , int j)
    {
        
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
      
    }
}