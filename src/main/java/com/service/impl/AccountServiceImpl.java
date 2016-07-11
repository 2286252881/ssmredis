package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.mapper.AccountMapper;
import com.pojo.po.Account;
import com.pojo.po.AccountExample;
import com.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	
	@Autowired private AccountMapper accountMapper;
	
	@Override
	public List<Account> getAllAccount() throws Exception {
		AccountExample accountExample=new AccountExample();
		AccountExample.Criteria criteria=accountExample.createCriteria();
		return accountMapper.selectByExample(accountExample);
	}

}
