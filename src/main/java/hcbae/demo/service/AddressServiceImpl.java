package hcbae.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import hcbae.demo.domain.Address;
import hcbae.demo.mapper.AddressMapper;
import hcbae.demo.vo.AddressVo;

@Service
public class AddressServiceImpl implements AddressService {

	@Inject
	private AddressMapper addressMapper;
	
	@Override
	public List<Address> readAll() {
		return addressMapper.selectAll();
	}
	
	@Override
	public long getTotalCount() {
		return addressMapper.selectTotalCount();
	}

	@Override
	public List<Address> readPerPage(AddressVo addressVo) {
		return addressMapper.selectPerPage(addressVo);
	}

}
