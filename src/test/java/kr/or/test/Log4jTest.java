package kr.or.test;

import org.apache.log4j.Logger;
//* logger 레벨 : debug < info < warn < error < fatal    위험순위 
public class Log4jTest {
		private Logger log = Logger.getLogger(Log4jTest.class);
		public void test() {
			MemberVO memberVO = new MemberVO();
			memberVO.setName("홍길동");
			memberVO.setAge(24);
			
			log.debug("디버그!!" + memberVO);
			log.info("인포!!");
			log.warn("워닝!!");
			log.error("에러!!");
			log.fatal("파탈에러!!");
		}

	public static void main(String[] args) {
		new Log4jTest().test();
		

	}

}
