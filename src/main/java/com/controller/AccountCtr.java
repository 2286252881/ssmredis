package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.JedisPoolUtil;
import com.common.RedisCache;
import com.pojo.po.Account;
import com.service.IAccountService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
public class AccountCtr {
	
	@Autowired private IAccountService accountService;
	@RequestMapping("/getAllAccount")
	public @ResponseBody List<Account> getAllAccount() throws Exception{
		JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
		Jedis jedis = null;
		List<Account> acList=null;
		try {
			jedis = jedisPool.getResource();
			if(jedis.exists("acList")){
				acList=RedisCache.getList(jedis);
			}else{
				acList=accountService.getAllAccount();
				RedisCache.setList(jedis,"acList", acList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JedisPoolUtil.release(jedisPool, jedis);
		}
		return acList;
	}
}
