package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO dao;
	
	//등록.
	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
		
	}

	//조회.
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	//수정.
	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	//삭제.
	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
		
	}

	//목록 조회.
	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

	//페이지 목록조회.
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	//페이지 수 조회.
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	//검색관련 조회.
	
	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}
	

	
	
}
