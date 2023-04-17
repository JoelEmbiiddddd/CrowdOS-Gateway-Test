package cn.crowdos.gateway.rpc;

import cn.crowdos.gateway.rpc.dto.XReq;


/**
 * @File : IActivityBooth.java
 * @Author : LiXin Huang, NWPU
 * @Desc :
 * @Email : iHuanglixin@outlook.com
 */


public interface IActivityBooth {

    String CrowdosA(String str);

    String CrowdosB(XReq req);

    String CrowdosC(String str, XReq req);

}
