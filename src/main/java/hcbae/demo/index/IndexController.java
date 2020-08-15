package hcbae.demo.index;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hcbae.demo.service.AddressService;


@Controller
public class IndexController {
	
	@Inject
	private AddressService addressService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		addressService.readAll();
		return "index";
	}
	
}
