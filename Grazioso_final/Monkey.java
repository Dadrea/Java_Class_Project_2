
public class Monkey extends RescueAnimal{
	private String species;
	private String height;
	private String tailLength;
	private String bodyLength;
	
	//Creates the constructor for the monkey class
	public Monkey(String name, String species, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, 
			String height, String tailLength, String bodyLength) {
		        setName(name);
		        setSpecies(species);
		        setGender(gender);
		        setAge(age);
		        setHeight(height);
		        setTailLength(tailLength);
		        setBodyLength(bodyLength);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);
		    }
	
	// sets the new monkeys species
	public void setSpecies(String newSpecies) {

		species = newSpecies;   
	}
	// returns the value of species
	public String getSpecies() {

		return species;   
	}
	
	// sets the new monkeys height
	public void setHeight(String newHeight) {

		height = newHeight;   
	}
	// returns the value of height
	public String getHeight() {

		return height;   
	}
	
	// sets the new monkeys tailLength
	public void setTailLength(String newTailLength) {

		tailLength = newTailLength;   
	}
	// returns the value of tailLength
	public String getTailLength() {

		return tailLength;   
	}
	
	// sets the new monkeys bodyLength
	public void setBodyLength(String newBodyLength) {

		bodyLength = newBodyLength;   
	}
	// returns the value of bodyLength
	public String getBodyLength() {

		return bodyLength;   
	}
	public String toString() {
		return "Name: " + getName() + ", Species: " + getSpecies() + ", Gender: " + getGender() + ", Age: " + getAge() + ", Weight: " + getWeight() + 
				", Date Acquired: " + getAcquisitionDate() + ",\n Country Acquired: " + getAcquisitionLocation() + ", Training Status: " + getTrainingStatus() 
				+ ", Reserved: " + getReserved() + ", Service Country: " + getInServiceLocation() + ",\n Height: " + 
				getHeight() + ", Tail Length: " + getTailLength() + ", Body Length " +  getBodyLength() + ".";
	}
	

}
