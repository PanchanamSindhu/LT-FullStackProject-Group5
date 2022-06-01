package com.lti.bean;

/** Represents an Admin.
 * @author group5
 
*/
public class Professor {

	private String profName;

	private String department;
	private String designation;


	/** Gets the professor department.
	 * @return A string representing the professor department
	 *     name.
	*/
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

}
