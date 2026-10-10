package org.example.DAO;

import org.example.model.Salle;

import javax.persistence.EntityManager;
import java.util.List;

public class SalleDao extends GenericDao<Salle>{
    public SalleDao(EntityManager em) {
        super( Salle.class, em);
    }


    public List<Salle> findByCapacityMin( int capacity) {

        return em.createQuery("select s from Salle s where s.capacite <= :capacity",Salle.class)
                .setParameter(capacity,capacity)
                .getResultList();
    }
}
