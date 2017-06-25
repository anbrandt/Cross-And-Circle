package CrossCircleMVC;

/**
 * Created by andrzej on 23.06.17.
 */
public class Field {

	private String status;
	private int player;

	public Field(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
}
