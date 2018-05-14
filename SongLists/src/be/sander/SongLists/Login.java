package be.sander.SongLists;

import java.awt.EventQueue;

import java.sql.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Login {
	
	private JFrame frame;
	private JTextField txtAlbum;
	private JTextField txtSong;
	private JTextField txtTime;
	private JTextField txtGenre;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField d;
	private JTable table;

	Connection connection=null;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		//connection=SqliteConnection.dbConnector();
		SqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAlbum = new JTextField();
		txtAlbum.setForeground(Color.BLACK);
		txtAlbum.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAlbum.setEditable(false);
		txtAlbum.setText("Album");
		txtAlbum.setBounds(10, 40, 67, 25);
		frame.getContentPane().add(txtAlbum);
		txtAlbum.setColumns(10);
		txtAlbum.setBorder(null);
		
		txtSong = new JTextField();
		txtSong.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSong.setText("Song");
		txtSong.setEditable(false);
		txtSong.setBounds(10, 80, 67, 25);
		frame.getContentPane().add(txtSong);
		txtSong.setColumns(10);
		txtSong.setBorder(null);
		
		txtTime = new JTextField();
		txtTime.setText("Time");
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTime.setEditable(false);
		txtTime.setBounds(10, 120, 67, 25);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		txtTime.setBorder(null);
		
		txtGenre = new JTextField();
		txtGenre.setEditable(false);
		txtGenre.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtGenre.setText("Genre");
		txtGenre.setBounds(10, 160, 67, 25);
		frame.getContentPane().add(txtGenre);
		txtGenre.setColumns(10);
		txtGenre.setBorder(null);
		
		a  = new JTextField();
		a.setBounds(87, 40, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		
		b = new JTextField();
		b.setBounds(87, 80, 86, 20);
		frame.getContentPane().add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(87, 120, 86, 20);
		frame.getContentPane().add(c);
		c.setColumns(10);
		
		d = new JTextField();
		d.setBounds(87, 160, 86, 20);
		frame.getContentPane().add(d);
		d.setColumns(10);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				collectDataFromForm();
			}
		});
		btnApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnApply.setBounds(84, 214, 89, 23);
		frame.getContentPane().add(btnApply);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 80, 252, 157);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLoadTable = new JButton("Load Song Data");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLoadTable.setBounds(227, 28, 250, 23);
		frame.getContentPane().add(btnLoadTable);
		frame.setVisible(true);
	}

	protected void collectDataFromForm() {
		// TODO Auto-generated method stub
		System.out.println(a.getText());
		System.out.println(b.getText());
		System.out.println(c.getText());
		System.out.println(d.getText());

		conn.InsertSong(a.getText());
		conn.InsertSong(b.getText());
		conn.InsertSong(c.getText());
		conn.InsertSong(d.getText());

	}
}
