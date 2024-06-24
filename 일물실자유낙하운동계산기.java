import java.util.Scanner;

public class 일물실자유낙하운동계산기 {
    public static void main(String[]args){
        double ipt,sqipt,sqhipt;
        Scanner sc = new Scanner(System.in);

        System.out.print("자유낙하 운동 시간을 입력해주세요.(s 기준) : ");
        ipt = sc.nextDouble();

        sqipt = ipt * ipt;

        sqhipt = sqipt / 2;

        System.out.println("시간(s) : t^2 =" + Math.round(sqipt * 10000000000.0) / 10000000000.0);
        System.out.print("시간(s) : t^2/2 =" + Math.round(sqhipt * 10000000000.0) / 10000000000.0);
    }
}
