package com.smxy.campus_recruit.controller;

import com.smxy.campus_recruit.bean.CRCollectionJob;
import com.smxy.campus_recruit.bean.CRResumeList;
import com.smxy.campus_recruit.bean.CRUserStu;
import com.smxy.campus_recruit.service.CRCollectionJobService;
import com.smxy.campus_recruit.service.CRResumeListService;
import com.smxy.campus_recruit.service.CRUserStuService;
import com.smxy.campus_recruit.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 张伟杰
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2021年06月30日 15:32:00
 */
@RestController
@RequestMapping("/userstu")

public class UserStuController {

    @Autowired
    private CRUserStuService userStuService;

    @Autowired
    private CRResumeListService resumeListService;

    @Autowired
    private CRCollectionJobService collectionJobService;

    @PostMapping("/login")
    public ResultData login(@RequestParam("username") String username
            , @RequestParam("password") String password
            , HttpSession session) {
        CRUserStu userStu = userStuService.verify(username, password);
        if (userStu != null) {
            session.setAttribute("userstu", userStu.setPassword(null));
            session.setAttribute("userid", userStu.getId());
            return ResultData.success().setMessage("登录成功").addExtend("userstu", userStu);
        } else {
            return ResultData.failure().setMessage("登录失败");
        }
    }

    @PostMapping("/logout")
    public ResultData logout(HttpSession session) {
        session.invalidate();
        return ResultData.success().setMessage("登出成功");
    }

    @PostMapping("/setdetail")
    public ResultData setDetail(CRUserStu userStu, HttpSession session) {
        int userid = (Integer) session.getAttribute("userid");
        userStu.setId(userid);
        if (userStuService.update(userStu)) {
            return ResultData.success().setMessage("修改成功");
        } else {
            return ResultData.failure().setMessage("修改失败");
        }
    }

    @PostMapping("/getdetail")
    public ResultData getDetail(HttpSession session) {
        CRUserStu userStu = (CRUserStu) session.getAttribute("userstu");
        return ResultData.success().addExtend("userstu", userStu);
    }

    @PostMapping("/sendresume")
    public ResultData sendResume(CRResumeList resumeList, HttpSession session) {
        CRUserStu userStu = (CRUserStu) session.getAttribute("userstu");
        resumeList.setName(userStu.getUsername());

        CRResumeList resumeList1 = resumeListService.
                getByNameAndEpname(resumeList.getName(), resumeList.getToEpName());
        if (resumeList1 == null) {
            if (resumeListService.add(resumeList)) {
                return ResultData.success().setMessage("添加成功").addExtend("data", resumeList);
            } else {
                return ResultData.failure().setMessage("添加失败");
            }
        } else {
            return ResultData.success().setMessage("已存在").addExtend("data", resumeList1);
        }
    }

    @PostMapping("/collect")
    public ResultData collect(Integer jobid, HttpSession session) {
        int userid = (Integer) session.getAttribute("userid");
        if (collectionJobService.existByUserIdAndJobId(userid, jobid)) {
            return ResultData.failure().setMessage("已收藏");
        } else {
            if (collectionJobService.add(userid, jobid)) {
                return ResultData.success().setMessage("收藏成功");
            } else {
                return ResultData.failure().setMessage("收藏失败");
            }
        }
    }

    @PostMapping("/cancelcollect")
    public ResultData cancelCollect(Integer jobid, HttpSession session) {
        int userid = (Integer) session.getAttribute("userid");
        if (!collectionJobService.existByUserIdAndJobId(userid, jobid)) {
            return ResultData.failure().setMessage("未收藏");
        } else {
            if (collectionJobService.deleteByUserIdAndJobId(userid, jobid)) {
                return ResultData.success().setMessage("取消成功");
            } else {
                return ResultData.failure().setMessage("取消失败");
            }
        }
    }

    @PostMapping("/collections")
    public ResultData collectionds(HttpSession session) {
        int userid = (Integer) session.getAttribute("userid");
        return ResultData.success().addExtend("data", collectionJobService.getByUserId(userid));
    }

}
