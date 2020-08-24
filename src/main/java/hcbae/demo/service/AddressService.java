package hcbae.demo.service;

import java.util.List;

import hcbae.demo.domain.Address;
import hcbae.demo.vo.AddressVo;

public interface AddressService {
	List<Address> readAll();
	long getTotalCount();
	List<Address> readPerPage(AddressVo addressVo);

}
