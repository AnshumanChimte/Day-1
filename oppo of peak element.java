import java.util.*;

class Newclasss{
    public static void main(String[] args) {
        int []arr={2,5,3,6,7,8,5,9};
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]< arr[i-1] && arr[i]< arr[i+1])
            {
                System.out.println("opposite of peak element is :"+arr[i]);
            }
        }
        
    }
}
