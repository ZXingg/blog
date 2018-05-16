package com.zxing.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxing.blog.domain.Vote;
import com.zxing.blog.repository.VoteRepository;

/**
 * Vote 服务.
 * 
 * @since 2018年4月9日
 * @author <a href="https://zxing.com">ZXing</a>
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;
	/* (non-Javadoc)
	 * @see com.zxing.blog.service.VoteService#removeVote(java.lang.Long)
	 */
	@Override
	@Transactional
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

}
