import java.util.Scanner;

public class problem10869 {
    public static void main(String[] args) {
        //두개의 숫자 입력 받기
        Scanner input = new Scanner(System.in);

        // 입력 받은 두 수 변수에 저장하기
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    }
}
