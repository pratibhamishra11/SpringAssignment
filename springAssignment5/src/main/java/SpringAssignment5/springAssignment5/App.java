package SpringAssignment5.springAssignment5;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Service trainerService = new Service();
        List<Trainer> trainers = trainerService.getAllTrainersWithSessions();
        for (Trainer trainer : trainers) {
            System.out.println("Trainer: " + trainer.getName());
            System.out.println("Sessions:");
            int c=1;
            for (Session session : trainer.getSessions()) {
                System.out.println(c+". " + session.getName());
                c++;
            }
            c=1;
            System.out.println();
        }
    }
}
