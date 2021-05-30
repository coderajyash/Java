import java.util.Scanner;

public class RotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String 1 :");
        String s1 = sc.nextLine();
        System.out.println("Enter The String 2 :");
        String s2 = sc.nextLine();

        String s3 = s1.concat(s1);

        if(s3.contains(s2)){
            System.out.println("Equal after rotation");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
