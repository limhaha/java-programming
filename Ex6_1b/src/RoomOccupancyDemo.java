import java.util.Scanner;

public class RoomOccupancyDemo {

	public static void main(String[] args) {
		RoomOccupancy room1 = new RoomOccupancy();
		Scanner keyboard = new Scanner(System.in);
		room1.setRoom(703, 2);
		System.out.println("Room1");
		while (true) {
		System.out.println("Enter 1.Add person  2.Remove person 3.exit");
		
		int i = keyboard.nextInt();
		if (i == 1)
			room1.addOneToRoom();
		else if (i == 2)
			room1.removeOneFromRoom();
		else
			break;
		}
		System.out.println("Room number : " + room1.getNumber() + " There were " +
		room1.getPeople() + "people in room, now there are " + RoomOccupancy.totalNumber +
		"people in room");
	
		RoomOccupancy room2 = new RoomOccupancy();
		room2.setRoom(704, 2);
		System.out.println("Room2");
		while (true) {
		System.out.println("Enter 1.Add person  2.Remove person 3.exit");
		
		int i = keyboard.nextInt();
		if (i == 1)
			room2.addOneToRoom();
		else if (i == 2)
			room2.removeOneFromRoom();
		else
			break;
		}
		System.out.println("Room number : " + room2.getNumber() + " There were " +
		room2.getPeople() + "people in room, now there are " + RoomOccupancy.totalNumber +
		"people in both rooms");
	}
}
