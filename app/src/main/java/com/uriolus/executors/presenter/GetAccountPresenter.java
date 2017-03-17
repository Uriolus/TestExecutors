package com.uriolus.executors.presenter;

import com.uriolus.executors.excutor.ThreadExecutor;
import com.uriolus.executors.model.Account;
import com.uriolus.executors.usecase.GetAccountUseCase;

/**
 * Created by ofernandez on 16/03/2017.
 */

public class GetAccountPresenter {
    public void getAccount(){
        GetAccountUseCase getAccountUseCase=new GetAccountUseCase(new GetAccountUseCase.Callback() {
            @Override
            public void onSuccess(Account account) {
                System.out.println("Account"+account);
            }

            @Override
            public void onError(Exception exception) {
                System.out.println("Account ERROR");
            }
        });
        ThreadExecutor threadExecutor= ThreadExecutor.getInstance();
        threadExecutor.run(getAccountUseCase);
    }
}
