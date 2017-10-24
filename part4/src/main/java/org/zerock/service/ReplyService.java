package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	//댓글 추가.
	public void addReply(ReplyVO vo)throws Exception;
	
	//해당 게시글 댓글 전체 조회.
	public List<ReplyVO> listReply(Integer bno)throws Exception;
	
	//댓글 수정.
	public void modifyReply(ReplyVO vo)throws Exception;
	
	//댓글 삭제.
	public void removeReply(Integer rno)throws Exception;
	
	public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception;
	
	public int count(Integer bno) throws Exception;
}
