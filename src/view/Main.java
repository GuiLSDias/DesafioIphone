package view;

import model.Iphone;
import model.Music;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.selecionarMusica("abcd");
    }
}