package Views;

import Helpers.Effects;
import Helpers.ValidarInputs;
import Model.Conexion;
import Model.Producto;
import Styles.BtnColorsEntred;
import Styles.BtnColorsExited;
import Styles.CustomUI;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;

public class AreaVentas extends javax.swing.JDialog {

    int cantidad = 0;//manejara la cantidad ingresada
    double subTotal = 0;
    int descuento;

    /*Si la compra es menor a 500 no hay desuento
       Si la compra es mayor a 500 y menor que 1000 el descuento sera del 5%
       Si la compra es mayor a 1000 y menor que 2500 el descuento sera del 10%
       Si la compra es mayor a 2500 del 12%
       
     */
    public AreaVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        estilosCombobox(tipo);
        estilosCombobox(listaProducto);
        PanelLista.setVisible(false);
        setLocationRelativeTo(null);//se centre al principio
        decoracionBotones();
        modeloComboBox(listaProducto);
        ValidarInputs.ingresoSoloNumeros(nProductos);

    }

    private void modeloComboBox(JComboBox j) {
        //modelo de las listas
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(Producto.mostrarProducto());
        j.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelAnimado = new javax.swing.JPanel();
        PanelLista = new javax.swing.JPanel();
        sa1 = new javax.swing.JLabel();
        listaProducto = new javax.swing.JComboBox<>();
        panelCodigo = new javax.swing.JPanel();
        sa = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        nProductos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        alumno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ingresarCarrito = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        generar = new javax.swing.JButton();
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

        panelAnimado.setBackground(new java.awt.Color(30, 30, 30));
        panelAnimado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLista.setBackground(new java.awt.Color(30, 30, 30));
        PanelLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        PanelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sa1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        sa1.setForeground(new java.awt.Color(255, 255, 255));
        sa1.setText("Listado de Productos:");
        PanelLista.add(sa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        tipo.setBackground(new java.awt.Color(51, 51, 51));
        tipo.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        listaProducto.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        listaProducto.setForeground(new java.awt.Color(255, 255, 255));
        listaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busqueda de Producto por codigo", "Busqueda de Producto por lista" }));
        listaProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaProductoItemStateChanged(evt);
            }
        });
        listaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductoActionPerformed(evt);
            }
        });
        PanelLista.add(listaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 250, 30));

        panelAnimado.add(PanelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));

        panelCodigo.setBackground(new java.awt.Color(30, 30, 30));
        panelCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sa.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        sa.setForeground(new java.awt.Color(255, 255, 255));
        sa.setText("Codigo del Producto");
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
        panelCodigo.add(campoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

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
        panelCodigo.add(btnLeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        panelAnimado.add(panelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad a Llevar:");

        campoMarca.setEditable(false);
        campoMarca.setBackground(new java.awt.Color(51, 51, 51));
        campoMarca.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        campoMarca.setForeground(new java.awt.Color(240, 240, 240));
        campoMarca.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMarcaActionPerformed(evt);
            }
        });

        campoPrecio.setEditable(false);
        campoPrecio.setBackground(new java.awt.Color(51, 51, 51));
        campoPrecio.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        campoPrecio.setForeground(new java.awt.Color(240, 240, 240));
        campoPrecio.setText("0");
        campoPrecio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioActionPerformed(evt);
            }
        });

        campoNombre.setEditable(false);
        campoNombre.setBackground(new java.awt.Color(51, 51, 51));
        campoNombre.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(240, 240, 240));
        campoNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNombreFocusGained(evt);
            }
        });
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        nProductos.setEditable(false);
        nProductos.setBackground(new java.awt.Color(51, 51, 51));
        nProductos.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        nProductos.setForeground(new java.awt.Color(240, 240, 240));
        nProductos.setText("0");
        nProductos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalles del Producto");

        alumno.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        alumno.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        ingresarCarrito.setBackground(new java.awt.Color(16, 131, 213));
        ingresarCarrito.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        ingresarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        ingresarCarrito.setText(" Ingresar al Carrito");
        ingresarCarrito.setBorder(null);
        ingresarCarrito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ingresarCarritoMouseMoved(evt);
            }
        });
        ingresarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarCarritoMouseExited(evt);
            }
        });
        ingresarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(alumno))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoNombre)
                                .addComponent(campoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingresarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingresarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

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
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busqueda Por  Codigo  ", "Busqueda Por Lista" }));
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

        generar.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        generar.setText("Generar Factura");
        generar.setToolTipText("Modificar un producto");
        generar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                generarMouseMoved(evt);
            }
        });
        generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generarMouseExited(evt);
            }
        });
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generar)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(panelAnimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generar)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(panelAnimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Area de Ventas");

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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
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

    private void campoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMarcaActionPerformed

    }//GEN-LAST:event_campoMarcaActionPerformed

    private void campoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

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
//para saber si esta vacio
        if (!hayProductosEnStock()) {
            mensajito(null, "No hay productos en stock", "Bodega vacia", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        Producto obtenido = retornaProductos(campoCodigo.getText(), "codigo");
        if (obtenido == null) {

            mensajito(campoCodigo, "Producto con el codigo " + campoCodigo.getText() + " no existe", "Revise bien el codigo", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            camposDesabilitados();//esta fucnion s eejecuta cuando un elemento no este seleccionado
            return;

        } else {
            mensajito(null, "Producto con el codigo " + campoCodigo.getText() + " encontrado", "Producto encontrado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));
            nProductos.setEditable(true);
            campoNombre.setText(obtenido.getNombre());
            campoMarca.setText(obtenido.getMarca());
            campoPrecio.setText(String.format("%.2f", obtenido.getPrecio()));
        }


    }//GEN-LAST:event_btnLeerActionPerformed
    private void estilosCombobox(JComboBox j) {
        CustomUI custom = new CustomUI();
        ComboBoxUI diseño = custom.createUI(j);
        j.setUI(diseño);
    }
    private void exitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseMoved
        exit.setBackground(new Color(200, 57, 43));
        exit.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_exitMouseMoved

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color(255, 51, 0));
        exit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_exitMouseExited
    public boolean validarVacio(JTextField j) {
        if (j.getText().trim().equals("")) {
            return true;
        }

        return false;
    }

    public void camposDesabilitados() {
        nProductos.setEditable(false);
        nProductos.setText("0");
        campoNombre.setText("");
        campoMarca.setText("");
        campoPrecio.setText("0.00");
    }
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed
    int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged
    private Producto retornaProductos(String codigo, String campoBBd) {
        Producto prod = null;//nos retornara los productos
        String sql = "SELECT * FROM productos WHERE " + campoBBd + "=?";

        Connection con = Conexion.getConnection("papeleria");
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, codigo);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String code = (rs.getString("codigo"));
                String name = (rs.getString("nombre"));
                String marca = (rs.getString("marca"));
                double precio = (rs.getDouble("precio"));
                Date fecha = (rs.getDate("fecha_ingreso"));

                prod = new Producto(code, name, marca, precio, fecha);
            }

            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            prod = null;
        }

        return prod;
    }
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemStateChanged

        if (tipo.getSelectedIndex() == 0) {
            PanelLista.setVisible(false);

            panelCodigo.setVisible(true);
        } else if (tipo.getSelectedIndex() == 1) {
            PanelLista.setVisible(true);
            panelCodigo.setVisible(false);

        }

    }//GEN-LAST:event_tipoItemStateChanged
    private boolean hayProductosEnStock() {
        boolean haySotck = false;
        int nProductos = 0;
        try {
            String senten = "SELECT * FROM productos";

            Connection c = Conexion.getConnection("papeleria");
            PreparedStatement preparedStatement = c.prepareStatement(senten);
            ResultSet rs = preparedStatement.executeQuery(senten);

            while (rs.next()) {
                nProductos++;
            }

            if (nProductos > 0) {
                haySotck = true;
            } else {
                haySotck = false;
            }

            c.close();
        } catch (HeadlessException | SQLException x) {
            x.printStackTrace();
            haySotck = false;
        }

        return haySotck;
    }
    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed
    public void decoracionBotones() {
        Effects.colorInicial(generar, BtnColorsEntred.Btnwarning);
        Effects.darHover(generar, BtnColorsEntred.Btnwarning, BtnColorsExited.Btnwarning);

    }
    private void listaProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaProductoItemStateChanged
        if (listaProducto.getSelectedIndex() == 0) {//si no hay nada lo vamos a resetear
            camposDesabilitados();
            return;
        } else {
            Producto productoSeleccionado = (Producto) listaProducto.getSelectedItem();
            nProductos.setEditable(true);
            campoNombre.setText(productoSeleccionado.getNombre());
            campoMarca.setText(productoSeleccionado.getMarca());
            campoPrecio.setText(String.format("%.2f", productoSeleccionado.getPrecio()));
        }
    }//GEN-LAST:event_listaProductoItemStateChanged

    private void listaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaProductoActionPerformed

    private void campoNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreFocusGained

    private void ingresarCarritoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarCarritoMouseMoved
        darHover(ingresarCarrito, new Color(12, 102, 166));
    }//GEN-LAST:event_ingresarCarritoMouseMoved

    private void ingresarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarCarritoMouseExited
        quitarHover(ingresarCarrito, new Color(16, 131, 213));
    }//GEN-LAST:event_ingresarCarritoMouseExited

    private void ingresarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCarritoActionPerformed
        if (campoNombre.getText().equals("")) {
            mensajito(campoNombre, "No hay productos seleccionados", "Sin productos a ingresar", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (nProductos.getText().equals("0")) {
            mensajito(nProductos, "La cantidad no puede ser 0", "Cantidad obligatoria", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (!hayProductosEnStock()) {
            mensajito(null, "No hay productos en stock", "Bodega vacia", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        String mensaje = "";//solo para saber si es uno omas productos

        if (parsearIntTextField(nProductos) == 1) {
            mensaje = "¿Está seguro que quiere agregar 1 " + campoNombre.getText() + " al carrito?";
        } else {
            mensaje = "¿Está seguro que quiere agregar " + parsearIntTextField(nProductos) + " articulos al carrito ?";

        }

        int resp = JOptionPane.showConfirmDialog(null, mensaje, "Peticion para agregar un producto",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagenNice("/Images/Messages/pregunta.png", 40, 40));

        if (resp == 0) {
            mensajito(null, "Producto agregado al carrito", "Producto insertado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));

            cantidad += parsearIntTextField(nProductos);
            subTotal += (cantidad * Double.parseDouble(campoPrecio.getText()));
            camposDesabilitados();
            campoCodigo.setText("");
            listaProducto.setSelectedIndex(0);
        }

        //aca haremos el calculo de cada uno de los elementos
    }//GEN-LAST:event_ingresarCarritoActionPerformed

    private void generarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarMouseMoved

    }//GEN-LAST:event_generarMouseMoved

    private void generarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarMouseExited

    }//GEN-LAST:event_generarMouseExited

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed

        if (cantidad == 0) {
            mensajito(null, "No hay ningun articulo en el carrito", "Carrito vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        int resp = JOptionPane.showConfirmDialog(null, "Presione (Si) para confirmar la compra", "Peticion para generar el Ticket",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagenNice("/Images/Messages/pregunta.png", 40, 40));

        if (resp == 0) {

            //generar los desuentos
            if (subTotal < 500) {
                descuento = 0;
            } else if (subTotal >= 500 && subTotal < 1000) {
                descuento = 5;
            } else if (subTotal >= 1000 && subTotal < 2500) {
                descuento = 10;
            } else if (subTotal >= 2500) {
                descuento = 12;
            }
            //total de la factura
            double total = calcularTotal(subTotal, descuento);

            if (insertarFacturaBBDD(total, subTotal, descuento, cantidad)) {

                
                mensajito(null, "Compra realizada exitosamente", "Ticket generado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));
DetallesFactura detalles = new DetallesFactura(this, true, xx);
            } else {
                mensajito(null, "Factura no se pudo crear", "Ticket no generado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));

            }

        }
    }//GEN-LAST:event_generarActionPerformed

    private boolean insertarFacturaBBDD(double total, double subtotal, int descuento, int cantidad) {

        boolean insertado = false;
        String sql = "INSERT INTO papeleria VALUES(null,?,?,?,CURRENT_DATE(),CURRENT_TIME(),?)";
        Connection c = Conexion.getConnection("papeleria");
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDouble(1, subtotal);
            ps.setInt(2, descuento);
            ps.setDouble(3, total);
            ps.setInt(4, cantidad);
            int resp = ps.executeUpdate();

            if (resp == 1) {
                insertado = true;
            } else {
                insertado = false;
            }

        } catch (SQLException ex) {
            insertado = false;
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return insertado;
    }

    private void darHover(JComponent componente, Color color) {
        componente.setBackground(color);
    }

    private void quitarHover(JComponent componente, Color color) {
        componente.setBackground(color);
    }

    private double calcularTotal(double subtotal, int descuento) {
        return (subtotal * descuento / 100) + subtotal;
    }

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
            java.util.logging.Logger.getLogger(AreaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AreaVentas dialog = new AreaVentas(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelLista;
    private javax.swing.JLabel alumno;
    private javax.swing.JButton btnLeer;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JButton exit;
    private javax.swing.JButton generar;
    private javax.swing.JButton ingresarCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> listaProducto;
    private javax.swing.JTextField nProductos;
    private javax.swing.JPanel panelAnimado;
    private javax.swing.JPanel panelCodigo;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel sa1;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
