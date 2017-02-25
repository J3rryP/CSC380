public class LotInfo {

	String description;
	boolean Isoccupied;
	String location;
	boolean handicupped;
	
	public LotInfo(){
		description = "";
		Isoccupied = false;
		location = "";
		handicupped = false;
	}
	
	
	boolean taken(){
		return Isoccupied;
	}

	void update(){
	
	}

}