package ru.minusd.gizatullina.lab24;

import javax.swing.*;

public class DocumentFramework extends JFrame {
    private IDocument m_doc;
    private ICreateDocument m_createDoc;
    private JMenuBar m_menuBar;
    private JMenu m_fileMenu;
    private JMenuItem m_newMenuItem;
    private JMenuItem m_openMenuItem;
    private JMenuItem m_saveMenuItem;
    private JMenuItem m_printMenuItem;
    private JMenuItem m_quitMenuItem;

    public DocumentFramework() {
        m_menuBar = new JMenuBar();
        m_fileMenu = new JMenu("File");
        m_newMenuItem = new JMenuItem("New");
        m_openMenuItem = new JMenuItem("Open");
        m_saveMenuItem = new JMenuItem("Save");
        m_printMenuItem = new JMenuItem("Print");
        m_quitMenuItem = new JMenuItem("Exit");

        m_fileMenu.add(m_newMenuItem);
        m_fileMenu.add(m_openMenuItem);
        m_fileMenu.add(m_saveMenuItem);
        m_fileMenu.add(m_printMenuItem);
        m_fileMenu.add(m_quitMenuItem);
        m_menuBar.add(m_fileMenu);
        setJMenuBar(m_menuBar);
    }

    public void SetCreateDoc(ICreateDocument createDoc) {
        m_createDoc = createDoc;
    }

    public void Init() {
        m_newMenuItem.addActionListener(e -> {
            m_doc = m_createDoc.CreateNew();
            m_doc.DoNew();
        });
        m_openMenuItem.addActionListener(e -> {
            m_doc = m_createDoc.CreateOpen();
            m_doc.DoOpen();
        });
        m_saveMenuItem.addActionListener(e -> {
            m_doc.DoSave();
        });
        m_printMenuItem.addActionListener(e -> {
            m_doc.DoPrint();
        });
        m_quitMenuItem.addActionListener(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        DocumentFramework docFramework = new DocumentFramework();
        docFramework.SetCreateDoc(new CreateTextDocument());
        docFramework.Init();
        docFramework.setSize(400, 300);
        docFramework.setVisible(true);
    }
}
