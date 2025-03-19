import java.util.Scanner;

public class problem2525 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);

        int bigTime = time.nextInt();
        int littleTime = time.nextInt();
        int loading = time.nextInt();

        int addBigTime = (littleTime+loading) / 60; // 더할 시간 계산
        int resultLittleTime = (littleTime+loading) % 60;

        int resultBigTime = (bigTime + addBigTime) % 24;


        System.out.println(resultBigTime+" "+resultLittleTime);
    }
}
