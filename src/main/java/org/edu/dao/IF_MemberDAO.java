package org.edu.dao;

import java.util.List;

import org.edu.vo.MemberVO;
import org.edu.vo.PageVO;

public interface IF_MemberDAO {
	public void insertMember(MemberVO MemberVO) throws Exception;
	public List<MemberVO> selectMember(PageVO pageVO) throws Exception;
	public void updateMember(MemberVO memberVO) throws Exception;
	public void deleteMember(String user_id) throws Exception;
	public MemberVO viewMember(String user_id) throws Exception;
	public int countUserId(PageVO pageVO) throws Exception;
}
//보드와 멤버가 갯수가 다른이유는 첨부파일이 많기떄문이다.