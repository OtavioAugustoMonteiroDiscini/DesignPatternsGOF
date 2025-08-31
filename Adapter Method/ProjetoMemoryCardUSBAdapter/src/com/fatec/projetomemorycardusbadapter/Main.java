package com.fatec.projetomemorycardusbadapter;

public class Main {
    public static void main(String[] args) {
        MemoryCardReader reader = new MemoryCardReader();

        MemoryCard realCard = new RealMemoryCard();
        System.out.println("==== Leitura do Memory Card real ====");
        reader.readMemoryCard(realCard);

        System.out.println();


        USBDrive usbDrive = new USBDrive();
        MemoryCard adaptedUSB = new USBToMemoryCard(usbDrive);
        System.out.println("=== LEITURA DE UM USBDRIVE COM ADAPTADOR ===");
        reader .readMemoryCard(adaptedUSB);
    }
}
