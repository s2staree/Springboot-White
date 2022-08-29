package site.metacoding.white;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

// 2022-08-29
// 고급 데이터 받기 (json, x-www-form-머시기, text)

@ RestController
public class ThirdController {

//	@ GetMapping("/third/{id}")
//	public String getData(@ PathVariable Integer id) {
//		return "id : " + id;
//	}
	
	@ PostMapping("/third")
	public String postData(Third third) {
		return "id : " + third.getId() + ", title : " + third.getTitle() + ", content : " + third.getContent();
	}
	
	// UPDATE third SET title = ?, content = ? WHERE id = ?
	@ PutMapping("/third/{id}")	// put은 무조건 id 받아야 함.
	public String putData(@ PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@ PutMapping("/third/{id}/json")	// put은 무조건 id 받아야 함.
	public String putJsonData(@ PathVariable Integer id, @ RequestBody Third third) {
		return third.toString();
	}
}
