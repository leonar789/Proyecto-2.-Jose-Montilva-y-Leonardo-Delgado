/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;


import clases.App;
import clases.Cliente;

import estructuras.ListaDoble;
import estructuras.NodoDoble;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jose Gabriel
 */

//se gestionan los parametros de inicio de simulación
public class Historico extends javax.swing.JPanel {
    
    /**
     * Creates new form Iniciar_Simulacion
     */
    
    
    public Historico() {
        initComponents();
    }
    
    
    
    
    //permite cargar los datos de la tabla desde una lista
    public void cargarTabla(ListaDoble lista){
        
        
        DefaultTableModel modelot=(DefaultTableModel)tablaReservas.getModel();
        for (int i = 0; i < tablaReservas.getRowCount(); i++) {
        modelot.removeRow(i);
        i-=1;
        }
        NodoDoble aux=lista.getFirstNodo();
        String pattern = "###,###,###";
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        myFormatter = new DecimalFormat(pattern,DecimalFormatSymbols.getInstance(Locale.GERMANY));
        while (aux!=null){
            Object[] fila = new Object[9];
            fila[0]=myFormatter.format(((Cliente)aux.get()).getCedula());
            fila[1]=((Cliente)aux.get()).getNombre();
            fila[2]=((Cliente)aux.get()).getApellido();
            fila[3]=((Cliente)aux.get()).getEmail();
            fila[4]=((Cliente)aux.get()).getGenero();
            fila[5]=((Cliente)aux.get()).getHabitacion();
            fila[6]=((Cliente)aux.get()).getCelular();
            fila[7]=((Cliente)aux.get()).getFechaLlegada();
            fila[8]=((Cliente)aux.get()).getFechaSalida();
            aux=aux.nNext();
            modelot.addRow(fila);
        }
        tablaReservas.setModel(modelot);
        tablaReservas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tHab = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        restaurarTabla = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Correo", "Género", "Hab.", "Celular", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReservas);
        if (tablaReservas.getColumnModel().getColumnCount() > 0) {
            tablaReservas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaReservas.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(3).setPreferredWidth(145);
            tablaReservas.getColumnModel().getColumn(4).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(5).setPreferredWidth(30);
            tablaReservas.getColumnModel().getColumn(6).setPreferredWidth(60);
            tablaReservas.getColumnModel().getColumn(7).setPreferredWidth(40);
            tablaReservas.getColumnModel().getColumn(8).setPreferredWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Histórico de Clientes");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Navegación");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Número de Hab.");

        tHab.setBackground(new java.awt.Color(255, 255, 255));
        tHab.setForeground(new java.awt.Color(0, 0, 0));
        tHab.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tHab.setToolTipText("");
        tHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHabActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(tHab, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("Restaurar");

        restaurarTabla.setText("Ver Tabla Completa");
        restaurarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(restaurarTabla)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restaurarTabla)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tHabActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try{
            int nHab=Integer.parseInt(tHab.getText());
            if (nHab<=0){
                JOptionPane.showInternalMessageDialog(null, "Debes ingresar solo números positivos", "Ingreso inválido", JOptionPane.ERROR_MESSAGE);

            }
            else{
                ListaDoble nLista= App.getHistorico(nHab);
                if (nLista==null){
                    JOptionPane.showInternalMessageDialog(null, "Recuerde que el rango de habitaciones va desde 1 hasta 300", "Habitación inexistente", JOptionPane.INFORMATION_MESSAGE);

                }
                else if (nLista.getLen()==0){
                    JOptionPane.showInternalMessageDialog(null, "Aún no hay clientes que ocuparan la habitación "+nHab, "Sin historial", JOptionPane.INFORMATION_MESSAGE);

                }
                else{
                    this.cargarTabla(nLista);
                }
            }
            
            
        } catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Debe ingresar solo números enteros en el recuadro", "Ingreso inválido", JOptionPane.ERROR_MESSAGE);

        }
        
       
        
    }//GEN-LAST:event_buscarActionPerformed

    private void restaurarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarTablaActionPerformed
        this.cargarTabla(App.listaHistorico);
    }//GEN-LAST:event_restaurarTablaActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton restaurarTabla;
    private javax.swing.JTextField tHab;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables
}
