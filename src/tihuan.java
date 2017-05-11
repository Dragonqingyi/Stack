import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class tihuan {
    public static void main(String[] args) {
        List<String>all = new ArrayList<String>();//实例化List
        Collections.addAll(all,"1,MADA","2,LXH","3,mldnjava");
        //增加内容
        System.out.print("交换之前的集合:");
        Iterator<String> iter = all.iterator();
        //实例化iterator对象
        while (iter.hasNext()){   //用迭代器进行集合标准输出
            System.out.print(iter.next()+",");   //输出内容
        }
        Collections.swap(all,0,2);  //交换指导位置的内容
        System.out.print("\n交换之后的集合:");  //输出信息
        iter = all.iterator();  //实例化iterator对象
        while (iter.hasNext()){
            System.out.print(iter.next()+",");
        }
    }
}
