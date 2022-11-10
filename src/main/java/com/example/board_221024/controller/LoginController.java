package com.example.board_221024.controller;

import com.example.board_221024.service.UserService;
import com.example.board_221024.vo.CommonResponseVo;
import com.example.board_221024.vo.UserVo;
import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Locale;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping({"/", "/login"})
    public ModelAndView loginPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login/login");
        return mv;
    }
    @RequestMapping("/join")
    public ModelAndView joinPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login/join");
        return mv;
    }
    @RequestMapping("/board")
    public ModelAndView boardPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/board/board");
        return mv;
    }
    /**요청 보낸 url 이 request mapping 으로 연결을 해주고
     * 여기서는 join.js에서 signUpUser 라는 함수에서 ajax 통신을 했음
     * 보낼 때 param 으로 보냈는데, key 값은 VO 에 선언한 대로 맞춰 줘야 함.
     *  -> 여기 함수의 (UserVo param)으로 들어옴
     * @ResponseBody - body에서 결과 받을 때는 무조건!!! 없으면 에러남 */
    @RequestMapping("/signUp")
    @ResponseBody
    public CommonResponseVo signUpUser(UserVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            userService.joinUser(param);
            r.setSuccess(true);

        }catch (Exception e) {
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
    @Autowired
    private SqlSession sqlSession;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {

        return "login";
    }

    @RequestMapping(value = "/loginChk", method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String, String> loginChk(Locale locale, Model model, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap <String,String>();

        String userId = request.getParameter("id");
        String userPassword = request.getParameter("pw");

        UserVo userVo = new UserVo();

        userVo.setUserId(userId);
        userVo.setUserPassword(userPassword);

        int insertRst = sqlSession.insert("login.insert", userVo);

        if ( insertRst > 0) {
            String Msg = "성공";
            String Code = "0";

            result.put("Msg", Msg);
            result.put("Code", Code);

            return result;
        } else {
            String Msg = "실패ㅔ";
            String Code = "1";

            result.put("Msg", Msg);
            result.put("Code", Code);

            return result;
        }
    }
}

