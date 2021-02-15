package com.zhe.qiushui.DubboRun.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qiushui.module.Info;
import com.qiushui.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sound.sampled.DataLine;
import java.util.Optional;
@Service
public class InfoServiceImpl implements InfoService {
    private static final Logger log = LoggerFactory.getLogger(InfoServiceImpl.class);
    @Override
    public Info queryByTypeAndName(String type, String name) {
        log.info("InfoService - QueryByTypeAndName - Received request: type-{}, name-{}", type, name);
        String inputType = Optional.ofNullable(type).orElse("");
        Info info =  new Info();
        switch (inputType){
            case "Person":
                info.setType(type);
                info.setName("You got person - " + name);
                return info;
            case "Product":
                info.setType(type);
                info.setName("You got product - " + name);
                return info;
            default:
                return new Info();
        }
    }
}
