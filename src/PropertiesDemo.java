import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by 时光与你 on 2017/5/11.
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        //创建1Properties对象
        //设置属性文件的操作路径
        File file = new File("D:"+File.separator+"area.properties");
        try {
            pro.load(new FileInputStream(file));  //读取文件属性
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("BJ属性存在，内容是："+pro.getProperty("BJ"));
    }
}
