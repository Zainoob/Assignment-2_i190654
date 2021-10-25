package flightbrr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Seat extends passenger {

	// LocalTime myObj = LocalTime.now()
	public String type;
	int fare;
	boolean book_status;
	int bookRefCode;

	Seat() {
		type = "";
		fare = 0;
		book_status = false;
		bookRefCode = 0;
	}

	public Seat(String type, int fare, boolean book_status) {
		super();
		this.type = type;
		this.fare = fare;
		this.book_status = book_status;
	}

	public int getBookRefCode() {
		return bookRefCode;
	}

	public void setBookRefCode(int bookRefCode) {
		this.bookRefCode = bookRefCode;
	}

	public int genBookingRefCode() {
		int b = (int) (Math.random() * (9999 - 1111 + 1) + 1111);
		return b;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public boolean isBook_status() {
		return book_status;
	}

	public void setBook_status(boolean book_status) {
		this.book_status = book_status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

class Airplane {
	Seat seat[];
	String PlaneName;
	String Planetype;
	String flight_assigned;
	int economyfare;
	int businessfare;
	int firstclassfare;
	int total_seats;

	Airplane() {
		PlaneName = "";
		Planetype = "";
		total_seats = 0;
		flight_assigned = "";
		firstclassfare = 0;
		businessfare = 0;
		economyfare = 0;
	}

	public Airplane(String planeName, String planetype, String flight_added, int economyfare, int businessfare,
			int firstclassfare, int total_seats) {
		seat = new Seat[total_seats];
		for (int i = 0; i < total_seats; i++) {
			seat[i] = new Seat();
		}
		PlaneName = planeName;
		Planetype = planetype;
		this.flight_assigned = flight_added;
		this.economyfare = economyfare;
		this.businessfare = businessfare;
		this.firstclassfare = firstclassfare;
		this.total_seats = total_seats;
	}

	public String getFlight_added() {
		return flight_assigned;
	}

	public void setFlight_added(String flight_added) {
		this.flight_assigned = flight_added;
	}

	public int getEconomyfare() {
		return economyfare;
	}

	public void setEconomyfare(int economyfare) {
		this.economyfare = economyfare;
	}

	public int getBusinessfare() {
		return businessfare;
	}

	public void setBusinessfare(int businessfare) {
		this.businessfare = businessfare;
	}

	public int getFirstclassfare() {
		return firstclassfare;
	}

	public void setFirstclassfare(int firstclassfare) {
		this.firstclassfare = firstclassfare;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
		seat = new Seat[total_seats];
		try {
			for (int i = 0; i < total_seats; i++) {
				seat[i] = new Seat();
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}

	}

	public void setPlaneName(String n) {
		this.PlaneName = n;
	}

	public void setPlanetype(String n) {
		this.Planetype = n;
	}

	public String getPlanetype() {
		return Planetype;
	}

	public String getPlaneName() {
		return PlaneName;
	}

	void setBstatus(int num, boolean b) {
		try {
			seat[num].setBook_status(b);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	void setfare(int num, int a) {
		try {
			seat[num].setFare(a);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	void setType(int num, String s) {

		try {
			seat[num].setType(s);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public int genbref(int num) {

		int b;
		try {
			b = seat[num].genBookingRefCode();
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return b;
	}

	boolean getBstatus(int num) {

		boolean st;
		try {
			st = seat[num].isBook_status();
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return st;
	}

	int getFare(int num) {

		int st;
		try {
			st = seat[num].getFare();
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return st;
	}

	String gettype(int num) {
		String st;
		try {
			st = seat[num].getType();
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return st;
	}

	void randomizeSeats() {
		int min = 100;
		int max = 900;
		int b = (int) (Math.random() * (max - min + 1) + min);
		this.total_seats = b;
		seat = new Seat[b];
		for (int i = 0; i < b; i++) {
			seat[i] = new Seat();
		}
	}

	void SetPlaneDetails() {
		int x = this.total_seats;
		if (this.total_seats <= 900 && this.total_seats > 700) {
			this.Planetype = "Commuter";
			this.PlaneName = "C";
			this.PlaneName += x;
		} else if (this.total_seats <= 700 && this.total_seats > 500) {
			this.Planetype = "Jumbo Jet";
			this.PlaneName = "J";
			this.PlaneName += x;
		} else if (this.total_seats <= 500 && this.total_seats > 400) {
			this.Planetype = "Airliner";
			this.PlaneName = "A";
			this.PlaneName += x;
		} else if (this.total_seats <= 400 && this.total_seats > 300) {
			this.Planetype = "Airbus";
			this.PlaneName = "E";
			this.PlaneName += x;
		} else if (this.total_seats <= 300 && this.total_seats > 200) {
			this.Planetype = "Concorde";
			this.PlaneName = "F";
			this.PlaneName += x;
		} else if (this.total_seats <= 200 && this.total_seats >= 100) {
			this.Planetype = "Light Jet";
			this.PlaneName = "L";
			this.PlaneName += x;
		}
	}

	void setfares() {
		int b = (int) (Math.random() * (30 - 10 + 1) + 10);
		int f = (int) (Math.random() * (50 - 30 + 1) + 10);
		int e = (int) (Math.random() * (10 - 3 + 1) + 3);
		b = b * 1000;
		f = f * 1000;
		e = e * 1000;
		this.businessfare = b;
		this.economyfare = e;
		this.firstclassfare = f;

	}

	int AvailableSeats() {
		int avails = 0;
		for (int i = 0; i < total_seats; i++) {
			if (seat[i].isBook_status() == false) {
				avails++;
			}
		}
		return avails;
	}

	int AvailableSeatsFirstClass() {
		int avails = 0;
		for (int i = 0; i < total_seats; i++) {
			if (seat[i].isBook_status() == false && seat[i].getType() == "firstclass") {
				avails++;
			}
		}
		return avails;
	}

	int AvailableSeatfirstclass() {
		int avails = 0;
		while (avails < total_seats) {
			if (seat[avails].isBook_status() == false && seat[avails].getType() == "firstclass") {
				break;
			}
			avails++;
		}
		return avails;
	}

	int AvailableSeatseconomy() {
		int avails = 0;
		for (int i = 0; i < total_seats; i++) {
			if (seat[i].isBook_status() == false && seat[i].getType() == "economy") {
				avails++;
				System.out.print("\n");
			}
		}
		return avails;
	}

	int AvailableSeateconomy() {
		int avails = 0;
		while (avails < total_seats) {
			if (seat[avails].isBook_status() == false && seat[avails].getType() == "economy") {
				break;
			}
			avails++;
		}
		return avails;
	}

	int AvailableSeatsBusiness() {
		int avails = 0;
		for (int i = 0; i < total_seats; i++) {
			if (seat[i].isBook_status() == false && seat[i].getType() == "business") {
				avails++;
			}
		}
		return avails;
	}

	int AvailableSeatBusiness() {
		int avails = 0;
		while (avails < total_seats) {
			if (seat[avails].isBook_status() == false && seat[avails].getType() == "business") {
				break;
			}
			avails++;
		}
		return avails;
	}

	void displayPlane() {
		System.out.print(" " + PlaneName + " 	");
		System.out.print(Planetype + "      ");
		System.out.print(total_seats + "  	  ");
		System.out.print(firstclassfare + " 	 ");
		System.out.print(businessfare + "      ");
		System.out.print(economyfare + "  ");
	}
}

public class airline extends flights {
	int total_planes;
	Airplane planes[];

	airline() {
		total_planes = 0;
	}

	void settotalplanes(int t) {
		total_planes = t;
		planes = new Airplane[t];
		for (int i = 0; i < t; i++) {
			planes[i] = new Airplane();
		}
	}

	int gettotalplanes() {
		return total_planes;
	}

	void fill(int planenum, String planeName, String planetype, int economyfare, int businessfare, int firstclassfare,
			int total_seats) {
		planes[planenum].setPlaneName(planeName);
		planes[planenum].setPlanetype(planetype);
		planes[planenum].setTotal_seats(total_seats);
		planes[planenum].setFirstclassfare(firstclassfare);
		planes[planenum].setEconomyfare(economyfare);
		planes[planenum].setBusinessfare(businessfare);
	}

	void fillall(String planeName, String planetype, int economyfare, int businessfare, int firstclassfare,
			int total_seats) {
		// to be implemented
	}

	void addflights(int x) {
		int i = 0;
		String dummy = "";
		String delimiter = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader("flights.csv"));
			while ((dummy = br.readLine()) != null) {
				String[] flightdetails = dummy.split(delimiter);
				this.Flights[i].flight_no = flightdetails[0];
				if (flightdetails[1] == "t") {
					this.Flights[i].ft_status = true;
				} else if (flightdetails[1] == "f") {
					this.Flights[i].ft_status = false;
				}
				this.Flights[i].origin = flightdetails[2];
				this.Flights[i].destination = flightdetails[3];
				this.Flights[i].flight_fare = Integer.parseInt(flightdetails[4]);
				if (flightdetails[5] == "t") {
					this.Flights[i].direct = true;
				} else if (flightdetails[5] == "f") {
					this.Flights[i].direct = false;
				}
				this.Flights[i].day = Integer.parseInt(flightdetails[6]);
				this.Flights[i].month = Integer.parseInt(flightdetails[7]);
				this.Flights[i].year = Integer.parseInt(flightdetails[8]);
				++i;
				if (i >= x) {
					break;
				}
			}
		} catch (IOException e) {
			System.out.print("\nFile could not be opened :(");
		}
	}

	public void showAirplanes() {
		System.out.print("\nShowing Plane Details\n\n");
		System.out.print("Sr.  Name	  Type	  Capacity	FirstClass	Business   Economy\n");
		for (int i = 0; i < this.gettotalplanes(); i++) {
			System.out.print((i + 1) + ". ");
			this.planes[i].displayPlane();
			System.out.print("\n");
		}
	}

	public void initAirplanes() {
		for (int i = 0; i < this.gettotalplanes(); i++) {
			this.planes[i].randomizeSeats();
			this.planes[i].SetPlaneDetails();
			this.planes[i].setfares();
		}
	}

	public void showAllFlights() {
		System.out.print("\nShowing Flight Details\n\n");

		try {
			for (int i = 0; i < this.getTotal_flights(); i++) {
				System.out.print((i + 1) + ". ");
				this.Flights[i].displayFlight();
				System.out.print("\n");
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public void linkPlanesFlights() {

		try {
			for (int i = 0; i < this.getTotal_flights(); i++) {
				this.planes[i].setFlight_added(this.Flights[i].getFlight_no());
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO Auto-generated catch block
			throw e;
		}

	}
	void CancelBooking(int bref)
	{
		boolean found=false;
		for(int i=0;i<this.getTotal_flights();i++)
		{
			for(int j=0;j<this.planes[i].getTotal_seats();j++)
			{
			if(this.planes[i].seat[j].getBookRefCode()==bref)
			{
				this.planes[i].setBstatus(j, false);
				this.planes[i].setType(j, "");
				this.planes[i].seat[j].setpassengerdetails("", "", 0, "", 0, 0, 0);
				this.planes[i].seat[j].setFare(0);
				this.planes[i].seat[j].setBookRefCode(0);
				found=true;
			}
			}
			
		}
		if(found==false)
		{
			System.out.println("\nFlight not found!");
		}
		else
		{
			System.out.println("\nYour booking has been cancelled");
		}
	}

	void Booking(int a) {
		Scanner S = new Scanner(System.in);
		int i = a;
		String name;
		String adress;
		String destination;
		String origin;
		int age, choice2;
		String gender;
		int passport_no;
		int cardnumber;
		int passengernum;
		int pin;

		System.out.println("\nChoose one of the fares for this flight are as follows: ");
		System.out.println("1. Business Class: " + this.planes[i].getBusinessfare());
		System.out.println("2. First Class: " + this.planes[i].getFirstclassfare());
		System.out.println("3. Economy Class(lowest fare): " + this.planes[i].getEconomyfare());
		System.out.println("0. Quit ");
		choice2 = S.nextInt();
		if (choice2 == 1 || choice2 == 2 || choice2 == 3) {
			for (int j = 0; j < this.planes[i].getTotal_seats(); j++) {
				if (this.planes[i].getBstatus(j) == false) {
					// this.planes[i]
					System.out.println("Enter your details below.\n Name: ");
					name = S.next();
					System.out.println("Passport no.: ");
					passport_no = S.nextInt();
					System.out.println("Age: ");
					age = S.nextInt();
					System.out.println("Gender: ");
					gender = S.next();
					System.out.println("Adress: ");
					adress = S.next();
					System.out.println("Passenger Number:");
					passengernum = S.nextInt();

					System.out.println("Enter your card details below.\n Card Number: ");
					cardnumber = S.nextInt();
					System.out.println("\nAlmost done. Enter your pin to verfiy purchase:");
					pin = S.nextInt();
					System.out.println("\nAll done!");
					System.out.println("Your flight is booked with " + this.planes[i].getPlaneName()
							+ this.planes[i].getPlanetype());

					if (choice2 == 1) {
						this.planes[i].setfare(j, this.planes[i].getBusinessfare());
						this.planes[i].setType(j, "Business");
					}
					if (choice2 == 2) {
						this.planes[i].setfare(j, this.planes[i].getFirstclassfare());
						this.planes[i].setType(j, "First Class");
					}
					if (choice2 == 3) {
						this.planes[i].setfare(j, this.planes[i].getEconomyfare());
						this.planes[i].setType(j, "Economy");
					}
					this.planes[i].setBstatus(j, true);

					System.out.println("Your booking refernce code is:");
					int bref = this.planes[i].genbref(j);
					this.planes[i].seat[j].setpassengerdetails(name, adress, age, gender, passport_no, cardnumber, pin);
					System.out.println(bref);
					System.out.println("You can use this code to alter booking");

				}
			}
		} else {
			return;
		}
	}

	void menu() {
		System.out.println("\n\t\t\tWelcome to Bumblebee Airlines");
		System.out.println("1. Search for a flight");
		System.out.println("2. Manage your booking");
		System.out.println("3. View the flight calender for booking");
		System.out.println("0. Quit");

	}

	public static void main(String[] args) {

		String name;
		String adress;
		String destination;
		String origin;
		int age;
		String gender;
		int passport_no;
		int cardnumber;
		int pin;
		int day;
		int month;
		int year;
		int passengernum;
		airline Airline = new airline();
		Airline.settotalplanes(20);
		Airline.initAirplanes();
		Airline.setTotal_flights(20);
		Airline.addflights(20);
		// Airline.showAirplanes();
		// Airline.showAllFlights();
		Airline.linkPlanesFlights();

		int choice = -1;
		int choice2 = -1;

		while (choice != 0) {
			Airline.menu();
			Scanner S = new Scanner(System.in);
			choice = S.nextInt();
			if (choice == 1) {
				System.out.print("\nEnter the day for your flight. ");
				// Scanner p=new Scanner(System.in);
				day = S.nextInt();
				System.out.print("\nEnter the month for your flight: ");
				month = S.nextInt();
				System.out.print("\nEnter the year for your flight: ");
				year = S.nextInt();

				for (int i = 0; i < Airline.getTotal_flights(); i++) {
					if (day == Airline.Flights[i].getDay() && month == Airline.Flights[i].getMonth()
							&& year == Airline.Flights[i].getYear()) {
						System.out.print("Enter your origin location(city)");
						origin = S.next();
						System.out.print("Enter your destination location(city)");
						destination = S.next();
						System.out.print("\nSearching flights...");
						if (origin == Airline.Flights[i].getOrigin()
								&& destination == Airline.Flights[i].getDestination()) {

							System.out.print("Flight found!");
						}
						System.out.print("Flight found!\n");
						Airline.Flights[i].displayFlight();
						System.out.print(
								"\nWould you like to proceed with booking?\nEnter 1 to proceed.Enter 0 to quit :");
						choice2 = S.nextInt();
						if (choice2 == 1) {
							Airline.Booking(i);
							// Airline.Flights[i].setFt_status(false);
						} else {
							choice = 0;
							break;
						}

					}
					else
					{
						System.out.print("Flight not found!\n");
					}
				}

			} else if (choice == 2) {
			
					int bref;
					System.out.println("Enter your booking reference code: ");
					bref = S.nextInt();
					Airline.CancelBooking(bref);
					
			} else if (choice == 3) {
				int c3;
				System.out.println(
						"\nChoose a flight from the flight calender displayed below");
				Airline.showAllFlights();
				c3 = S.nextInt();
				Airline.Booking(c3);

			}  else if (choice == 0) {

			} else {
				System.out.println("\nInvalid choice");
				while(choice != 1 ||choice != 2||choice != 3||choice != 0)
				{
					choice = S.nextInt();
				}
			}
		}

		System.out.print("\n");

	}
}
