package com.pnoker.common.sdk.quartz.job;

import com.pnoker.common.sdk.service.DriverCustomizersService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 自定义调度任务
 *
 * @author pnoker
 */
@Slf4j
@Component
public class CustomizerJob extends QuartzJobBean {
    @Resource
    private DriverCustomizersService customizersService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        customizersService.schedule();
        log.info("customizers job");
    }
}