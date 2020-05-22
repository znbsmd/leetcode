import java.util.Arrays;
import java.util.Stack;

/**
 * @author zjn
 * @create 2020-05-20 23:26
 * @description 每日温度
 */
public class SevenThreeNine {

    /**
     * 栈 结构 解答 O(n)
     * @param T
     * @return
     */
    public static int[] dailyTemperaturesStack(int[] T) {

        int[] N = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {

            while (!stack.empty() && T[i] >T[stack.peek()]){
                int pop = stack.pop();
                N[pop] = i-pop;

            }
            stack.push(i);
        }


        return N;
    }

    /**
     * 算法解答  O(n2)
     * @param T
     * @return
     */

    public static int[] dailyTemperatures(int[] T) {

        int[] N = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i+1; j < T.length; j++) {
                if(T[j] > T[i] ){
                    N[i] = j-i;
                    break;
                }
            }
        }

        return N;

    }
    public static void main(String[] args) {
        int[] T = {55,38,53,81,61,93,97,32,43,78};
        int[] ints = dailyTemperaturesStack(T);

        System.out.println(Arrays.toString(ints));
    }
}
