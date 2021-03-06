package kr.inhatc.spring.text.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import kr.inhatc.spring.board.dto.FileDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 				// 데이블을 만드는 엔티티 객체 생성
@Table(name = "PRO_Files") 	// 테이블명 다르게 줌('users' 로)
@NoArgsConstructor 		// 디폴트 생성자
@AllArgsConstructor 	// 전체 컬럼 생성자
@Data 					// get, set
@Builder	
public class FileDto {

	@Id //기본키
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idx;
	
	private String username;
	
	private String originalFileName;
	
	private String storedFilePath;
	
	private long fileSize;
}
