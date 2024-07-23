import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        

            for(int i=1; i<=10; i++) {
                
                int p = sc.nextInt();
                if(p%2==1){ //i가 홀수일때, i는 입력받는 scan값이 되어야 함
                cnt++;
            }
            }
             System.out.println(cnt);
           
        
        }
    }