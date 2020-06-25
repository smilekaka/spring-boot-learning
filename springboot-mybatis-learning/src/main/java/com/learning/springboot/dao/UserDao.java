package com.learning.springboot.dao;

import com.learning.springboot.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userDao")
public class UserDao extends BaseDao<UserEntity, Serializable>{

    /**
     *
     */
    private static final long serialVersionUID = 9152785684346322571L;

}
