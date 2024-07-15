package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Builder
@RequiredArgsConstructor
@Table(name = "tbl_memo")
@Entity

public class Memo { //저장하는 데이터 설정
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용    
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String userId;
	
	@Column(length = 50, nullable = false)
	private String password;
	
	@Column(length = 300, nullable = false)
	private String addr;
	
	public Memo(Long id, String userId, String password, String addr) {
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.addr = addr;
	}
}
