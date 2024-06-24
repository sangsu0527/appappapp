import java.util.Scanner;

public class 일물실회전운동계산기 {
    public static void main(String[] args) {
        double G = 9.8; //중력값은 고정.
        double r, M, m, a, Id, Ip, I, It, R;
        int input; //1,2 연산 선택

        Scanner sc = new Scanner(System.in);

        System.out.print("1. 알루미늄 봉과 디스크의 관성모멘트 구하기 \n2. 회전 추의 관성모멘트 구하기\n연산 선택 : ");
        input = sc.nextInt();

        if ( input == 1 ) {
            System.out.print("회전반경 R(m) : ");
            R = sc.nextDouble();

            System.out.print("추의 질량 m(kg) : ");
            m = sc.nextDouble();

            System.out.print("t-w 그래프의 추세선 기울기 (각가속도) : ");
            a = sc.nextDouble();

            Id = (m*R*(G-R*a))/a;

            System.out.print("알루미늄 봉과 디스크의 관성모멘트: " + (Math.round(Id * 10000000.0)/10000000.0));
        }
        else if ( input == 2 ) {
            System.out.print("회전반경 R(m) : ");
            R = sc.nextDouble();

            System.out.print("회전 추의 회전 반경 r(m) : " );
            r = sc.nextDouble();

            System.out.print("회전 추의 질량 M(kg) : ");
            M = sc.nextDouble();

            System.out.print("추의 질량 m(kg) : ");
            m = sc.nextDouble();

            System.out.print("t-w 그래프의 추세선 기울기 (각가속도) : ");
            a = sc.nextDouble();

            System.out.print("알루미늄 봉과 디스크의 관성모멘트: ");
            Id = sc.nextDouble();

            Ip = (m*R*(G-R*a))/a;
            I = Ip - Id;
            It = M * r * r;

            System.out.println("전체 관성 모멘트 : " + Math.round(Ip * 10000000.0)/10000000.0);
            System.out.println("회전 추의 관성 모멘트 : " + Math.round(I * 10000000.0)/10000000.0);
            System.out.println("회전 추의 관성모멘트 이론값 : " + Math.round(It * 10000000.0)/10000000.0);

        }
        else {
            System.out.print("유효하지 않은 값");
        }
        sc.close();
    }

}
