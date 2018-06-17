package Controller;

import model.Applicant;
import model.CompanyA;
import model.HiringProcess;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String welcome(Model model) {
        Applicant jerry = new Applicant("jerry",10);
        HiringProcess result = new CompanyA(); // 채용프로세스 타입을 보장받는다.
        // (지금은 CompanyA를 넣었지만, 지원서에 적힌 Company명을 가지고 분류하는 기능으로 자동화가 가능하다. 이기능을 구현시에는 이부분의 코딩은 완료가 된다.)
        model.addAttribute("result", result.getResult(jerry));
        return "welcome";
    }
}
