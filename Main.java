
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
           long a=in.nextLong();
           long b= in.nextLong();
           if(b>a)
            System.out.println(b-a);
           else
                System.out.println(a-b);
        }
    }
    
}
