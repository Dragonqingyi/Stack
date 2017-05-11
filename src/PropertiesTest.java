import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ","Beijing");
        pro.setProperty("TJ","Tianjin");
        pro.setProperty("NJ","Nanjing");  //设置内容
        System.out.println("1,BJ属性存在："+pro.getProperty("BJ"));
        System.out.println("2,SC属性不存在："+pro.getProperty("SC"));
        System.out.println("3,SC属性不存在，同时设定默认值："+pro.getProperty("SC","没有发现"));
        File file = new File("D:"+File.separator+"area.properties"); // 设置文件保存路径
        try {
            //保存属性到普通文件中去，并设置注释内容
            pro.store(new FileOutputStream(file),"Area Info"); //字符串为注释内容
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
