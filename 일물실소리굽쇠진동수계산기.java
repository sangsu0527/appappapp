public class 일물실소리굽쇠진동수계산기 {
    public static void main(String[] args) {
        System.out.println("1. fn (소리굽쇠 진동수) \n2. (f1-f2)/2 (소리굽쇠1 + 소리굽쇠2) \n3. (f1+f2)/2 (소리굽쇠1 + 소리굽쇠2)\n");

        System.out.print("연산을 선택하시오:");

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String operator = sc.next();

        if (operator.equals("1")) {

            System.out.print("\n시작시간(t1):");
            double t1 =  sc.nextDouble();

            System.out.print("마지막시간(t2):");
            double t2 =  sc.nextDouble();

            System.out.print("주기수(N):");
            double n =  sc.nextDouble();

            double t = (t2 - t1) / n;

            double Hz = 1/t;

            System.out.println("\n주기(T):" + Math.round(t * 100000) / 100000.0 );

            System.out.println("진동수(Hz):" + Math.round(Hz * 100000) / 100000.0 );
        }
        else if (operator.equals("2")) {
            System.out.print("\n시작시간(t1):");
            double t1 =  sc.nextDouble();

            System.out.print("마지막시간(t2):");
            double t2 =  sc.nextDouble();

            System.out.print("주기수(N):");
            double n =  sc.nextDouble();

            double t = (t2 - t1) / n * 2;

            double Hz = 1/t;

            System.out.println("\n주기(T):" + Math.round(t * 100000) / 100000.0 );

            System.out.println("진동수(Hz):" + Math.round(Hz * 100000) / 100000.0 );

            System.out.println("맥놀이 진동수 실험값(Hz):" + Math.round(Hz * 100000) / 100000.0 * 2 );

        }
        else if (operator.equals("3")) {
            System.out.print("\n시작시간(t1):");
            double t1 =  sc.nextDouble();

            System.out.print("마지막시간(t2):");
            double t2 =  sc.nextDouble();

            System.out.print("주기수(N):");
            double n =  sc.nextDouble();

            double t = (t2 - t1) / n;

            double Hz = 1/t;

            System.out.println("\n주기(T):" + Math.round(t * 100000) / 100000.0);

            System.out.println("진동수(Hz):" + Math.round(Hz * 100000) / 100000.0);

        }

        sc.close();
    }
}
