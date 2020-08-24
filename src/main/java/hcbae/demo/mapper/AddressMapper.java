package hcbae.demo.mapper;

import java.util.List;

import hcbae.demo.domain.Address;
import hcbae.demo.vo.AddressVo;

public interface AddressMapper {
	List<Address> selectAll();
	long selectTotalCount();
	List<Address> selectPerPage(AddressVo addressVo);
}
