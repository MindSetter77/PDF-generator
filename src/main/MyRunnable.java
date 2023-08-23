package main;

import java.util.Arrays;

public class MyRunnable implements Runnable {
    Window window;
    String currentTitle;
    String[] tabl;
    int idx;
    int mode;

    public MyRunnable(Window window){
        this.window = window;
        this.currentTitle = "";
        idx = 0;
        String title = "Najlepszy generator numerologii v2000";
        this.tabl = title.split("");

        this.mode = 1;
    }

    @Override
    public void run() {
        while(true){
            try{

                if(mode==1) {
                    this.currentTitle += tabl[idx];
                    idx++;
                    if (idx >= tabl.length) {
                        mode = 2;
                        idx = 0;
                    }
                    window.setTitle(currentTitle);
                }

                else {
                    this.currentTitle = currentTitle.substring(0, currentTitle.length()-1);
                    window.setTitle(currentTitle);
                    if(currentTitle.length()==0){
                        this.mode = 1;
                    }
                }

                Thread.sleep(100);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
