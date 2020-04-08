import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        int v = in.nextInt();
        int t = in.nextInt();
        if(v>=-100&&v<=100&&t>=0&&t<=200)
        System.out.println((t*2)*v);
        }
    }
}