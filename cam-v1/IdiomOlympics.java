import javax.swing.*;
public class IdiomOlympics {
    VirtualPet p=new VirtualPet();
    public void pause(int milliseconds){try {
        Thread.sleep(milliseconds);
    } catch(Exception e){
    
    }}
public static void main(String[] args) {
    VirtualPetFace face=new VirtualPetFace();
    VirtualPet p=new VirtualPet();
    
    int answer1=10;
    while (answer1!=0){
        answer1=p.dialog("Yes", "No", "Are you ready to play?", "Welcome to IdiomOlympics!");
    }
    int answer2=p.dialog("Yes", "No", "Is the world turning?", null);
    if (answer2==1){
        p.joyful();
        p.message("Correct, it's about to", "Correct!");
        int answer3=p.dialog("Left", "Right", "You reach a fork in the road. Which way do you go?", "Fork in the Road");
        if (answer3==0){
            p.joyful();
            p.message("You take a big left turn and continue on your journey", "Nice job!");
            int answer4=p.dialog("Look for a way around", "Say \"Open Sesame!\"","A wall ahead blocks your path. What do you do?", "Unexpected obstace");
            if (answer4==1){
                p.joyful();
                p.message("You talk right through it", "Correct!");
                int answer5=p.dialog("Yes", "No", "Is the world turning?", null); 
                if (answer5==0){
                    p.joyful();
                    p.message("Yup, now it is", null);
                    int answer6=-1;
                    int jamEaten=0;
                    while (answer6!=0){
                        answer6=p.dialog("Climb the ladder", "Drink the liquid", "You reach a ladder with a bucket of a mysterious red liquid next to it. What do you do?", "A sticky situation");
                        if (answer6==1){
                            jamEaten++;
                            p.jam();
                            p.message("You take a sip. It's sweet flavor reminds you of strawberries", "Yummy!");
                        }
                    }
                    if (jamEaten==0){
                        p.hungry();
                        p.message("You begin climbing, but your hunger robs you of your speed and dexterity, speed and dexterity, allowing someone to push you over the edge", "You lose!");
                    }
                    if (jamEaten>1){
                        p.message("You try to climb, but you are weighed down by all the jam you ate. Seems like your eyes were bigger than your stomach", "You lose!");
                    }
                    if (jamEaten==1){
                        p.ladder();
                        p.message("You begin the ascent. You have just enough speed and dexterity, speed and dexterity to reach the top", "Tough Climb");
                        int answer7=p.dialog("Run through it", "Go around", "A dense grove blocks your path. It's many roots seem like a tripping hazard", "A forest ahead");
                        if (answer7==0){
                            p.ecstatic();
                            p.message("As soon as you enter the grove, your foot gets caught in a root and you tip forward. Right before your face would hit the ground, everything disappears and you find yourself sitting at a computer in front of the flashing words \"You win!\"", "You win!");
                        }else{
                            p.dead();
                            p.message("You skirt the edge. Right as you are about to pass it, a giant rat appears and attacks. Unfortunately, you are unable to escape","You lose!");
                        }
                    }
                }else{
                    p.dead();
                    p.message("Sorry, it started a while back", "You lose!");
                }
            }else{
                p.dead();
                p.message("Cat got your tounge?", "You lose!");
            }
        }else{
            p.dead();
            p.message("Come see me in advisory and we'll figure this out", "You lose!");
        }
    }else{
        p.dead();
        p.message("Nope, but it's about to!", "You lose!");
    }
}
}
