/**
* @author kangzhenyu
* @date 2018-05-29
* @version 1.0
*/

package com.h3c.demon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.h3c.demon.pojo.Thanks;
import com.h3c.demon.service.ThanksService;

@Controller
public class ThanksController {
	
	private final ThanksService thanksService;

	@Autowired
	public ThanksController(ThanksService thanksService) {
		this.thanksService = thanksService;
	}

	@RequestMapping(value="/thanks")
	public String showThanks() {
		List<Thanks> thanksList = thanksService.findAllThanks();
		for (Thanks thanks : thanksList) {
			System.out.println(thanks.getName());
		}
		return "redirect:https://www.baidu.com";
	}
}
