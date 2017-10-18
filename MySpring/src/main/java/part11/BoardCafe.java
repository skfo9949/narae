package part11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("board")
public class BoardCafe implements Board {
//	@Autowired
//	@Qualifier("qnaWrite")

	@Resource(name="qnaWrite")
	private Write write;
	
	
	public void boardWrite() {
		write.doWrite();
	}
}
