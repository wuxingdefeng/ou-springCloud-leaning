package com.gitHub.oudezhi.userClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/9/27.
 */
@Controller
public class FirstTestController {
    @Value("${datasource.url:你好德玛西亚}")
    String language;

    @RequestMapping("/info-hi")
    @ResponseBody
    public String getInfo(){
        return "你好世界";
    }
    @RequestMapping("/user/{id}")
    @ResponseBody
    public String getUserInfo(@PathVariable String id){
        return language+":"+id;
    }


}
