package xin.zcglory.service.impl;

import xin.zcglory.dao.PeopleDaoImpl;
import xin.zcglory.entity.People;
import xin.zcglory.service.PeopleService;

import java.util.List;

public class PeopleServiceImpl implements PeopleService {
    private PeopleDaoImpl peopleDao;
    @Override
    public void add(People people) {
        peopleDao.add(people);
    }

    @Override
    public void delete(String id) {
        peopleDao.delete(id);
    }

    @Override
    public People findByid(String id) {
        return peopleDao.findByid(id);
    }

    @Override
    public void update(People people) {
        peopleDao.update(people);
    }

    @Override
    public List<People> findAll() {
        String sql = "from People";
        return peopleDao.find(sql);
    }


    public PeopleDaoImpl getPeopleDao() {
        return peopleDao;
    }

    public void setPeopleDao(PeopleDaoImpl peopleDao) {
        this.peopleDao = peopleDao;
    }
}
