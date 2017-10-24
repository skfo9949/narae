package org.zerock.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
	
	@Inject
	private SqlSession session;
	private static String namespace = "org.zerock.mapper.ReplyMapper";
	
	
	//해당 게시물 댓글 전체 조회.
	@Override
	public List<ReplyVO> list(Integer bno) throws Exception {
		return session.selectList(namespace+".list",bno);
	}
	
	//댓글 추가.
	@Override
	public void create(ReplyVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}
	
	//댓글 수정.
	@Override
	public void update(ReplyVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}
	
	//댓글 삭제.
	@Override
	public void delete(Integer rno) throws Exception {
		session.delete(namespace+".delete",rno);
	}

	@Override
	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception {
		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("bno", bno);
		paramMap.put("cri", cri);
		return session.selectList(namespace+".listPage", paramMap);
	}

	@Override
	public int count(Integer bno) throws Exception {
		return session.selectOne(namespace+".count", bno);
	}
	
	

}
