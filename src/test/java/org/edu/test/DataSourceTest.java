package org.edu.test;


import java.sql.Connection;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.edu.service.IF_MemberService;
import org.edu.vo.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class DataSourceTest {
   
   @Inject
   private DataSource ds;
   
   @Inject
   private IF_MemberService memberService;
   
   @Test
   public void testConnection()throws Exception{
      Connection con = ds.getConnection();
      System.out.println("데이터베이스 커넥션 성공:" + con);   
      }

   @Test
   public void testSelcetMember() throws Exception {
	   System.out.println("회원리스트 입니다.");
	   List<MemberVO> list = memberService.selectMember();
	   for(MemberVO vo:list){
		  System.out.println("사용자아이디 : " + vo.getUser_id());
		  System.out.println("사용자이메일 : " + vo.getEmail());
	   }
	   /*System.out.println(memberService.selectMember());*/
   }
}