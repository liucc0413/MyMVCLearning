package FourTeen;

import Dao.HttpRole;
import Dao.RoleParams;
import Dao.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/test2")
@SessionAttributes(names = {"id"},types = {String.class})
public class MyController2 {

    @RequestMapping("m1")
    public void idAndName(Integer id, String name) {
        System.out.println(id + " : " + name);
    }

    @RequestMapping("m2")
    public void method2(short b) {
        System.out.println(b);
    }

    @RequestMapping("m3")
    public void method3 (Short b) {
        System.out.println("object m3 Short:" +b);
    }

    @RequestMapping("m4")
    public void method4(Role role){
        System.out.println(role.toString());
    }

    @RequestMapping("m5")
    public void method5(double b) {
        System.out.println(b);
    }

    @RequestMapping("m6")
    public void method6 (Double b) {
        System.out.println("object m6 Double:" +b);
    }

    @RequestMapping("m7")
    public void method7(char c) {
        System.out.println(c);
    }

    @RequestMapping("m8/{id}")
    public void methodUrl (@PathVariable(value = "id") int id) {
        System.out.println(id);
    }

    @RequestMapping(value = "m9",method = RequestMethod.POST)
    public void methodJson(@RequestBody RoleParams roleParams) {
        System.out.println(roleParams.toString());
    }

    @RequestMapping("m10")
    public void method10(@RequestBody String id, @RequestBody String name) {
        System.out.println(name +" : "+id);
    }

    @RequestMapping(value = "m11",method = RequestMethod.POST, consumes="application/json" )
    public void method11 (HttpServletRequest request, HttpServletResponse response,  HttpRole role ) {
        System.out.println(role.toString());

    }
    @RequestMapping(value = "m12",method = RequestMethod.POST,consumes="application/json")
    public void method12 (@RequestBody String name) {
        System.out.println(name );
    }

    /*String的方式 重定向*/
    @RequestMapping("m13")
    public String method13 (Role role) {
        System.out.println("m13: "+role.toString());
        return "redirect:/c2";
    }

    @RequestMapping("m14")
    public void method14 () {
        System.out.println("14");
    }


    /*RedirectAttributes 方式重定向*/
    @RequestMapping("m15")
    public String method15 (RedirectAttributes ra,Role role) {
        System.out.println("m15" + role.toString());
        ra.addFlashAttribute("role",role);
        System.out.println(role.hashCode());
        return "redirect:./m16";
    }

    @RequestMapping("m16")
    public void method16 ( Role role) {
        System.out.println("16: " + role.toString());
        System.out.println(role.hashCode());
    }


    /*ModelAndView的方法*/
    @RequestMapping("m17")
    public ModelAndView method17(ModelAndView mv, Role role) {
        System.out.println("ModelAndView m17:" + role.toString());

        mv.addObject("role",role);
        mv.setViewName("redirect:./m18");
        return mv;
    }

    @RequestMapping("m18")
    public void method18() {
        System.out.println("m18");
    }

    @RequestMapping("19")
    public ModelAndView method19(ModelAndView mv) {

        mv.addObject("id",124);

        mv.addObject("name","klc");
        mv.setViewName("redirect:/c5");
        return mv;
    }

    @RequestMapping("21")
    public ModelAndView method19_2(ModelAndView mv) {

        mv.addObject("id",124);

        mv.addObject("name","klc");
        mv.setViewName("redirect:/c6");
        return mv;
    }

    @RequestMapping("m20")
    public void method20(@RequestHeader(value = "ceshi",required = false) String ceshi) {
        System.out.println(ceshi);
    }

    @RequestMapping("m21")
    public void method21(@CookieValue(value = "ceshi",required = false) String ceshi) {
        System.out.println(ceshi);
    }


}
