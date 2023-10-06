public class Main{

    public Main(){
    VirtualPet p = new VirtualPet();
    p.exercise();
    pause(5);
    p.feed();
    pause(5);
    p.exercise();
    }

    public void pause(int seconds){try {
        Thread.sleep(seconds);
    } catch(Exception e){
    
    }}

    public static void main(String[] args){
        new Main();
    }
}