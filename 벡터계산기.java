import java.util.Scanner;

public class 벡터계산기 {
    public static void main(String[]args){
        int entry;
        double R,Rp,Rx,Ry,A,B,C,Ap,Bp,Cp;
        double ApRadians,BpRadians,CpRadians;
        Scanner sc = new Scanner(System.in);

        System.out.print("1. 두 벡터의 합 2. 세 벡터의 합\n(숫자 입력) : "); entry = sc.nextInt();

        if(entry == 1){
            System.out.print("크기 A : "); A = sc.nextDouble();
            System.out.print("방향 A (도 단위) : "); Ap = sc.nextDouble();
            System.out.print("크기 B :"); B = sc.nextDouble();
            System.out.print("방향 B (도 단위) : "); Bp = sc.nextDouble();

            ApRadians = Math.toRadians(Ap); BpRadians = Math.toRadians(Bp);

            Rx = A * Math.cos(ApRadians) + B * Math.cos(BpRadians);
            Ry = A * Math.sin(ApRadians) + B * Math.sin(BpRadians);

            R = Math.sqrt(Math.pow(Rx, 2) + Math.pow(Ry, 2));
            Rp = Math.toDegrees(Math.atan2(Ry, Rx));

            System.out.println("합 벡터의 크기: " + R);
            System.out.println("합 벡터의 방향 (도 단위): " + Rp);
        }
        if(entry == 2){
            System.out.print("크기 A : "); A = sc.nextDouble();
            System.out.print("방향 A (도 단위) : "); Ap = sc.nextDouble();
            System.out.print("크기 B :"); B = sc.nextDouble();
            System.out.print("방향 B (도 단위) : "); Bp = sc.nextDouble();
            System.out.print("크기 C : "); C = sc.nextDouble();
            System.out.print("방향 C (도 단위) : "); Cp = sc.nextDouble();

            ApRadians = Math.toRadians(Ap); BpRadians = Math.toRadians(Bp); CpRadians = Math.toRadians(Cp);

            Rx = A * Math.cos(ApRadians) + B * Math.cos(BpRadians) + C * Math.cos(CpRadians);
            Ry = A * Math.sin(ApRadians) + B * Math.sin(BpRadians) + C * Math.sin(CpRadians);

            R = Math.sqrt(Math.pow(Rx, 2) + Math.pow(Ry, 2));
            Rp = Math.toDegrees(Math.atan2(Ry, Rx));

            System.out.println("합 벡터의 크기: " + R);
            System.out.println("합 벡터의 방향 (도 단위): " + Rp);
        }
        else{
            System.out.print("숫자 1, 2 중에 한 개를 입력해주세요.");
        }
    }
}
