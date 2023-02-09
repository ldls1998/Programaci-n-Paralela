/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pFormularios;

/**
 *
 * @author Vlik35
 */
public class frmVenta extends javax.swing.JFrame {

    /**
     * Creates new form frmVenta
     */
    public frmVenta() {
        initComponents();
    }

private void btnRegistrarActionPerformed(...) {
 txtNfactura.setText(""+generaNumero());
  asignaFecha();
 txtVendedor.requestFocus();
    habilitaCajas(true);
txtVendedor.setEditable(true);
   txtMonto.setEditable(true);
   txtVendedor.setText("");
  txtMonto.setText("");
   btnRegistrar.setVisible(false);
  btnGrabarIngreso.setVisible(true);
 }

private void btnConsultarActionPerformed(...) {
  try{
limpiaCajas();
  limpiaMatriz();
int buscoFactura=Integer.parseInt(JOptionPane.
  showInputDialog(null,
"Ingrese un numero de Factura:"));
   //objeto fact que busca el numero de factura en el ArrayList f
Factura fact=f.buscar(buscoFactura);
if (fact!=null){
    tFacturas.setValueAt(fact.getNfactura(), 0, 0);
    tFacturas.setValueAt(fact.getfecha(), 0, 1);
  tFacturas.setValueAt(fact.getVendedor(), 0, 2);
     tFacturas.setValueAt(fact.getMonto(), 0, 3);
}else
    JOptionPane.showMessageDialog(null,"Factura NO encontrada",
                     "Confirmacion",JOptionPane.ERROR_MESSAGE);
 } catch(Exception ex){
JOptionPane.showMessageDialog(null,"Error de Entrada de Datos",
      "Confirmacion",JOptionPane.ERROR_MESSAGE);
  }
}

private void btnModificarActionPerformed(...) {
   try{
   limpiaCajas();
  limpiaMatriz();
   btnModificar.setVisible(false);
 btnGrabarModificado.setVisible(true);
  int buscoFactura=Integer.parseInt(JOptionPane.
 showInputDialog(null,"Ingrese un numero de Factura:"));
   //objeto fact que busca el numero de factura en el ArrayList f
   Factura fact=f.buscar(buscoFactura);
  if (fact!=null){
  tFacturas.setValueAt(fact.getNfactura(), 0, 0);
tFacturas.setValueAt(fact.getfecha(), 0, 1);
tFacturas.setValueAt(fact.getVendedor(), 0, 2);
tFacturas.setValueAt(fact.getMonto(), 0, 3);
      txtNfactura.setText(""+fact.getNfactura());
txtFechaVenta.setText(fact.getfecha());
txtVendedor.setText(fact.getVendedor());
txtMonto.setText(""+fact.getMonto());
         habilitaCajas(true);
   txtNfactura.setEditable(false);
   txtFechaVenta.setEditable(false);
}else
    JOptionPane.showMessageDialog(null,"Factura NO encontrada",
                     "Confirmacion",JOptionPane.ERROR_MESSAGE);
}catch(Exception ex){
  JOptionPane.showMessageDialog(null,"Factura NO encontrada",
       "Confirmacion",JOptionPane.ERROR_MESSAGE);
  btnModificar.setVisible(true);
 btnGrabarModificado.setVisible(false);
  }
 }

private void btnGrabarModificadoActionPerformed(...) {
try{
  Factura fact=f.buscar(getNumFact());
  fact.setVendedor(getVendedor());
fact.setMonto(getMonto());
  JOptionPane.showMessageDialog(null,
         "Factura Modificada Correctamente",
             "Confirmacion",JOptionPane.INFORMATION_MESSAGE);
listar();
   }catch(Exception ex){
 JOptionPane.showMessageDialog(null,
  "Ocurrio un error al intentar Grabar",
"Confirmacion",JOptionPane.INFORMATION_MESSAGE);
   }
btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
