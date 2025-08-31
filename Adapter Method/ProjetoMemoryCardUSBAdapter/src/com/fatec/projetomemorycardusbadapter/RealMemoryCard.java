package com.fatec.projetomemorycardusbadapter;

public class RealMemoryCard implements MemoryCard{
    @Override
    public void readData() {
        System.out.println("Lendo dados diretamente do cartão de memória...");//Comandos que leriam o USB
    }
}
