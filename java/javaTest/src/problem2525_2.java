import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2525_2 {
    public static void main(String[] args) throws IOException {
        // scanner을 사용하지 않고 BufferedReader을 사용하여 해결
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // split을 사용하여 해결할 수도 있지만 이게 성능이 더 좋음
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int bigTime = Integer.parseInt(st.nextToken());
        int littleTime = Integer.parseInt(st.nextToken());
        int loadingTime = Integer.parseInt(br.readLine());

        int addBigTime = (littleTime + loadingTime) / 60;
        int resultLittleTime = (littleTime + loadingTime) % 60;
        int resultBigTime = (addBigTime + bigTime) % 24;

        System.out.println(resultBigTime + " " + resultLittleTime);


    }
}
