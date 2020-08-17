package hcbae.demo.index;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import hcbae.demo.domain.Address;
import hcbae.demo.service.AddressService;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class IndexController {
	
	@Inject
	private AddressService addressService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<Address> list = addressService.readAll();
		for(Address a : list) {
			log.info("###:"+a);
		}
		
		Gson gList = new Gson();
		String gsonList = gList.toJson(list);
		model.addAttribute("list", gsonList);
		return "index";
	}
	
}
