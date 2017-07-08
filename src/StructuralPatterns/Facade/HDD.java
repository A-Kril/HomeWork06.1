package StructuralPatterns.Facade;

class HDD {
    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("The data is copied from the disk");
        }
        else {
            System.out.println("Insert a data disk");
        }
    }
}
