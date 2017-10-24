package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Inject
	private ReplyDAO dao;

	//댓글 추가.
	@Override
	public void addReply(ReplyVO vo) throws Exception {
		dao.create(vo);
		
	}

	//해당 게시물 댓글 전체조회.
	@Override
	public List<ReplyVO> listReply(Integer bno) throws Exception {
		return dao.list(bno);
	}

	//댓글 수정.
	@Override
	public void modifyReply(ReplyVO vo) throws Exception {
		dao.update(vo);
	}

	//댓글 삭제.
	@Override
	public void removeReply(Integer rno) throws Exception {
		dao.delete(rno);
	}

	@Override
	public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception {
		return dao.listPage(bno, cri);
	}

	@Override
	public int count(Integer bno) throws Exception {
		return dao.count(bno);
	}
	
	
}
