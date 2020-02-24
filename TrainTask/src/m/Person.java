package m;

public class Person {
	String idString;
	String nameString;
	String sexString;
	
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Person(String idString, String nameString, String sexString) {
		super();
		this.idString = idString;
		this.nameString = nameString;
		this.sexString = sexString;
	}
	
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getSexString() {
		return sexString;
	}
	public void setSexString(String sexString) {
		this.sexString = sexString;
	}
	
	@Override
	public String toString() {
		return this.idString + this.nameString + this.sexString;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idString == null) ? 0 : idString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (idString == null) {
			if (other.idString != null)
				return false;
		} 
		else if (!idString.equals(other.idString))
			return false;
		
		return true;
	}
	
}
