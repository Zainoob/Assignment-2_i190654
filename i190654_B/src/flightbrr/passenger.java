package flightbrr;

public class passenger {

	String name;
	String adress;
	int age;
	String gender;
	int passport_no;
	int cardnumber;
	int pin;

	passenger() {
		this.name = "";
		this.adress = "";
		this.age = 0;
		this.gender = "";
		this.passport_no = 0;
		this.cardnumber = 0;
		this.pin = 0;
	}

	public passenger(String name, String adress, int age, String gender, int passport_no, int cardnumber, int pin) {
		this.name = name;
		this.adress = adress;
		this.age = age;
		this.gender = gender;
		this.passport_no = passport_no;
		this.cardnumber = cardnumber;
		this.pin = pin;
	}

	public void setpassengerdetails(String name, String adress, int age, String gender, int passport_no, int cardnumber,
			int pin) {
		this.name = name;
		this.adress = adress;
		this.age = age;
		this.gender = gender;
		this.passport_no = passport_no;
		this.cardnumber = cardnumber;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(int passport_no) {
		this.passport_no = passport_no;
	}

	public int getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
