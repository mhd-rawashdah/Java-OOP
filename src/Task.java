public class Task {
    public static int taskNo;
    private String taskName;
    private boolean isDone;

    public Task(String taskName, boolean isDone) {
        this.taskName = taskName;
        this.isDone = isDone;
    }


    public String getTaskName() {
        return taskName;
    }

    public void modifyTask(String taskName) {
        this.taskName = taskName;
    }

    public void runTask() {
        if (this.isDone) {

            return;
        }
        System.out.println("Is runing !!");

        try {
            Thread.sleep(5000);
            this.isDone = true;

        } catch (Exception e){

        }

        if (this.isDone) {
            System.out.println("The task is done");
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
