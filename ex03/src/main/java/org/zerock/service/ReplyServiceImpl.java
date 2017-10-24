package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.persistence.BoardDAO;
import org.zerock.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Inject
	private ReplyDAO replyDAO;

	@Inject
	private BoardDAO boardDAO;

	// 댓글 추가.
	@Transactional
	@Override
	public void addReply(ReplyVO vo) throws Exception {
		replyDAO.create(vo);
		boardDAO.updateReplyCnt(vo.getBno(), 1);

	}

	// 해당 게시물 댓글 전체조회.
	@Override
	public List<ReplyVO> listReply(Integer bno) throws Exception {
		return replyDAO.list(bno);
	}

	// 댓글 수정.
	@Override
	public void modifyReply(ReplyVO vo) throws Exception {
		replyDAO.update(vo);
	}

	// 댓글 삭제.
	@Transactional
	@Override
	public void removeReply(Integer rno) throws Exception {
		
		int bno = replyDAO.getBno(rno);
		replyDAO.delete(rno);
		boardDAO.updateReplyCnt(bno, -1);
	}

	@Override
	public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception {
		return replyDAO.listPage(bno, cri);
	}

	@Override
	public int count(Integer bno) throws Exception {
		return replyDAO.count(bno);
	}

}