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
    int answer2=p.dialog("Yes", "No", "Is the world turning?", null);
    if (answer2==1){
        p.message("Correct, it's about to", "Correct!");
        int answer3=p.dialog("Left", "Right", "You reach a fork in the road. Which way do you go?", "Fork in the Road");
        if (answer2==0){
            int answer4=p.dialog("Look for a way around", "Say \"Open Sesame!\"","A wall ahead blocks your path. What do you do?", "Unexpected obstace");
            if (answer4==1){
                int answer5=p.dialog("Yes", "No", "Is the world turning?", null);
                if (answer5==0){
                    int answer6=10;
                    int jamEaten=0;
                    while (answer6!=0){
                        answer6=p.dialog("Climb the ladder", "Drink the liquid", "You reach a ladder with a bucket of a mysterious red liquid next to it. What do you do?", "A sticky situation");
                        if (answer6==1){
                            jamEaten++;
                        }
                    }
                    
                }else{
                    p.message("Sorry, it started a while back", "You lose!");
                }
            }else{
                p.message("Cat got your tounge?", "You lose!");
            }
        }else{
            p.message("Come see me in advisory and we'll figure this out", "You lose!");
        }
    }else{
        p.message("Nope, but it's about to!", "You lose!");
    }
}
}
