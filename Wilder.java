public class Wilder {


	private String firstname;
	private boolean present;


	public Wilder(String firstname, boolean present) {
		this.firstname = firstname;
		this.present = present;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isPresent() {
		return this.present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public String whoAmI() {
		if (present) {
			return "My name is " + firstname + " and I am present";
		} else {
			return "My name is " + firstname + " and I am not present";
		}
		
	}


}