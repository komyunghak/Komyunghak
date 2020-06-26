package org.edu.service;

import java.util.List;

import org.edu.vo.BoardVO;
import org.springframework.stereotype.Service;
@Service
public interface IF_BoardService {
   public void insertBoard(BoardVO boardVO) throws Exception;
   public List<BoardVO> selectBoard() throws Exception;
   public void updateBoard(BoardVO boardVO) throws Exception;
   public void deleteBoard(Integer bno) throws Exception;
}