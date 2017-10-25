package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyDAO {

	// 해당 게시글 댓글 전체 조회.
	public List<ReplyVO> list(Integer bno) throws Exception;

	// 댓글 등록.
	public void create(ReplyVO vo) throws Exception;

	// 댓글 수정.
	public void update(ReplyVO vo) throws Exception;

	// 댓글삭제.
	public void delete(Integer rno) throws Exception;

	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception;

	public int count(Integer bno) throws Exception;
	
	//게시물 번호 알아내기 위한 sql
	public int getBno(Integer rno) throws Exception;
	
	//댓글 전체 삭제.
	public void deleteAll(Integer bno)throws Exception;
}