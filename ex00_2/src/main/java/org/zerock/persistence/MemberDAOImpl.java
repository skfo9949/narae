package org.zerock.persistence;

import org.zerock.domain.*;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.apache.ibatis.session.*;
import org.springframework.stereotype.Repository;

@Repository //저장소!
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "org.zerock.mappers.MemberMapper";

	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace + ".insertMember", vo);
	}
}
