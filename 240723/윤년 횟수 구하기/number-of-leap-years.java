import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y=0;
        int p=0;
        
        for(int i=1; i<=n; i++){
             if(i%4!=0||(i%100==0&&i%400!=0))  {p++;}
        }
        y=n-p;
        System.out.print(y);
    }
}

// 4로 나누어떨어지는 해는 윤년 
// 즉 4로 나누어 떨어지지 않는 해는 평년임
// 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년