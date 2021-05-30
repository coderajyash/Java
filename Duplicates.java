import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                
                map.put(s.charAt(i),1);
                
            }

        }
        //Iterating through every Hash Map Elements
        for(Map.Entry m: map.entrySet()){
            
            if((int)(m.getValue())>1){
                System.out.println("Duplicate : "+(char)(m.getKey()));                   
            }

        }
    }
}
