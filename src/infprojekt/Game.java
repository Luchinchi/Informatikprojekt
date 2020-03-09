/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infprojekt;

/**
 *
 * @author fv0544
 */
public class Game implements Runnable{
    
    public static int fps = 60;
    public static final long maxLoopTime = 1000/fps;
    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 640;
 
    public static void main(String[] args){
        Game game = new Game();
        new Screen("Game", SCREEN_WIDTH, SCREEN_HEIGHT);
        new Thread(game).start();
    }
    
    public boolean running = true;
    @Override
    
    public void run(){
    long timestamp;
    long oldTimestamp;
    while(running){
        oldTimestamp = System.currentTimeMillis();
        update();
        timestamp = System.currentTimeMillis();
        if(timestamp-oldTimestamp > maxLoopTime) {
            System.out.println("Wir sind zu spät!");
        continue; 
        }
    render();
    timestamp = System.currentTimeMillis();
    System.out.println(maxLoopTime + " : " + (timestamp-oldTimestamp));
    if(timestamp-oldTimestamp <= maxLoopTime) {
        try {
          Thread.sleep(maxLoopTime - (timestamp-oldTimestamp) );
          } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  void update() {
  try {
    Thread.sleep(15);
  } catch (InterruptedException e) {
    e.printStackTrace();
  };
} 
  void render() { }

  
  
}
    
    

