package com.h3c.demon.dao;

import com.h3c.demon.pojo.Thanks;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ThanksDao extends MongoRepository<Thanks,String> {

    Thanks findByName(String name);
    
}
