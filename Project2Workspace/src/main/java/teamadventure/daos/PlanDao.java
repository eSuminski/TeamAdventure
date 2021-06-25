package teamadventure.daos;

import teamadventure.entities.Plan;

import java.util.List;

public interface PlanDao {

    // create (used for testing purposes, also part of stretch goals)
    public Plan createPlan(Plan plan);

    // read
    public Plan getPlanByID(int planID);

    public List<Plan> getAllPlans();

    // these methods are for stretch goals
//    // update
//    Plan updatePlan(Plan plan);
//
//    // delete
//    boolean deletePlanByID(int planID);

}
