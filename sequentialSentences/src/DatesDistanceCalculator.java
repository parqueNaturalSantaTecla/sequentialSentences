class DatesDistanceCalculator extends Console{

	public static void main(String[] args) {
		new DatesDistanceCalculator().exec();
	}

	void exec() {
		int originDay = 12;
		int originMonth = 6;
		int originYear = 1968;
		int tarjetDay = 23;
		int tarjetMonth = 6;
		int tarjetYear = 1985;
		// TODO
		int originDays = originYear*365 + originMonth*30 + originDay;
		int tarjetDays = tarjetYear*365 + tarjetMonth*30 + tarjetDay;
		int days = tarjetDays - originDays;
		int years = days / 365;
		days -= years*365;
		int months = days/30;
		days -= months*30;
		write(years + " años, " + months + " meses y " + days + " días.");
		//
	}

}
