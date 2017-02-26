public class LotInfo {

	String description;
	boolean isOccupied;
	String location;
	boolean handicupped;
	
	public LotInfo(){
		update("","",false,false);
	}
	
	public LotInfo(String d, String l, boolean i , boolean h){
		description = d;
		location = l;
		isOccupied = i;
		handicupped = h;
	}
	
	
	boolean taken(){
		return isOccupied;
	}

	void update(String des , String loc, boolean iso , boolean ish){
		description = des;
		location = loc;
		isOccupied = iso;
		handicupped = ish;
	}
	
	void status(){
		System.out.println("Lot info ");
		System.out.println("Location : "+ location);
		System.out.println("Description : "+ description);
		System.out.println("Occupied : "+isOccupied);
		System.out.println("Handicupped : "+handicupped);
	}

}