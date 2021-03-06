package com.mercury.mortgage.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER_TABLE")
public class Person implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2748948831285204760L;
	private int personId;
	private String username;
	private String email;
	private String password;
	private String authority;
	private boolean enabled;
    
	// Constructors
	/** default constructor */
    public Person() {}

    // Property accessors
    @Id
    @GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")
    @Column(name="ID", nullable = false)
    public int getPersonId() {
        return this.personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Column
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
		
	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Column
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
  
}
