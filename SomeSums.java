import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int total = 0;
        //exemple: n=20, a=2, b=5
        for (int i = 1; i <= n; i++) { //i=1; i<=20;
            int sum=0;
            int num = i; // num=1
            while (num > 0) { //1>0
                sum = sum + num % 10;//sum=0+1=1
                num = num / 10; //num=1/10=0
            }

            if (sum >= a && sum <= b) {//1>=2 && 1<=5
                total = total + i; //total=0+1=1
            }
        }
        System.out.println(total);//1
    }
}
