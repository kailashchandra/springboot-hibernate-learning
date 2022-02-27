package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.Student;
import dao.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;
	
	@RequestMapping("/addStudent")
	public ModelAndView showForm(){
		return new ModelAndView("AddStudent","command",new Student());
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Student st){
		studentDao.save(st);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping("/viewStudent")
	public ModelAndView viewForm(){
		List<Student> list=studentDao.getStudents();
		return new ModelAndView("viewStudent","list",list);
	}
	
	@RequestMapping(value="/editStudent/{sid}")
	public ModelAndView editForm(@PathVariable int sid){
		Student st=studentDao.getStudent(sid);
		return new ModelAndView("editStudent", "command", st);	
	}
	
	@RequestMapping(value="/updateStudent",method=RequestMethod.POST)
	public ModelAndView edit(@ModelAttribute Student st){
		studentDao.update(st);
		return new ModelAndView("redirect:/viewStudent");
	}
	
	@RequestMapping(value="/deleteStudent/{sid}")
	public ModelAndView delete(@PathVariable int sid){
		studentDao.delete(sid);
		return new ModelAndView("redirect:/viewStudent");
	}
}
