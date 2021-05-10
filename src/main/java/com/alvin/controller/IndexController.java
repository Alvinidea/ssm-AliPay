package com.alvin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alipay")
public class IndexController {

    @RequestMapping("/index")
    public String index()
    {
        return "alipay/index";
    }

    @RequestMapping("/alipay.trade.page.pay")
    public String pay()
    {
        return "alipay/alipay.trade.page.pay";
    }

    @RequestMapping("/alipay.trade.close")
    public String alipayIndex()
    {
        return "alipay/close";
    }

    @RequestMapping("/alipay.trade.fastpay.refund.query")
    public String refund_query()
    {
        return "alipay.trade.fastpay.refund.query";
    }



    @RequestMapping("/alipay.trade.query")
    public String query()
    {
        return "alipay/alipay.trade.query";
    }

    @RequestMapping("/alipay.trade.refund")
    public String refund()
    {
        return "alipay/alipay.trade.refund";
    }

    @RequestMapping("/notify_url")
    public String notify_url()
    {
        return "alipay/notify_url";
    }

    @RequestMapping("/return_url")
    public String return_url()
    {
        return "alipay/return_url";
    }

}
