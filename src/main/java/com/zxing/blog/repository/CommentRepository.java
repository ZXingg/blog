package com.zxing.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zxing.blog.domain.Comment;

/**
 * Comment 仓库.
 *
 * @since 1.0.0 2017年4月7日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
