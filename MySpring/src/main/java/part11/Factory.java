package part11;

public class Factory {
	public static Write getWriteInstance() {
		return new QnABoardWrite();
	}
	public static Board getBoardInstance() {
		return new BoardCafe();
	}
}
