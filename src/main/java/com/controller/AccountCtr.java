package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.po.Account;
import com.service.IAccountService;

@Controller
public class AccountCtr {
	
	@Autowired private IAccountService accountService;
	@RequestMapping("/getAllAccount")
	public @ResponseBody List<Account> getAllAccount() throws Exception{
		List<Account> acList=accountService.getAllAccount();
		return acList;
	}
}
