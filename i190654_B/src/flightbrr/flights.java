package flightbrr;

class flight {
	String flight_no;
	boolean ft_status;
	String origin;
	String destination;
	int passengerNum;
	int flight_fare;
	boolean direct;
	int day,month,year;

	flight() {
		flight_no = "";
		ft_status = false;
		origin = "";
		destination = "";
		passengerNum = 0;
		flight_fare = 0;
		direct = false;
	}

	public flight(String flight_no, boolean ft_status, String origin, String destination, int passengerNum,
			int flight_fare, boolean direct) {
		this.flight_no = flight_no;
		this.ft_status = ft_status;
		this.origin = origin;
		this.destination = destination;
		this.passengerNum = passengerNum;
		this.flight_fare = flight_fare;
		this.direct = direct;
	}
	public String getFlight_no() {
		return flight_no;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

	public boolean isFt_status() {
		return ft_status;
	}

	public void setFt_status(boolean ft_status) {
		this.ft_status = ft_status;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}

	public int getFlight_fare() {
		return flight_fare;
	}

	public void setFlight_fare(int flight_fare) {
		this.flight_fare = flight_fare;
	}

	public boolean isDirect() {
		return direct;
	}

	public void setDirect(boolean direct) {
		this.direct = direct;
	}
	public void displayFlight()
	{
		System.out.print(this.flight_no);
		if(ft_status==false)
		{
			System.out.print(" to depart from ");
		}
		else if(ft_status==true)
		{
			System.out.print(" has departed from ");
		}
		System.out.print(origin + " to ");
		System.out.print(destination + " on ");
		System.out.println(day+"/"+month+"/"+year);
		
	}

}

public class flights {
	
	flight Flights[];
	int total_flights;
	
	flights()
	{
		total_flights=0;
	}
	public flights(int total_flights) {
		this.total_flights = total_flights;
		Flights = new flight[total_flights];
		for(int i=0;i<total_flights;i++)
		{
			Flights[i]=new flight();
		}
	}
	public int getTotal_flights() {
		return total_flights;
	}
	public void setTotal_flights(int total_flights) {
		this.total_flights = total_flights;
		Flights = new flight[total_flights];
		for(int i=0;i<total_flights;i++)
		{
			Flights[i]=new flight();
		}
	}
	
	public void fillflights(int flight_num,String flight_no, boolean ft_status, String origin, String destination, int passengerNum,
			int flight_fare, boolean direct)
	{
		Flights[flight_num].setFlight_no(flight_no);
		Flights[flight_num].setFt_status(ft_status);
		Flights[flight_num].setOrigin(origin);
		Flights[flight_num].setDestination(destination);
		Flights[flight_num].setPassengerNum(passengerNum);
		Flights[flight_num].setFlight_fare(flight_fare);
		Flights[flight_num].setDirect(direct);
	
	}

}
