import java.util.HashMap;
import java.util.Scanner;

public class Translate {
    private static HashMap<Character, String> map = new HashMap<Character, String>();
    
    static {
        map.put('a', "@");
        map.put('b', "b");
        map.put('c', "(");
        map.put('d', "6");
        map.put('e', "3");
        map.put('f', "f");
        map.put('g', "g");
        map.put('h', ")-(");
        map.put('i', "1");
        map.put('j', "j");
        map.put('k', "|<");
        map.put('l', "|");
        map.put('m', "m");
        map.put('n', "^");
        map.put('o', "0");
        map.put('p', "9");
        map.put('q', "q");
        map.put('r', "r");
        map.put('s', "$");
        map.put('t', "+");
        map.put('u', "u");
        map.put('v', "v");
        map.put('w', "\\/\\/");
        map.put('x', "x");
        map.put('y', "\u00A5");
        map.put('z', "z");
    }

    private static String translate(String oldString) {
        if (oldString == null) { return ""; }

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < oldString.length(); i++) {
            char c = oldString.charAt(i);
            if (map.containsKey(c)) {
                newString.append(map.get(Character.toLowerCase(c)));
            } else {
                newString.append(c);
            }
        }
        return newString.toString();
    }
    
    public static void main (String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("[Text to translate]: ");
        String line = scan.nextLine();
        System.out.println("[Translated text]: " + translate(line));
        scan.close();
    }
}
