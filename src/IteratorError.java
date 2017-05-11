import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class IteratorError {
    public static void main(String[] args) {
        Collection books  = new HashSet();
        books.add("android 江湖");
        books.add("会当凌绝顶");
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println(book);
            if (book.equals("Struts2权威指南")){
                //使用Iterator迭代过程中，不可修改几何元素，下面代码发生异常
                books.remove(book);
                //输出结果并未出错·
            }
        }
    }
}
