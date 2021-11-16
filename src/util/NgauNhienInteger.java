/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author taiproduaxe
 */
public class NgauNhienInteger {
    public static int getSoNgauNhien(){
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }
}
