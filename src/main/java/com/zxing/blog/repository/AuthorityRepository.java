package com.zxing.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxing.blog.domain.Authority;

/**
 * Authority 仓库.
 *
 * @since 1.0.0 2017年3月2日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
