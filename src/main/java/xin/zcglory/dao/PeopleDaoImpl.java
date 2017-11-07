package xin.zcglory.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import xin.zcglory.entity.People;

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


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
