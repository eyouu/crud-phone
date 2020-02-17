package org.springbootproject.crudphone.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springbootproject.crudphone.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PhoneDAOImpl implements PhoneDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Phone> findAll() {
        Session session = entityManager.unwrap(Session.class);

        Query<Phone> query = session.createQuery("from Phone", Phone.class);

        return query.getResultList();
    }

    @Override
    public Phone findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Phone.class, id);
    }

    @Override
    public void save(Phone phone) {
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(phone);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);

        Phone phone = session.get(Phone.class, id);
        session.delete(phone);

    }
}
