import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        for(int i=0; i<5; i++){
            int p = sc.nextInt();
            if(p%2==0) {n++;}
        }

        System.out.print(n);
    }
}