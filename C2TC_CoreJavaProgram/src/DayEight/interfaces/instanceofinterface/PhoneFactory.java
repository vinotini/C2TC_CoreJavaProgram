package DayEight.interfaces.instanceofinterface;

public class PhoneFactory {

	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("jio"))
			return new jio();
		return null;
	}
}