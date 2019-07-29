package com.example.demo;

/*import model.plan;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/plan")
public class PlanController{
    @GetMapping
    public String show(Model model){
        List<PlanDomain> mylist= Arrays.asList(
                new PlanDomain(1,"Postpaid"),
                new PlanDomain(2,"prepaid"),
                new PlanDomain(3,"dongle")
        );
        model.addAttribute("plan",mylist );
        return "plan";
    }


}

