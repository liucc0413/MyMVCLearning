package SixTeen;

import Dao.User;
import Dao.Role;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static sun.security.x509.X509CertInfo.KEY;

@Controller
@RequestMapping("test6")
public class MyController6 {
   /* @InitBinder
    public void test(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(int.class, new IntegerEditor());
    }*/
    @RequestMapping("m1")
    @ResponseBody
    public Role getRole() {
       Role role = new Role(12,"中文");
       return role;
    }
    @RequestMapping("m2")
    @ResponseBody
    public Role method2( Role role) {
        System.out.println(role.toString());
        return role;
    }

    @RequestMapping("m3")
    @ResponseBody
    public Map<String,Object> method3(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE,style = "MM")Date date, @NumberFormat(pattern = "##,###.##") Double number) {
        Map<String,Object> result = new HashMap<>();
        result.put("date",date);
        result.put("number", number);
        return result;

    }

    @RequestMapping("m4")
    @ResponseBody
    public Map<String,Object> method4(@DateTimeFormat(style ="SS")Date date, @NumberFormat(pattern = "##,###.##") Double number) {
        Map<String,Object> result = new HashMap<>();
        result.put("date",date);
        result.put("number", number);
        return result;

    }

    @RequestMapping("m5")
    @ResponseBody
    public Map<String,Object> method5(@DateTimeFormat(pattern = "yyy-MM-dd",style = "SS")Date date, @NumberFormat(pattern = "##,###.##") Double number) {
        Map<String,Object> result = new HashMap<>();
        result.put("date",date);
        result.put("number", number);
        return result;

    }

   /*@ModelAttribute(value = "role")
    public Role method6() {
        Role role = new Role();
        role.setId(123);
        return role;
    }*/

    @RequestMapping("m6")
    public String method7(Role role){
        role.setName("woshilcc");
        return "redirect:/index3.jsp";
    }

    @RequestMapping("m7")
    @ResponseBody
    public Role method8(@ModelAttribute Role role) {
        return role;
    }
    @RequestMapping("m9")
    @ResponseBody
    public Integer method9(@ModelAttribute Integer id) {
        return id;
    }

    @RequestMapping("m10")
    public void method10(int id) {
        System.out.println(id);
        System.out.println(id/10);
        int n = 10/id;
    }

    @RequestMapping("m11")
    public String method11(int id) {
         List<String> list = 4 % id == 0 ? null : Arrays.asList(new String[]{"a","b","c","d"});
        return list.get(id);
    }
    @RequestMapping("m12")
    public void method12(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession(true);
        request.setCharacterEncoding("UTF-8");          // 设置request编码
        response.setCharacterEncoding("UTF-8");        // 设置response编码

        String action = request.getParameter("action"); // 获取action参数

        if ("login".equals(action)) {                       // 如果为login动作
            String account = request.getParameter("account"); // 获取account参数
            String password = request.getParameter("password"); // 获取password参数
            int timeout = new Integer(request.getParameter("timeout")); // 获取timeout参数

            String ssid = calcMD1(account + KEY); // 把账号、密钥使用MD1加密后保存

            Cookie accountCookie = new Cookie("account", account); // 新建Cookie
            accountCookie.setMaxAge(timeout);// 设置有效期

            Cookie a = new Cookie("af","dsfa");
            HttpSession httpSession = request.getSession();

            Cookie ssidCookie = new Cookie("ssid", ssid);   // 新建Cookie
            ssidCookie.setMaxAge(timeout);                 // 设置有效期

            response.addCookie(accountCookie);             // 输出到客户端
            response.addCookie(ssidCookie);            // 输出到客户端

            // 重新请求本页面，参数中带有时间戳，禁止浏览器缓存页面内容
            response.sendRedirect(request.getRequestURI() + "?" + System.currentTimeMillis());
            return;
        } else if ("logout".equals(action)) {                  // 如果为logout动作
            Cookie accountCookie = new Cookie("account", ""); // 新建Cookie，内容为空
            accountCookie.setMaxAge(0); // 设置有效期为0，删除

            Cookie ssidCookie = new Cookie("ssid", ""); // 新建Cookie，内容为空
            ssidCookie.setMaxAge(0);                   // 设置有效期为0，删除
            response.addCookie(accountCookie);         // 输出到客户端
            response.addCookie(ssidCookie);         // 输出到客户端
            // 重新请求本页面，参数中带有时间戳，禁止浏览器缓存页面内容
            response.sendRedirect(request.getRequestURI() + "?" + System.currentTimeMillis());
            return;
        }
        boolean login = false;                        // 是否登录
        String account = null;                        // 账号
        String ssid = null;                           // SSID标识

        if (request.getCookies() != null) {               // 如果Cookie不为空
            for (Cookie cookie : request.getCookies()) {  // 遍历Cookie
                if (cookie.getName().equals("account"))  // 如果Cookie名为 account
                    account = cookie.getValue();       // 保存account内容
                if (cookie.getName().equals("ssid")) // 如果为SSID
                    ssid = cookie.getValue();          // 保存SSID内容
            }
        }
        if (account != null && ssid != null) {    // 如果account、SSID都不为空
            login = ssid.equals(calcMD1(account + KEY)); // 如果加密规则正确, 则视为已经登录
        }
    }
    public final static String calcMD1(String ss) { // MD1 加密算法
        String s = ss == null ? "" : ss; // 若为null返回空
        s = s + "abc";
        return s;
    }

    @RequestMapping("Login")
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        System.out.println("SessionId=="+request.getSession().getId());
        String name = request.getParameter("name");
        //将用户的名称保存到session属性中
        request.getSession().setAttribute("name",request.getRemoteAddr()+name);
        System.out.println(request.getSession().isNew());
        HttpSession session = request.getSession();

        //登录成功后，保存名称为JSESSIONID的id的cookie，值为session的id
        Cookie c = new Cookie("JSESSIONID",request.getSession().getId());
        c.setMaxAge(60*100);
        c.setPath("/");
        response.addCookie(c);

        //调用doGet请求
        doGet(request,response);

    }

    private void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        if(request.getSession().getAttribute("name")!=null && !request.getSession().getAttribute("name").equals(request.getRemoteAddr())){
            out.print("你好："+request.getSession().getAttribute("name")+"用户登录成功");
        }else{
            out.print("亲还有登录哦");
        }
    }


    @RequestMapping("regist")
    public String method12( Model model, HttpServletRequest request, HttpServletResponse response) {
        RequestContext requestContext = new RequestContext(request);
        String username = requestContext.getMessage("username");
        User user = new User();
       user.setUsername(username);
       model.addAttribute("user",user);
       return "redirect:/index7.jsp";
    }

    @RequestMapping("signupcookie")
    public String method13( String locale, Model model, HttpServletRequest request, HttpServletResponse response) {
        RequestContext requestContext = new RequestContext(request);
        String s = request.getHeader("accept-language");

        String username = requestContext.getMessage("username");
        User user = new User();
        user.setUsername(username);
        model.addAttribute("user",user);
        return "redirect:/index7.jsp";
    }
    @RequestMapping(value="/test", method = {RequestMethod.GET})
    public String test(HttpServletRequest request,Model model, @RequestParam(value="locale", defaultValue="zh") String langType) {

            RequestContext requestContext = new RequestContext(request);
            if (langType.equals("zh_CN")) {
                Locale locale = new Locale("zh", "CN");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
            } else if (langType.equals("en_US")) {
                Locale locale = new Locale("en", "US");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
            } else
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());

        return "redirect:/index7.jsp";
    }

}
