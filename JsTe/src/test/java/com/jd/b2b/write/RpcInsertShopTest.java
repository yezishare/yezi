package com.jd.b2b.write;

import base.BaseTestNG;
import com.jd.pop.qa.annotation.Description;
import com.tqmall.core.common.entity.Result;
import com.tqmall.ucenter.object.result.shop.ShopDTO;
import com.tqmall.ucenter.service.shop.RpcShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.Date;

public class RpcInsertShopTest extends BaseTestNG{
    @Autowired
    RpcShopService rpcShopService;
    @Test
    @Description(description="写入数据")
    public void test_insertShop(){
        ShopDTO shopDTO=new ShopDTO();
        shopDTO.setCompanyName("测试12356");
        shopDTO.setCompanyFormalName("测试数据123");
        shopDTO.setVerifyStatus(2);
        shopDTO.setUserId(1);
        shopDTO.setAppSource("YAO");//数据来源
        shopDTO.setSource("YAO");
        shopDTO.setGmtCreate(new Date());
        shopDTO.setGmtModified(new Date());
        //shopDTO.setOutId(customerInfo.getCompanyId());//yao端id uc_shop的外部id
//        com.tqmall.core.common.entity.Result<ShopDTO> shopDTOResult = rpcShopService.insertShop(shopDTO);
        Result<ShopDTO> shopDTOResult=rpcShopService.insertShop(shopDTO);
        if(shopDTOResult.isSuccess()){
            System.out.println(shopDTOResult.getData());
            System.out.println("1111");
        }
    }


//    @Test
//    @Description(description = "写入店铺信息");
//    public void insertShop() throws Exception{
//        HashMap<String[],Boolean> data=new HashMap<~>();
//        Boolean isSuccess=Boolean.TRUE;
//        Random random=new Random();
//        /*数据格式公司名称、全名称、号码、用户ID、状态值、店铺类型、店铺状态等*/
//        data.put(new String[]{"测试1","测试123","231","2","0","1","","0","0","0","yao","65","1000","","","1","",""});
//        Result<ShopDTO> invoke=this.invoke(rpcShopService,"insertShop",rpcShopService.class,this.InsertShop(),ShopDTO);
//        if(invoke.isSuccess()){
//            ShopDTO dto=Result.getData();
//        }
//    }





}
