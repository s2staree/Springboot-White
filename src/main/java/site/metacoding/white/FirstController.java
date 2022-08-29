package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// Http Method -> Mapping 기술
// GET -> 주소창이나 하이퍼링크, 혹은 FORM태그로 요청
// POST -> FORM태그로만 요청
// PUT,DELETE -> 자바스크립트로 요청

// GET -> 주소창이나 하이퍼링크
// GET,POST -> FORM태그로 요청
// GET,POST,PUT,DELETE -> 자바스크립트로 요청

// 포스트맨 -> 4가지 요청을 쉽게 테스트 해볼 수 있다.

@ RestController // data를 응답하는것
public class FirstController {
	
	@ GetMapping("/first")
	public String getData() {	// 프로토콜이므로 여기다 insert해도 상관은 없다.
		return "<h1>data</h1>";
	}

	@ PostMapping("/first")
	public String postData() {
		return "<h1>insert data</h1>";
	}
	
	@ PutMapping("/first")
	public String putData() {
		return "<h1>update data</h1>";
	}
	
	@ DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data</h1>";
	}
}
