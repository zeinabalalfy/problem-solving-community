/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.view;

/**
 *
 * @author 3m
 */
public class View {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FrameProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
        new FrameProfile().setVisible(true);
    });
        
        
    }
}
