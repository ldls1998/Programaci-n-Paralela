/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pClases;

/**
 *
 * @author Vlik35
 */
public class Factura {
    
    private int nFactura;
    private String fecha;
    private String vendedor;
    private double monto;
    
    //Medoto constructor

    public Factura(int nFactura, String fecha, String vendedor, double monto) {
        this.nFactura = nFactura;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.monto = monto;
    }
    
    //Metodos set
    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    //Metodos get

    public int getnFactura() {
        return nFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVendedor() {
        return vendedor;
    }

    public double getMonto() {
        return monto;
    }
    
    /*
    try {
        habilitaCajas(false);
        btnRegistrar.setVisible(true);
        btnGrabarIngreso.setVisible(false);
        
        Factura fact = new Factura(getNumFact(), getFecha(), getVendedor(), getMonto());
    
        f.agregar(fact);
        listar();
        JOptionPane.showMessageDialog(null, "Factura ingresada correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE):
    } catch(Exception ex) {
        JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos", JOptionPane.ERROR_MESSAGE)
        num--;
    }
    */
    
}
