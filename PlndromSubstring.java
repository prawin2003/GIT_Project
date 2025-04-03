
import java.util.*;

class PlndromSubstring {
    public static boolean isPalindrome(String s){
      int i = 0, j =s.length()-1;
      while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            ++i;
            --j;
        }
        else
            return false;
      }  
      return true;
    }
    public String longestPalindrome(String s) {
        String ans = s.substring(s.length()-1);
        int i=0, j=s.length();
        while(i<j){
            if(s.charAt(i)==s.charAt(j-1)&&isPalindrome(s.substring(i,j))){
                if(s.substring(i,j).length()>ans.length())
                    ans = s.substring(i,j);
            ++i; 
            j = s.length();
            }
            else
                --j;
            if(i<s.length()-1 && i==j){
                ++i;
                j = s.length();
            }
        }
    return ans;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("give any string");
       String s = sc.next();
       String ans = new PlndromSubstring().longestPalindrome(s);
       System.out.println(ans); 
    }
}