/**
 * @Date 2018/5/29
 * @Author kkf7688
 */
package com.h3c.demon.pojo;

import org.springframework.data.annotation.Id;

public class Thanks {

    @Id
    private Object id;
    private String name;
    private String career;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
