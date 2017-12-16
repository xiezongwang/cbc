package com.service.cbc;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class CbcApplication {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init(BeanUtils.DEFAULT_BEAN_RESOURCE, "classpath*:META-INF/spring/*.server.xml");
    }
}
