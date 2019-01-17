package genericos;

public class EjecutarGenericos {
	
    public static void main(String[] args) {
        Actor actor = new Actor("Michael", 23);
        Engineer engineer = new Engineer("Scott", 25);
 
        WorkerUtils wu = new WorkerUtils();
        System.out.println(wu.getJob(actor) + ", " + wu.getJob(engineer));
    }

}
