package com.zoneone.bo.impl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.zonenone.form.BaseFormBean;
import com.zonenone.form.LoginFormBean;

public class LoginBOImplTest {

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

	@Test
	public void userEmptyTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("");
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
	public void pwdEmptyTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("rajesh");
		formBean.setPassword("");
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
	public void userInvalidCredentialsTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("dummy");
		formBean.setPassword("rajesh");
		LoginBOImpl boImpl = new LoginBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = false;
		try {
			boImpl.save(baseFormBean);
			result = false;
		} catch (Exception e) {
			result = true;
		}
		Assert.assertTrue(result);
	}

	@Test
	public void pwdInValidCredTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("rajesh");
		formBean.setPassword("dummy");
		LoginBOImpl boImpl = new LoginBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = false;
		try {
			boImpl.save(baseFormBean);
			result = false;
		} catch (Exception e) {
			result = true;
		}
		Assert.assertTrue(result);
	}

	@Test
	public void validCredTest() {
		LoginFormBean formBean = new LoginFormBean();
		formBean.setUserName("rajesh");
		formBean.setPassword("rajesh");
		LoginBOImpl boImpl = new LoginBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = true;
		try {
			boImpl.save(baseFormBean);
			result = true;
		} catch (Exception e) {
			result = false;
		}
		Assert.assertTrue(result);
	}

}
