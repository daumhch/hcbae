package hcbae.demo.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hcbae.demo.domain.Address;
import hcbae.demo.service.AddressService;
import hcbae.demo.vo.AddressVo;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class AddressController {
	
	@Inject
	private AddressService addressService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		/*List<Address> list = addressService.readAll();
		for(Address a : list) {
			log.info("###:"+a);
		}*/
		AddressVo addressVo = new AddressVo();
		long cp = 2;
		long ps = 5;
		addressVo.setCurrentPage(cp);
		addressVo.setPageSize(ps);
		List<Address> list = addressService.readPerPage(addressVo);
		addressVo.setList(list);
		addressVo.setTotalCount(addressService.getTotalCount() );
		addressVo.setTotalPageCount(addressVo.calTotalPageCount() );

		model.addAttribute("addressVo", addressVo);
		return "index";
	}
	
}
