
public class RoomOccupancy {
	static int totalNumber = 0;
	private int roomNumber, peopleInRoom;
	
	
	public int getNumber() {
		return roomNumber;
	}
	public int getPeople() {
		return peopleInRoom;
	}
	public int getTotal() {
		return totalNumber;
	}
	public void setRoom(int roomNum, int peopleNum) {
		this.roomNumber = roomNum;
		this.peopleInRoom = peopleNum;
		totalNumber = totalNumber + this.peopleInRoom;
	}
	
	public void addOneToRoom() {
		this.peopleInRoom ++;
		totalNumber ++;
	}
	
	public void removeOneFromRoom() {
		if ((this.peopleInRoom > 0) && (totalNumber > 0)) {
			this.peopleInRoom --;
			totalNumber --;
		}
	}
}
