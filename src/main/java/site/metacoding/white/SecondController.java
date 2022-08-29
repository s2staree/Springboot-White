package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 2022-08-29
// 데이터 받기
// GET -> http body가 없다. -> QueryString, PathVariable(PK) -> Form태그 (GET) -> 브라우저 (주소 뒤에 ? 붙이기)
// POST, PUT -> http body에 담아준다. -> Form태그 (POST), JS로 가능 // header는 라벨, QueryString은 쪽지라는 개념!
// DELETE -> http body가 없다. -> QueryString, PathVariable(PK)

@ RestController
public class SecondController {

	@ GetMapping("/second/{id}")	// PK(ID)가 1인것
	public String getData(@ PathVariable Integer id) {
		return "id : " + id;
	}
	
	// QueryString은 x-www-form-urlencoded 타입이다.
	@ GetMapping("/second")
	public String getData2(String title, String content) {
		return "title : " + title +", content : " + content;
	}
	
	// BufferdeReader -> title=제목&content=내용, content-type : x-www-form-뭐시기
	@ PostMapping("/second")
	public String getData(String title, String content) {	// 스프링 파싱 기본 전략 : x-www-form-뭐시기
		return "title : " + title +", content : " + content;
	}
	
	@ PutMapping("/second")
	public String putData(String title, String content) {	// 스프링 파싱 기본 전략 : x-www-form-뭐시기
		return "title : " + title +", content : " + content;
	}
		
	@ DeleteMapping("/second/{id}")
	public String deleteData(@ PathVariable Integer id) {	// 스프링 파싱 기본 전략 : x-www-form-뭐시기
		return id + " delete ok";
	}
}
