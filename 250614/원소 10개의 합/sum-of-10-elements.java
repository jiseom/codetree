import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = 0;

        for (int i =0; i < 10; i++){
            val += sc.nextInt();
        }
        System.out.print(val);
    }
}