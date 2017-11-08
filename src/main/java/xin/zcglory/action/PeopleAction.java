package xin.zcglory.action;

import com.opensymphony.xwork2.ActionSupport;
import xin.zcglory.entity.People;
import xin.zcglory.service.impl.PeopleServiceImpl;

import java.util.List;

public class PeopleAction extends ActionSupport {

    private PeopleServiceImpl peopleService;
    private List<People> peoples;
    private People people;
    private String id;
    //查询所有
    public String findAll() {
        peoples = peopleService.findAll();
        return this.SUCCESS;
    }
    //跳转到修改页面
    public String updateUi() {
        people = peopleService.findByid(id);
        return this.SUCCESS;
    }

    //修改
    public String update() {
        peopleService.update(people);
        return this.SUCCESS;
    }



    public PeopleServiceImpl getPeopleService() {
        return peopleService;
    }

    public void setPeopleService(PeopleServiceImpl peopleService) {
        this.peopleService = peopleService;
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
