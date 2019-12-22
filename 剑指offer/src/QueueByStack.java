import java.util.Stack;

/**
 * @program: 剑指offer
 * @description: 用两个栈实现一个队列
 * @author: tyq
 * @create: 2019-10-31 18:56
 **/
public class QueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);

    }

    public int pop() {
        while(stack2.size()!=0){
            int temp=stack2.peek();
            stack1.push(temp);
            stack2.pop();
        }
        int result=stack1.peek();
        stack1.pop();
        while (stack1.size()!=0){
            int temp=stack1.peek();
            stack2.push(temp);
            stack1.pop();
        }
        return result;
    }
}
