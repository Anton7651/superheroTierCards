/*
 * Anton dela Cruz
 * wolverinePage.java
 * This GUI form displays data of the Wolverine character
 * January 24, 2019
 */

/**
 *
 * @author andel7651
 */
public class wolverinePage extends javax.swing.JFrame {

    /**
     * Creates new form wolverinePage
     */
    public wolverinePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wolverinePic = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        realName = new javax.swing.JLabel();
        gA = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        strength = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        intelligence = new javax.swing.JLabel();
        durability = new javax.swing.JLabel();
        skill = new javax.swing.JLabel();
        button = new javax.swing.JButton();
        strengthBar = new javax.swing.JProgressBar();
        speedBar = new javax.swing.JProgressBar();
        intelligenceBar = new javax.swing.JProgressBar();
        durabilityBar = new javax.swing.JProgressBar();
        skillBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wolverinePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wolverineCard(4).jpg"))); // NOI18N

        name.setFont(new java.awt.Font("GlassJaw BB", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 153, 0));
        name.setText("Wolverine");

        realName.setText("Real name(s): James Howlett, Logan");

        gA.setText("Group Affiliations: X-Men, the Avengers, X-Force");

        height.setText("Height: 5'3");

        weight.setText("Weight: 300 lbs");

        strength.setText("Strength: 2 / 7");

        speed.setText("Speed: 2 / 7");

        intelligence.setText("Intelligence: 2 / 7");

        durability.setText("Durability: 5 / 7");

        skill.setText("Skill: 6 / 7");

        button.setText("<-- back");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        strengthBar.setForeground(new java.awt.Color(0, 255, 0));
        strengthBar.setValue(30);
        strengthBar.setString("");
        strengthBar.setStringPainted(true);

        speedBar.setForeground(new java.awt.Color(0, 255, 0));
        speedBar.setValue(30);
        speedBar.setString("");
        speedBar.setStringPainted(true);

        intelligenceBar.setForeground(new java.awt.Color(0, 255, 0));
        intelligenceBar.setValue(30);
        intelligenceBar.setString("");
        intelligenceBar.setStringPainted(true);

        durabilityBar.setForeground(new java.awt.Color(0, 255, 0));
        durabilityBar.setValue(72);
        durabilityBar.setString("");
        durabilityBar.setStringPainted(true);

        skillBar.setForeground(new java.awt.Color(0, 255, 0));
        skillBar.setValue(86);
        skillBar.setString("");
        skillBar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wolverinePic, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(strength)
                                            .addComponent(speed)
                                            .addComponent(durability)
                                            .addComponent(skill))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(intelligence)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strengthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speedBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(intelligenceBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(durabilityBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(realName)
                                    .addComponent(weight)
                                    .addComponent(gA)
                                    .addComponent(height))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skillBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(name)
                        .addGap(8, 8, 8)
                        .addComponent(realName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gA)
                        .addGap(13, 13, 13)
                        .addComponent(height)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(strength)
                                    .addComponent(strengthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speed)
                                .addGap(5, 5, 5))
                            .addComponent(speedBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intelligenceBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intelligence))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(durabilityBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durability))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(skillBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skill))
                        .addGap(18, 18, 18)
                        .addComponent(button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(wolverinePic, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // when "<--back" button is clicked, user is taken back to mainscreen
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        this.setVisible(false);
        new mainscreen().setVisible(true);
    }//GEN-LAST:event_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(wolverinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wolverinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wolverinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wolverinePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wolverinePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JLabel durability;
    private javax.swing.JProgressBar durabilityBar;
    private javax.swing.JLabel gA;
    private javax.swing.JLabel height;
    private javax.swing.JLabel intelligence;
    private javax.swing.JProgressBar intelligenceBar;
    private javax.swing.JLabel name;
    private javax.swing.JLabel realName;
    private javax.swing.JLabel skill;
    private javax.swing.JProgressBar skillBar;
    private javax.swing.JLabel speed;
    private javax.swing.JProgressBar speedBar;
    private javax.swing.JLabel strength;
    private javax.swing.JProgressBar strengthBar;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel wolverinePic;
    // End of variables declaration//GEN-END:variables
}
