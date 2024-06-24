import java.util.Scanner;

public class 금속의선팽창계산기 {
    public static void main(String[] args) {
        double L1, L2, T1, T2, op;
        Scanner sc = new Scanner(System.in);

        System.out.println("L1(시료 길이:mm) 값을 입력해주세요. : ");
        L1 = sc.nextDouble();
        System.out.println("L2(늘어난 시료 길이:mm) 값을 입력해주세요. : ");
        L2 = sc.nextDouble();
        System.out.println("T1(처음 온도:C or K) 값을 입력해주세요. : ");
        T1 = sc.nextDouble();
        System.out.println("T2(나중 온도:C or K) 값을 입력해주세요. : ");
        T2 = sc.nextDouble();

        op = (L2 - L1) / (L1*(T2 - T1));
        System.out.println("선팽창 계수 = " + op);
        sc.close();
    }
}
