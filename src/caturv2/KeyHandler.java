/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caturv2;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author ASUS
 */
public class KeyHandler implements KeyListener{
    
    public boolean upPressed, downPressed, leftPressed, rightPressed, spacePressed;

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        
        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }if (code == KeyEvent.VK_S) {
            downPressed = true;
        }if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }if (code == KeyEvent.VK_SPACE) {
            spacePressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        
        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }if (code == KeyEvent.VK_S) {
            downPressed = false;
        }if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }if (code == KeyEvent.VK_SPACE) {
            spacePressed = false;
        }
    }
    
}

