package com.fatec.projetomemorycardusbadapter;

public class USBToMemoryCard implements MemoryCard{

    private USBDrive usbDrive;

    public USBToMemoryCard(USBDrive usbDrive){
        this.usbDrive = usbDrive;
    }


    @Override
    public void readData() {
        System.out.println("Adapatador em acao: Convertendo usb em memory card");
    }
}
