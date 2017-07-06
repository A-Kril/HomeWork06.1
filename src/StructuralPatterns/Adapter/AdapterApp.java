package StructuralPatterns.Adapter;

public class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicsInterface vectorGraphicsInterface = new VectorAdapterFromRaster();

        vectorGraphicsInterface.drawLine();
        vectorGraphicsInterface.drawSquare();
    }
}
