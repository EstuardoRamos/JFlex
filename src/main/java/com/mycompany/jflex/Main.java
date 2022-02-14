/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jflex;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Estuardo Ramos
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    CounterLexer lexer;
    public Main() {
        initComponents();
         setLocationRelativeTo(null);
        
        txtArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = e.getDot();
                try {
                    int fila = txtArea.getLineOfOffset(pos) + 1;
                    int col = pos - txtArea.getLineStartOffset(fila - 1) + 1;
                    filaLabel.setText("Fila: " + fila);
                    columLabel.setText("Columna: " + col);
                } catch (BadLocationException exc) {
                    System.out.println(exc);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        unaVocal = new javax.swing.JLabel();
        analizar = new javax.swing.JButton();
        dosVocal = new javax.swing.JLabel();
        tresVocal = new javax.swing.JLabel();
        cuatroVocal = new javax.swing.JLabel();
        cincoVocal = new javax.swing.JLabel();
        filaLabel = new javax.swing.JLabel();
        columLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        unaVocal.setText("Cant. Palabras con 1 vocal:");

        analizar.setText("Analizar");
        analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarActionPerformed(evt);
            }
        });

        dosVocal.setText("Cant. Palabras con 2 vocal:");

        tresVocal.setText("Cant. Palabras con 3 vocal:");

        cuatroVocal.setText("Cant. Palabras con 4 vocal:");

        cincoVocal.setText("Cant. Palabras con 5 vocal:");

        filaLabel.setText("Fila:");

        columLabel.setText("Columna:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cincoVocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuatroVocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tresVocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dosVocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unaVocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(analizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(columLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(filaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analizar)
                    .addComponent(filaLabel))
                .addGap(18, 18, 18)
                .addComponent(columLabel)
                .addGap(3, 3, 3)
                .addComponent(unaVocal)
                .addGap(18, 18, 18)
                .addComponent(dosVocal)
                .addGap(18, 18, 18)
                .addComponent(tresVocal)
                .addGap(18, 18, 18)
                .addComponent(cuatroVocal)
                .addGap(18, 18, 18)
                .addComponent(cincoVocal)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarActionPerformed
        Reader reader = new StringReader(txtArea.getText());
        System.out.println("hola");
         lexer = new CounterLexer(reader);
        try {
            int output = lexer.yylex();
            while (output != CounterLexer.YYEOF) {
                lexer.yylex();
            }
            
            unaVocal.setText("Cant. Palabras con 1 vocal:" + lexer.getV1());
            dosVocal.setText("Cant. Palabras con 2 vocal:" + lexer.getV2());
            tresVocal.setText("Cant. Palabras con 3 vocal:" + lexer.getV3());
            cuatroVocal.setText("Cant. Palabras con 4 vocal:" + lexer.getV4());
            cincoVocal.setText("Cant. Palabras con 5 vocal:" + lexer.getV5());
            
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

        /*unaVocal.setText("Cant. Palabras con 1 vocal: " + palabras[0] + "\n");
        dosVocal.setText("Cant. Palabras con 2 vocal: " + palabras[1] + "\n");
        tresVocal.setText("Cant. Palabras con 3 vocal: " + palabras[2] + "\n");
        cuatroVocal.setText("Cant. Palabras con 4 vocal: " + palabras[3] + "\n");
        cincoVocal.setText("Cant. Palabras con 5 vocal:: " + palabras[4] + "\n");*/
        
        
    }//GEN-LAST:event_analizarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analizar;
    private javax.swing.JLabel cincoVocal;
    private javax.swing.JLabel columLabel;
    private javax.swing.JLabel cuatroVocal;
    private javax.swing.JLabel dosVocal;
    private javax.swing.JLabel filaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tresVocal;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel unaVocal;
    // End of variables declaration//GEN-END:variables
}
