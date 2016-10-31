package com.sealinetech.cloudccerp.controller;

import com.sealinetech.cloudccerp.service.DelegateUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by OOJEEK on 2016/10/28.
 */
@Controller
@RequestMapping("/delegateUnit")
public class DelegateUnitController {

    @Autowired
    private DelegateUnitService service;

    @RequestMapping("/list.do")
    public String getDelegateUnitList(HttpServletRequest request) {
        request.setAttribute("list", service.getRecordList());
        return "success.jsp";
    }
}
