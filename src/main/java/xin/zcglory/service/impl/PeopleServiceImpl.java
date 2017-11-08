package xin.zcglory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.zcglory.dao.PeopleDaoImpl;
import xin.zcglory.entity.People;
import xin.zcglory.service.PeopleService;

import java.util.List;
@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDaoImpl peopleDaoimpl;
    @Override
    public void add(People people) {
        peopleDaoimpl.add(people);
    }

    @Override
    public void delete(String id) {
        peopleDaoimpl.delete(id);
    }

    @Override
    public People findByid(String id) {
        return peopleDaoimpl.findByid(id);
    }

    @Override
    public void update(People people) {
        peopleDaoimpl.update(people);
    }

    @Override
    public List<People> findAll() {
        String sql = "from People";
        return peopleDaoimpl.find(sql);
    }


    public PeopleDaoImpl getPeopleDaoimpl() {
        return peopleDaoimpl;
    }

    public void setPeopleDaoimpl(PeopleDaoImpl peopleDaoimpl) {
        this.peopleDaoimpl = peopleDaoimpl;
    }
}
