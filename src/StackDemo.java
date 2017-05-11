import java.util.Stack;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class StackDemo {
    public static void main(String[]args){
        //Stack为Vector的子类
        //peek方法查看栈顶，不删除
        //pop出栈，同时删除
        //push入栈
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");   //入栈
        System.out.println(s.pop()+",");
        System.out.println(s.pop()+",");
        System.out.println(s.pop()+",");  //出栈
        //System.out.println(s.pop());  //错误，出栈，出现异常，栈已空
    }
}
