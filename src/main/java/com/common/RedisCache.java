package com.common;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisCache {

	/**
	 * 设置 list
	 * 
	 * @param <T>
	 * @param key
	 * @param value
	 */
	public static <T> void setList(Jedis jedis, String key, List<T> list) {
		jedis.set(key.getBytes(), ObjectTranscoder.serialize(list));
	}
	/**
	 * 获取list
	 * 
	 * @param <T>
	 * @param key
	 * @return list
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> getList(Jedis jedis) {
		byte[] in = jedis.get("acList".getBytes());
		List<T> list = (List<T>) ObjectTranscoder.deserialize(in);
		return list;
	}
}