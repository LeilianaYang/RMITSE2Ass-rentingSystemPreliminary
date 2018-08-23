
public abstract class RentalProperty {

	private String propertyId;
	private String streetNo;
	private String streetName;
	private String suburb;
	private int numOfBedRoom;
	private String propertyType;
	private String status;
	
	public String getPropertyId() {
		return propertyId;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getSuburb() {
		return suburb;
	}
	public int getNumOfBedRoom() {
		return numOfBedRoom;
	}
	
	public String getPropertyType() {
		return propertyType;
	}
	
	public String getStatus() {
		return status;
	}

	public abstract boolean rentProperty(String customerId, DateTime rentDate, int numOfRentDay);
	
	public abstract boolean returnProperty(DateTime returnDate);

	public abstract boolean performMaintenance();
	
	public abstract boolean completeMaintenance(DateTime completionDate);
	
	public String toString() {
		
		return null;
	}
	
	public abstract String getDetails();

}
