package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;

public interface BoardDAO {
	
	//CRUD관련.
	public void create(BoardVO vo)throws Exception;
	public BoardVO read(Integer bno)throws Exception;
	public void update(BoardVO vo)throws Exception;
	public void delete(Integer bno)throws Exception;
	public List<BoardVO> listAll()throws Exception;
	
	//paging 관련.
	public List<BoardVO> listPage(int page)throws Exception;
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	public int countPaging(Criteria cri)throws Exception; 
	
	//검색 관련.
	public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;
	public int listSearchCount(SearchCriteria cri)throws Exception;
}
