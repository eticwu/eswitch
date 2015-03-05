package com.kuaidadi.app.common.eswitch.threshold.handler;

import org.aopalliance.intercept.MethodInvocation;

import com.kuaidadi.app.common.eswitch.threshold.ItemSph;
import com.kuaidadi.app.common.eswitch.threshold.ThresholdException;
import com.kuaidadi.app.common.eswitch.threshold.ThresholdLimitedHandler;
import com.kuaidadi.app.common.eswitch.threshold.ThresholdException.Type;

/**
 * 当被限流时, 抛出 {@link ThresholdException} 异常.
 * 
 * @author chenke
 */
public class ExceptionThresholdLimitedHandler implements ThresholdLimitedHandler {

    @Override
    public Object handleLimited(MethodInvocation invocation, ItemSph sph) {
        throw new ThresholdException(Type.Reject, "ThresholdInterceptor:class is: "
                                                  + invocation.getThis().getClass().getName() + "; method is: "
                                                  + invocation.getMethod().getName());
    }

}
