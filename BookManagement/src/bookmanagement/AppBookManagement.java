/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookmanagement;

import bookmanagement.models.Menu;
import static bookmanagement.models.Menu.menuOption;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class AppBookManagement {

    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        menuOption(scan);
    }
}
