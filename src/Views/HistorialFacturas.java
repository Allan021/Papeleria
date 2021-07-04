
package Views;

import Styles.CustomUI;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;


public class HistorialFacturas extends javax.swing.JDialog {

    int xx,xy;

    public HistorialFacturas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        llamarEstilos();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        PanelLista = new javax.swing.JPanel();
        sa1 = new javax.swing.JLabel();
        fechas = new javax.swing.JComboBox<>();
        sa2 = new javax.swing.JLabel();
        Horas = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cantidadDescuento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        cantidadComprada = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        total = new javax.swing.JLabel();
        ocultarFactura = new javax.swing.JPanel();
        panelCodigo = new javax.swing.JPanel();
        sa = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(16, 131, 213));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(30, 30, 30));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Busqueda a realizar:");
        jPanel6.add(jLabel8);

        tipo.setBackground(new java.awt.Color(51, 51, 51));
        tipo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        tipo.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busqueda Por  Codigo  ", "Busqueda Por Fecha" }));
        tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoItemStateChanged(evt);
            }
        });
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        jPanel6.add(tipo);

        PanelLista.setBackground(new java.awt.Color(30, 30, 30));
        PanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda por Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 13), new java.awt.Color(240, 240, 240))); // NOI18N
        PanelLista.setForeground(new java.awt.Color(255, 255, 255));
        PanelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sa1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        sa1.setForeground(new java.awt.Color(255, 255, 255));
        sa1.setText("Fecha Ingresada:");
        PanelLista.add(sa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        tipo.setBackground(new java.awt.Color(51, 51, 51));
        tipo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        fechas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        fechas.setForeground(new java.awt.Color(255, 255, 255));
        fechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busqueda de Producto por codigo", "Busqueda de Producto por lista" }));
        fechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fechasItemStateChanged(evt);
            }
        });
        fechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechasActionPerformed(evt);
            }
        });
        PanelLista.add(fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 30));

        sa2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        sa2.setForeground(new java.awt.Color(255, 255, 255));
        sa2.setText("Hora:");
        PanelLista.add(sa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        tipo.setBackground(new java.awt.Color(51, 51, 51));
        tipo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        Horas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        Horas.setForeground(new java.awt.Color(255, 255, 255));
        Horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busqueda de Producto por codigo", "Busqueda de Producto por lista" }));
        Horas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HorasItemStateChanged(evt);
            }
        });
        Horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasActionPerformed(evt);
            }
        });
        PanelLista.add(Horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 30));

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Detalles de la factura ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 68, -1, -1));

        codigo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        codigo.setForeground(new java.awt.Color(0, 0, 0));
        codigo.setText("jLabel3");
        jPanel3.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 68, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 68, -1, -1));

        fecha.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("jLabel3");
        jPanel3.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 68, 66, -1));

        hora.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        hora.setForeground(new java.awt.Color(0, 0, 0));
        hora.setText("jLabel3");
        jPanel3.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 92, 75, -1));

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Hora:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 92, -1, -1));

        jPanel4.setBackground(new java.awt.Color(240, 240, 240));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descuento:");

        cantidadDescuento.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        cantidadDescuento.setForeground(new java.awt.Color(0, 0, 0));
        cantidadDescuento.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Subtotal:");

        subtotal.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        subtotal.setForeground(new java.awt.Color(0, 0, 0));
        subtotal.setText("jLabel3");

        cantidadComprada.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        cantidadComprada.setForeground(new java.awt.Color(0, 0, 0));
        cantidadComprada.setText("Por la cantidad de () articulos comprados");

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total:");

        descuento.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        descuento.setForeground(new java.awt.Color(0, 0, 0));
        descuento.setText("- 2000");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        total.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cantidadDescuento))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(cantidadComprada)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantidadComprada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cantidadDescuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(jLabel9))
                .addGap(17, 17, 17))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 128, -1, -1));

        ocultarFactura.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout ocultarFacturaLayout = new javax.swing.GroupLayout(ocultarFactura);
        ocultarFactura.setLayout(ocultarFacturaLayout);
        ocultarFacturaLayout.setHorizontalGroup(
            ocultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        ocultarFacturaLayout.setVerticalGroup(
            ocultarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel3.add(ocultarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 300));

        panelCodigo.setBackground(new java.awt.Color(30, 30, 30));
        panelCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sa.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        sa.setForeground(new java.awt.Color(255, 255, 255));
        sa.setText("Codigo de la Factura:");
        panelCodigo.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        campoCodigo.setBackground(new java.awt.Color(51, 51, 51));
        campoCodigo.setColumns(20);
        campoCodigo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        campoCodigo.setForeground(new java.awt.Color(255, 255, 255));
        campoCodigo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });
        panelCodigo.add(campoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, -1));

        btnLeer.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnLeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard/icon.png"))); // NOI18N
        btnLeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLeerMouseEntered(evt);
            }
        });
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        panelCodigo.add(btnLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Historial de Ventas");

        exit.setBackground(new java.awt.Color(255, 51, 0));
        exit.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setBorder(null);
        exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitMouseMoved(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public void llamarEstilos(){
        estilosCombobox(tipo);
        estilosCombobox(fechas);
        estilosCombobox(Horas);
    }
    
    private void fechasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fechasItemStateChanged
       
    }//GEN-LAST:event_fechasItemStateChanged

    private void fechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechasActionPerformed

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed

    }//GEN-LAST:event_campoCodigoActionPerformed

    private void btnLeerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerMouseEntered

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        if (validarVacio(campoCodigo)) {
            mensajito(campoCodigo, "Campo codigo es obligatorio para la busqueda", "Campo codigo sin datos", 3, imagenNice("/Images/Messages/error.png", 40, 40));

            return;
        }
       

    }//GEN-LAST:event_btnLeerActionPerformed
 private void estilosCombobox(JComboBox j) {
        CustomUI custom = new CustomUI();
        ComboBoxUI diseño = custom.createUI(j);
        j.setUI(diseño);
    }
 
 public boolean validarVacio(JTextField j) {
        if (j.getText().trim().equals("")) {
            return true;
        }

        return false;
    }
    private void tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemStateChanged

        if (tipo.getSelectedIndex() == 0) {
            PanelLista.setVisible(false);

            panelCodigo.setVisible(true);
        } else if (tipo.getSelectedIndex() == 1) {
            PanelLista.setVisible(true);
            panelCodigo.setVisible(false);

        }
    }//GEN-LAST:event_tipoItemStateChanged

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void exitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMoved
        exit.setBackground(new Color(200, 57, 43));
        exit.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_exitMouseMoved

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color(255, 51, 0));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      
        this.dispose();
  
    }//GEN-LAST:event_exitActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void HorasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HorasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_HorasItemStateChanged

    private void HorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorasActionPerformed

      private int parsearIntTextField(JTextField j) {
        return Integer.parseInt(j.getText());
    }

    public Icon imagenNice(String path, int ancho, int alto) {
        Icon imagen = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));

        return imagen;
    }

    private void mensajito(JComponent object, String text, String title, int i, Icon icono) {
        JOptionPane.showMessageDialog(object, text, title, i, icono);
    }

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
            java.util.logging.Logger.getLogger(HistorialFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HistorialFacturas dialog = new HistorialFacturas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Horas;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JButton btnLeer;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JLabel cantidadComprada;
    private javax.swing.JLabel cantidadDescuento;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel descuento;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JComboBox<String> fechas;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel ocultarFactura;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel sa1;
    private javax.swing.JLabel sa2;
    private javax.swing.JLabel subtotal;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
