package main.java.global;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView exception(Exception ex,WebRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errorcode",ex.getMessage());
		modelAndView.setViewName("error");
		return modelAndView;
	}
}
