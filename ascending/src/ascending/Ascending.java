
package ascending;
import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len,i;
        System.out.println("How many elements:");
        len=in.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter the numbers:");
        for(i=0;i<len;i++){
            System.out.println("Enter the "+(i+1)+" Elements");
            nums[i]=in.nextInt();
        }
        for(i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=0;
                if(nums[i]>nums[j]){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
        }
        for(i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=0;
                if(nums[i]<nums[j]){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
        }
               
        System.out.println("Ascending order:");
        for(i=0;i<nums.length;i++){
        System.out.println(nums[i]);
            
        System.out.println("Descending order:");
        for(i=0;i<nums.length;i++){
        System.out.println(nums[i]);
            
        }
        
        
    }

   }
}


   
