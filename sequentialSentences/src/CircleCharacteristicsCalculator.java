class CircleCharacteristicsCalculator extends Console {

	public static void main(String[] args) {
		new CircleCharacteristicsCalculator().exec();
	}

	void exec() {
		// TODO
		final double PI = 3.14159;
		double radio = readDouble("Dame el radio: ");
		write("El per�metro es: " + 2 * PI * radio);
		write("El �rea es: " + PI * radio * radio);
		//
	}

}
