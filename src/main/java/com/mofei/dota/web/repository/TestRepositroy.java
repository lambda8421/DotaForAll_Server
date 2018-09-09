package com.mofei.dota.web.repository;

import com.mofei.dota.web.entity.test.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepositroy {
    private static final Logger logger = LoggerFactory.getLogger(TestRepositroy.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }


    public void addPerson(Book p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Person saved successfully, Person Details="+p);
    }


    public void updatePerson(Book p) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Person updated successfully, Person Details="+p);
    }

    @SuppressWarnings("unchecked")
    public List<Book> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> personsList = session.createQuery("from Book").list();
        for(Book p : personsList){
            logger.info("Person List::"+p);
        }
        return personsList;
    }
}
