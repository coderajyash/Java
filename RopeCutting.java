import java.util.Scanner;

public class RopeCutting {

    
    static int count(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        
        int res = max(count(n-a, a, b, c),count(n-b, a, b, c),count(n-c, a, b, c));

        if(res == -1) return -1;

        return res+1;
    }
    public static void main(String[] args) {
        count(9,2,2,2);

        

    }
}
