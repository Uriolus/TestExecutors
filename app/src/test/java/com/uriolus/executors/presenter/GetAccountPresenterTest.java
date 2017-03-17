package com.uriolus.executors.presenter;

import org.junit.Test;

/**
 * Created by ofernandez on 16/03/2017.
 */
public class GetAccountPresenterTest {
    @Test
    public void getAccount() throws Exception {
        GetAccountPresenter getAccountPresenter=new GetAccountPresenter();
        getAccountPresenter.getAccount();
        GetAccountPresenter getAccountPresenter2=new GetAccountPresenter();
        getAccountPresenter2.getAccount();
        GetAccountPresenter getAccountPresenter3=new GetAccountPresenter();
        getAccountPresenter3.getAccount();
        GetAccountPresenter getAccountPresenter4=new GetAccountPresenter();
        getAccountPresenter4.getAccount();
        Thread.sleep(6000);
    }

}