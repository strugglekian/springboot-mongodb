package com.h3c.demon;

import com.h3c.demon.dao.ThanksDao;
import com.h3c.demon.pojo.Thanks;
import com.h3c.demon.service.ThanksService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ThanksService thanksService;

    @Autowired
    private ThanksDao thanksDao;

    @Test
    public void thanksServiceTest() {
        Thanks thanks =  thanksDao.findByName("张岳");
        System.out.println(thanks.getName()+"=================");
        List<Thanks> thanksList = thanksService.findAllThanks();
        for (Thanks thank : thanksList) {
            System.out.println(thank.getName());
        }
    }

}
