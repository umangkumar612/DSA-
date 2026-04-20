import java.util.Stack;
class HelloWorld {
    public static void main(String[] args) {
        Stack< Integer > st = new Stack<>();
        st.push(3);
        st.push(9);
        st.push(10);
        st.push(11);
        System.out.println(st.peek());
        System.out.println(st + " ");
        st.pop();
        System.out.println(st + " ");
        System.out.println("size is " + st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.Full());
    }
}