import javax.swing.*;
public class IdiomOlympics {
    VirtualPet p=new VirtualPet();
    public void pause(int milliseconds){try {
        Thread.sleep(milliseconds);
    } catch(Exception e){
    
    }}
public static void main(String[] args) {
    VirtualPet p=new VirtualPet();
    int answer1=10;
    while (answer1!=0){
        answer1=p.dialog("Yes", "No", "Are you ready to play?", "Welcome to IdiomOlympics!");
    }
}
}
