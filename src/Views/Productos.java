/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Helpers.Effects;
import Helpers.ValidarInputs;
import Helpers.Validations;
import Model.Conexion;
import Styles.BtnColorsEntred;
import Styles.BtnColorsExited;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JDialog {

    private PreparedStatement preparedStatement;//consultas preparadas
    DefaultTableModel modelo;
    Object datosProductos[] = new Object[5];
    private Connection con;///ya me canse de estar copiandolo a cada rato jajaj 
    int xx, xy;

    public Productos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        darHover();
        initColors();
        validaciones();
        estilosTablas(tablaProductos);
    }

    public void validaciones() {
        ValidarInputs.soloLetras(campoMarca);
        ValidarInputs.soloLetras(campoNombre);
    }

    public void estilosTablas(JTable tabla) {
        tabla.getTableHeader().setBackground(new Color(0, 123, 200));
        tabla.getTableHeader().setFont(jLabel2.getFont());
        tabla.getTableHeader().setForeground(new Color(250, 250, 250));
        tabla.getTableHeader().setBorder(jPanel3.getBorder());
        tabla.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        tabla.setSelectionBackground(new Color(140, 140, 140));
        tabla.setSelectionForeground(Color.white);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        buscarCodigo = new javax.swing.JButton();
        buscarNombre = new javax.swing.JButton();
        campoCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        BtnCrear = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        BtnUpadte = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

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

        jPanel2.setBackground(new java.awt.Color(52, 52, 52));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        campoNombre.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        campoNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoMarca.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        campoMarca.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));

        buscarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard/icon.png"))); // NOI18N
        buscarCodigo.setToolTipText("Buscar un producto por el codigo");
        buscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCodigoActionPerformed(evt);
            }
        });

        buscarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard/icon.png"))); // NOI18N
        buscarNombre.setToolTipText("Busvar un producto por el nombre");
        buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });

        campoCodigo.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        campoCodigo.setToolTipText("El codigo articulo debe Iniciar con AR");
        campoCodigo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");

        campoPrecio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4)));
        campoPrecio.setForeground(new java.awt.Color(0, 0, 0));
        campoPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campoPrecio.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoCodigo))
                    .addComponent(buscarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6))
                        .addComponent(buscarNombre))
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        BtnCrear.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        BtnCrear.setText("Insertar");
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });
        jPanel4.add(BtnCrear);

        btnLeer.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnLeer.setText("Mostrar Productos");
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
        jPanel4.add(btnLeer);

        BtnUpadte.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        BtnUpadte.setText("Modificar");
        BtnUpadte.setToolTipText("Modificar un producto");
        BtnUpadte.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnUpadteMouseMoved(evt);
            }
        });
        BtnUpadte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnUpadteMouseExited(evt);
            }
        });
        BtnUpadte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpadteActionPerformed(evt);
            }
        });
        jPanel4.add(BtnUpadte);

        btnEliminar.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);

        btnLimpiar.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.setToolTipText("Limpiar los campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);

        jPanel5.setBackground(new java.awt.Color(40, 40, 40));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Lista de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setToolTipText("Vista Previa de los productos en stock");

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        tablaProductos.setBackground(new java.awt.Color(51, 51, 51));
        tablaProductos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Precio", "Fecha de Ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setGridColor(new java.awt.Color(51, 51, 51));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Seccion de Productos");

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed

    }//GEN-LAST:event_campoNombreActionPerformed
    private boolean eliminarProducto(String text) {
        boolean insertado = false;
        String sql = "Delete from productos where codigo =?";

        con = Conexion.getConnection("papeleria");
        try {
            preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, text);

            int resp = preparedStatement.executeUpdate();

            if (resp > 0) {
                insertado = true;
            } else {
                insertado = false;

            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            insertado = false;

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }

        return insertado;

    }

    private void buscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCodigoActionPerformed
        if (validarVacio(campoCodigo)) {
            mensajito(campoCodigo, "Campo codigo es obligatorio para la busqueda", "Campo codigo sin datos", 3, imagenNice("/Images/Messages/error.png", 40, 40));

            return;
        }

        limpiarTabla();
        if (resultados(campoCodigo.getText(), "codigo") < 1) {

            mensajito(campoCodigo, "Producto con el codigo " + campoCodigo.getText() + " no ha sido encontrado", "Revise bien el codigo", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;

        } else {
            mensajito(null, "Producto con el codigo " + campoCodigo.getText() + " encontrado", "Producto encontrado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));

        }

    }//GEN-LAST:event_buscarCodigoActionPerformed

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreActionPerformed
        if (validarVacio(campoNombre)) {
            mensajito(campoNombre, "No podemos encotrar un producto sin nombre", "Campo nombre sin datos", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

       
        
        limpiarTabla();
        if (resultados(campoNombre.getText(), "nombre") < 1) {

            mensajito(null, "Productos(s) con el nombre " + campoNombre.getText() + " no han sido encontrado(s)", "Revise bien el numero de nombre del Producto", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;

        } else {
            mensajito(null, "Productos(s) con el nombre " + campoNombre.getText() + " encontrado(s) !!", "Producto(s) encontrado", 3, imagenNice("/Images/Messages/nice.png", 40, 40));

        }

    }//GEN-LAST:event_buscarNombreActionPerformed

    ///calidar el comienzo del articulo
    private boolean validarComienzo(JTextField j, String texto) {
        if (j.getText().trim().startsWith(texto)) {
            return true;
        } else {
            return false;
        }
    }

    private int resultados(String codigo, String campoBBd) {

        String sql = "SELECT * FROM productos WHERE " + campoBBd + "=?";
        int contador = 0;

        con = Conexion.getConnection("papeleria");
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, codigo);
            ResultSet rs = preparedStatement.executeQuery();
            modelo = (DefaultTableModel) tablaProductos.getModel();

            while (rs.next()) {
               datosProductos[0] = (rs.getString("codigo"));
                datosProductos[1] = (rs.getString("nombre"));
                datosProductos[2] = (rs.getString("marca"));
                datosProductos[3] = (rs.getString("precio"));
                datosProductos[4] = (rs.getDate("fecha_ingreso"));
                modelo.addRow(datosProductos);
                contador++;
            }

            tablaProductos.setModel(modelo);
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            contador = 0;
        }

        return contador;
    }
    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed

        if (validarVacio(campoNombre) && validarVacio(campoMarca) && validarVacio(campoPrecio) && validarVacio(campoCodigo)) {
            mensajito(null, "Todos lo campos estan vacios", "No hay infomracion ", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (validarVacio(campoCodigo)) {
            mensajito(campoCodigo, "Campo codigo sin datos", "El codigo es obligatorio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (!validarComienzo(campoCodigo, "AR")) {
            mensajito(campoCodigo, "El codigo de articulo debe iniciar con 'AR'", "El codigo es invalido", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (validarVacio(campoNombre)) {
            mensajito(campoNombre, "El nombre del Producto es obligatorio", "Campo Nombre vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (validarVacio(campoMarca)) {
            mensajito(campoMarca, "La marca es obligatoria", "Campo marca vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (validarVacio(campoPrecio)) {
            mensajito(campoPrecio, "El precio es obligatorio", "Campo precio vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (campoPrecio.getText().trim().equals("0.00")) {
            mensajito(campoPrecio, "El producto debe tener un precio", "Producto sin precio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (repetido(campoCodigo.getText(), "codigo")) {
            mensajito(campoCodigo, "El producto ya existe en la Base de Datos", "No pueden haber productos repetidos", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        String formValues[] = {campoCodigo.getText().trim(), campoNombre.getText().trim(), campoMarca.getText().trim(), campoPrecio.getText()};

        if (insertarProductos(formValues)) {
            mensajito(null, "Producto insertado correctamente", "Todo salio bien", 2, imagenNice("/Images/Messages/nice.png", 40, 40));
            limpiarTabla();
            BuscarProductos();
            resetear();
        } else {
            mensajito(campoCodigo, "El producto no se pudo insertar", "Hubo un error", 3, imagenNice("/Images/Messages/error.png", 40, 40));

        }
    }//GEN-LAST:event_BtnCrearActionPerformed

    private void btnLeerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeerMouseEntered

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        limpiarTabla();
        if (!BuscarProductos()) {
            mensajito(null, "La base de datos esta apagada o  no hay registros", "No hay registros", 3, imagenNice("/Images/Messages/error.png", 40, 40));
        }
    }//GEN-LAST:event_btnLeerActionPerformed

    private void BtnUpadteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpadteMouseMoved

    }//GEN-LAST:event_BtnUpadteMouseMoved

    private void BtnUpadteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpadteMouseExited

    }//GEN-LAST:event_BtnUpadteMouseExited

    private void BtnUpadteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpadteActionPerformed
        if (validarVacio(campoCodigo) && validarVacio(campoMarca) && validarVacio(campoPrecio) && validarVacio(campoNombre)) {
            mensajito(null, "Todos lo campos estan vacios", "No hay infomracion ", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (validarVacio(campoCodigo)) {
            mensajito(campoCodigo, "No tiene un producto seleccionado", "No hay productos para actualizar", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }


        if (!validarComienzo(campoCodigo, "AR")) {
            mensajito(campoCodigo, "El codigo de articulo debe iniciar con 'AR'", "El codigo es invalido", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (validarVacio(campoNombre)) {
            mensajito(campoNombre, "El nombre del Producto es obligatorio", "Campo Nombre vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (validarVacio(campoMarca)) {
            mensajito(campoMarca, "La marca es obligatoria", "Campo marca vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (validarVacio(campoPrecio)) {
            mensajito(campoPrecio, "El precio es obligatorio", "Campo precio vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        if (campoPrecio.getText().trim().equals("0.00")) {
            mensajito(campoPrecio, "El producto debe tener un precio", "Producto sin precio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
         if (!repetido(campoCodigo.getText(), "codigo")) {
            mensajito(campoCodigo, "El producto ingresado no existe  en la Base de Datos", "No pueden hay productos por eliminar", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }
        
        String formValues[] = { campoNombre.getText().trim(), campoMarca.getText().trim(),campoPrecio.getText().trim()};

        if (actualizar(campoCodigo.getText(), formValues)) {
            mensajito(null, "Producto actualizado correctamente", "Todo salio bien", 2, imagenNice("/Images/Messages/nice.png", 40, 40));
            limpiarTabla();
            BuscarProductos();
            resetear();
        } else {
            mensajito(null, "Hubo un error en la actualizacion del producto", "El codigo articulo no se puede cambiar", 3, imagenNice("/Images/Messages/error.png", 40, 40));

        }
    }//GEN-LAST:event_BtnUpadteActionPerformed

    private boolean actualizar(String text, String formaValues[]) {
        boolean insertado = false;
        String sql = "Update productos set nombre=?,marca=?,precio=? where codigo =?";
        con = Conexion.getConnection("papeleria");
        try {
            preparedStatement = con.prepareStatement(sql);
            for (int i = 0; i < formaValues.length-1; i++) {
                preparedStatement.setString(i + 1, formaValues[i]);

            }
            preparedStatement.setDouble(3, Double.parseDouble(formaValues[2]));
            preparedStatement.setString(4, text);

            int resp = preparedStatement.executeUpdate();

            if (resp > 0) {
                insertado = true;
            } else {
                insertado = false;

            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            insertado = false;

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }

        return insertado;
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (validarVacio(campoCodigo)) {
            mensajito(campoCodigo, "El codigo es obligatorio para la eliminacion", "Campo coidgo vacio", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        if (!repetido(campoCodigo.getText(), "codigo")) {
            mensajito(campoCodigo, "El producto ingresado no existe  en la Base de Datos", "No pueden hay productos por eliminar", 3, imagenNice("/Images/Messages/error.png", 40, 40));
            return;
        }

        int resp = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar al producto con el codigo " + campoCodigo.getText() + " ?", "Peticion de eliminacion de cliente",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagenNice("/Images/Messages/triste.png", 40, 40));

        if (resp == 0) {

            if (eliminarProducto(campoCodigo.getText())) {
                mensajito(null, "Producto eliminado exitosamente", "Operacion realizada con exito", 3, imagenNice("/Images/Messages/nice.png", 40, 40));
                limpiarTabla();
                BuscarProductos();

                resetear();
            } else {
                mensajito(null, "El producto no se pudo eliminar ", "Hubo un error en la eliminacion del producto", 3, imagenNice("/Images/Messages/error.png", 40, 40));

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private boolean BuscarProductos() {
        boolean encontrado = false;
        try {
            String senten = "SELECT * FROM productos";

            Connection c = Conexion.getConnection("papeleria");
            preparedStatement = c.prepareStatement(senten);
            ResultSet rs = preparedStatement.executeQuery(senten);
            modelo = (DefaultTableModel) tablaProductos.getModel();

            while (rs.next()) {

                datosProductos[0] = (rs.getString("codigo"));
                datosProductos[1] = (rs.getString("nombre"));
                datosProductos[2] = (rs.getString("marca"));
                datosProductos[3] = (rs.getString("precio"));
                datosProductos[4] = (rs.getDate("fecha_ingreso"));
                modelo.addRow(datosProductos);
                encontrado = true;
            }

            tablaProductos.setModel(modelo);
            c.close();
        } catch (HeadlessException | SQLException x) {
            x.printStackTrace();
            encontrado = false;
        }

        return encontrado;
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        resetear();


    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void resetear() {
        campoNombre.setText("");
        campoMarca.setText("");
        campoCodigo.setText("");
        campoPrecio.setText("0.00");
    }

    public boolean validarVacio(JTextField j) {
        if (j.getText().trim().equals("")) {
            return true;
        }

        return false;
    }

    public Icon imagenNice(String path, int ancho, int alto) {
        Icon imagen = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().
                getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));

        return imagen;
    }

    public void limpiarTabla() {
        int fila = tablaProductos.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

    private void mensajito(JComponent object, String text, String title, int i, Icon icono) {
        JOptionPane.showMessageDialog(object, text, title, i, icono);
    }

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int fila = tablaProductos.getSelectedRow();
        campoCodigo.setText(tablaProductos.getValueAt(fila, 0).toString());
        campoNombre.setText(tablaProductos.getValueAt(fila, 1).toString());
        campoMarca.setText(tablaProductos.getValueAt(fila, 2).toString());
        campoPrecio.setText(tablaProductos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

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

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged
    private void initColors() {
        Effects.colorInicial(BtnCrear, BtnColorsEntred.BtnmainColor);
        Effects.colorInicial(btnLeer, BtnColorsEntred.Btnsecondary);
        Effects.colorInicial(btnEliminar, BtnColorsExited.Btndanger);
        Effects.colorInicial(BtnUpadte, BtnColorsEntred.Btnwarning);
        Effects.colorInicial(btnLimpiar, BtnColorsExited.Btninfo);

    }

    private void darHover() {

        Effects.darHover(BtnCrear, BtnColorsEntred.BtnmainColor, BtnColorsExited.BtnmainColor);
        Effects.darHover(btnLeer, BtnColorsEntred.Btnsecondary, BtnColorsExited.Btnsecondary);
        Effects.darHover(btnEliminar, BtnColorsEntred.Btndanger, BtnColorsExited.Btndanger);
        Effects.darHover(BtnUpadte, BtnColorsEntred.Btnwarning, BtnColorsExited.Btnwarning);
        Effects.darHover(btnLimpiar, BtnColorsEntred.Btninfo, BtnColorsExited.Btninfo);

    }

   

    private boolean repetido(String codigo, String campo) {
        boolean repetido = false;
        String sql = "SELECT * FROM productos WHERE "+campo+" = '"+codigo+"';";
        int contador = 0;
        con = Conexion.getConnection("papeleria");
        
        try {
            preparedStatement = con.prepareStatement(sql);
     
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                contador++;
            }

            if (contador > 0) {
                repetido = true;
            } else {
                repetido = false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            repetido = false;
        }

        return repetido;

    }
    private boolean insertarProductos(String formValues[]) {
        boolean insertado = false;
        String sql = "Insert into productos values(?,?,?,?,now())";

        con = Conexion.getConnection("papeleria");
        try {
            preparedStatement = con.prepareStatement(sql);
            for (int i = 0; i < formValues.length-1; i++) {
                preparedStatement.setString(i + 1, formValues[i]);

            }
            preparedStatement.setDouble(4, Double.parseDouble(formValues[3]));
            int resp = preparedStatement.executeUpdate();

            if (resp == 1) {
                insertado = true;
            } else {
                insertado = false;

            }
            preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            insertado = false;

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }

        return insertado;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnUpadte;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton buscarCodigo;
    private javax.swing.JButton buscarNombre;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JFormattedTextField campoPrecio;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
