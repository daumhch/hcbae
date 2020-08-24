package hcbae.demo.vo;

import java.util.List;

import hcbae.demo.domain.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressVo {
    private long currentPage;
	private long pageSize;
	private List<Address> list;
	private long totalCount;
	private long totalPageCount;
	
	public AddressVo(long currentPage, long pageSize, List<Address> list, 
			long totalCount, long totalPageCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.list = list;
		this.totalCount = totalCount;
		this.totalPageCount = totalPageCount;
	}
	
	public long calTotalPageCount() {
		long tpc = this.totalCount/this.pageSize; 
		if(this.totalCount%this.pageSize != 0) tpc++;
		return tpc;
	}
}
