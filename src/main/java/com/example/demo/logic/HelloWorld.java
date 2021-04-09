package com.example.demo.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.dao.SampletblDao;
import com.example.demo.entity.Sampletbl;

@Component
public class HelloWorld {



	@Autowired
	SampletblDao dao;

	@Autowired
	nConverter conv;


	@Scheduled(cron = "0 * * * * *", zone = "Asia/Tokyo")
	public void hello() {
		String string;


		Sampletbl entity=new Sampletbl();
		entity=dao.selectid();
		System.out.println(entity.id);
		System.out.println(entity.name);

		string=conv.ConverterShinsu("173G");
		System.out.println(string.toUpperCase());
		string=conv.ConverterShinsu(55852);
		System.out.println(string.toUpperCase());
	}

}
