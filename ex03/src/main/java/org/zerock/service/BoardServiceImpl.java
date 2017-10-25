package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;
import org.zerock.persistence.ReplyDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boardDAO;
	
	@Inject
	private ReplyDAO replyDAO;
	//등록.
	@Override
	public void regist(BoardVO board) throws Exception {
		boardDAO.create(board);
		
	}

	//조회.
	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public BoardVO read(Integer bno) throws Exception {
		boardDAO.updateViewCnt(bno);
		return boardDAO.read(bno);
	}

	//수정.
	@Override
	public void modify(BoardVO board) throws Exception {
		boardDAO.update(board);
	}

	//삭제.
	@Transactional
	@Override
	public void remove(Integer bno) throws Exception {
		replyDAO.deleteAll(bno);
		boardDAO.delete(bno);
		
	}

	//목록 조회.
	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}

	//페이지 목록조회.
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return boardDAO.listCriteria(cri);
	}

	//페이지 수 조회.
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return boardDAO.countPaging(cri);
	}

	//검색관련 조회.
	
	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return boardDAO.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return boardDAO.listSearchCount(cri);
	}
	
	
	
	
}
