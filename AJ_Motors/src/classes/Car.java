package classes;

public class Car {
	private int carCode;
	private String make;
	private String model;
	private int numberofSeats;
	private int engineSize;
	private boolean petrol;

	public int getCarCode() {
		return carCode;
	}

	public void setCarCode(int newCarCode) throws Exception {
		if (newCarCode < 100 || newCarCode > 999) {
			Exception ex = new Exception("Car code out of range");
			// CarCode = 999;
			throw ex;

		} else {
			carCode = newCarCode;
		}
	}

	public String getMake() {
		return make;
	}

	public void setMake(String newMake) {
		make = newMake;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int newNumberOfSeats) {
		numberofSeats = newNumberOfSeats;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int newEngineSize) {
		engineSize = newEngineSize;
	}

	public boolean isPetrol() {
		return petrol;
	}

	public void setPetrol(boolean newPetrol) {
		petrol = newPetrol;
	}

	public void setPetrol(String newPetrol) {
		if (newPetrol.toLowerCase().startsWith("y")) {
			petrol = true;
		} else {
			petrol = false;
		}
	}

	public String getPetrol() {
		if (petrol) {
			return "Petrol";
		} else {
			return "Diesel";
		}
	}

	public void display() {
		System.out.println("Car Details");
		System.out.println("*************");
		System.out.println("Car Code        " + getCarCode());
		System.out.println("Make            " + getMake());
		System.out.println("Model           " + getModel());
		System.out.println("Number of Seats " + getNumberofSeats());
		System.out.println("Engine Size     " + getEngineSize());
		System.out.println("Fuel Type       " + getPetrol());

	}

	public Car(int newCarCode, String newMake, String newModel, int newNumberOfSeats, int newEngineSize,
			boolean newPetrol) throws Exception {
		setCarCode(newCarCode);
		setMake(newMake);
		setModel(newModel);
		setNumberofSeats(newNumberOfSeats);
		setEngineSize(newEngineSize);
		setPetrol(newPetrol);
	}

	public Car() throws Exception {
		setCarCode(999);
		setMake("dftmake");
		setModel("dftmodel");
		setNumberofSeats(3);
		setEngineSize(1800);
		setPetrol(false);
	}
}
