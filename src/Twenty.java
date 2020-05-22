import java.util.HashMap;
import java.util.Stack;

/**
 * @author zjn
 * @create 2020-05-20 23:26
 * @description 有效的括号
 */
public class Twenty {

    public static void main(String[] args) {

        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {


        HashMap<Character, Character> ss = new HashMap<>();

        Stack<Character> stack = new Stack<>();
        ss.put(')','(');
        ss.put(']','[');
        ss.put('}','{');

        for (Character c :s.toCharArray()) {

            if(ss.containsKey(c)){
                Character topStack = stack.empty() ? '#' : stack.pop();

                if(topStack != ss.get(c)){
                    return  false;
                }

            }else{

                stack.push(c);
            }

        }

        return stack.empty();
    }
}
