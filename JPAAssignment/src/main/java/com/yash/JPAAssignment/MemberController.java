package com.yash.JPAAssignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yash.JPAAssignment.entity.BookEntity;
import com.yash.JPAAssignment.entity.MemberEntity;
import com.yash.JPAAssignment.repository.MemberRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	@Autowired
	MemberRepo mrp;

	@GetMapping("member")
	public String display() {
		return "Memberhome.html";
	}
	@GetMapping("addmember")
	public String home()
	{
		return "admember.html";
	}
	
	@PostMapping("/regmem")
	public String reg(MemberEntity mobj)
	{
		mrp.save(mobj);
		System.out.println(mobj.getJoinyear());
		return "Done.jsp";
	}
	
	
	
	@GetMapping("membername")
	public String SearchMemberName() {
		return "SearchName.html";
	}
	@PostMapping("/name")
	public ModelAndView searchName(String name ,HttpSession ses)
	{
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("name.jsp");
		   List<MemberEntity> listmn=mrp.findByName(name);
		   ses.setAttribute("name", name);
		   mv.addObject("listmn", listmn);
			System.out.println("number of book retrieved : "+listmn.size());
	    return mv;
	}
	
	
	
	
	
	@GetMapping("memjoin")
	public String join() {
		
			return "SearchByjoin.html";
	}
	@PostMapping("/year")
	public ModelAndView searchYear(int joinyear ,HttpSession ses)
	{
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("joinyear.jsp");
		   List<MemberEntity> listmy=mrp.findByJoinyear(joinyear);
		   ses.setAttribute("joinyear", joinyear);
		   mv.addObject("listmy", listmy);
			System.out.println("number of book retrieved : "+listmy.size());
	    return mv;
	}
	
}
