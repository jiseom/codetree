import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double total = 0.0;
    int score = 8;
    for (int i = 0; i < score; i++){
        total += sc.nextDouble();
    }
        System.out.printf("%.1f\n",total / score);

    }
}