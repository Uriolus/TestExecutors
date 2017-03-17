package com.uriolus.executors.usecase;

import com.uriolus.executors.model.Account;

import java.util.Random;

/**
 * Created by ofernandez on 16/03/2017.
 */

public class GetAccountUseCase implements BaseUseCase {

    Callback callback;

    public GetAccountUseCase(Callback callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            Random random=new Random(System.currentTimeMillis());
            callback.onSuccess(new Account(random.nextDouble()+"N",random.nextInt()+"€"));
        } catch (InterruptedException e) {
            e.printStackTrace();
            callback.onError(e);
        }

    }
    public interface Callback {
        void onSuccess(Account account);
        void onError(Exception exception);
    }
}
