package org.springbootproject.crudphone.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springbootproject.crudphone.entity.Characteristic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CharacteristicDAOImpl implements CharacteristicDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Characteristic> findAll() {
        Session session = entityManager.unwrap(Session.class);

        Query<Characteristic> query = session.createQuery("from Characteristic", Characteristic.class);

        return query.getResultList();
    }

    @Override
    public Characteristic findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Characteristic.class, id);
    }

    @Override
    public void save(Characteristic characteristic) {
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(characteristic);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);

        Characteristic characteristic = session.get(Characteristic.class, id);
        session.delete(characteristic);
    }
}
