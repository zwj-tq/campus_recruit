package com.smxy.campus_recruit.controller;

import com.smxy.campus_recruit.bean.CRJobList;
import com.smxy.campus_recruit.bean.CRUserEq;
import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.service.CRJobListService;
import com.smxy.campus_recruit.service.CRResumeListService;
import com.smxy.campus_recruit.service.CRUserEqService;
import com.smxy.campus_recruit.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.time.Period;

/**
 * @author 张伟杰
 * @ClassName UserEpController.java
 * @Description TODO
 * @createTime 2021年07月06日 10:16:00
 */

@RestController
@RequestMapping("/userep")

public class UserEpController {

    @Autowired
    private CRUserEqService userEqService;

    @Autowired
    private CRJobListService jobListService;

    @Autowired
    private CRResumeListService resumeListService;

    @PostMapping("/login")
    public ResultData login(@RequestParam("username") String username
            , @RequestParam("password") String password
            , HttpSession session) {
        CRUserEq userEq = userEqService.verify(username, password);
        if (userEq != null) {
            session.setAttribute("usereq", userEq.setPassword(null));
            session.setAttribute("userid", userEq.getId());
            return ResultData.success().setMessage("登录成功").addExtend("data", userEq);
        } else {
            return ResultData.failure().setMessage("登录失败");
        }
    }

    @PostMapping("/logout")
    public ResultData logout(HttpSession session) {
        session.invalidate();
        return ResultData.success().setMessage("登出成功");
    }

    @PostMapping("/regist")
    public ResultData regist(CRUserEq userEq){
        if(userEqService.getByUsername(userEq.getUsername())!=null ||
                userEqService.getByPhone(userEq.getPhone())!=null){
            return ResultData.failure().setMessage("用户名或电话已存在");
        }
        userEqService.add(userEq.setEpName("未审核-"+userEq.getEpName()));
        return ResultData.success();
    }

    @PostMapping("/setdetail")
    public ResultData setDetail(CRUserEq userEq, HttpSession session) {
        int userid = (Integer) session.getAttribute("userid");
        userEq.setId(userid);
        if (userEqService.update(userEq)) {
            session.setAttribute("userstu",userEqService.getById(userid));
            return ResultData.success().setMessage("修改成功");
        } else {
            return ResultData.failure().setMessage("修改失败");
        }
    }

    @PostMapping("/getdetail")
    public ResultData getDetail(HttpSession session) {
        CRUserEq userEq = (CRUserEq) session.getAttribute("usereq");
        return ResultData.success().addExtend("userstu", userEq);
    }

    @PostMapping("/recruit")
    public ResultData recruit(CRJobList job,HttpSession session){
        CRUserEq userEq= (CRUserEq) session.getAttribute("usereq");
        job.setEpName(userEq.getEpName());
        job.setEpAdr(userEq.getEpAdr());
        job.setEpAvatar(userEq.getEpAvatar());
        job.setEpCode(userEq.getEpCode());
        job.setEpIntroduce(userEq.getEpIntroduce());
        job.setEpType(userEq.getEpType());

        if(jobListService.add(job)){
            return ResultData.success().setMessage("发布成功");
        }else{
            return ResultData.failure().setMessage("发布失败");
        }
    }

    @PostMapping("/getrecruit")
    public ResultData getRecruit(HttpSession session){
        CRUserEq userEq=(CRUserEq) session.getAttribute("userep");
        return ResultData.success().addExtend("data",jobListService.getByEpname(userEq.getEpName()));
    }

    @PostMapping("/getresume")
    public ResultData getResume(HttpSession session){
        CRUserEq userEq=(CRUserEq) session.getAttribute("userep");
        return ResultData.success().addExtend("data",resumeListService.getByEpname(userEq.getEpName()));
    }

}
