package com.muya;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Author: MuYa
 * @Date : 2018/1/23
 * @Time : 19:56
 * @Description:
 */
public class JobImpl extends QuartzJobBean {
    private final static Logger logger = LoggerFactory.getLogger(QuartzJobBean.class);

    /**
     *
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("quartzJobBean execute!");
    }
}
