package SixTeen;

import Dao.FormatModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping(value = "/global")
public class GlobalController {

    @RequestMapping(value="/test", method = {RequestMethod.GET})
    public String test(HttpServletRequest request, Model model){
        if(!model.containsAttribute("contentModel")){

            //从后台代码获取国际化信息
            RequestContext requestContext = new RequestContext(request);
            model.addAttribute("money", requestContext.getMessage("money"));
            model.addAttribute("date", requestContext.getMessage("date"));


            FormatModel formatModel=new FormatModel();

            formatModel.setMoney(12345.678);
            formatModel.setDate(new Date());

            model.addAttribute("contentModel", formatModel);
        }
        return "redirect:/index8.jsp";
    }

}