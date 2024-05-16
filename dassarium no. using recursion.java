import java.util.*;

class Test
{
   
    static boolean check(int n)
    {
       
        int count_digits = Integer.toString(n).length();
      
       
        int sum = 0; 
        int x = n;
        while (x!=0)
        {
            int r = x%10;
      
            sum = (int) (sum + Math.pow(r, count_digits--));
            x = x/10;
        }
      
        return (sum == n);
    }
     
    public static void main(String[] args) 
    {
        int n = 135;
         
        System.out.println(check(n) ? "Disarium Number" : "Not a Disarium Number");
    }
}
