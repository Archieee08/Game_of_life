import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, s;
        n = scn.nextInt();
        s = scn.nextInt();
        char[][] arr = new char[n][n];
        Random randomno = new Random(s);
        boolean t;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t = randomno.nextBoolean();
                if(t){
                    arr[i][j]='O';
                }else{
                    arr[i][j]=' ';
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
