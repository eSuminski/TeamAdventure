package suminski.plandaotests;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import teamadventure.daos.PlanDao;
import teamadventure.entities.Plan;
import teamadventure.services.PlanService;
import teamadventure.services.PlanServiceImp;

import java.util.ArrayList;
import java.util.List;

public class PlanServiceTests {
    // create new project to add these files to

    static PlanDao planDao = Mockito.mock(PlanDao.class);
    static PlanService planService = new PlanServiceImp(planDao);

    @BeforeMethod
    void init(){
        Plan plan1 = new Plan(1, "first", "plan", 1000, 100);
        Plan plan2 = new Plan(2, "second", "plan", 2000, 200);
        Plan plan3 = new Plan(3, "third", "plan", 3000, 300);
        List<Plan> plans = new ArrayList<>();
        plans.add(plan1);
        plans.add(plan2);
        plans.add(plan3);
        Mockito.when(planService.getPlanByID(2)).thenReturn(plan2);
        Mockito.when(planService.getAllPlans()).thenReturn(plans);
    }

    @Test
    void getPlanByID(){
        Plan result = planService.getPlanByID(2);
        Assert.assertEquals(result.getPlanID(),2);
    }

    @Test
    void getAllPlans(){
        List<Plan> plans = planService.getAllPlans();
        Assert.assertEquals(plans.size(),3);
    }



}
