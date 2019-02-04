package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class FastFoodDAO {

    @PersistenceContext(unitName = "persistenceUnitName")
    private EntityManager entityManager;


}
