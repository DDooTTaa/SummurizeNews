package kr.inhatc.spring.board.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartHttpServletRequest;

//import kr.inhatc.spring.board.entity.Files;
import kr.inhatc.spring.board.entity.Boards;

public interface BoardService {

	List<Boards> boardList();
	
	void saveBoards(Boards board, int hitCnt);
	
	Boards boardDetail(int boardIdx);
	
	void boardDelete(int boardIdx);

	//FileDto selectFileInfo(int idx, int boardIdx);
	
	Page<Boards> boardjpaPageList(String searchText, Pageable pageable);


}
