package com.zxing.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxing.blog.domain.Vote;

/**
 * Vote 仓库.
 *
 * @since 2018年4月9日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
