
// Given a string s, find the length of the longest substring without duplicate characters

import java.util.*;
class SubString {
    public int lengthOfLongestSubstring(String s) {
    if(s.length()==0)
        return 0;
    int intx = 0;
    int max = 0;
    Set <Character> cs = new LinkedHashSet<>();
    for(int i=0; i<s.length();i++){
        if(!(cs.contains(s.charAt(i)))){
            cs.add(s.charAt(i));
        }
        else{
            while(cs.contains(s.charAt(i)))
                cs.remove(s.charAt(intx++));
            cs.add(s.charAt(i));
        }
        max = Math.max(cs.size(),max);
    }
    return max;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("give any string");
       String s = sc.next();
       int ans = new SubString().lengthOfLongestSubstring(s);
       System.out.println(ans); 
    }
} 