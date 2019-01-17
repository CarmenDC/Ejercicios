package genericos;

public class WorkerUtils {
	
    public <T extends Person> String getJob(T person) {
        return person.getJob();
    }

}
