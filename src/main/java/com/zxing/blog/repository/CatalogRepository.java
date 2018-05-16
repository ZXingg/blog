package com.zxing.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxing.blog.domain.Catalog;
import com.zxing.blog.domain.User;

/**
 * Catalog 仓库.
 *
 * @since 2018年4月10日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
	/**
	 * 根据用户查询
	 * @param user
	 * @return
	 */
	List<Catalog> findByUser(User user);
	
	/**
	 * 根据用户查询
	 * @param user
	 * @param name
	 * @return
	 */
	List<Catalog> findByUserAndName(User user, String name);
}
