package com.service;

import java.util.List;

import com.pojo.po.Account;

public interface IAccountService {
	List<Account> getAllAccount()throws Exception;
}
