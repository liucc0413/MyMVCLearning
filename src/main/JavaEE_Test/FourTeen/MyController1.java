package FourTeen;


import Thirteen.RoleService;
import Dao.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MyController1 {
    @Autowired
    RoleService roleService = null;
    @RequestMapping(path = "/ceshi",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8","text/plain","application/*"})

    public void ceshi() {
       int n = 10;
        System.out.println("Hello Word");

    }

    @RequestMapping(value = "c2")
    public void getParams(@RequestParam(name = "id",required = false,defaultValue = "8") int id) {
        System.out.println(id);
        System.out.println("hell0");
    }

    @RequestMapping(value = "c3",headers={"a=1"})
    public void getParams3(@RequestParam(name = "id",required = false) String id) {
        System.out.println(id);
        System.out.println("hell0");
    }

    @RequestMapping(value = "role")
    public ModelAndView getRole(@RequestParam(name = "id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        Role role = roleService.getRoleById(id);
        /*modelAndView.setViewName("roleDetail");*/
        modelAndView.addObject("role",role);
        modelAndView.setView(new MappingJackson2JsonView());
        return modelAndView;

    }

    @RequestMapping(value = "c4")
    public void getParams4(@RequestParam(name = "role",required = false) Role role) {

        if (role == null) {
            System.out.println("null");
        }
        System.out.println("hell0");
    }
    @RequestMapping("c5")
    public void method5(@RequestParam("id") int id,@RequestParam("name") String name) { ;

        System.out.println("dfasf");

    }
    @RequestMapping("c6")
    public void method6(ModelAndView mv,HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println("id:"+session.getAttribute("id"));
        System.out.println("name:"+session.getAttribute("name"));
        System.out.println("dfasf");

    }


}
