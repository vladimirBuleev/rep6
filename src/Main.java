public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");

        Queue queue = new Queue();
        queue.push(2);
        queue.push(5);
        queue.push(4);
        queue.push(1);
        queue.push(7);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }

}
