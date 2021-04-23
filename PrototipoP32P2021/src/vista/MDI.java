package vista;
import com.formdev.flatlaf.FlatLightLaf;
import dominio.Login;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leelu
 */
public class MDI extends javax.swing.JFrame {
     private MantenimientoTrabajadores formMT;
     private Mantenimiento_VideoJuegos formMVJ;
     private Mantenimiento_Dvd formMDVD;
     private MantenimientoBodega formB;
     private Mantenimiento_Clientes formMC;
        
    /**
     * Creates new form MDI
     */
    public MDI() {
        initComponents();
        String tipo;
        tipo = LOGIN.tip;
        switch(tipo){
            case "0":
                archivos.setVisible(false);
                catalogos.setVisible(false);
                procesos.setVisible(false);
                informes.setVisible(false);
                herramientas.setVisible(false);
                cerrar_sesion.setVisible(true);
                seguridad.setVisible(true);
                break;
            case "1":
                archivos.setVisible(true);
                catalogos.setVisible(true);
                procesos.setVisible(true);
                informes.setVisible(true);
                herramientas.setVisible(true);
                cerrar_sesion.setVisible(true);
                seguridad.setVisible(false);
                break;
            default:
        }
        this.setTitle("Usuario: " + "[" + "Luis Carlos Lee Mejia 9959-19-2356" + "]");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivos = new javax.swing.JMenu();
        catalogos = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        procesos = new javax.swing.JMenu();
        informes = new javax.swing.JMenu();
        herramientas = new javax.swing.JMenu();
        seguridad = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cerrar_sesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        archivos.setText("ARCHIVOS");
        archivos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuBar1.add(archivos);

        catalogos.setText("CATALOGOS");
        catalogos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenuItem2.setText("Mantenimiento Videojuegos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        catalogos.add(jMenuItem2);

        jMenuItem3.setText("Mantenimiento DVD's");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        catalogos.add(jMenuItem3);

        jMenuItem4.setText("Mantenimiento Bodega");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        catalogos.add(jMenuItem4);

        jMenuItem5.setText("Mantenimiento Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        catalogos.add(jMenuItem5);

        jMenuBar1.add(catalogos);

        procesos.setText("PROCESOS");
        procesos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuBar1.add(procesos);

        informes.setText("INFORMES");
        informes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuBar1.add(informes);

        herramientas.setText("HERRAMIENTAS");
        herramientas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuBar1.add(herramientas);

        seguridad.setText("SEGURIDAD");
        seguridad.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jMenu1.setText("CATALOGOS");

        jMenuItem1.setText("Mantenimiento de Trabajadores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        seguridad.add(jMenu1);

        jMenu2.setText("PROCESOS");
        seguridad.add(jMenu2);

        jMenuBar1.add(seguridad);

        cerrar_sesion.setText("CERRAR SESIÓN");
        cerrar_sesion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrar_sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesionMouseClicked
        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_cerrar_sesionMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    formMT = new MantenimientoTrabajadores();
    formMT.setVisible(true);
    jDesktopPane1.add(formMT);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    formMVJ = new Mantenimiento_VideoJuegos();
    formMVJ.setVisible(true);
    jDesktopPane1.add(formMVJ);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    formMDVD = new Mantenimiento_Dvd();
    formMDVD.setVisible(true);
    jDesktopPane1.add(formMDVD);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    formB = new MantenimientoBodega();
    formB.setVisible(true);
    jDesktopPane1.add(formB);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    formMC = new Mantenimiento_Clientes();
    formMC.setVisible(true);
    jDesktopPane1.add(formMC);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivos;
    private javax.swing.JMenu catalogos;
    private javax.swing.JMenu cerrar_sesion;
    private javax.swing.JMenu herramientas;
    private javax.swing.JMenu informes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu procesos;
    private javax.swing.JMenu seguridad;
    // End of variables declaration//GEN-END:variables
}
