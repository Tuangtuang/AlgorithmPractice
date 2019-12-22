import java.util.LinkedList;
import java.util.Stack;

/**
 * @program: 剑指offer
 * @description: 最小栈
 * @author: tyq
 * @create: 2019-11-01 18:07
 **/
public class MinStack {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public void push(int node) {
        stack.push(node);
        if(minStack.size()==0){
            minStack.push(node);
        }
        if(node<minStack.peek()){
            minStack.push(node);
        }

    }

    public void pop() {
        if(minStack.peek()==stack.peek()){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
