package OverrideEqualsMethod;

public class Passanger {
	
	private String firstName;
	private String lastName;
	private int id;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
         return this.id+this.firstName.length()+this.lastName.length();
	}
	
	@Override
	public boolean equals(Object obj) {
         Passanger passanger = (Passanger)obj;
         if(passanger.getId()==this.id&&passanger.getFirstName().equals(this.firstName)
        		 &&passanger.getLastName().equals(this.lastName)){
        	 return true;
         }else{
        	 return false;
         }
	}

}
