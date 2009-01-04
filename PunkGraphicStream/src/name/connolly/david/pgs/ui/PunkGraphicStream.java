/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PunkGraphicStream.java
 *
 * Created on 04-Jan-2009, 15:50:39
 */

package name.connolly.david.pgs.ui;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.apple.eawt.Application;
import com.apple.eawt.ApplicationAdapter;
import com.apple.eawt.ApplicationEvent;

/**
 *
 * @author slarti
 */
public class PunkGraphicStream extends javax.swing.JFrame {
    /** Creates new form PunkGraphicStream */
    public PunkGraphicStream() {
    	final PunkGraphicStream parent = this;
        String lcOSName = System.getProperty("os.name").toLowerCase();
        boolean MAC_OS_X = lcOSName.startsWith("mac os x");

        initComponents();

        if (MAC_OS_X) {
            	Application application = Application.getApplication();
                ApplicationAdapter listener = new ApplicationAdapter() {
                	@Override
            		public void handleAbout(ApplicationEvent event) {
                        event.setHandled(true);
                		new AboutDialog(parent, true).setVisible(true);
            		}

                @Override
                public void handleQuit(ApplicationEvent event) {
                    event.setHandled(true);
                    System.exit(0);
                }

                    
                };
                application.addApplicationListener(listener);

            menuBar.setVisible(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFrameRate = new javax.swing.ButtonGroup();
        jTextFieldSubtitleFile = new javax.swing.JTextField();
        jButtonBrowse = new javax.swing.JButton();
        jRadioButtonFilmNtsc = new javax.swing.JRadioButton();
        jRadioButtonFilm = new javax.swing.JRadioButton();
        jRadioButtonPal = new javax.swing.JRadioButton();
        jRadioButtonNtsc = new javax.swing.JRadioButton();
        jRadioButtonPalHd = new javax.swing.JRadioButton();
        jRadioButtonNtscHd = new javax.swing.JRadioButton();
        jButtonEncode = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelFrameRate = new javax.swing.JLabel();
        jLabelSubtitleFile = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PunkGraphicStream");
        setLocationByPlatform(true);
        setResizable(false);

        jButtonBrowse.setText("Browse...");
        jButtonBrowse.setToolTipText("Select Subtitle File");

        buttonGroupFrameRate.add(jRadioButtonFilmNtsc);
        jRadioButtonFilmNtsc.setText("Film (NTSC) ");
        jRadioButtonFilmNtsc.setToolTipText("24 Frames Per Second");
        jRadioButtonFilmNtsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFilmNtscActionPerformed(evt);
            }
        });

        buttonGroupFrameRate.add(jRadioButtonFilm);
        jRadioButtonFilm.setText("Film");
        jRadioButtonFilm.setToolTipText("23.976 Frames Per Second");
        jRadioButtonFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFilmActionPerformed(evt);
            }
        });

        buttonGroupFrameRate.add(jRadioButtonPal);
        jRadioButtonPal.setText("PAL");
        jRadioButtonPal.setToolTipText("25 Frames Per Second");

        buttonGroupFrameRate.add(jRadioButtonNtsc);
        jRadioButtonNtsc.setText("NTSC");
        jRadioButtonNtsc.setToolTipText("29.97 Frames Per Second");
        jRadioButtonNtsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNtscActionPerformed(evt);
            }
        });

        buttonGroupFrameRate.add(jRadioButtonPalHd);
        jRadioButtonPalHd.setText("PAL HD");
        jRadioButtonPalHd.setToolTipText("50 Frames Per Second");

        buttonGroupFrameRate.add(jRadioButtonNtscHd);
        jRadioButtonNtscHd.setText("NTSC HD");
        jRadioButtonNtscHd.setToolTipText("59.94 Frames Per Second");

        jButtonEncode.setText("Encode");
        jButtonEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncodeActionPerformed(evt);
            }
        });

        jLabelFrameRate.setText("Frame Rate:");

        jLabelSubtitleFile.setText("Subtitle File:");

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldSubtitleFile, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButtonBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jRadioButtonNtsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jRadioButtonNtscHd))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jRadioButtonFilmNtsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jRadioButtonFilm))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jRadioButtonPal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jRadioButtonPalHd)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFrameRate)
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSubtitleFile)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jButtonEncode)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRadioButtonFilm, jRadioButtonFilmNtsc, jRadioButtonNtsc, jRadioButtonNtscHd, jRadioButtonPal, jRadioButtonPalHd});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSubtitleFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSubtitleFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButtonBrowse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelFrameRate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFilmNtsc)
                    .addComponent(jRadioButtonFilm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPalHd)
                    .addComponent(jRadioButtonPal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonNtscHd)
                    .addComponent(jRadioButtonNtsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEncode)
                .addContainerGap())
        );

        jButtonBrowse.getAccessibleContext().setAccessibleName("jButtonBrowse");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jRadioButtonFilmNtscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFilmNtscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFilmNtscActionPerformed

    private void jRadioButtonFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFilmActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRadioButtonFilmActionPerformed

    private void jRadioButtonNtscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNtscActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRadioButtonNtscActionPerformed

    private void jButtonEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncodeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButtonEncodeActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PunkGraphicStream().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.ButtonGroup buttonGroupFrameRate;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonEncode;
    private javax.swing.JLabel jLabelFrameRate;
    private javax.swing.JLabel jLabelSubtitleFile;
    private javax.swing.JRadioButton jRadioButtonFilm;
    private javax.swing.JRadioButton jRadioButtonFilmNtsc;
    private javax.swing.JRadioButton jRadioButtonNtsc;
    private javax.swing.JRadioButton jRadioButtonNtscHd;
    private javax.swing.JRadioButton jRadioButtonPal;
    private javax.swing.JRadioButton jRadioButtonPalHd;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldSubtitleFile;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
