package com.zhe.qiushui.DubboRun.service;

import com.qiushui.module.ProductPrice;
import com.qiushui.service.PriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductPriceServiceImpl implements PriceService {
    private static final Logger log = LoggerFactory.getLogger(ProductPriceServiceImpl.class);
    @Override
    public ProductPrice getProductPrice(String name, int date) {
        ProductPrice pp = new ProductPrice();
        pp.setDate(date);
        pp.setName(name);
        pp.setValue(110.2);
        return pp;
    }
}
