package tms.com.lessons8;

public class MainApp {
    public static void main(String[] args) {

//        1) Необходимо создать 3 работника и 1 директора. Для каждого сотрудника распечатать полное имя сотрудника и его з/п.

        Director director = new Director("Ivan", "Ivanov", 5);
        Worker worker = new Worker("Sidor", "Sidorov", 3);
        Worker worker1 = new Worker("Grigorij", "Grigorev", 4);
        Worker worker2 = new Worker("Fil", "Filov", 1);
        director.printInfo();
        worker.printInfo();
        worker1.printInfo();
        worker2.printInfo();

//        2) Назначить двух созданных сотрудников под управление директора. Распечатать сведения о директоре (инфо о директоре и об его подчинении).

        director.addWorker(worker);
        director.addWorker(worker1);
        System.out.println(director);

//        3) Создать нового директора с одним сотрудником (под управлением) и добавить его под управления существующего директора.

        Director director1 = new Director("Petr", "Petrov", 3);
        director1.addWorker(worker2);
        director.addWorker(director1);

//        4) Убедиться, что сведения о первом директоре теперь включают сведения о втором, который так же добавлен к нему (и т.д.).

        System.out.println(director);

//        5) Создать сервис, который определяет есть ли у данного директора в подчинении (прямом или косвенном) сотрудник с указанным именем (поиск вглубь)

        FindWorkerService findWorkerService = new FindWorkerService();
        boolean workerFound = findWorkerService.findWorkerService(director, "Fil");
        System.out.println("Worker found is " + workerFound);
    }

}
