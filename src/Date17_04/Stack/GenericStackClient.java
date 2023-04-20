package Date17_04.Stack;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Tow");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operation: " +stack.size());
        System.out.println("1.2 pop element from stack: " );
        while (!stack.isEmpty()){
            System.out.printf("%7s",stack.pop());
        }
        System.out.println("\n1.3 Size of stack  after pop operation: "+ stack.size());
    }
    private static void  stackOfInteger(){
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(5);
        myGenericStack.push(4);
        myGenericStack.push(3);
        myGenericStack.push(2);
        myGenericStack.push(1);
        System.out.println("1.1 Size of stack after push operation: " +myGenericStack.size());
        System.out.println("1.2 pop element from stack: " );
        while (!myGenericStack.isEmpty()){
            System.out.printf("%5s",myGenericStack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " +myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("stack pop String");
        stackOfStrings();
        System.out.println("stack pop Integer");
        stackOfInteger();
    }
}
