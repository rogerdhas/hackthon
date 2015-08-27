/**
 * 
 */
package com.zoneone.bo.impl;

import org.junit.Assert;
import org.junit.Test;

import com.zonenone.form.BaseFormBean;
import com.zonenone.form.PlanFormBean;

/**
 * @author Administrator
 *
 */
public class PlanBOImplTest {

	@Test
	public void planNmeNullTest() {
		PlanFormBean formBean = new PlanFormBean();
		formBean.setPlanNme(null);
		formBean.setAmt("250");
		PlanBOImpl boImpl = new PlanBOImpl();
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
	public void planNmeEmptyTest() {
		PlanFormBean formBean = new PlanFormBean();
		formBean.setPlanNme("");
		formBean.setAmt("250");
		PlanBOImpl boImpl = new PlanBOImpl();
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
	public void amtNullTest() {
		PlanFormBean formBean = new PlanFormBean();
		formBean.setPlanNme("SMS Pack");
		formBean.setAmt(null);
		PlanBOImpl boImpl = new PlanBOImpl();
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
	public void amtEmptyTest() {
		PlanFormBean formBean = new PlanFormBean();
		formBean.setPlanNme("SMS Pack");
		formBean.setAmt("");
		PlanBOImpl boImpl = new PlanBOImpl();
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
	public void validPlanTest() {
		PlanFormBean formBean = new PlanFormBean();
		formBean.setPlanNme("SMS Pack");
		formBean.setAmt("250");
		PlanBOImpl boImpl = new PlanBOImpl();
		BaseFormBean baseFormBean = formBean;
		boolean result = true;
		try {
			boImpl.save(baseFormBean);
			result = true;
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
}
