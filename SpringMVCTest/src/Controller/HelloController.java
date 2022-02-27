package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController  implements Controller{
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res)throws Exception{
		String name=req.getParameter("Name");
		Map m=new HashMap();
		m.put("msg", "Hello....."+name);
		ModelAndView mv=new ModelAndView("Success", m);
		return mv; 
	}
}
