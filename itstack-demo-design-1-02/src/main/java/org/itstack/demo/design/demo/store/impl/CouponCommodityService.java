package org.itstack.demo.design.demo.store.impl;

import org.itstack.demo.design.coupon.CouponResult;
import org.itstack.demo.design.coupon.CouponService;
import org.itstack.demo.design.demo.store.ICommodity;

import java.util.Map;

/**
 * @author yanan.chang
 */
public class CouponCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        CouponService couponService = new CouponService();
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        if (!couponResult.getCode().equals("0000")) {
            throw new RuntimeException("发送优惠券失败");
        }
    }
}
