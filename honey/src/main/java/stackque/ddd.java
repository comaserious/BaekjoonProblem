package stackque;

import java.util.Stack;

public class ddd {

    public static void main(String[] args) {




        StringBuilder st = new StringBuilder();

        st.append("(())())");
        System.out.println(st.indexOf("()"));
        System.out.println(st);


        st.delete(1,3);
        System.out.println(st);
    }
}
