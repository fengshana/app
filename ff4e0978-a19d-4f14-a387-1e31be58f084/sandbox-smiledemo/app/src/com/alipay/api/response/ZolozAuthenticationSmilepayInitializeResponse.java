package com.alipay.api.response;

import com.alipay.api.AlipayResponse;
import com.alibaba.fastjson.annotation.JSONField;

public class ZolozAuthenticationSmilepayInitializeResponse
    extends AlipayResponse
{
    private static final long serialVersionUID = 1717839179174256488L;
    @JSONField(name = "result")
    private String result;

    @JSONField(name = "ret_code_sub")
    private String retCodeSub;

    @JSONField(name = "ret_message_sub")
    private String retMessageSub;

    @JSONField(name = "zim_id")
    private String zimId;

    @JSONField(name = "zim_init_client_data")
    private String zimInitClientData;

    public String getRetCodeSub() {
        return retCodeSub;
    }

    public void setRetCodeSub(String retCodeSub) {
        this.retCodeSub = retCodeSub;
    }

    public String getRetMessageSub() {
        return retMessageSub;
    }

    public void setRetMessageSub(String retMessageSub) {
        this.retMessageSub = retMessageSub;
    }

    public String getZimId() {
        return zimId;
    }

    public void setZimId(String zimId) {
        this.zimId = zimId;
    }

    public String getZimInitClientData() {
        return zimInitClientData;
    }

    public void setZimInitClientData(String zimInitClientData) {
        this.zimInitClientData = zimInitClientData;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public String getResult()
    {
        return this.result;
    }
}
