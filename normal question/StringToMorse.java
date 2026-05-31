import java.util.*;

// import static java.lang.Character.*;

public class StringToMorse
{
    private static final Map<Character, String> code = new HashMap<>();
        static {
            
             code.put('A', ".-");
             code.put('B', "-...");
             code.put('C', "-.-.");
             code.put('D', "-..");
             code.put('E', ".");
             code.put('F', "..-.");
             code.put('G', "--.");
             code.put('H', "....");
             code.put('I', "..");
             code.put('J', ".---");
             code.put('K', "-.-");
             code.put('L', ".-..");
             code.put('M', "--");
             code.put('N', "-.");
             code.put('O', "---");
             code.put('P', ".--.");
             code.put('Q', "--.-");
             code.put('R', ".-.");
             code.put('S', "...");
             code.put('T', "-");
             code.put('U', "..-");
             code.put('V', "...-");
             code.put('W', ".--");
             code.put('X', "-..-");
             code.put('Y', "-.--");
             code.put('Z', "--..");

             code.put('a', ".-");
             code.put('b', "-...");
             code.put('c', "-.-.");
             code.put('d', "-..");
             code.put('e', ".");
             code.put('f', "..-.");
             code.put('g', "--.");
             code.put('h', "....");
             code.put('i', "..");
             code.put('j', ".---");
             code.put('k', "-.-");
             code.put('l', ".-..");
             code.put('m', "--");
             code.put('n', "-.");
             code.put('o', "---");
             code.put('p', ".--.");
             code.put('q', "--.-");
             code.put('r', ".-.");
             code.put('s', "...");
             code.put('t', "-");
             code.put('u', "..-");
             code.put('v', "...-");
             code.put('w', ".--");
             code.put('x', "-..-");
             code.put('y', "-.--");
             code.put('z', "--..");

             code.put('0', "-----");
             code.put('1', ".----");
             code.put('2', "..---");
             code.put('3', "...--");
             code.put('4', "....-");
             code.put('5', ".....");
             code.put('6', "-....");
             code.put('7', "--...");
             code.put('8', "---..");
             code.put('9', "----.");            

             code.put('.', ".-.-.-");
             code.put(',', "--..--");
             code.put(':', "---...");
             code.put('?', "..--..");
             code.put('\'', ".----.");
             code.put('-', "-....-");
             code.put('/', "-..-.");
             code.put('(', "-.--.-");
             code.put(')', "-.--.-");
             code.put('"', ".-..-.");
             code.put('@', ".--.-.");
             code.put('=', "-...-");

                    code.put(' ', " ");
        }

    public static String translate(String message) {
        String result = new String();
        
        for(char c : message.toCharArray()) {
            if(code.containsKey(c)) result = result + code.get(c) + "/";
            else throw new IllegalArgumentException("Character " + c + "is not in Morse's code");
        }
        
        result = result.substring(0, result.length() - 1);
        return result;
    }
}


