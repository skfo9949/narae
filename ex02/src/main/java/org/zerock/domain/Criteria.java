package org.zerock.domain;

public class Criteria {
	private int page;
	private int perPageNum;
	
	public Criteria() {
		//기본값으로 페이지 번호는 1, 리스트당 데이터 수 10으로 강제 부여.
		this.page= 1; //페이지 번호 1
		this.perPageNum = 10; //리스트당 데이터 수 
	}

	public Criteria(int page, int perPageNum) {
		super();
		this.page = page;
		this.perPageNum = perPageNum;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}

	public void setPage(int page) {
		if(page <=0) {
			this.page =1;
			return;
		}
		this.page = page;
	}
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <=0 || perPageNum >100) {
			this.perPageNum =10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	public int getPage() {
		return page;
	}
	
	public int getPageStart() {
		//Mapper limit 구문에서 시작 위치를 지정할 때 사용.
		return(this.page-1)*perPageNum;
	}
	
	public int getPerPageNum() {
		//Mappe를 위한 메서드.
		return this.perPageNum;
	}

	
}
