import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> soz = new HashMap<>();
        String a = scanner.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (soz.containsKey(c)){
                soz.put(c,soz.get(c) +1);
            }else{
                soz.put(c,1);
            }
        }for (char c: soz.keySet()){
            System.out.println(c + " - "+soz.get(c));
        }
    }
}