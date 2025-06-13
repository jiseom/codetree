import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int count = 0;
        float avg = 0.0f;
    
        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();
            
            if(num <= 250){
                total += num;
                count = i+1;
            }else{
                break;
            }
        }
        System.out.printf("%d %4.1f" , total , (double)total/count);
    }
}