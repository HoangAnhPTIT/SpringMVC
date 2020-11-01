package com.hoanganh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hoanganh.service.IHomeService;

@Service
public class HomeService implements IHomeService{

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("Blog");
		menus.add("Liên hệ");
		menus.add("Thanh Toán");
		return menus;
	}

}
