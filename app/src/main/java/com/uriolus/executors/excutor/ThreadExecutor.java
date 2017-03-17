package com.uriolus.executors.excutor;

import com.uriolus.executors.usecase.BaseUseCase;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by ofernandez on 16/03/2017.
 */

public class ThreadExecutor implements Executor{
    private static final int CORE_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 5;
    private static final int KEEP_ALIVE_TIME = 120;
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private static final BlockingQueue<Runnable> WORK_QUEUE = new LinkedBlockingQueue();

    private  ThreadPoolExecutor threadPoolexecutor;
    private static ThreadExecutor threadExecutor;

    public ThreadExecutor() {
        int corePoolSize = CORE_POOL_SIZE;
        int maxPoolSize = MAX_POOL_SIZE;
        int keepAliveTime = KEEP_ALIVE_TIME;
        TimeUnit timeUnit = TIME_UNIT;
        BlockingQueue<Runnable> workQueue = WORK_QUEUE;
        this.threadPoolexecutor=new ThreadPoolExecutor(corePoolSize,maxPoolSize,keepAliveTime,timeUnit,workQueue);
    }

    public static ThreadExecutor getInstance() {

        if (threadExecutor==null) {
            threadExecutor =
                    new ThreadExecutor();
        }
        return threadExecutor;

    }

    public ThreadExecutor(final int corePoolSize, final int maxPoolSize,
                          final int keepAliveTime, final TimeUnit timeUnit) {

        BlockingQueue<Runnable> workQueue = WORK_QUEUE;

        threadPoolexecutor =
                new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, timeUnit, workQueue);
    }

    @Override
    public void run(final BaseUseCase useCase) {
        if (useCase == null) {
            throw new IllegalArgumentException("UseCase to execute can't be null");
        }

        threadPoolexecutor.submit(useCase);
    }

}
