
package armstrong;
import java.util.Scanner;
public class Armstrong {
    /*public static String arm(int inp){
        int x=inp;
        int out=0;
        String output="";
       
        while(x>0){
         int temp=x%10;
         out+=temp*temp*temp;
         x=x/10;
        }
         System.out.println(out);
        
        if(inp==out){
            return "Armstrong Number";
        }
        else{
            return "Not Armstrong Number";
         
    }
}

    
    public static void main(String[] args) {
        String a=arm(153);
        System.out.println(a);  
    }*/
    public static int pow(int x,int y){
        int out=1;
        for(int i=1;i<=y;i++){
            out*=x;
        }
        return out;
    }
    public static String arm(String inp){
        int len=inp.length();
        int in=Integer.parseInt(inp);
        int x=in;
        int out=0;
        while(x>0){
         int temp=x%10;
         out+=pow(temp,len);
         x=x/10;
        }
        if(in==out){
            return "Armstrong Number";
            
        }
        else{
            return "Not Armstrong Number";
         
    }
}

    
    public static void main(String[] args) {
        System.out.println(arm("1634"));
    }
    

}

