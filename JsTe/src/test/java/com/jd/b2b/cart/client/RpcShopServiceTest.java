package com.jd.b2b.cart.client;

import base.BaseTestNG;
import com.jd.pop.qa.annotation.Description;
import com.tqmall.core.common.entity.Result;
import com.tqmall.ucenter.object.result.shop.ShopDTO;
import com.tqmall.ucenter.service.shop.RpcShopService;
import org.databene.domain.organization.CompanyName;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RpcShopServiceTest extends BaseTestNG {

    @Autowired
    RpcShopService rpcShopService;
    @Test
    @Description(description="读取shop信息")
    public void testCartClient(){
//        ClientInfo clientInfo=new ClientInfo("1111","1112");
//        Logger.log("查询购物车信息");
        Result<ShopDTO> result =  rpcShopService.getShopById("YAO",439);
        ShopDTO dto = result.getData();
        System.out.println(dto.getCompanyName()+dto.getClientNum());
        if(result.isSuccess()){

//            System.out.println(dto.getCompanyName()+dto.getClientNum());


        }


    }


}
