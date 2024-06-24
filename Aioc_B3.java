package Aioc;

import java.util.Scanner;

public class Aioc_B3 {
    public static void main(String[]args){
        String input;
        Scanner sc = new Scanner(System.in);

        // 계산기 종류
        String[] calculatorTypes = {"퍼센트오차계산기", "구면계계산기", "소리굽쇠진동수계산기", "자유낙하운동계산기", "회전운동계산기"
                , "금속선팽창계산기", "벡터계산기", "구심력계산기", "용수철의조화운동계산기", "포사체운동계산기", "행렬계산기"};

        // 계산기 종류 보여주기
        System.out.println("사용 가능한 계산기 종류:");
        for (String type : calculatorTypes) {
            System.out.println("- " + type);
        }

        // 계산기 선택
        System.out.print("사용하실 계산기 입력 (띄어쓰기 상관x) : "); input = sc.nextLine();

        // 퍼센트 오차 계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("퍼센트오차계산기")){
            double Ev, Tv, Pe;

            System.out.println("실험 값 입력 : "); Ev = sc.nextDouble();
            System.out.println("이론 값 입력 : "); Tv = sc.nextDouble();

            Pe = Math.abs(((Ev - Tv) / Tv) * 100);

            System.out.println("퍼센트 오차 : " + Pe + "%");
        }
        // 퍼센트 오차 계산기 끝.

        // 구면계 계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("구면계계산기")){
            double sum=0, Df=0, avg, Sd, Er;
            int count, i;

            System.out.print("실험 횟수 : "); count = sc.nextInt();

            double[]entry = new double[count];
            System.out.println(count + "개의 데이터를 입력하시오.");

            for(i = 0; i < count; i++) {
                entry[i] = sc.nextDouble();
                sum = sum + entry[i];
            }

            avg = sum / count;

            for (i = 0; i < count; i++) {
                Df = Df + Math.pow(entry[i] - avg, 2);
            }

            Sd = Math.sqrt(Df / (count-1));

            Er = Sd / Math.sqrt(count);

            System.out.println("평균 : " + avg);
            System.out.println("평균 표준 편차 : " + Sd);
            System.out.println("평균 표준 오차 : " + Er);
        }
        // 구면계 계산기 끝.

        // 소리굽쇠 진동수 계산기
        if(input.replace(" ", "").equalsIgnoreCase("소리굽쇠진동수계산기")) {
            double T1, T2, N, T, Hz;
            int entry;

            System.out.println("1. fn (소리굽쇠 진동수) \n2. (f1-f2)/2 (소리굽쇠1 - 소리굽쇠2) \n3. (f1+f2)/2 (소리굽쇠1 + 소리굽쇠2)\n");

            System.out.print("연산 선택 : "); entry = sc.nextInt();

            if(entry == 1){
                System.out.print("\n시작 시간(T1) : "); T1 = sc.nextDouble();

                System.out.print("마지막 시간(T2) : "); T2 = sc.nextDouble();

                System.out.print("주기수(N) : "); N = sc.nextDouble();

                T = (T2 - T1) / N; Hz = 1 / T;

                System.out.println("\n주기(T) : " + Math.round(T * 100000) / 100000.0);

                System.out.println("진동수(Hz) : " + Math.round(Hz * 100000) / 100000.0);
            }
            else if(entry == 2){
                System.out.print("\n시작 시간(T1) : "); T1 = sc.nextDouble();

                System.out.print("마지막 시간(T2) : "); T2 = sc.nextDouble();

                System.out.print("주기수(N) : "); N = sc.nextDouble();

                T = (T2 - T1) / N * 2; Hz = 1 / T;

                System.out.println("\n주기(T) : " + Math.round(T * 100000) / 100000.0);

                System.out.println("진동수(Hz) : " + Math.round(Hz * 100000) / 100000.0);

                System.out.println("맥놀이 진동수 실험값(Hz) : " + Math.round(Hz * 100000) / 100000.0 * 2);
            }
            else if(entry == 3) {
                System.out.print("\n시작 시간(T1) : "); T1 = sc.nextDouble();

                System.out.print("마지막 시간(T2) : "); T2 = sc.nextDouble();

                System.out.print("주기수(N) : "); N = sc.nextDouble();

                T = (T2 - T1) / N;
                Hz = 1 / T;

                System.out.println("\n주기(T):" + Math.round(T * 100000) / 100000.0);

                System.out.println("진동수(Hz):" + Math.round(Hz * 100000) / 100000.0);
            }
            else{
                System.out.println("숫자 1, 2, 3 중에 한 개를 입력해주세요.");
            }
        }
        // 소리굽쇠 진동수 계산기 끝.

        // 회전 운동 계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("회전운동계산기")) {
            double G = 9.8, r, M, m, a, Id, Ip, I, It, R;
            int entry;

            System.out.print("1. 알루미늄 봉과 디스크의 관성모멘트 구하기 \n2. 회전 추의 관성모멘트 구하기\n연산 선택 : "); entry = sc.nextInt();

            if (entry == 1) {
                System.out.print("회전반경 R(m) : "); R = sc.nextDouble();

                System.out.print("추의 질량 m(kg) : "); m = sc.nextDouble();

                System.out.print("t-w 그래프의 추세선 기울기 (각가속도) : "); a = sc.nextDouble();

                Id = (m * R * (G - R * a)) / a;

                System.out.print("알루미늄 봉과 디스크의 관성모멘트: " + (Math.round(Id * 10000000.0) / 10000000.0));
            }
            else if (entry == 2) {
                System.out.print("회전반경 R(m) : "); R = sc.nextDouble();

                System.out.print("회전 추의 회전 반경 r(m) : "); r = sc.nextDouble();

                System.out.print("회전 추의 질량 M(kg) : "); M = sc.nextDouble();

                System.out.print("추의 질량 m(kg) : "); m = sc.nextDouble();

                System.out.print("t-w 그래프의 추세선 기울기 (각가속도) : "); a = sc.nextDouble();

                System.out.print("알루미늄 봉과 디스크의 관성모멘트: "); Id = sc.nextDouble();

                Ip = (m * R * (G - R * a)) / a;
                I = Ip - Id;
                It = M * r * r;

                System.out.println("전체 관성 모멘트 : " + Math.round(Ip * 10000000.0) / 10000000.0);
                System.out.println("회전 추의 관성 모멘트 : " + Math.round(I * 10000000.0) / 10000000.0);
                System.out.println("회전 추의 관성모멘트 이론값 : " + Math.round(It * 10000000.0) / 10000000.0);
            } else {
                System.out.print("숫자 1, 2 중에 한 개를 입력해주세요.");
            }
        }
        // 회전 운동 계산기 끝.

        // 자유 낙하 운동 계산기
        if(input.replace(" ", "").equalsIgnoreCase("자유낙하운동계산기")) {
            double entry, SQentry, SQHentry;

            System.out.print("자유 낙하 운동 시간을 입력해주세요. (s 기준) : "); entry = sc.nextDouble();

            SQentry = entry * entry;

            SQHentry = SQentry / 2;

            System.out.println("시간(s) : t^2 =" + Math.round(SQentry * 10000000000.0) / 10000000000.0);
            System.out.print("시간(s) : t^2/2 =" + Math.round(SQHentry * 10000000000.0) / 10000000000.0);
        }
        // 자유 낙하 운동 계산기 끝.

        // 금속 선팽창 계산기
        if(input.replace(" ", "").equalsIgnoreCase("금속선팽창계산기")) {
            double L1, L2, T1, T2, LN;

            System.out.print("L1(시료 길이:mm) 값을 입력해주세요. : "); L1 = sc.nextDouble();
            System.out.print("L2(늘어난 시료 길이:mm) 값을 입력해주세요. : "); L2 = sc.nextDouble();
            System.out.print("T1(처음 온도:C or K) 값을 입력해주세요. : "); T1 = sc.nextDouble();
            System.out.print("T2(나중 온도:C or K) 값을 입력해주세요. : "); T2 = sc.nextDouble();

            LN = (L2 - L1) / (L1*(T2 - T1));

            System.out.println("선팽창 계수 : " + LN);
        }
        // 금속 선팽창 계산기 끝.

        // 벡터 계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("벡터계산기")) {
            int entry;
            double R,Rp,Rx,Ry,A,B,C,Ap,Bp,Cp;
            double ApRadians,BpRadians,CpRadians;

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
        // 벡터 계산기 끝.

        // 구심력 계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("구심력계산기")) {
            double r,v,w,ww;
            System.out.print("회전 반경(m) : "); r = sc.nextDouble();
            System.out.print("속도 : " ); v = sc.nextDouble();

            w = v / r;
            ww = Math.pow(w ,2);

            System.out.println("각속도 : " + w);
            System.out.println("각속도 제곱 : " + ww);
        }
        // 구심력 계산기 끝.

        // 용수철의조화운동계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("용수철의조화운동계산기")) {
            double T,w,ww;
            System.out.print("주기 : "); T = sc.nextDouble();

            w = Math.PI*2 / T;
            ww = Math.pow(w ,2);

            System.out.println("각속도 : " + w);
            System.out.println("각속도 제곱 : " + ww);
        }
        // 용수철의조화운동계산기 끝.

        // 포사체운동계산기 시작.
        if(input.replace(" ", "").equalsIgnoreCase("포사체운동계산기")) {
            System.out.print("발사체 질량(kg) : "); double m = sc.nextDouble();

            System.out.print("발사체 각도(도 단위) : "); double d = sc.nextDouble();
            double dRadians = Math.toRadians(d);

            System.out.print("(t-x 한 번 미분)\n속도 x : "); double vx = sc.nextDouble();
            System.out.print("(t-y 한 번 미분 후 '0'대입)\n속도 y : "); double vy = sc.nextDouble();
            System.out.print("(t-y 방정식 두 번 미분)\n중력가속도 : "); double g = sc.nextDouble();
            System.out.print("시간 : "); double t = sc.nextDouble();
            System.out.print("높이 : "); double h = sc.nextDouble();


            double v0 = Math.pow((Math.pow(vx , 2))+(Math.pow(vy , 2)), 0.5);
            double W = m * Math.abs(g) * h;
            double K = 0.5 * m * ((Math.pow(vx , 2))+(Math.pow(vy - (Math.abs(g)*t), 2)));

            double H = (Math.pow(v0 , 2) * Math.pow(Math.sin(dRadians) , 2)) / (2*(9.8));
            double R = (Math.pow(v0 , 2) * Math.sin(2 * dRadians)) / 9.8;
            double T = (2 * v0 * Math.sin(dRadians)) / 9.8;

            System.out.println("--측정값--");
            System.out.println("초기속도 : " + v0);
            System.out.println("위치 에너지 : " + W);
            System.out.println("운동 에너지 : " + K);
            System.out.println("--이론값--");
            System.out.println("최고점높이 : " + H);
            System.out.println("수평도달거리 : " + R);
            System.out.println("수평도달거리 소요시간 : " + T);
        }
        // 포사체운동계산기 끝.

        // 행렬 계산기 시작.
        if (input.replace(" ", "").equalsIgnoreCase("행렬계산기")) {
            System.out.println("첫 번째 행렬의 크기를 입력하세요 (행, 열 순서로) : ");
            int row1 = sc.nextInt(); int col1 = sc.nextInt();

            System.out.println("두 번째 행렬의 크기를 입력하세요 (행, 열 순서로) : ");
            int row2 = sc.nextInt(); int col2 = sc.nextInt();

            if (col1 != row2) {
                System.out.println("행렬의 곱셈을 위해서는 첫 번째 행렬의 열 수와 두 번째 행렬의 행 수가 같아야 합니다.");
                return;
            }

            System.out.println("첫 번째 행렬의 요소를 입력하세요 : ");
            int[][] matrix1 = readMatrix(row1, col1, sc);

            System.out.println("두 번째 행렬의 요소를 입력하세요 : ");
            int[][] matrix2 = readMatrix(row2, col2, sc);

            System.out.println("첫 번째 행렬 : ");
            printMatrix(matrix1);

            System.out.println("두 번째 행렬 : ");
            printMatrix(matrix2);

            System.out.println("원하는 연산을 선택하세요 (덧셈/뺄셈/곱셈) : ");
            String operation = sc.next();

            if (operation.equalsIgnoreCase("덧셈")) {
                int[][] sum = addMatrix(matrix1, matrix2);
                System.out.println("행렬의 합:");
                printMatrix(sum);
            } else if (operation.equalsIgnoreCase("뺄셈")) {
                int[][] difference = subtractMatrix(matrix1, matrix2);
                System.out.println("행렬의 차:");
                printMatrix(difference);
            } else if (operation.equalsIgnoreCase("곱셈")) {
                int[][] product = multiplyMatrix(matrix1, matrix2);
                System.out.println("행렬의 곱:");
                printMatrix(product);
            } else {
                System.out.println("올바른 연산을 선택하세요 (덧셈/뺄셈/곱셈).");
            }
        }
        // 행렬 계산기 끝.

        sc.close();
    }

    // 행렬 요소 입력
    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // 행렬 출력
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 행렬 덧셈
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    // 행렬 뺄셈
    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return difference;
    }

    // 행렬 곱셈
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}
