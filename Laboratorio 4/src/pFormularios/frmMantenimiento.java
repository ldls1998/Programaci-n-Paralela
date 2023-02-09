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
  
     //Metodo que define el ancho de las columnas de la tabla
         void DefinirAnchos(){
             TableColumn columna;
             columna=tFacturas.getColumnModel().getColumn(0);
             columna.setPreferredWidth(30);
             columna=tFacturas.getColumnModel().getColumn(1);
             columna.setPreferredWidth(50);
             columna=tFacturas.getColumnModel().getColumn(2);
                columna.setPreferredWidth(150);
  columna=tFacturas.getColumnModel().getColumn(3);
 columna.setPreferredWidth(70);
tFacturas.getTableHeader().setReorderingAllowed(false);
tFacturas.getTableHeader().setResizingAllowed(false);
   }
   //Metodo que bloquea y desbloquea los controles JTextField
      
   CAP. 11: Vector de objetos y arraylist
425
    void habilitaCajas(boolean opcion){
    txtNfactura.setEditable(opcion);
    txtVendedor.setEditable(opcion);
       txtMonto.setEditable(opcion);
  txtFechaVenta.setEditable(opcion);
  }
   //Metodo que limpia los controles JTextField
 void limpiaCajas(){
  txtNfactura.setText("");
txtVendedor.setText("");
  txtFechaVenta.setText("");
      txtMonto.setText("");
}
    //Metodo que limpia el control tFacturas
void limpiaMatriz(){
  for(int i=0;i<10;i++){
 tFacturas.setValueAt("", i, 0);
  tFacturas.setValueAt("", i, 1);
tFacturas.setValueAt("", i, 2);
           tFacturas.setValueAt("", i, 3);
    }
}
     //Metodo que genera el numero de factura
public int generaNumero(){
num++;
   return num; }
     //Metodos que capturan los valores ingresados por el usuario
 public int getNumFact(){
    return Integer.parseInt(txtNfactura.getText());
  }
  public String getFecha(){
    return txtFechaVenta.getText();
  }
  public String getVendedor(){
    return txtVendedor.getText();
   }
 public double getMonto(){
return Double.parseDouble(txtMonto.getText());
  }
   //Metodo que lista las facturas en el control tFacturas
void listar(){
   if (f.getTamaño()>0){
    for(int i=0;i<f.getTamaño();i++){
  Factura fact=f.obtener(i);
 tFacturas.setValueAt(fact.getNfactura(),i,0);
  tFacturas.setValueAt(fact.getfecha(), i, 1);
tFacturas.setValueAt(fact.getVendedor(), i, 2);
           tFacturas.setValueAt(fact.getMonto(), i, 3);
    }
} else {
   JOptionPane.showMessageDialog(this,
  "No hay facturas registradas",
 "Confirmacion",JOptionPane.INFORMATION_MESSAGE);
 limpiaMatriz();
  } }
       
  426
 DESARROLLO DE APLICACIONES CON JAVA USANDO JCREATOR, JDEVELOPER Y NETBEANS
       //Metodo que muestra la fecha actual en el control txtFechaVenta
  void asignaFecha(){
    GregorianCalendar cal=new GregorianCalendar();
   txtFechaVenta.setText(cal.get(cal.DAY_OF_MONTH)+"/"
  +cal.MONTH+"/"
  +cal.get(cal.YEAR));
   }
   
