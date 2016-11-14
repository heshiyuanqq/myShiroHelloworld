package com.shiro.utils;

import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.MapCache;
import org.apache.shiro.util.SoftHashMap;

public class MyShiroCacheManager extends AbstractCacheManager {

	@Override
	protected Cache createCache(String name) throws CacheException {
		SoftHashMap<Object, Object> softHashMap = new SoftHashMap<Object, Object>();
		System.out.println("******MyShiroCacheManager.createCache:key="+name+",value="+softHashMap+"*************");
		 return new MapCache<Object, Object>(name,softHashMap );
	}

}
