/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author taiproduaxe
 */
public class LayLogTime {
    public static String getLogTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");;
        LocalDateTime localTime = LocalDateTime.now();
        return dtf.format(localTime);
    }
}
