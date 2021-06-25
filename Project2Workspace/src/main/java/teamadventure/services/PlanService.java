package teamadventure.services;

import teamadventure.entities.Plan;

import java.util.List;

public interface PlanService {

    Plan getPlanByID(int planID);

    List<Plan> getAllPlans();

}
