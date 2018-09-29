public class AnimalThread extends Thread {
    public String name;
    public int priority;
    int countMetrs = 0;

    public AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.setName(name);
    }

    public void run() {
        do {
            countMetrs+=getPriority();
            if (countMetrs % 100 == 0) {
                System.out.println(name + " пробежал " + countMetrs + " метров");
            }
            if(countMetrs==6000){
                this.setPriority(priority);
            }


        } while (countMetrs < 10000);
    }



}
