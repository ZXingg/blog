package com.zxing.blog.service;

import com.zxing.blog.domain.Vote;

/**
 * Vote 服务接口.
 * 
 * @since 2018年4月9日
 * @author <a href="https://zxing.com">ZXing</a>
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Vote getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
