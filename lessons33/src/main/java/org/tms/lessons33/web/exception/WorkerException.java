package org.tms.lessons33.web.exception;

import lombok.Getter;
import lombok.Setter;
import org.tms.lessons33.web.domain.Worker;

@Getter
@Setter
public class WorkerException extends RuntimeException {

    private Worker worker;

    public WorkerException(Worker worker) {
        this.worker = worker;
    }


}




