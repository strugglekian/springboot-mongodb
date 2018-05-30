/**
 * @Date 2018/5/29
 * @Author kkf7688
 */
package com.h3c.demon.service;

import com.h3c.demon.pojo.Thanks;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ThanksService {
    List<Thanks> findAllThanks();
}
