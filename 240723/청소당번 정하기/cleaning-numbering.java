import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int w=0;
        int t=0;

        for(int i=0; i<n; i++){
            if(i%2==0&&i%3!=0&&i%12!=0) {c++;} //12와 3으로 나누어지지 않는 짝수들
            if(i%2!=0&&i%3==0&&i%12!=0) {w++;} //12로 나누어지지 않는 짝수가 아닌 3의 배수들 
            if(i%2==0&&i%3==0&&i%12!=0) {w++;}
            if(i>=12&&i%12==0) {t++;}//12로 나누어지는 것들
        }

        System.out.printf("%d %d %d", c,w,t);
        // 0일부터 시작
        // 2일마다 교실(c) 청소를 3일마다 복도(w) 청소를 12일마다 화장실(t) 청소를 함
        // 날짜가 겹치는 날에는 화장실 > 복도 > 교실 순으로 진행함
    }
}