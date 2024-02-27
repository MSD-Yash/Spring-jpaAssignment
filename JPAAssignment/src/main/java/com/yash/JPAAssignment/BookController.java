package com.yash.JPAAssignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yash.JPAAssignment.entity.BookEntity;
import com.yash.JPAAssignment.repository.BookRepo;

import jakarta.servlet.http.HttpSession;





@Controller
public class BookController {
	
	@Autowired
	private BookRepo bookRepo;
	
	
	
	
	@GetMapping("/")
	public String display() {
		return "index.html";
	}
	
@GetMapping("book")
public String home() {
	return "bookhome.html";
}

@GetMapping("addbook")
public String adbk() {
	return "adbook.html";
}
@PostMapping("/regbook")  
public String registerBook(BookEntity obj)
{
	//System.out.println(obj.getAuthor());
	bookRepo.save(obj);
	System.out.println(obj.getLangauge());
	//System.out.println(obj.getBookid());
	
	return "Done.jsp";
}



@GetMapping("SbynameAuthor")
public String searchAuthor() {
	return "SearchByAuthor.html";
}
@PostMapping("/Author")
public ModelAndView searchAuthor(String author ,HttpSession ses)
{
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("Author.jsp");
	   List<BookEntity> autlist=bookRepo.findByAuthor(author);
	   ses.setAttribute("author", author);
	   mv.addObject("autlist", autlist);
		System.out.println("number of book retrieved : "+autlist.size());
    return mv;
}




@GetMapping("Sbygenre")
public String searchGerne() {
	return "SearchByGerne.html";
}

@PostMapping("/gern")
public ModelAndView searchGerne(String gern ,HttpSession ses)
{
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("genre.jsp");
	   List<BookEntity> list=bookRepo.findByGenre(gern);
	   ses.setAttribute("gern", gern);
	   mv.addObject("list", list);
		System.out.println("number of book retrieved : "+list.size());
    return mv;
}


@GetMapping("Sbypage")
public String page() {
	return "SearchByPage.html";
	
}
@PostMapping("/pages")
public ModelAndView searchpg(int pages ,HttpSession ses)
{
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("page.jsp");
	   List<BookEntity> listp=bookRepo.findByPagesLessThan(pages);
	   ses.setAttribute("pages", pages);
	   mv.addObject("listp", listp);
		System.out.println("number of book retrieved : "+listp.size());
    return mv;
}





@GetMapping("Sbypublication")
public String publication() {
	return "SearchByPublicationyr.html";
}
@PostMapping("/publication")
public ModelAndView publication(int publicationyear ,HttpSession ses)
{
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("bookyr.jsp");
	   List<BookEntity> ly=bookRepo.findByPublicationyear(publicationyear);
	   ses.setAttribute("year", publicationyear);
	   mv.addObject("ly", ly);
		System.out.println("number of book retrieved : "+ly.size());
    return mv;
}












@GetMapping("Sbylg")
public String langauge() {
	return "Searchlang.html";
}
@PostMapping("/lang")
public ModelAndView langaugeAndGenre(String genre,String langauge, HttpSession ses)
{
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("lagG.jsp");
	   System.out.println(genre);
	   List<BookEntity> lg=bookRepo.findByGenreAndLangauge(genre, langauge);
	   ses.setAttribute("genre",genre);
	   ses.setAttribute("langauge", langauge);
	   mv.addObject("lg", lg);
		System.out.println("number of book retrieved : "+lg.size());
    return mv;
}
}
