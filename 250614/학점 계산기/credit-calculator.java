import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String level = "";
        double score = 0;

        for(int i = 0; i< n; i++){
            score += sc.nextDouble();
        }
        if ((float)score/n >= 4.0){
            level = "Perfect";
        }else if ((float)score/n >= 3.0){
            level = "Good";
        }else{
            level = "Poor";
        }
        System.out.printf("%1.1f",(float)score/n);
        System.out.println();
        System.out.print(level);


    }
}