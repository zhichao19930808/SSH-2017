package xin.zcglory.dao;

import xin.zcglory.entity.People;

import java.util.List;

public interface PeopleDao {
    void add(People people);
    void delete(String id);
    People findByid(String id);
    void update(People people);
    List<People> find(String sql);
}
