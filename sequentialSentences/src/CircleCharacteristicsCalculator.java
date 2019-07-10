class CircleCharacteristicsCalculator extends Console {

	public static void main(String[] args) {
		new CircleCharacteristicsCalculator().exec();
	}

	void exec() {
		// TODO
		final double PI = 3.14159;
		double radio = readDouble("Dame el radio: ");
		write("El perímetro es: " + 2 * PI * radio);
		write("El área es: " + PI * radio * radio);
		//
	}

}
