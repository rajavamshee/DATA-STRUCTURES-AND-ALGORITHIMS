class Solution {
    public boolean buddyStrings(String A, String B) {
        //First necessary condition is that the length of A should be equal to B
        if(A.length()!=B.length())
            return false;
        
        //Converting A to an character Array.
        
        char[] arr = A.toCharArray();
        
        boolean continueloop = true;
        int start = 0;
        int count =0;
        int val1 =-1;
        int val2 =-1;
        while(continueloop==true && start<arr.length)
        {
            if(arr[start]!=(B.charAt(start)))
            {
                count++;
                if(count ==1)
                {
                    val1 = start;
                }
                
                if(count == 2)
                {
                    val2 = start;
                    continueloop = false;
                }
            }
            start++;
        }
        
        //If the string is completly matching.
        if(continueloop == true && (val1==-1 && val2==-1))
        {
           //There can be one possibility that the occurance of one character can be ultiple times like of example 3.
            int[] a = new int[26];
            for(int i=0;i<A.length();i++)
            {
                a[(((A.charAt(i)-0) -'a')+1)]++;
            }
            
            System.out.println(a[0]);
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>1)
                    return true;
            }
            return false;
        }
        
        //if there is only one differnce in characters.
        if(val1==-1 || val2==-1)
            return false;
        
        //If there is min of 2 diffence. 
        char temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
        
        String modified = new String(arr);
        return (modified.equals(B));
    }
}
