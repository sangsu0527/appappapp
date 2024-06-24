import java.util.Scanner;

public class 일물실구면계계산기 {
    public static void main(String[]args){
        double /*input = 0,*/ sum=0, df=0, avg, py, error;
        int count, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("실험 횟수를 입력하세요. : "); //실험 횟수 받기
        count = sc.nextInt();

        double[] input = new double[count];
        System.out.println(count + "개의 데이터를 입력해주세요. : "); //데이터 입력 (1)

        for(i=0; i<count; i++) { //입력 값 받기(2) , 입력 총 합계
            input[i] = sc.nextDouble();
            sum = sum + input[i];
        }
        avg = sum / count; //평균

        for (i = 0; i < count; i++) {
            df = df + Math.pow(input[i] - avg, 2); //편차^2
        }
        py = Math.sqrt(df / (count-1)); //평균 표준 편차

        error = py / Math.sqrt(count); //평균 표준 오차

        System.out.println("평균= " + avg);
        System.out.println("평균 표준 편차= " + py);
        System.out.print("평균 표준 오차= " + error);

        sc.close();
    }
}

