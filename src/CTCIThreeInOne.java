import java.util.Arrays;
import java.util.Stack;

public class CTCIThreeInOne {

    public static void main(String[] args) {
        try {
            CTCIThreeInOne obj = new CTCIThreeInOne();
            obj.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(String[] args) throws Exception {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(8);
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.push(6);
        System.out.println(minStack.min());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.min());
    }

    public class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minValue = new Stack<>();

        public void push(int num) {
            if(stack.isEmpty()){
                minValue.push(num);
            }else if(num < minValue.peek()){
                minValue.push(num);
            }else{
                minValue.push(minValue.peek());
            }
            stack.push(num);
        }

        public int pop() {
            minValue.pop();
            return stack.pop();
        }

        public int min() {
            return minValue.peek();
        }

    }
}
