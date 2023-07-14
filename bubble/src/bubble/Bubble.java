 package bubble;
 public class Bubble{
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             int temp=arr[i];
              if(arr[i]<arr[j]){
              arr[i]=arr[j];
              arr[j]=temp;
              } 
            }
        }
    }
    public static void main(String[] args){
        int[] arr={4,5,2,7,8};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");   
        }
                
    }
}

