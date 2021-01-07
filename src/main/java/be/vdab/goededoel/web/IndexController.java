package be.vdab.goededoel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.goededoel.domain.GoedeDoel;

@Controller
@RequestMapping("/")
class IndexController {

	@GetMapping
	public ModelAndView index() {
		return new ModelAndView("index").addObject(new GoedeDoel("CliniClowns"));
	}
}
