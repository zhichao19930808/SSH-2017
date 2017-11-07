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
        //测试add方法
        peopleDap.add(people);

    }
}
