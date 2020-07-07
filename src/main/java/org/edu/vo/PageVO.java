package org.edu.vo;

public class PageVO {
	private int startBno;
	private int perPageNum;
	private Integer page; //(선생님 주석jsp단에서 null로 값이 올떄 에러가 발생하지 않도록 Integer사용) 내 주석  이것만 인티저를 사용하는 이유로는 private 는 그 페이지안에서만 쓰는것이지만 integer는 jsp에서부터 오는거라서 사용한다. 예를들면 원래는 page가 null이지만 인트에서는 널이 사용 불가능하다(숫자x) 하지만 integer는 널이 사용가능하므로 page(null사용)
	private int totalCount;
	private int endPage;
	private int startPage;
	private boolean prev;
	private boolean next;
	//검색용 변수 2개 추가
	private String searchType;
	private String searchKeyword;
	
	
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	private void calcPage() { 
		//page변수는 현재 jsp에서 클릭한 페이지번호
		int tempEnd = (int)(Math.ceil(page/10.0)*10); 
		//ceil함수는 천장 함수로 1.1 = 2 , 2.1 = 3 (반올림이라 생각하면된다.)
		//반대되는 바닥함수로는 floor(), 반올림 함수로 round()가 있다.
		//jsp에서 클릭한 페이지번호를 기준으로 끝 페이지를 계산한다.
		this.startPage = tempEnd - 9;//시작 페이지 계산 클릭한 page번호가 10일떄 까지는 시작페이지는 1
		if(tempEnd * 10 > this.totalCount) {
			//클릭한 page번호로 계산된 게시물수가 실제게시물개수 totalCount 클때
			this.endPage = (int)Math.ceil(this.totalCount/10.0);
		}else {
			//클릭한 page번호로 계산된 게시물수가 실제게시물 개수 totalCount 작을때
			this.endPage = tempEnd;
		}
		this.prev = this.startPage != 1; //시작페이지가 1보다 크면 무조건 이전 페이지가 있다 true
		this.next = this.endPage * 10 < this.totalCount; //클릭한 page번호로 계산된 게시물수가 실제 게시물 개수보다 작다면 다음페이지가 있음. true 
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcPage(); //totalCount 전체게시물개수가 있어야 페이지계산을 할 수 있기 때문에
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public int getStartBno() {
		//DB쿼리에서 사용... 시작데이터번호 = (jsp클릭한 페이지번호-1)*페이지당 보여지는 개수
		startBno = (this. page - 1) * perPageNum;
		return startBno;
	}
	public void setStartBno(int startBno) {
		this.startBno = startBno;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}
}
