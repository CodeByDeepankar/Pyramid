import java.util.*;

public class pyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.print("Enter how many rows you want to take: ");
        int n = input.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
