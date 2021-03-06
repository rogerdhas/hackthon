package com.zoneone.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zonenone.bo.BaseBO;
import com.zonenone.dao.PlanDAOImpl;
import com.zonenone.dao.databeans.Plan;
import com.zonenone.dto.PlanDTO;
import com.zonenone.form.BaseFormBean;
import com.zonenone.form.PlanFormBean;

public class PlanBOImpl implements BaseBO {

	@Autowired
	private PlanDAOImpl planDAOImpl;

	@Autowired
	private PlanDTO planDTO;

	public void load(BaseFormBean baseFormBean) {
		PlanFormBean planFormBean = (PlanFormBean) baseFormBean;
		this.loadPlanDatas(planFormBean);
		baseFormBean = planFormBean;
	}

	public void save(BaseFormBean baseFormBean) {
		PlanFormBean planFormBean = (PlanFormBean) baseFormBean;
		this.loadPlanDatas(planFormBean);

		Plan plan = new Plan();
		//plan = planDTO.fromPlanFormBeanToPlanDBBean(planFormBean);
		//this.planDAOImpl.save(plan);
		baseFormBean = planFormBean;
	}

	public void delete(BaseFormBean baseFormBean) {
	}

	public void validate(BaseFormBean baseFormBean) throws Exception {
		PlanFormBean planFormBean = (PlanFormBean) baseFormBean;
		this.loadPlanDatas(planFormBean);
		if (planFormBean.getPlanNme() == null || planFormBean.getPlanNme().isEmpty()) {
			throw new Exception("Plan Name is requried!");
		}
		if (planFormBean.getAmt() == null || planFormBean.getAmt().isEmpty()) {
			throw new Exception("Amount is requried!");
		}
	}

	/*
	 * method to fetch plan details
	 */
	private void loadPlanDatas(PlanFormBean planFormBean) {
		/*List<Plan> plans = planDAOImpl.getPlanListsForUser(Integer.parseInt(planFormBean.getUserId()));*/
		List<Plan> plans = new ArrayList<Plan>();
		List<PlanFormBean> planFormBeans = new ArrayList<PlanFormBean>();
		for (Plan plan : plans) {
			PlanFormBean innerBean = new PlanFormBean();
			planDTO.fromPlanDBBeanToPlanFormBean(plan, innerBean);
			planFormBeans.add(innerBean);
		}
		planFormBean.setPlanFormBeans(planFormBeans);
	}

	public PlanDAOImpl getPlanDAOImpl() {
		return planDAOImpl;
	}

	public void setPlanDAOImpl(PlanDAOImpl planDAOImpl) {
		this.planDAOImpl = planDAOImpl;
	}

	public PlanDTO getPlanDTO() {
		return planDTO;
	}

	public void setPlanDTO(PlanDTO planDTO) {
		this.planDTO = planDTO;
	}

}
