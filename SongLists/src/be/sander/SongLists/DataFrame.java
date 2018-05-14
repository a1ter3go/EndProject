package be.sander.SongLists;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.Connection;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionEvent;

public class DataFrame {

	
	private JFrame frmMainFrame;
	private JTextField txtMainFrame_2;
	private JTable table;
	private JTextField txtAlbum;
	private JTextField txtSong;
	private JTextField txtTime;
	private JTextField txtGenre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataFrame window = new DataFrame();
					window.frmMainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainFrame = new JFrame();
		frmMainFrame.setTitle("DataFrame");
		frmMainFrame.setBounds(100, 100, 880, 630);
		frmMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainFrame.getContentPane().setLayout(null);
		
		txtMainFrame_2 = new JTextField();
		txtMainFrame_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainFrame_2.setFont(new Font("Verdana", Font.BOLD, 22));
		txtMainFrame_2.setBackground(Color.BLUE);
		txtMainFrame_2.setText("MAIN FRAME");
		txtMainFrame_2.setBounds(0, 0, 864, 59);
		frmMainFrame.getContentPane().add(txtMainFrame_2);
		txtMainFrame_2.setColumns(10);
		
		JButton btnEditArtist = new JButton("EDIT ARTIST");
		btnEditArtist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditArtist.setFont(new Font("Verdana", Font.BOLD, 11));
		btnEditArtist.setBounds(708, 271, 115, 43);
		frmMainFrame.getContentPane().add(btnEditArtist);
		
	/**	JButton btnAddArtist = new JButton("ADD ARTIST");
		btnAddArtist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					String query="insert into DataFrame (Album,Song,Time,Genre) vulues (?,?,?,?)";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					pst.close();
					rs.close();
				}	catch (Exception e) {
						e.printStackTrace();
				}
			
			}
		});
		btnAddArtist.setFont(new Font("Verdana", Font.BOLD, 11));
		btnAddArtist.setBounds(708, 201, 115, 43);
		frmMainFrame.getContentPane().add(btnAddArtist);

		*/
		JButton btnSave = new JButton("SAVE EDITS");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Verdana", Font.BOLD, 11));
		btnSave.setBounds(708, 344, 115, 43);
		frmMainFrame.getContentPane().add(btnSave);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClose.setFont(new Font("Verdana", Font.BOLD, 11));
		btnClose.setBounds(708, 417, 115, 43);
		frmMainFrame.getContentPane().add(btnClose);
		
		table = new JTable();
		table.setBounds(42, 235, 200, 225);
		frmMainFrame.getContentPane().add(table);
		
		txtAlbum = new JTextField();
		txtAlbum.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlbum.setBackground(Color.BLUE);
		txtAlbum.setText("Album");
		txtAlbum.setBounds(42, 213, 50, 20);
		frmMainFrame.getContentPane().add(txtAlbum);
		txtAlbum.setColumns(10);
		
		txtSong = new JTextField();
		txtSong.setHorizontalAlignment(SwingConstants.CENTER);
		txtSong.setBackground(Color.BLUE);
		txtSong.setText("Song");
		txtSong.setBounds(94, 213, 50, 20);
		frmMainFrame.getContentPane().add(txtSong);
		txtSong.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBackground(Color.BLUE);
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setText("Time");
		txtTime.setBounds(142, 213, 50, 20);
		frmMainFrame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		txtGenre = new JTextField();
		txtGenre.setHorizontalAlignment(SwingConstants.CENTER);
		txtGenre.setBackground(Color.BLUE);
		txtGenre.setText("Genre");
		txtGenre.setBounds(192, 213, 50, 20);
		frmMainFrame.getContentPane().add(txtGenre);
		txtGenre.setColumns(10);
		
		
		
		JPanel subPanel = new JPanel();
		subPanel.setBounds(769, 34, 95, 557);
	   
		
	}
}