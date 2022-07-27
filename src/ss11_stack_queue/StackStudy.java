package ss11_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

//        integerStack.push(10);
//        integerStack.push(20);
//        integerStack.push(5);
//        integerStack.push(100);
//
//        while (!integerStack.isEmpty()){
//            System.out.println(integerStack.pop());
//        }
//
//        System.out.println(integerStack);

        int n = 100000;

        while (n > 0) {
            integerStack.push(n % 2);
            n /= 2;
        }

        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
