package springboot.exception;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author DK
 * @date 2019年4月16日 下午3:20:10
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("exception", e);
		map.put("url", req.getRequestURL());
        return map.toString();
    }
}
