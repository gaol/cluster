package com.kylin.infinispan.demo;

import java.util.Set;

import org.infinispan.Cache;

public class CacheDelegateImpl implements CacheDelegate {
	
	private Cache<String, String> cache;
	
	public CacheDelegateImpl(Cache<String, String> cache) {
		this.cache = cache;
	}

	public Cache<String, String> getGenericCache() {
		return cache;
	}

	public void removeAll(Set<String> keys) {
		for (String key : keys)
			cache.remove(key);
	}
	
	public void remove(String key) {
		cache.remove(key);
	} 

}









