package com.zoneone.bo.impl;

import org.junit.Assert;
import org.junit.Test;

import com.zonenone.form.BaseFormBean;
import com.zonenone.form.LoginFormBean;

public class LoginBOImplTestIT {

	@Test
	public void userNullTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName(null);
		formBean.setPassword("rajesh");
		LoginBOImpl boImpl = new LoginBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = false;
		try {
			boImpl.validate(baseFormBean);
			result = false;
		} catch (Exception e) {
			result = true;
		}
		Assert.assertTrue(result);
	}

	@Test
	public void pwdNullTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("rajesh");
		formBean.setPassword(null);
		LoginBOImpl boImpl = new LoginBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = false;
		try {
			boImpl.validate(baseFormBean);
			result = false;
		} catch (Exception e) {
			result = true;
		}
		Assert.assertTrue(result);
	}

}
