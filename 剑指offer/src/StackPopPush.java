import java.util.Stack;

/**
 * @program: 剑指offer
 * @description: 栈的压入弹出
 * @author: tyq
 * @create: 2019-11-01 18:47
 **/
public class StackPopPush {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (stack.size() != 0 && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

