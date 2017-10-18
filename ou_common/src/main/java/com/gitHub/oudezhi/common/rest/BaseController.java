package com.gitHub.oudezhi.common.rest;

import com.gitHub.oudezhi.common.biz.BaseBiz;
import com.gitHub.oudezhi.common.msg.ObjectRestResponse;
import com.gitHub.oudezhi.common.msg.TableResultResponse;
import com.gitHub.oudezhi.common.util.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/18.
 */
public class BaseController<Biz extends BaseBiz,Entity>{

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected Biz baseBiz;

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public ObjectRestResponse<Entity> add(@RequestBody Entity entity){
        baseBiz.insertSelective(entity);
        return new ObjectRestResponse<Entity>().rel(true);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<Entity> get(@PathVariable int id){
        return new ObjectRestResponse<Entity>().rel(true).data(baseBiz.selectById(id));
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse<Entity> update(@RequestBody Entity entity){
        baseBiz.updateSelectiveById(entity);
        return new ObjectRestResponse<Entity>().rel(true);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ObjectRestResponse<Entity> remove(@PathVariable int id){
        baseBiz.deleteById(id);
        return new ObjectRestResponse<Entity>().rel(true);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<Entity> all(){
        return baseBiz.selectListAll();
    }
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Entity> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        return baseBiz.selectByQuery(query);
    }
    public String getCurrentUserName(){
        String authorization = request.getHeader("Authorization");
        return new String(Base64Utils.decodeFromString(authorization));
    }
}
