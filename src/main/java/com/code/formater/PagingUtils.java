<<<<<<< HEAD
package com.code.formater;

import java.util.ArrayList;

public class PagingUtils {
	
	private int totalRows;
	private int totalPages;
	private int pageSize;
	private int pageNo;
	
	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getOffset() {
		return pageSize * (pageNo - 1);
	}
	public StringBuffer getDynamic(String dynamic) {
		StringBuffer dQuery = new StringBuffer(dynamic);
		ArrayList<String> dParam = new ArrayList<String>();
		dQuery.append("\n LIMIT " + getPageSize() + " OFFSET " + getOffset());
		
		return dQuery;
	}

}

=======
package com.code.formater;

import java.util.ArrayList;

public class PagingUtils {
	
	private int totalRows;
	private int totalPages;
	private int pageSize;
	private int pageNo;
	
	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getOffset() {
		return pageSize * (pageNo - 1);
	}
	public StringBuffer getDynamic(String dynamic) {
		StringBuffer dQuery = new StringBuffer(dynamic);
		ArrayList<String> dParam = new ArrayList<String>();
		dQuery.append("\n LIMIT " + getPageSize() + " OFFSET " + getOffset());
		
		return dQuery;
	}

}

>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
