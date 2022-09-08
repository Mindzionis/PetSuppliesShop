package lt.codeacademy.learn.project.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {

	private static final long serialVersionUID = -2054386655979281969L;

	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";

	@Id
	@Column(name = "User_Name", length = 20, nullable = false)
	private String userName;

	@Column(name = "Encrypted_Password", length = 128, nullable = false)
	private String encryptedPassword;

	@Column(name = "Active", length = 1, nullable = false)
	private boolean active;

	@Column(name = "User_Role", length = 20, nullable = false)
	private String userRole;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encrytedPassword) {
		this.encryptedPassword = encrytedPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", encryptedPassword=" + encryptedPassword + ", active=" + active
				+ ", userRole=" + userRole + "]";
	}

}
