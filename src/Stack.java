public class Stack {
    private Element head;

    public void push(int value){
        Element last = head;
        head= new Element(value);
        head.setNext(last);

    }public int pop(){
        if (head==null){
            System.out.println("no element");
        }
            int value= head.getValue();
        head=head.getNext();
            return value;
    }public int peek(){
        if(head==null){
            System.out.println("no element");
        }return head.getValue();
    }
}
