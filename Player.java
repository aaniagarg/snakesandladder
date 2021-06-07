// Aania Garg
// Samitha Nadella
// AP Computer Science A
// June 7, 2021

package snakesandladders;

public class Player{
     private String character;
     private String name;
     private boolean turn;
     private int location;

     public Player(String name, String character){
          setName(name);
          setCharacter(character);
          setLocation(0);
          setTurn(false);
     }

     public boolean isTurn() {
          return turn;
     }    

     public void setTurn(boolean turn) {
          this.turn = turn;
     }

     public String getCharacter() {
          return character;
     }

     public void setCharacter(String character) {
          this.character = character;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getLocation() {
          return location;
     }

     public void setLocation(int location) {
          this.location = location;
     }
}