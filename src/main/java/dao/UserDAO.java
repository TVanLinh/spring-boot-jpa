package dao;

import entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by linhtran on 14/07/17.
 */

@Repository
@Transactional
public class UserDAO implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserByName(String name) {
        String str = "select * from users where username =:name";
        Query query = entityManager.createNativeQuery(str,User.class).setParameter("name",name);
        return (User) query.getSingleResult();
    }
}
