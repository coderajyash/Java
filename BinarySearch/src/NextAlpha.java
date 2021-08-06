import java.util.Scanner;

public class NextAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in character array");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        char[] a= new char[n];

        int i=0;
        while(i<n){

             a[i] = sc.next().charAt(0);
             i++;
        }
        System.out.println("Enter Search element : ");
        char c = sc.next().charAt(0);
        int l =0,h=n-1,m;
        char res=' ';
        if(c>a[n-1]){
            res = a[0];
        }
        else {
            while (l <= h) {
                m = l + (h - l) / 2;
                if (a[m] == c) {
                    l = m + 1;

                }
                else {
                    res = a[m];
                    h = m - 1;
                }
            }
        }
        if(res!=' '){
            System.out.println("Next Alpha : "+res);
        }
        else{
            System.out.println("Not Found");

        }

    }
}
