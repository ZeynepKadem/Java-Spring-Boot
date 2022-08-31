package com.TemizlikSirketi.proje.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TemizlikSirketi.proje.model.PlanModel;
import com.TemizlikSirketi.proje.repository.PlanRepository;
import com.TemizlikSirketi.proje.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	    @Autowired
	    private PlanRepository planRepository;

	    public PlanServiceImpl(PlanRepository planRepository) {
	        this.planRepository = planRepository;
	    }


	    @Override
	    public List<PlanModel> getAllPlan() {
	        return planRepository.findAll();
	    }

	    @Override
	    public PlanModel savePlan(PlanModel planModel) {
	        return planRepository.save(planModel);
	    }

	    @Override
	    public PlanModel getPlanId(Long id) {
	        return planRepository.getById(id);
	    }

	    @Override
	    public PlanModel updatePlan(PlanModel planModel) {
	        return planRepository.save(planModel);
	    }

	    @Override
	    public void deletePlanById(Long id) {
	    	planRepository.deleteById(id);
	    }

	    @Override
	    public List<PlanModel> getAllByPlan(String name, String password) {
	        return planRepository.getFindPlan(name, password);
	    }


		@Override
		public PlanModel getPlan(Long id) {
			return null;
		
			
		}

	   

}