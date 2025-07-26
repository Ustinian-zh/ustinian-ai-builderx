package com.ustinian.ustinianaibuilderx.controller;

import com.ustinian.ustinianaibuilderx.common.BaseResponse;
import com.ustinian.ustinianaibuilderx.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthController {
    @GetMapping
    public BaseResponse <String> healthCheck() {
        return ResultUtils.success("");
    }

}
