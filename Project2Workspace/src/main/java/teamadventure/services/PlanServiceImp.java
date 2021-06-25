package teamadventure.services;


import teamadventure.daos.PlanDao;
import teamadventure.entities.Plan;

import java.util.List;

public class PlanServiceImp implements PlanService{

    private PlanDao planDao;

    public PlanServiceImp(PlanDao planDao) {
        this.planDao = planDao;
    }

    @Override
    public Plan getPlanByID(int planID) {
        return planDao.getPlanByID(planID);
    }


    @Override
    public List<Plan> getAllPlans() {
        return planDao.getAllPlans();
    }
}
