package com.uriolus.executors.excutor;

import com.uriolus.executors.usecase.BaseUseCase;

/**
 * Created by ofernandez on 16/03/2017.
 */

public interface Executor {
    void run(final BaseUseCase useCase);
}
