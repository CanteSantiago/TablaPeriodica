/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfTBP;

/**
 *
 * @author cante
 */
public class LANTANIDOS extends javax.swing.JFrame {

    /**
     * Creates new form LANTANIDOS
     */
    public LANTANIDOS() {
        initComponents();
         this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NDEVARIABLE = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        oxi = new javax.swing.JLabel();
        oxi2 = new javax.swing.JLabel();
        PESO = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CONFIGATOMIC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        NDEVARIABLE.setFont(new java.awt.Font("Tahoma", 0, 73)); // NOI18N
        NDEVARIABLE.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(NDEVARIABLE);
        NDEVARIABLE.setBounds(0, 0, 110, 77);

        numero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numero.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(numero);
        numero.setBounds(134, 0, 55, 29);

        oxi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oxi.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(oxi);
        oxi.setBounds(104, 35, 85, 31);

        oxi2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oxi2.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(oxi2);
        oxi2.setBounds(104, 72, 85, 31);

        PESO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PESO.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(PESO);
        PESO.setBounds(10, 180, 169, 31);

        nombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(nombre);
        nombre.setBounds(10, 222, 179, 29);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 153)));

        CONFIGATOMIC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CONFIGATOMIC.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CONFIGATOMIC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(CONFIGATOMIC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LANTANIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LANTANIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LANTANIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LANTANIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LANTANIDOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONFIGATOMIC;
    private javax.swing.JLabel NDEVARIABLE;
    private javax.swing.JLabel PESO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel oxi;
    private javax.swing.JLabel oxi2;
    // End of variables declaration//GEN-END:variables
public void rellenar(String cadena) {
      nombre.setText(cadena);
      }

    public void rellenar2(String cadena) {
      NDEVARIABLE.setText(cadena);
    }

    public void rellenar3(String cadena) {
      numero.setText(cadena);
    }

    public void rellenar4(String cadena) {
       PESO.setText(cadena);
    }

    public void rellenar5(String cadena) {
      CONFIGATOMIC.setText(cadena);
    }

    public void rellenar6(String cadena) {
       oxi.setText(cadena);
    }

    public void rellenar7(String cadena) {
        oxi2.setText(cadena);
    }
   
}
