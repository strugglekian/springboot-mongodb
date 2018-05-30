/**
 * @Date 2018/5/29
 * @Author kkf7688
 */
package com.h3c.demon.service.impl;

import com.h3c.demon.dao.ThanksDao;
import com.h3c.demon.pojo.Thanks;
import com.h3c.demon.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThanksServiceImpl implements ThanksService {

   private final ThanksDao thanksDao;

    @Autowired
    public ThanksServiceImpl(ThanksDao thanksDao) {
        this.thanksDao = thanksDao;
    }

    @Override
    public List<Thanks> findAllThanks() {
    	
    	List<Thanks> thanksList = thanksDao.findAll();
    
        return thanksList;
    }
}
