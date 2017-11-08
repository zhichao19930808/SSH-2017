package xin.zcglory.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xin.zcglory.entity.People;
import xin.zcglory.service.impl.PeopleServiceImpl;

import java.util.List;
@Controller
public class PeopleAction extends ActionSupport {
    @Autowired
    private PeopleServiceImpl peopleServiceImpl;

    private List<People> peoples;
    private People people;
    private String id;
    //查询所有
    public String findAll() {
        peoples = peopleServiceImpl.findAll();
        return this.SUCCESS;
    }
    //跳转到修改页面
    public String updateUi() {
        people = peopleServiceImpl.findByid(id);
        return this.SUCCESS;
    }

    //修改
    public String update() {
        peopleServiceImpl.update(people);
        return this.SUCCESS;
    }


    public PeopleServiceImpl getPeopleServiceImpl() {
        return peopleServiceImpl;
    }

    public void setPeopleServiceImpl(PeopleServiceImpl peopleServiceImpl) {
        this.peopleServiceImpl = peopleServiceImpl;
    }

    public List<People> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<People> peoples) {
        this.peoples = peoples;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
