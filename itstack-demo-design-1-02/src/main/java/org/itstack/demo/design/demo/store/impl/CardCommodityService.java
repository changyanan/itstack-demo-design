package org.itstack.demo.design.demo.store.impl;

import org.itstack.demo.design.card.IQiYiCardService;
import org.itstack.demo.design.demo.store.ICommodity;

import java.util.Map;

/**
 * @author yanan.chang
 */
public class CardCommodityService implements ICommodity {

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        IQiYiCardService iQiYiCardService = new IQiYiCardService();
        iQiYiCardService.grantToken(queryUserMobile(uId), bizId);
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
