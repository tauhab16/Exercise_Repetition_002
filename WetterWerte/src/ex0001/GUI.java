package ex0001;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class GUI extends javax.swing.JFrame {

    private WetterModel inv = new WetterModel();

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEingabe = new javax.swing.JPanel();
        btEinfuegen = new javax.swing.JButton();
        sliderLuft = new javax.swing.JSlider();
        sliderTemp = new javax.swing.JSlider();
        lbT = new javax.swing.JLabel();
        lbL = new javax.swing.JLabel();
        pAnzeige = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        menu = new javax.swing.JMenuBar();
        menuD = new javax.swing.JMenu();
        menuS = new javax.swing.JMenuItem();
        menuL = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelEingabe.setBorder(javax.swing.BorderFactory.createTitledBorder("Eingabe"));

        btEinfuegen.setText("Einfügen");
        btEinfuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEInfuegen(evt);
            }
        });

        sliderLuft.setMajorTickSpacing(20);
        sliderLuft.setMinorTickSpacing(10);
        sliderLuft.setPaintLabels(true);
        sliderLuft.setPaintTicks(true);
        sliderLuft.setValue(0);
        sliderLuft.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onLuftChange(evt);
            }
        });

        sliderTemp.setMajorTickSpacing(10);
        sliderTemp.setMaximum(40);
        sliderTemp.setMinimum(-20);
        sliderTemp.setMinorTickSpacing(5);
        sliderTemp.setPaintLabels(true);
        sliderTemp.setPaintTicks(true);
        sliderTemp.setValue(0);
        sliderTemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onTempChange(evt);
            }
        });

        lbT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbT.setText("Temperatur :");

        lbL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbL.setText("Luftfeuchtigkeit :");

        javax.swing.GroupLayout panelEingabeLayout = new javax.swing.GroupLayout(panelEingabe);
        panelEingabe.setLayout(panelEingabeLayout);
        panelEingabeLayout.setHorizontalGroup(
            panelEingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btEinfuegen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sliderLuft, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(sliderTemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEingabeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbT)
                    .addComponent(lbL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEingabeLayout.setVerticalGroup(
            panelEingabeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEingabeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderLuft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEinfuegen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelEingabe);

        pAnzeige.setBorder(javax.swing.BorderFactory.createTitledBorder("Anzeige"));

        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout pAnzeigeLayout = new javax.swing.GroupLayout(pAnzeige);
        pAnzeige.setLayout(pAnzeigeLayout);
        pAnzeigeLayout.setHorizontalGroup(
            pAnzeigeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        pAnzeigeLayout.setVerticalGroup(
            pAnzeigeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAnzeigeLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(pAnzeige);

        menuD.setText("Datei");

        menuS.setText("Speichern");
        menuS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSave(evt);
            }
        });
        menuD.add(menuS);

        menuL.setText("Laden");
        menuL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoad(evt);
            }
        });
        menuD.add(menuL);

        menuE.setText("Exit");
        menuE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExit(evt);
            }
        });
        menuD.add(menuE);

        menu.add(menuD);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onExit(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onExit
    {//GEN-HEADEREND:event_onExit
        dispose();
    }//GEN-LAST:event_onExit

    private void onEInfuegen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onEInfuegen
    {//GEN-HEADEREND:event_onEInfuegen
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM - HH:mm:ss");
        String format = ldt.format(dtf);
        int grad = sliderTemp.getValue();
        int prozent = sliderLuft.getValue();
        try {
            WetterWert w = new WetterWert(grad, prozent, format);
            inv.einfuegen(w);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, ""
                    + "Fehler beim Speichern der Datei", ERROR_MESSAGE);
        }
        list.setListData(inv.getInhalt());
    }//GEN-LAST:event_onEInfuegen

    private void onTempChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onTempChange
    {//GEN-HEADEREND:event_onTempChange
        int temperatur = sliderTemp.getValue();
        lbT.setText("Temperatur : " + temperatur + " °C");
    }//GEN-LAST:event_onTempChange

    private void onLuftChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onLuftChange
    {//GEN-HEADEREND:event_onLuftChange
        int luft = sliderLuft.getValue();
        lbL.setText("Luftfeuchtigkeit : " + luft + " %");
    }//GEN-LAST:event_onLuftChange

    private void onSave(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onSave
    {//GEN-HEADEREND:event_onSave
        JFileChooser jfilechooser = new JFileChooser();
        int ok = jfilechooser.showSaveDialog(this);
        if (ok == APPROVE_OPTION) {
            File sel = jfilechooser.getSelectedFile();
            try {
                inv.speichern(sel);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_onSave

    private void onLoad(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLoad
    {//GEN-HEADEREND:event_onLoad
        JFileChooser jfilechooser = new JFileChooser();
        int checker = jfilechooser.showOpenDialog(this);
        if (checker == APPROVE_OPTION) {
            File fl = jfilechooser.getSelectedFile();
            try {
                inv.laden(fl);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex, ""
                        + "Fehler beim Laden der Datei", ERROR_MESSAGE);
            }
        } else {
             System.out.print("Dei File wurde nicht gefunden");
        }
        list.setListData(inv.getInhalt());
    }//GEN-LAST:event_onLoad

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEinfuegen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbL;
    private javax.swing.JLabel lbT;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuD;
    private javax.swing.JMenuItem menuE;
    private javax.swing.JMenuItem menuL;
    private javax.swing.JMenuItem menuS;
    private javax.swing.JPanel pAnzeige;
    private javax.swing.JPanel panelEingabe;
    private javax.swing.JSlider sliderLuft;
    private javax.swing.JSlider sliderTemp;
    // End of variables declaration//GEN-END:variables
}
