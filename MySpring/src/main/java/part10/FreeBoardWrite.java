package part10;

import javax.annotation.PostConstruct;

public class FreeBoardWrite implements Write {
	private String sBoardName;
//	
//	public FreeBoardWrite() {
//		init();
//	}
	
	@PostConstruct
	public void init() {
		this.setsBoardName("Free Board");
	}
	
	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	public String getsBoardName() {
		return sBoardName;
	}
	public void doWrite() {
		System.out.println(this.getsBoardName()+" Write down!");
	}
}
