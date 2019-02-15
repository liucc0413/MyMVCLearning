package SixTeen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, String> test (Exception e) {
        System.out.println(e.getMessage());
        Map<String,String> result = new HashMap<>();
        result.put("code", "failed");
        result.put("msg", e.getMessage());
        return result;
    }
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
    public Map<String, String> test2 (ArithmeticException e) {
        System.out.println(e.getMessage());
        Map<String,String> result = new HashMap<>();
        result.put("code", "failed2");
        result.put("msg", e.getMessage());
        return result;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "溢出")
    public String test3 (ArrayIndexOutOfBoundsException e) {
       e.printStackTrace();
       return "s";
    }

}
