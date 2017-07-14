package dao;

import entities.User;
import org.springframework.stereotype.Repository;

/**
 * Created by linhtran on 14/07/17.
 */

public interface IUserDAO {
    User getUserByName(String name);
}
