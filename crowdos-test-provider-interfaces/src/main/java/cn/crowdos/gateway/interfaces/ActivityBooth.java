package cn.crowdos.gateway.interfaces;

import cn.crowdos.gateway.rpc.IActivityBooth;
import cn.crowdos.gateway.rpc.dto.XReq;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Service;

/**
 * @File : ActivityBooth.java
 * @Author : LiXin Huang, NWPU
 * @Desc :
 * @Email : iHuanglixin@outlook.com
 */

@Service(version = "1.0.0")
public class ActivityBooth implements IActivityBooth {

    @Override
    public String CrowdosA(String str) {
        return "hi " + str + " ,This is a function about Get from crowdos-gateway.Congratulations!";
    }

    @Override
    public String CrowdosB(XReq req) {
        return "hi " + JSON.toJSONString(req) + ",This is a function about Post from crowdos-gateway.Congratulations!";
    }

    @Override
    public String CrowdosC(String str, XReq req) {
        return "hi " + JSON.toJSONString(req) +" ,This is a function about Post from crowdos-gateway.Congratulations!";
    }

}
