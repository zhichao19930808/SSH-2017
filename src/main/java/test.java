import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xin.zcglory.dao.PeopleDaoImpl;
import xin.zcglory.entity.People;

import java.sql.Date;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        PeopleDaoImpl peopleDap = (PeopleDaoImpl) context.getBean("peopleDaoImpl");
        People people = new People("张三", '男', new Date(System.currentTimeMillis()));
        People people2 = new People("402881f05f95c2c2015f95c2c3de0000","李四", '男', new Date(System.currentTimeMillis()));
        //测试add方法
//        peopleDap.add(people);
        //测试delete方法
//        peopleDap.delete("402881f05f95af2e015f95af2ff20000");
        //测试findById方法
//        System.out.println(peopleDap.findByid("402881f05f95af2e015f95af2ff20000"));
        //测试findById方法
        peopleDap.update(people2);

    }
}
