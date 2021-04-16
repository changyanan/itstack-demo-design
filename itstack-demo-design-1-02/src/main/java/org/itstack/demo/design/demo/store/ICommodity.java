package org.itstack.demo.design.demo.store;

import java.util.Map;

/**
 * @author yanan.chang
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
