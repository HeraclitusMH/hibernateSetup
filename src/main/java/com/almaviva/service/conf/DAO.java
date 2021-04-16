package com.almaviva.service.conf;

import com.almaviva.service.persistence.model.PersonMod;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonMod> findAll() {
        return entityManager
                .createQuery("from " + PersonMod.class.getName()).getResultList();
    }
}
