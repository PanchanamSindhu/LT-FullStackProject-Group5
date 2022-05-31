/**
 * 
 */
package com.lti.dao;

import java.util.List;

import com.lti.bean.Login;

/**
 * @author user209
 *
 */
public interface LoginRegDaoInterface {
	
	public List<Login> verifyLogin();
	
	public void registration();
	
	public void updatePassword(double id);

}
