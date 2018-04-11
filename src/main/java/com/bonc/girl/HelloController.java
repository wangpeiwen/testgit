package com.bonc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = true,defaultValue = "0") Integer id){
//        return girlProperties.getCupSize();
        return "id: "+id;
    }
}
