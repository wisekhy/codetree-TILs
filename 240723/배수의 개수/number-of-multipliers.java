import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=0;
        int f=0;

        for(int i=1; i<=10; i++) {
            int p = sc.nextInt();
            if(p%3==0) { t++;}
            if(p%5==0) { f++;}
        }

        System.out.printf("%d %d", t,f);
      
    }
}