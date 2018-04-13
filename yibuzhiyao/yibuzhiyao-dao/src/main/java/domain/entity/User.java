package domain.entity;

public class User implements UserService {
	
	public String Name;
	public String ID;
	public String passward;
	public int age;
	
	/* (non-Javadoc)
	 * @see domain.entity.UserService#getName()
	 */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	/* (non-Javadoc)
	 * @see domain.entity.UserService#getID()
	 */
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	/* (non-Javadoc)
	 * @see domain.entity.UserService#getPassward()
	 */
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	/* (non-Javadoc)
	 * @see domain.entity.UserService#getAge()
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
