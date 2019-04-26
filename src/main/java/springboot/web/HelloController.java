package springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DK
 * @date 2019年4月16日 上午9:02:22
 */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hellp() throws Exception {
		if(true){
            throw new Exception("some exception");
        }
		return "Hello Spring !!";
	}
}
