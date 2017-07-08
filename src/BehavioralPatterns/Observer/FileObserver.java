package BehavioralPatterns.Observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        File file;
        try{
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("The weather has changed. Temperature - " + temp + ". Pressure - " + presser + ".");
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
