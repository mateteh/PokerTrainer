/*
 * Copyright (c) 2017, Aarón Durán Sánchez,Javier López de Lerma, Mateo García Fuentes, Carlos López Martínez 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package pokertrainer.view;

import java.awt.Color;
import pokertrainer.controller.MainWindowController;

/**
 * Clase de la vista que define la ventana de inicio de la aplicación.
 * @author Javi
 */
public class MainWindow extends javax.swing.JFrame {
    
    private MainWindowController mcntr;

    
    /**
     * Constructor que llama al constructor de la clase padre.
     * @param modal Si la ventana será modal o no.
     * @param mc Controlador de la ventana principal.
     */
    public MainWindow(boolean modal, MainWindowController mc) {
        this.mcntr = mc;
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
    }
    /**
     * Constructor de la clase.
     */
    public MainWindow() {
        this(true, null);
        
        this.pack();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel1 = new pokertrainer.view.TitlePanel();
        jButtonPlay = new javax.swing.JButton();
        jSliderNumberPlayers = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PokerTrainer");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1015, 694));

        titlePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPlay.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPlay.setFont(new java.awt.Font("Brush Script MT", 1, 60)); // NOI18N
        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokertrainer/view/img/button/playIcon.png"))); // NOI18N
        jButtonPlay.setBorder(null);
        jButtonPlay.setBorderPainted(false);
        jButtonPlay.setContentAreaFilled(false);
        jButtonPlay.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pokertrainer/view/img/button/playPressedIcon.png"))); // NOI18N
        jButtonPlay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pokertrainer/view/img/button/playHoverIcon.png"))); // NOI18N
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jSliderNumberPlayers.setBackground(new java.awt.Color(0, 0, 0));
        jSliderNumberPlayers.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jSliderNumberPlayers.setForeground(new java.awt.Color(255, 255, 255));
        jSliderNumberPlayers.setMajorTickSpacing(1);
        jSliderNumberPlayers.setMaximum(9);
        jSliderNumberPlayers.setMinimum(2);
        jSliderNumberPlayers.setMinorTickSpacing(1);
        jSliderNumberPlayers.setPaintLabels(true);
        jSliderNumberPlayers.setPaintTicks(true);
        jSliderNumberPlayers.setSnapToTicks(true);
        jSliderNumberPlayers.setValue(2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokertrainer/view/img/numPlayers.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(titlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jSliderNumberPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jButtonPlay)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(titlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSliderNumberPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addComponent(jButtonPlay)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * Método que inicia la aplicación con el número de jugadores seleccionado al pulsar el botón de inicio .
     * @param evt Evento que provoca la ejecución de este método.
     */
    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        int numPlayers = jSliderNumberPlayers.getValue();
        dispose();
        mcntr.start(numPlayers);
    }//GEN-LAST:event_jButtonPlayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSliderNumberPlayers;
    private pokertrainer.view.TitlePanel titlePanel1;
    // End of variables declaration//GEN-END:variables
}