
public class ViewHotel {
	int ratePerDAy;
	String hotelName;
	int rateforWeekEnd;
	

	public void HotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void HotelRate(int ratePerDay) {
		this.ratePerDAy = ratePerDay;
	}
	public void rateforWeekEnd(int rateforWeekEnd) {
		this.ratePerDAy = rateforWeekEnd;
	}
	

	public String toString() {
		return "Hotel's  are " + " Name is " + hotelName + " And rate per day is " + ratePerDAy + "\n";

	}

}