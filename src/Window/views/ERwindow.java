package Window.views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Window.common.SQLFetcher;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;
import javax.swing.table.*;



public class ERwindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnBuy;
	private JButton btnAddToWishlist;
	private JTextField textField = new JTextField("Field");
	private JTextField txtUsername;
	private JTextField txtLibID;
	private JList<String> listGames;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");			
		}
		catch (Throwable t) {
			System.err.println("Could not locate jdbc driver");
			t.printStackTrace();
			System.exit(1);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ERwindow frame = new ERwindow();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public ERwindow() {

		initComponent();
		createEvents();

	}

	// code for initializing events
	private void initComponent() {

		setTitle("Vude");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ERwindow.class.getResource("/Window/resources/atom (3).png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnBuy = new JButton("Buy");
		
		JButton btnGames = new JButton("Games");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnUsers = new JButton("Users");
		btnUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnReviews = new JButton("Reviews");
		
		JButton btnUserLibrary = new JButton("User Library");
		
		JButton btnWishlist = new JButton("Wishlist");
		
		btnAddToWishlist = new JButton("Add to Wishlist");
		
		JLabel lblEnter = new JLabel("Enter your Lib ID");
		
		// Generate the list of games
		List<String> gameList = SQLFetcher.getAllGames();
		Object[] gameNames = gameList.toArray();
		
		listGames = new JList(gameNames);
		listGames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listGames.setLayoutOrientation(JList.VERTICAL);
		listGames.setVisibleRowCount(-1);
		// -------------------------------->
		// Set a listener on the games list
		ListSelectionModel listSelectionModel = listGames.getSelectionModel();
		listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		
		txtLibID = new JTextField();
		txtLibID.setColumns(10);
		
		JButton btnUpdateGame = new JButton("Update Game");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdateGame)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(listGames, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnUsers, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername))
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnUserLibrary)
									.addGap(18)
									.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(91))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEnter, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAddToWishlist)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtLibID, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
											.addComponent(btnBuy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
									.addGap(13)))))
					.addGap(52))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUserLibrary, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUsers, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(226)
							.addComponent(lblEnter)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtLibID, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(listGames, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAddToWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(56))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(66)
					.addComponent(btnUpdateGame)
					.addGap(326)
					.addComponent(lblUsername)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	// code for creating events
	private void createEvents() {
		try {

			btnBuy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, SQLFetcher.query1(textField), "Query Result", 1 );
					System.out.println("\'" + e.getActionCommand() + "\'" + " was pressed");
					try {
						int libID = Integer.parseInt(txtLibID.getText());
						SQLFetcher.addGameToLibrary(listGames.getSelectedValue(), libID);						
					}
					catch (Throwable t) {
						String message = "Something went wrong. Verify that LibID is a valid integer.";
						System.err.println(message);
						JOptionPane.showMessageDialog(null, message);
						t.printStackTrace();
					}
				}

			});
			
			btnAddToWishlist.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("\'" + e.getActionCommand() + "\'" + " was pressed");
					SQLFetcher.addGameToWishlist(listGames.getSelectedValue(), txtUsername.getText());
				}
			});
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Invalid input");
			System.exit(1);
		}

	}
	
	//TODO: Determine if this is needed
	class SharedListSelectionHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) { 
            ListSelectionModel lsm = (ListSelectionModel)e.getSource();
 
            int firstIndex = e.getFirstIndex();
            int lastIndex = e.getLastIndex();
            boolean isAdjusting = e.getValueIsAdjusting(); 
//            output.append("Event for indexes "
//                          + firstIndex + " - " + lastIndex
//                          + "; isAdjusting is " + isAdjusting
//                          + "; selected indexes:");
 
            if (lsm.isSelectionEmpty()) {
//                output.append(" <none>");
            } else {
                // Find out which indexes are selected.
                int minIndex = lsm.getMinSelectionIndex();
                int maxIndex = lsm.getMaxSelectionIndex();
                for (int i = minIndex; i <= maxIndex; i++) {
                    if (lsm.isSelectedIndex(i)) {
//                        output.append(" " + i);
//                    	System.out.println(i);
                    }
                }
            }
//            output.append(newline);
//            output.setCaretPosition(output.getDocument().getLength());
        }
    }
}
