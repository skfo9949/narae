package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime()throws Exception{
		System.out.println(dao.getTime());
	}
	
//	@Test
//	public void testInsertMember() throws Exception{
//		MemberVO vo = new MemberVO();
//		vo.setUserid("user01");
//		vo.setUserpw("user01");
//		vo.setUsername("USER01");
//		vo.setEmail("user01@aaa.com");
//		
//		dao.insertMember(vo);
//	}

	
	@Test
	public void testSelectMember()throws Exception{
		String userid="user01";
		
		System.out.println("select by userid ");
		System.out.println(dao.readMember(userid));
		
		
	}
	
	@Test
	public void testSelectMemberWithPW()throws Exception{
		String userid="user00";
		String userpw="user00";
		
		System.out.println("select by userid and userpw" );
		System.out.println(dao.readWithPW(userid, userpw));
	}
}
