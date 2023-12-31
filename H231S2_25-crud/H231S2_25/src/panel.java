import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class panel extends javax.swing.JFrame {

    /**
     * Creates new form panel
     */
    public panel() {
        initComponents();
        txtid.setEnabled(false);
        setLocationRelativeTo(null);
        limpiar();
        mostrartabla();
    }
    
    //limpiar los datos
    void limpiar(){
        txtid.setText("");
        txtnumeroserie.setText("");
        txtmodelo.setText("");
        txtespecificacionestecnicas.setText("");
        tadescripciones.setText("");
        ftffechacompra.setText("");
        
        //enfocamos que ala hora de limpiar los datos vuelva a numero de serie
        txtnumeroserie.requestFocus();
    }
    
    //mostrar tabla con los datos
    void mostrartabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NUMERO DE SERIE");
        modelo.addColumn("MARCA");
        modelo.addColumn("MODELO");
        modelo.addColumn("ESPECIFICACIONES TECNICAS");
        modelo.addColumn("DESCRIPCIONES");
        modelo.addColumn("ESTADO");
        modelo.addColumn("FECHA COMPRA");
        
        tbregistros.setModel(modelo);
        String datos[]=new String[8];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs =st.executeQuery("SELECT * FROM controlEquipos");
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            datos[7]=rs.getString(8);
            
            modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.out.println("error de listado");
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnumeroserie = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtespecificacionestecnicas = new javax.swing.JTextField();
        btnguardar_deybipayco = new javax.swing.JButton();
        btncancelar_deybipayco = new javax.swing.JButton();
        btneliminar_deybipayco = new javax.swing.JButton();
        btnactualizar_deybipayco = new javax.swing.JButton();
        rbinactivo = new javax.swing.JRadioButton();
        rbactivo = new javax.swing.JRadioButton();
        rbmantenimiento = new javax.swing.JRadioButton();
        ftffechacompra = new javax.swing.JFormattedTextField();
        cbmarca = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadescripciones = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbregistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " COMPUTADORAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Engravers MT", 1, 36))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Engravers MT", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("NUMERO DE SERIE");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("MARCA");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("MODELO");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("ESPECIFICACIONES TECNICAS");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("DESCRIPCIONES");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("ESTADOS");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("FECHA DE COMPRA");

        btnguardar_deybipayco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnguardar_deybipayco.setText("GUARDAR");
        btnguardar_deybipayco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar_deybipaycoActionPerformed(evt);
            }
        });

        btncancelar_deybipayco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncancelar_deybipayco.setText("CANCELAR");
        btncancelar_deybipayco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelar_deybipaycoActionPerformed(evt);
            }
        });

        btneliminar_deybipayco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btneliminar_deybipayco.setText("ELIMINAR");
        btneliminar_deybipayco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminar_deybipaycoActionPerformed(evt);
            }
        });

        btnactualizar_deybipayco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnactualizar_deybipayco.setText("ACTUALIZAR");
        btnactualizar_deybipayco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizar_deybipaycoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbinactivo);
        rbinactivo.setText("INACTIVO");

        buttonGroup1.add(rbactivo);
        rbactivo.setText("ACTIVO");
        rbactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbactivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmantenimiento);
        rbmantenimiento.setText("MANTENIMIENTO");

        ftffechacompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        cbmarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LENOVO", "MAC", "HP", " " }));

        tadescripciones.setColumns(20);
        tadescripciones.setRows(5);
        jScrollPane2.setViewportView(tadescripciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmodelo)
                            .addComponent(txtespecificacionestecnicas)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(313, 313, 313)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid)
                            .addComponent(cbmarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnumeroserie)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftffechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnguardar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btneliminar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbactivo)
                        .addGap(18, 18, 18)
                        .addComponent(rbmantenimiento)
                        .addGap(18, 18, 18)
                        .addComponent(rbinactivo)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumeroserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtespecificacionestecnicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbactivo)
                    .addComponent(rbmantenimiento)
                    .addComponent(rbinactivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ftffechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar_deybipayco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbregistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbregistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbregistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbregistros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbactivoActionPerformed

    private void btncancelar_deybipaycoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar_deybipaycoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btncancelar_deybipaycoActionPerformed

    private void btnguardar_deybipaycoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar_deybipaycoActionPerformed
        // TODO add your handling code here:
        String estado="";
        if(rbactivo.isSelected()){
            estado=rbactivo.getActionCommand();
        }else if(rbmantenimiento.isSelected()){
            estado=rbmantenimiento.getActionCommand();
        }else if(rbinactivo.isSelected()){
            estado=rbinactivo.getActionCommand();
        }
        
        try {
            PreparedStatement ps =cn.prepareStatement("INSERT INTO controlEquipos (Nserie,marca,modelo,Etecnicas,descripcion,estado,fechaCompra) VALUES('"+txtnumeroserie.getText()+"','"+cbmarca.getSelectedItem().toString()+"','"+txtmodelo.getText()+"','"+txtespecificacionestecnicas.getText()+"','"+tadescripciones.getText()+"','"+estado+"','"+ftffechacompra.getText()+"')");
            //ejecutacion
            ps.executeUpdate();
            
            mostrartabla();
            limpiar();
            
            //notificaciones
            JOptionPane.showMessageDialog(null,"registro guardado exitosamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"registro no guardado");
        }
    }//GEN-LAST:event_btnguardar_deybipaycoActionPerformed

    private void tbregistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbregistrosMouseClicked
        // TODO add your handling code here:    
        
        int fila =tbregistros.getSelectedRow();
        txtid.setText(tbregistros.getValueAt(fila, 0).toString());
        txtnumeroserie.setText(tbregistros.getValueAt(fila, 1).toString());
        cbmarca.setSelectedItem(tbregistros.getValueAt(fila, 2).toString());
        txtmodelo.setText(tbregistros.getValueAt(fila, 3).toString());
        txtespecificacionestecnicas.setText(tbregistros.getValueAt(fila, 4).toString());
        tadescripciones.setText(tbregistros.getValueAt(fila, 5).toString());
        String estado = tbregistros.getValueAt(fila, 6).toString();
        ftffechacompra.setText(tbregistros.getValueAt(fila, 7).toString());
        
        if (estado.equals(rbactivo.getActionCommand())) {
            rbactivo.setSelected(true);
        } else if (estado.equals(rbmantenimiento.getActionCommand())) {
            rbmantenimiento.setSelected(true);
        } else if (estado.equals(rbinactivo.getActionCommand())) {
            rbinactivo.setSelected(true);
        }
    }//GEN-LAST:event_tbregistrosMouseClicked

    private void btneliminar_deybipaycoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminar_deybipaycoActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps =cn.prepareStatement("DELETE FROM controlEquipos WHERE id = '"+txtid.getText()+"'");
            ps.executeUpdate();
            
            limpiar();
            mostrartabla();
            JOptionPane.showMessageDialog(null, "dato eliminado correctamente");
            
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "dato no eliminado");
        }
        
    }//GEN-LAST:event_btneliminar_deybipaycoActionPerformed

    private void btnactualizar_deybipaycoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizar_deybipaycoActionPerformed
        // TODO add your handling code here:  
        
         try {
             String estado="";
             if (rbactivo.isSelected()) {
                 estado = rbactivo.getActionCommand();
             } else if (rbmantenimiento.isSelected()) {
                 estado = rbmantenimiento.getActionCommand();
             } else if (rbinactivo.isSelected()) {
                 estado = rbinactivo.getActionCommand();
             }
             
            PreparedStatement ps =cn.prepareStatement("update controlEquipos set Nserie='"+txtnumeroserie.getText()+"',marca='"+cbmarca.getSelectedItem().toString()+"',modelo='"+txtmodelo.getText()+"',Etecnicas='"+txtespecificacionestecnicas.getText()+"',descripcion='"+tadescripciones.getText()+"',estado='"+estado+"',fechaCompra='"+ftffechacompra.getText()+"' where id='"+txtid.getText()+"';"); 
            ps.executeUpdate();
            

            limpiar();
            mostrartabla();
            JOptionPane.showMessageDialog(null, "dato actualizado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "dato no actualizado correctamente");
        }
        
    }//GEN-LAST:event_btnactualizar_deybipaycoActionPerformed

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar_deybipayco;
    private javax.swing.JButton btncancelar_deybipayco;
    private javax.swing.JButton btneliminar_deybipayco;
    private javax.swing.JButton btnguardar_deybipayco;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbmarca;
    private javax.swing.JFormattedTextField ftffechacompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbactivo;
    private javax.swing.JRadioButton rbinactivo;
    private javax.swing.JRadioButton rbmantenimiento;
    private javax.swing.JTextArea tadescripciones;
    private javax.swing.JTable tbregistros;
    private javax.swing.JTextField txtespecificacionestecnicas;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnumeroserie;
    // End of variables declaration//GEN-END:variables
        conexion obj=new conexion();
        Connection cn = obj.conexion();
}
