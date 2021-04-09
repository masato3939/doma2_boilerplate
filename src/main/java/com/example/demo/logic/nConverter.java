package com.example.demo.logic;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Configuration
@Data
public class nConverter {
	private StringBuilder stringBuilder=new StringBuilder();
	private final String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final int n=36;
	private final int m=10;

	{
		for(String str:str.split("")) {
			stringBuilder.append(str);
		}
	}
	/*
	 * @param 10進数
	 * @return 36進数
	 */
	public String ConverterShinsu(Number num) {
		Long dec=Long.parseLong(num.toString(),m);
		return Long.toString(dec,n);
	}
	/*
	 * @param 36進数
	 * @return 10進数
	 */
	public String ConverterShinsu(String str) {
		long dec=Long.parseLong(str,n);
		return Long.toString(dec, m);
	}



}
