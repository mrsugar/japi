/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Desktop;
import javax.swing.*;
import javax.swing.table.*;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

// Cho copy clipboard
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 *
 * @author anhtuan
 */

public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new for frmMain
     */
    public frmMain() {
        initComponents();
        
        // Hiện giữa màn hình
        this.setLocationRelativeTo(null);
        
        // Xử lý
        // Nút GET POST
        ButtonGroup method = new ButtonGroup();
        method.add(rdGET);
        method.add(rdPOST);
        rdGET.setSelected(true);

        txtParameter.setVisible(false);
        btnParameterString1.setVisible(false);
        
        ((DefaultTableModel) tblParameter.getModel()).addRow(new Object[]{"", "", true});
        ((DefaultTableModel) tblHeader.getModel()).addRow(new Object[]{"Accept", "text/plain", true});
        
        tblParameter.setCellSelectionEnabled(true);

        txtURL.addItem("http://httpbin.org/get");
        txtURL.addItem("http://httpbin.org/post");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdPOST = new javax.swing.JRadioButton();
        rdGET = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKetqua = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        txtURL = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnParameterString = new javax.swing.JButton();
        btnParameterAdd = new javax.swing.JButton();
        btnParameterDelete = new javax.swing.JButton();
        txtParameter = new javax.swing.JComboBox<>();
        btnParameterString1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParameter = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        btnHeaderAdd = new javax.swing.JButton();
        btnHeaderDelete = new javax.swing.JButton();
        txtHeader = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHeader = new javax.swing.JTable();
        btnHeaderOK = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Đường dẫn URL:");

        jLabel2.setText("Phương thức:");

        rdPOST.setText("POST");

        rdGET.setText("GET");

        txtKetqua.setColumns(20);
        txtKetqua.setLineWrap(true);
        txtKetqua.setRows(5);
        txtKetqua.setToolTipText("");
        jScrollPane2.setViewportView(txtKetqua);

        btnSend.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/send.png"))); // NOI18N
        btnSend.setText("Gửi");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtURL.setEditable(true);
        txtURL.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jToolBar1.setRollover(true);

        jLabel5.setText("Tùy chọn");
        jToolBar1.add(jLabel5);

        btnSave.setText("Xuất ra file");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnCopy.setText("Copy vào clipboard");
        btnCopy.setFocusable(false);
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopy);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jInternalFrame1.setTitle("Tham số của URL");
        jInternalFrame1.setVisible(true);

        btnParameterString.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnParameterString.setText("Thêm từ chuỗi");
        btnParameterString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParameterStringActionPerformed(evt);
            }
        });

        btnParameterAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnParameterAdd.setText("Thêm");
        btnParameterAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParameterAddActionPerformed(evt);
            }
        });

        btnParameterDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnParameterDelete.setText("Xóa");
        btnParameterDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParameterDeleteActionPerformed(evt);
            }
        });

        txtParameter.setEditable(true);

        btnParameterString1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnParameterString1.setText("Thêm");
        btnParameterString1.setToolTipText("");
        btnParameterString1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParameterString1ActionPerformed(evt);
            }
        });

        tblParameter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Giá trị", "Bật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblParameter.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tblParameter.setRowHeight(26);
        tblParameter.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblParameter);
        if (tblParameter.getColumnModel().getColumnCount() > 0) {
            tblParameter.getColumnModel().getColumn(0).setResizable(false);
            tblParameter.getColumnModel().getColumn(1).setResizable(false);
            tblParameter.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(txtParameter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParameterString1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(btnParameterAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParameterDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParameterString, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParameterDelete)
                    .addComponent(btnParameterString)
                    .addComponent(btnParameterAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParameterString1)
                    .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jInternalFrame2.setTitle("Cấu hình Header");
        jInternalFrame2.setVisible(true);

        btnHeaderAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnHeaderAdd.setText("Thêm");
        btnHeaderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeaderAddActionPerformed(evt);
            }
        });

        btnHeaderDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnHeaderDelete.setText("Xóa");
        btnHeaderDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeaderDeleteActionPerformed(evt);
            }
        });

        txtHeader.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accept", "Accept-Charset", "Accept-Encoding", "Authorization", "Cache-Control", "Connection", "Cookie", "Content-Type", "Forwarded", "From", "Host", "If-Match", "If-Modified-Since", "Origin", "Pragma", "Referer", "User-Agent" }));

        tblHeader.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Giá trị", "Bật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHeader.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tblHeader.setRowHeight(26);
        tblHeader.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblHeader);
        if (tblHeader.getColumnModel().getColumnCount() > 0) {
            tblHeader.getColumnModel().getColumn(0).setResizable(false);
            tblHeader.getColumnModel().getColumn(1).setResizable(false);
            tblHeader.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        btnHeaderOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnHeaderOK.setText("Thêm");
        btnHeaderOK.setToolTipText("");
        btnHeaderOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeaderOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(btnHeaderAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHeaderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHeaderOK, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHeaderAdd)
                    .addComponent(btnHeaderDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHeaderOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem2.setText("Hướng dẫn sử dụng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdGET)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdPOST))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtURL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(rdGET)
                            .addComponent(rdPOST)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)))
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParameterAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParameterAddActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) tblParameter.getModel()).addRow(new Object[]{"", "", true});
        tblParameter.requestFocus();
        tblParameter.editCellAt(tblParameter.getRowCount() - 1, 0);
        tblParameter.requestFocus();
    }//GEN-LAST:event_btnParameterAddActionPerformed

    private void btnParameterDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParameterDeleteActionPerformed
        // TODO add your handling code here:
        int[] rows = tblParameter.getSelectedRows();
        if( rows.length == 0 ) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ít nhất 1 hàng để xóa", "Lỗi xảy ra", JOptionPane.WARNING_MESSAGE);
        }else {
            for(int i = 0; i < rows.length; i++)
                ((DefaultTableModel) tblParameter.getModel()).removeRow(rows[i] - i);
        }
    }//GEN-LAST:event_btnParameterDeleteActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        
        // Reset kết quả cho lần chạy mới
        txtKetqua.setText("");
        
        // Xử lý:
        String cURL = "";
        
        if (txtURL.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null,"Vui lòng điền URL để lấy dữ liệu","Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
        }else {
            cURL = txtURL.getSelectedItem().toString();
            Boolean duplicateURL = false;
            for(int i = 0; i < txtURL.getItemCount(); i++)
                if(txtURL.getItemAt(i).equals(cURL))  duplicateURL = true;
            if(duplicateURL != true) txtURL.addItem(cURL);
        }
        
        try {
            URL                 URLStart = new URL("");
            HttpURLConnection   connection = (HttpURLConnection) URLStart.openConnection();
            
            // Lấy parameter từ bảng
            String urlParameters = "";
            for(int i = 0; i < tblParameter.getRowCount(); i++ ){
                if(tblParameter.getValueAt(i, 2).equals(true)){
                    urlParameters = urlParameters + tblParameter.getValueAt(i, 0) + "=" + tblParameter.getValueAt(i, 1) + "&";
                }
            }
            byte[] postData       = urlParameters.getBytes( StandardCharsets.UTF_8 );
            int    postDataLength = postData.length;
            
            if ( rdPOST.isSelected() ){
                URL url = new URL(cURL);
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Length", Integer.toString( postDataLength ));
                connection.setUseCaches(false);
                try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                    wr.writeBytes(urlParameters);
                    wr.flush();
                }
            }else {
                URL url = new URL(cURL + "?" + urlParameters);
                connection = (HttpURLConnection) url.openConnection();
                connection.setDoOutput(true);
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-Length", Integer.toString( postDataLength ));
                connection.setUseCaches(false);
            }
            
            // Lấy header từ bảng
            for(int i = 0; i < tblHeader.getRowCount(); i++ ){
                if(tblHeader.getValueAt(i, 2).equals(true)){
                    connection.setRequestProperty(tblHeader.getValueAt(i, 0).toString(), tblHeader.getValueAt(i, 1).toString());
                }
            }
            
            switch(connection.getResponseCode()){
                case 403:
                    JOptionPane.showMessageDialog(null, "Không được cấp quyền để truy cập\nVui lòng liên hệ với kĩ thuật. Mã lỗi 403", "Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
                    break;
                case 404:
                    JOptionPane.showMessageDialog(null, "Đường dẫn không tồn tại\nVui lòng kiểm tra lại đường dẫn", "Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
                    break;
                case 405:
                    JOptionPane.showMessageDialog(null, "Phương thức không được chấp nhận\nVui lòng chọn chính xác kiểu GET hoặc POST", "Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
                    break;
            }
            
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null)
                      txtKetqua.setText(txtKetqua.getText() + inputLine + "\r\n");
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnParameterStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParameterStringActionPerformed
        // TODO add your handling code here:
        txtParameter.setVisible(true);
        btnParameterString1.setVisible(true);
        txtParameter.grabFocus();
    }//GEN-LAST:event_btnParameterStringActionPerformed

    private void btnParameterString1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParameterString1ActionPerformed
        if (txtParameter.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null,"Vui lòng điền tham số","Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
        }else {
            Boolean duplicateParam = false;
            for(int i = 0; i < txtParameter.getItemCount(); i++)
                if(txtParameter.getItemAt(i).equals(txtParameter.getSelectedItem().toString()))  duplicateParam = true;
            if(duplicateParam != true) txtParameter.addItem(txtParameter.getSelectedItem().toString());
            StringParamtoTable();
        }
    }//GEN-LAST:event_btnParameterString1ActionPerformed

    private void btnHeaderDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeaderDeleteActionPerformed
        int[] rows = tblHeader.getSelectedRows();
        if( rows.length == 0 ) {
            JOptionPane.showMessageDialog(null,"Vui lòng chọn ít nhất 1 hàng để xóa","Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
        }else {
            for(int i = 0; i < rows.length; i++)
                ((DefaultTableModel) tblHeader.getModel()).removeRow(rows[i] - i);
        }
    }//GEN-LAST:event_btnHeaderDeleteActionPerformed

    private void btnHeaderOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeaderOKActionPerformed
        if (txtHeader.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null,"Vui lòng điền tham số","Lỗi xảy ra",JOptionPane.WARNING_MESSAGE);
        }else {
            Boolean duplicateHeader = false;
            for(int i = 0; i < tblHeader.getRowCount(); i++)
                if(tblHeader.getValueAt(i, 0).equals(txtHeader.getSelectedItem().toString())) duplicateHeader = true;
            if(duplicateHeader != true) ((DefaultTableModel) tblHeader.getModel()).addRow(new Object[]{txtHeader.getSelectedItem().toString(), "", true});
        }
    }//GEN-LAST:event_btnHeaderOKActionPerformed

    private void btnHeaderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeaderAddActionPerformed
        ((DefaultTableModel) tblHeader.getModel()).addRow(new Object[]{"", "", true});
        tblHeader.requestFocus();
        tblHeader.editCellAt(tblHeader.getRowCount() - 1, 0);
        tblHeader.requestFocus();
    }//GEN-LAST:event_btnHeaderAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
          File file = fileChooser.getSelectedFile();
          try{
              try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
                  writer.print(txtKetqua.getText());
              }
              JOptionPane.showMessageDialog(null, "Đã lưu thành công", "Kết quả",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {}
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        StringSelection stringSelection = new StringSelection(txtKetqua.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(null, "Đã copy vào clipboard", "Kết quả",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCopyActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            openWebpage(new URL("https://google.com"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void StringParamtoTable(){
        if(txtParameter.getSelectedItem() != null){
            String[] params = txtParameter.getSelectedItem().toString().split("&", -1);
            
            if(params[0].split("=", -1).length == 2){
                for (int i = (tblParameter.getRowCount() - 1); i >= 0; i--)
                    ((DefaultTableModel) tblParameter.getModel()).removeRow(i);
            }

            for (String param : params) {
                String[] parameter = param.split("=", -1);
                if(parameter.length == 2) ((DefaultTableModel) tblParameter.getModel()).addRow(new Object[]{parameter[0], parameter[1], true});
            }
        }
    }
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
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnHeaderAdd;
    private javax.swing.JButton btnHeaderDelete;
    private javax.swing.JButton btnHeaderOK;
    private javax.swing.JButton btnParameterAdd;
    private javax.swing.JButton btnParameterDelete;
    private javax.swing.JButton btnParameterString;
    private javax.swing.JButton btnParameterString1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSend;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rdGET;
    private javax.swing.JRadioButton rdPOST;
    private javax.swing.JTable tblHeader;
    private javax.swing.JTable tblParameter;
    private javax.swing.JComboBox<String> txtHeader;
    private javax.swing.JTextArea txtKetqua;
    private javax.swing.JComboBox<String> txtParameter;
    private javax.swing.JComboBox<String> txtURL;
    // End of variables declaration//GEN-END:variables
    
    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (IOException e) {
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException e) {
        }
    }

}
