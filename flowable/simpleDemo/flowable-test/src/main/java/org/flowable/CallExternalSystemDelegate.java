package org.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2023/1/10
 */
public class CallExternalSystemDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("zp已经批准"+ delegateExecution.getVariable("employee")+"的假期申请");
    }
}
