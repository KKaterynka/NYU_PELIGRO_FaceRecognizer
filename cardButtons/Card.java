/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.recognitionApp.cardButtons;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.JLabel;


public class Card extends javax.swing.JPanel {

    private Color color1;
    private Color color2;
    private JLabel title;
    private JLabel cardIcon;
    private JLabel cardDesciption;
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }
    
    public void Card(Color color1, Color color2, JLabel cardDesciption, JLabel cardIcon, JLabel title){
        this.color1 = color1;
        this.color2 = color2;
        this.cardDesciption = cardDesciption;
        this.cardIcon = cardIcon;
        this.title = title;
    }
    
    public void setColors(Color color1, Color color2){
        this.color1 = color1;
        this.color2 = color2;
        repaint();
    }
    
    public void setTitle(String cardTitle){
        this.cardTitle.setText(cardTitle);
    }
    
    public void setDescription(String cardDescription){
        this.cardDescription.setText(cardDescription);
    }
    
    public void setIcon(Icon icon){
        this.iconCard.setIcon(icon);
    }
    
   
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0,0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-20, getHeight()/2+20, getHeight(), getHeight());
        
        super.paintComponent(grphcs);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconCard = new javax.swing.JLabel();
        cardTitle = new javax.swing.JLabel();
        cardDescription = new javax.swing.JLabel();

        iconCard.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\icons_user.png")); // NOI18N

        cardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTitle.setForeground(new java.awt.Color(255, 255, 255));
        cardTitle.setText("Title");

        cardDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cardDescription.setForeground(new java.awt.Color(255, 255, 255));
        cardDescription.setText("Values");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cardDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iconCard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardDescription;
    private javax.swing.JLabel cardTitle;
    private javax.swing.JLabel iconCard;
    // End of variables declaration//GEN-END:variables
}
