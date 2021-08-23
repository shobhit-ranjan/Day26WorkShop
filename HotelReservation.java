import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;

public class HotelReservation {

	static ArrayList<ViewHotel> listOfHotels = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System Program. ");

		ViewHotel LakeWood = new ViewHotel();
		LakeWood.HotelName("LakeWood");
		LakeWood.HotelRate(110);
		listOfHotels.add(LakeWood);

		ViewHotel RidgeWood = new ViewHotel();
		RidgeWood.HotelName("RidgeWood");
		RidgeWood.HotelRate(150);
		listOfHotels.add(RidgeWood);

		ViewHotel BridgeWood = new ViewHotel();
		BridgeWood.HotelName("BridgeWood");
		BridgeWood.HotelRate(220);
		listOfHotels.add(BridgeWood);

		ViewHotel LakeWoodforWeekEnd = new ViewHotel();
		LakeWoodforWeekEnd.HotelName("LakeWoodWeekendRate");
		LakeWoodforWeekEnd.HotelRate(90);
		listOfHotels.add(LakeWoodforWeekEnd);

		ViewHotel RidgeWoodforWeekEnd = new ViewHotel();
		RidgeWoodforWeekEnd.HotelName("LakeWoodWeekendRate");
		RidgeWoodforWeekEnd.HotelRate(150);
		listOfHotels.add(RidgeWoodforWeekEnd);

		ViewHotel BridgeWoodforWeekEnd = new ViewHotel();
		BridgeWoodforWeekEnd.HotelName("LakeWoodWeekendRate");
		BridgeWoodforWeekEnd.HotelRate(50);
		listOfHotels.add(BridgeWoodforWeekEnd);

		viewHotels();
		cheapHotelsRoom();
	}

	public static void viewHotels() {

		for (int i = 0; i < listOfHotels.size(); i++)
			System.out.print(listOfHotels.get(i));
	}

	public static void cheapHotelsRoom() {

		System.out.println("Enter the Number days to want to stay.");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();

		int rateOfLakeWood = (days * 110);
		int rateOfRidgeWood = (days * 150);
		int rateOfBridgeWood = (days * 220);

		if (rateOfLakeWood < rateOfRidgeWood || rateOfLakeWood < rateOfBridgeWood) {
			System.out.println("Best will LakeWood For you it will cost you " + rateOfLakeWood);
		} else if (rateOfRidgeWood < rateOfLakeWood || rateOfRidgeWood < rateOfBridgeWood) {
			System.out.println("Best will RightWood For you it will cost you " + rateOfRidgeWood);
		} else {
			System.out.println("Best will RightWood For you it will cost you " + rateOfBridgeWood);
		}

	}

}