package com.kuaidadi.app.common.eswitch.threshold.handler;

import org.aopalliance.intercept.MethodInvocation;

import com.kuaidadi.app.common.eswitch.threshold.ThresholdException;
import com.kuaidadi.app.common.eswitch.threshold.ThresholdNotFoundHandler;
import com.kuaidadi.app.common.eswitch.threshold.ThresholdException.Type;

/**
 * 当流控项未找到时, 抛出 {@link ThresholdException} 异常.
 * 
 * @author chenke
 */
public class ExceptionThresholdNotFoundHandler implements ThresholdNotFoundHandler {

    @Override
    public Object handleNotFound(MethodInvocation invocation) {
        throw new ThresholdException(Type.ThresholdNotFound, "ThresholdInterceptor:class is: "
                                                             + invocation.getMethod().getDeclaringClass().getName()
                                                             + "; method is: " + invocation.getMethod().getName());
    }

}
