package service;

import entities.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by linhtran on 14/07/17.
 */

public interface IUserService  {
    User getUserByName(String name);
}
