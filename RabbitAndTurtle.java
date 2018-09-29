public class RabbitAndTurtle {
    public static void main(String args[]){
            AnimalThread Rabbit = new AnimalThread("Хролик",1);
            Rabbit.start();
            AnimalThread Tortale = new AnimalThread("Шарипаха",10);
            Tortale.start();

    }
}
