package samp1;

import java.util.Arrays;

public class Samp1 {
    public static void main(String[] args) {
        int a=213;
        float b=2.1234567F;
        byte c=-128;
        long d=5001;
        short e=32767;
        Double f=4.123456789101112;
        char g='A';
        boolean h=false;
        String i="safdhgkj";
        char[] j={'h','j','k'};
        String[] k={"Anu","Anitha","Zahee"};
        
       
        String[] l=k.clone();
        System.out.println(a);  
        System.out.println(b); 
        System.out.println(c);
        System.out.println(d);
        System.out.println(e); 
        System.out.println(f); 
        System.out.println(g); 
        System.out.println(h); 
        System.out.println(i);
        System.out.println(j[2]); 
        System.out.println(Arrays.toString(k)); 
        System.out.println(Arrays.toString(l)); 
    }
    
}
