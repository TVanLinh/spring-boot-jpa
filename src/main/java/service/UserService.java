package service;

import dao.UserDAO;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by linhtran on 14/07/17.
 */

@Transactional
@Repository
public class UserService implements IUserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }
}
