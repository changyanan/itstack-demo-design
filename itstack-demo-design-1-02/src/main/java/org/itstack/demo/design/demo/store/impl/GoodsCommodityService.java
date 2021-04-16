package org.itstack.demo.design.demo.store.impl;

import org.itstack.demo.design.demo.store.ICommodity;
import org.itstack.demo.design.goods.DeliverReq;
import org.itstack.demo.design.goods.GoodsService;

import java.util.Map;

/**
 * @author yanan.chang
 */
public class GoodsCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        GoodsService goodsService = new GoodsService();
        DeliverReq deliverReq= new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku("香水有毒");
        deliverReq.setOrderId(bizId);
//        extMap.put("consigneeUserName", "谢飞机");
//        extMap.put("consigneeUserPhone", "15200292123");
//        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }
    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
