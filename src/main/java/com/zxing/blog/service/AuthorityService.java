package com.zxing.blog.service;

import com.zxing.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @since 2018年3月18日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param Authority
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
