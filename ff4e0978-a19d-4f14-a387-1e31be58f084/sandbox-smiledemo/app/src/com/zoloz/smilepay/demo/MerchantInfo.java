package com.zoloz.smilepay.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bruce on 2018/6/15.
 */

public class MerchantInfo {
    //这里三个值请填写自己真实的值
    //应用的签名私钥
    public final static String appKey1 = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC142R2BqLOQMU9tvkztDC8flzaUnfUrIe7ZaRrwuTV5lqOnQVkg/wX2eDR/xPjAfS7CxbbVO6YUdAatlrjbjsZ3F8sCzlGmuieVKIDgJUIPlEaaPM3tE0CCXjTtN5K/lJST3WO1JBysVnVGGXgeDStfGdZG+jvOvyuGcClfE/I2wndz7gHvlZIeUsYKZjqjpQ9QpNWfBw3TL6bhViqDSEzbKLMCJoZ6jKbwdpwmfmm2Duh6xtNtOFVCofWX1zTifGWPfWaOxLsXI7NVrE0eIFV1lL36PlDs23VPPm5DVylxVqnt2W/qfXKN9ketV/FUQKwpZa5VU/a8vS+7E8pGnQZAgMBAAECggEAHaKdHbXbFOvsty92zvvO7QdRrai+KYKq4teewIgSrN9JZe8jj8sJagFv5gc/gD8zVr5pzPa7oUnDNHb9vAybyIzlXNG/VUesGxADDbsHjT5KDJmI90yDN4+/hg70IRfq5cpYhxsPJgDLeDLvdnFfc9zPIe+wNjpQLTW4872bakgvs3jJo6CFzVe8SewjaSwspsSMBjZI9mMUwmFzMPW86SLDMdoinlTdcomlIrZJBl33PurAmDnp9ioVpQYS5s25CeaToq+QRZHzphVl2K3CWO0mPJADghR1OLW3UKJZDTUrtBvd4xf+CyI2cMo38XqRw9WOmIzIO3XYOzaXJij/+QKBgQDZn7WX9EtGq4B7b9lMAsfu5si35nZgA4Mn7XBvToRjv2tPcrAmIrugepmxGpBNQLIWtg4IA0AeE5ZbejtbQGmW68g4RwumjETL4V6dpxfnBn4TxqvIouVfIYH1xf+HdvuhIZu1LrhnCRhr9zhriKYWleWzQ/m7ah7EqriKvchDVwKBgQDV9nRWulsyMArx2nVI/XV46hUY49wimvkH2kkjaf4TEbeq/DJSfGWS3PJ3Y3o3VvktYxzoQdAmLDYVdi8JRgJjyQM/kn9IlAQrQg96KVEvwC5Pvd4a8/MK+2RSrGKdPKPStuH1iraNk5zrVQYeZDadsrdkJrAw8M2UBv8cSrZODwKBgDxedX2Foywjfyy+xkSzsMqw8pUxNT1FPCjjUQFPgqI5A4eyhPLPR8UovWHHwKftfnmWXyYR4MN3I4qUycpyf9gB6DTUYIL+/kagaiLJq3PG9Up/HkA2D/Ln1KldF5l4hC0aqZsFLtpGR6QLnHcYHRq+0k18WdaHhamAwliadOdZAoGBANQB0qElIrwGErI2zsQ2MTJQb/srvLKlcGCxkIsAuXrXsXBBWPOWw2bUe4SFE1LGYTzx2nDg1YkdgbGeW1kK/880HH3fgTO/Rqo+WOupCQMRoFHvRqbaVlbpZiztFwHKVmGySQ9uFRkPzQr6QofWsK9tqH4aP7cew/ULQbkc5qtNAoGAaBxsBOJeUM1wSKYP4c4pdX60niN+uA07HjxIuq+xC2WlPrMPlHLGXUpXyt5K43ENe59hikzwQyZg0FHMp3tWUk52lhrOlcr6QyrxDXN+5/02BLOqMo/VNwo1u3+7VFdsDdWzXSeMgw/9NpaLMzI0C7S8qVa9X2j544ExzVsmVrg=";
    //商户id  商户UID
    public final static String partnerId1 = "2088102176785469";

    //应用的appId
    public final static String appId1 = "2016092200571190";

    //沙箱网关的url
    public final static String openapiUrl = "https://openapi.alipaydev.com/gateway.do";
    /**
     * mock数据，真实商户请填写真实信息.
     */
    public static Map mockInfo() {
        Map merchantInfo = new HashMap();
        //以下信息请根据真实情况填写
        //商户id
        merchantInfo.put("partnerId", MainActivity.mPartnerId);
        merchantInfo.put("merchantId", MainActivity.mPartnerId);
        //开放平台注册的appid
        merchantInfo.put("appId", MainActivity.mAppId);
        //机具编号，便于关联商家管理的机具
        merchantInfo.put("deviceNum", "TEST_ZOLOZ_TEST");
        //真实店铺号
        merchantInfo.put("storeCode", "TEST");
        //口碑店铺号
        merchantInfo.put("alipayStoreCode", "TEST");
        //品牌，传入拼音或者英文，标示该商家
        merchantInfo.put("brandCode", "TEST");

        merchantInfo.put("areaCode", "TEST");
        merchantInfo.put("geo", "0.000000,0.000000");
        merchantInfo.put("wifiMac", "TEST");
        merchantInfo.put("wifiName", "TEST");
        merchantInfo.put("deviceMac", "TEST");

        return merchantInfo;
    }
}
