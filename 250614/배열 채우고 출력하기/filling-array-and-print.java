import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = sc.nextLine().split(" ");
        
        String str = "";
        int num = 9;
        for (int i = 0; i< 10; i++){
            str += strArray[num-i];
        
        }
           System.out.print(str);

    }
}