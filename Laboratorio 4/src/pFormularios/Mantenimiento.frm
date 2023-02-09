 package pFormularios;
          import java.util.GregorianCalendar;
  import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloFacturas;
import pClases.Factura;
      public class frmVenta extends javax.swing.JFrame {
   ArregloFacturas f=new ArregloFacturas();
 int num=0;
   public frmVenta() {
 initComponents();
DefinirAnchos();
  asignaFecha();
  habilitaCajas(false);
btnGrabarIngreso.setVisible(false);
  btnGrabarModificado.setVisible(false);
 }
