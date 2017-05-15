package dao;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;


/**
 * Created by Sergey on 20.02.2017.
 */
public class DAO {

    private static final String UNIT_NAME = "primary";

    protected Class entityClass;

    @PersistenceContext(unitName = "simpleFactory")
    protected EntityManager em;

    /**
     * DAO constructor
     */
    DAO() {

    }

    public void closeEntityManager() {
        em.close();
    }


    public Object readEntity(int id) throws DAOException {
        try {
//            logger.info("Reading entity.");
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery query = cb.createQuery(entityClass);
            Root e = query.from(entityClass);
            query.select(e).where(cb.equal(e.get("id"), id));
            return entityClass.cast(em.createQuery(query).getSingleResult());
        } catch (Exception ex) {
            throw new DAOException("Cant't read " + entityClass.getSimpleName() + " with id " + id, ex);
        }
    }

//    public void deleteResult(int id) throws DAOException {
//        try {
//            logger.info("Deleting entity.");
//            em.getTransaction().begin();
//            CriteriaBuilder cb = em.getCriteriaBuilder();
//            CriteriaDelete delete = cb.createCriteriaDelete(entityClass);
//            Root e = delete.from(entityClass);
//            Query query = em.createQuery(delete.where(cb.equal(e.get("id"), id)));
//            query.executeUpdate();
//            em.getTransaction().commit();
//        } catch (Exception ex){
//            throw new DAOException("Can't delete " + entityClass.getSimpleName() + " with id " + id, ex);
//        }
//    }

}
