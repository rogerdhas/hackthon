package com.zoneone.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zonenone.bo.BaseBO;
import com.zonenone.dao.UserDAOImpl;
import com.zonenone.dao.databeans.User;
import com.zonenone.form.BaseFormBean;
import com.zonenone.form.LoginFormBean;

public class LoginBOImpl implements BaseBO {

	@Autowired
	private UserDAOImpl userDAOImpl;

	public void load(BaseFormBean baseFormBean) {
		// TODO Auto-generated method stub

	}

	public void save(BaseFormBean baseFormBean) throws Exception {

		LoginFormBean loginFormBean = (LoginFormBean) baseFormBean;

		try {
			/*
			 * User user = userDAOImpl.getUser(loginFormBean.getUserName(),
			 * loginFormBean.getPassword());
			 */
			LoginFormBean confirmBean = null;
			List<LoginFormBean> list = this.getUserDetails();
			for (LoginFormBean bean : list) {
				if (loginFormBean.getUserName().equalsIgnoreCase(bean.getUserName())
						&& (loginFormBean.getPassword().equalsIgnoreCase(bean.getPassword())))
					confirmBean = bean;
			}
			if (confirmBean != null) {
				loginFormBean.setUserId(confirmBean.getUserId());
				loginFormBean.setMailId(confirmBean.getMailId());
			} else {
				throw new Exception("Invalid Credentials!");
			}
		} catch (Exception ex) {
			throw new Exception("Invalid Credentials!");
		}
	}

	public void delete(BaseFormBean baseFormBean) {
		// TODO Auto-generated method stub

	}

	public void validate(BaseFormBean baseFormBean) throws Exception {
		LoginFormBean loginFormBean = (LoginFormBean) baseFormBean;
		if (loginFormBean.getUserName() == null || loginFormBean.getUserName().isEmpty()) {
			throw new Exception("Username is required!");
		}
		if (loginFormBean.getPassword() == null || loginFormBean.getPassword().isEmpty()) {
			throw new Exception("Password is required!");
		}
	}

	public UserDAOImpl getUserDAOImpl() {
		return userDAOImpl;
	}

	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}

	private List<LoginFormBean> getUserDetails() {
		List<LoginFormBean> userList = new ArrayList<LoginFormBean>();
		LoginFormBean loginFormBean = new LoginFormBean();
		loginFormBean.setUserId("1");
		loginFormBean.setUserName("senthil");
		loginFormBean.setPassword("senthil");
		loginFormBean.setMailId("senthil.retnasamy@verion.com");
		userList.add(loginFormBean);
		loginFormBean = new LoginFormBean();
		loginFormBean.setUserId("2");
		loginFormBean.setUserName("roger");
		loginFormBean.setPassword("roger");
		loginFormBean.setMailId("roger@verion.com");
		userList.add(loginFormBean);
		loginFormBean = new LoginFormBean();
		loginFormBean.setUserId("3");
		loginFormBean.setUserName("rajesh");
		loginFormBean.setPassword("rajesh");
		loginFormBean.setMailId("rajesh@verion.com");
		userList.add(loginFormBean);
		return userList;
	}

}
