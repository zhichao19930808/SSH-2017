package xin.zcglory.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import xin.zcglory.entity.People;

import java.util.List;

public class PeopleDaoImpl implements PeopleDao {
    private SessionFactory sessionFactory;
    @Override
    public void add(People people) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.save(people);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(String id) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.delete(session.get(People.class,id));
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public People findByid(String id) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        People people = session.get(People.class,id);
        session.getTransaction().commit();
        session.close();
        return people;
    }

    @Override
    public void update(People people) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.merge(people);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<People> find(String sql) {

        return null;
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
