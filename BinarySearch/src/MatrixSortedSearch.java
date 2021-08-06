import java.sql.SQLOutput;
import java.util.Scanner;

public class MatrixSortedSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];

        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int res=0;
        //Mid is chosen as top corner
        i = 0;
        j=m-1;
        if(a[i][j]==k){
            System.out.println("Element Found at : "+i+" "+j);

        }
        else{
            while(i!=-1 && i!=n && j!=-1 && j !=m){

                if(a[i][j]==k){
                    res = 1;
                    break;
                }
                else {
                    if(k>a[i][j]){
                        i++;
                    }
                    else{
                        j--;
                    }
                }
            }
        }

        if(res==1){
            System.out.println("Element Found at :"+i+" "+j);
        }
        else {
            System.out.println("Element not found");
        }


    }
}
