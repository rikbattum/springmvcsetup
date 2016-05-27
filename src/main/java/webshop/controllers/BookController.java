package webshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springwebmvc.impl.Trap;
import springwebmvc.impl.TrapDao;
import springwebmvc.impl.TrapDaoImpl;

@Controller
@RequestMapping("Trap")
public class BookController {
//
//	@Autowired
//	TrapDao trapDao;
//
//	@RequestMapping(method = RequestMethod.GET)
//	public ModelAndView listBooks() {
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("trapindex");
//		Trap trap = new Trap(1L);
//		Trap trap2 = new Trap(2L);
//
//		trapDao.saveTrap(trap);
//		trapDao.saveTrap(trap2);
//		mav.addObject("trappen", trapDao.listTrappen());
//		mav.addObject("message", "hello");
//
//		return mav;
//
//	}

//	@RequestMapping(value =	"edit",	method = RequestMethod.POST)
//	public String gettrap(Trap trap) {
//	return "trap/edit.jsp";
//}
//	
//	@RequestMapping(value =	"edit",	method = RequestMethod.POST)
//			public String saveBook(Trap trap) {
//			trapDao.saveTrap(trap);
//			return "redirect:/springwebmvc/Trap";
//	}
}
