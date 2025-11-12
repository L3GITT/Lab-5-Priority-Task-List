public class TaskList {
    public static void main(String[] args) {
        System.out.println("Priority Task List");
        System.out.println("------------------");
        Task t1 = new Task("Attend class", 1);
        Task t2 = new Task("Homework", 2);
        Task t3 = new Task("Exercise", 3);
        Task t4 = new Task("Eat breakfast", 4);
        Task t5 = new Task("Eat lunch", 5);
      
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
