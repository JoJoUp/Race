public class AnimalThread extends Thread {
    public String name;
    public int priority;

    public AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {

        int countMetrs = 0;
        do {
            countMetrs++;
            if (countMetrs % 100 == 0) {
                System.out.println(name + " пробежал " + countMetrs + " метров");
            }
            if(countMetrs==5000){
                setPriority(priority);
            }


        } while (countMetrs < 10000);
    }



}
