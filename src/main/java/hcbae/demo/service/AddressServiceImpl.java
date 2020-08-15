package hcbae.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import hcbae.demo.domain.Address;
import hcbae.demo.mapper.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService {

	@Inject
	private AddressMapper addressMapper;
	
	@Override
	public List<Address> readAll() {
		
		return addressMapper.selectAll();
	}

}
