package com.i.cs_305_project2;

import java.lang.Character;

public class Cipher {
    String character;
    int shift;

    public Cipher(){
        setCharacter("a");
        setShift(1);
    }

    public Cipher(String c, int s){
        setCharacter(c);
        setShift(s);
    }

    public void setCharacter(String c){
        character = c;
    }

    public void setShift(int s){
        if(s >= 1 && s <= 25){
            shift = s;
        }

        if(s > 25){
            shift = 25;
        }

        if(s < 1){
            shift = 1;
        }
    }

    public String getCharacter(){
        return character;
    }

    public int getShift(){
        return shift;
    }

    public String encrypt(){
        char[] encryption = character.toCharArray();

        for (int i = 0; i < encryption.length; i++) {

            char letter = encryption[i];
            if(Character.isLetter(letter)){
                letter = (char) (letter + shift);
                if (letter > 'z') {
                    letter = (char) (letter - 26);
                } else if (letter < 'a') {
                    letter = (char) (letter + 26);
                }
                encryption[i] = letter;
            }
        }
        return new String(encryption);
    }
}
