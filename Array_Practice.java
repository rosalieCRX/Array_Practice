import java.util.HashMap;

/**
 * Practices with arrays
 * @author rosaliecarrow
 *
 */
public class Array_Practice {
  
  /**
   * in-place array rotation
   * O(1)
   * 
   * @param nums    the array to modify
   * @param k       right shift k places
   */
  public void rotate(int[] nums, int k) {
        
        for(int i=0;i<gcd(nums.length,k);i++){
            int out=nums[i];
            int index = i;
            do{
            int tempIndex= (index+k)%nums.length;
            int temp = nums[tempIndex];
            nums[tempIndex]=out;
            out=temp;
            index=tempIndex;
            }while(i!=index);
        }
    }
    
    public int gcd(int a, int b){
        while(a!=b){
            if(a==0){
                return b;
            }
            if(b==0){
                return a;
            }
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }


  
}
