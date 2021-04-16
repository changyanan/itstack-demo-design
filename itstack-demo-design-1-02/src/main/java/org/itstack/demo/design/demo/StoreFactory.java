package org.itstack.demo.design.demo;

import org.itstack.demo.design.demo.store.ICommodity;
import org.itstack.demo.design.demo.store.impl.CardCommodityService;
import org.itstack.demo.design.demo.store.impl.CouponCommodityService;
import org.itstack.demo.design.demo.store.impl.GoodsCommodityService;

/**
 * @author yanan.chang
 */
public class StoreFactory {
    public ICommodity getCommodity(Integer commodityType){
        if (commodityType==1)return new CardCommodityService();
        if (commodityType==2)return new CouponCommodityService();
        if(commodityType==3)return new GoodsCommodityService();
        throw new RuntimeException("不存在服务类型");
    }
}
