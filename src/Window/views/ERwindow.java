package Window.views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Window.common.SQLFetcher;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class ERwindow extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel contentPane;

	private JButton btnUsername;
	private JButton btnGames;
	private JButton btnReviews;
	private JButton btnUserLibrary;
	private JButton btnWishlist;

	private JLabel lblPassword;
	private JLabel lblName;
	private JLabel lblBirthdate;

	private JButton btnBuys;
	private JTextPane textPane;
	private JToggleButton ToggleUSer;
	private JTextField txtLib_ID;
	private JToggleButton ToggleUserSearch;
	private JToggleButton ToggleNewUser;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblEnterUsername;
	private JTextField txtBirthdate;
	private JTextField txtInputUser;
	private JButton btnSearch;
	private JLabel lblLocation;
	private JTextField txtLocation;
	private JLabel lblUsername;
	private JTextField txtUsernameoutput;
	private JTextField txtName;
	private JButton btnEnterUser;
	private JTextField txtPassword;
	private JLabel lblEnterFields;
	private GroupLayout gl_contentPane;
	private JButton btnaddWish;
	private JButton btnUpdateGame;
	private JLabel lblEnterLibId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

		setTitle("ER Querie Displayer");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(UserSearch.class.getResource("/Window/resources/atom (3).png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnGames = new JButton("Games");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnBuys = new JButton("Buy");
		btnBuys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnReviews = new JButton("Reviews");

		btnUserLibrary = new JButton("User Library");

		btnWishlist = new JButton("Wishlist");

		btnUsername = new JButton("username");

		textPane = new JTextPane();

		ToggleUSer = new JToggleButton("User");

		btnaddWish = new JButton("Add To WishList");

		btnUpdateGame = new JButton("Update  Game");

		lblEnterLibId = new JLabel("Enter Lib_ID");

		txtLib_ID = new JTextField();
		txtLib_ID.setColumns(10);
		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnUserLibrary).addGap(30)
								.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
								.addComponent(btnUpdateGame, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addGap(15)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(btnBuys,
								GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnaddWish))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtLib_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblEnterLibId, GroupLayout.PREFERRED_SIZE, 96,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(6)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnUserLibrary, GroupLayout.PREFERRED_SIZE, 31,
										GroupLayout.PREFERRED_SIZE))
						.addGap(35).addComponent(textPane, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
						.addGap(28)
						.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(324).addComponent(lblEnterLibId)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtLib_ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(29)
								.addComponent(btnBuys, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnaddWish, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnUpdateGame, GroupLayout.PREFERRED_SIZE, 31,
												GroupLayout.PREFERRED_SIZE))))
				.addGap(36)));
		contentPane.setLayout(gl_contentPane);
	}

	// User Button Selection
	private void Usercomponent() {

		setTitle("ER Querie Displayer");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(UserSearch.class.getResource("/Window/resources/atom (3).png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnGames = new JButton("Games");
	

		btnReviews = new JButton("Reviews");

		btnUserLibrary = new JButton("User Library");

		btnWishlist = new JButton("Wishlist");

		btnUsername = new JButton("username");

		textPane = new JTextPane();

		// ToggleUSer = new JToggleButton("User");
		ToggleUSer.setSelected(true);

		ToggleUserSearch = new JToggleButton("User Search");

		ToggleNewUser = new JToggleButton("New User");
		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(23)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
								.addGap(37)
								.addComponent(ToggleUserSearch, GroupLayout.PREFERRED_SIZE, 115,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(btnUserLibrary).addGap(30)
								.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
						.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(ToggleNewUser, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
				.addGap(22)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUserLibrary, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(35)
								.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
								.addGap(28)
								.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								gl_contentPane.createSequentialGroup().addGap(47)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(ToggleUserSearch).addComponent(ToggleNewUser))))
				.addGap(36)));
		contentPane.setLayout(gl_contentPane);
	}

	// New User Button Selection
	private void UserNewUsercomponent() {
		setTitle("ER Querie Displayer");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(UserSearch.class.getResource("/Window/resources/atom (3).png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnGames = new JButton("Games");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnReviews = new JButton("Reviews");

		btnUserLibrary = new JButton("User Library");

		btnWishlist = new JButton("Wishlist");

		btnUsername = new JButton("username");

		textPane = new JTextPane();

		// ToggleUSer = new JToggleButton("User");
		ToggleUSer.setSelected(true);
		// ToggleUserSearch = new JToggleButton("User Search");

		// ToggleNewUser = new JToggleButton("New User");

		lblUsername = new JLabel("Username");

		txtUsernameoutput = new JTextField();
		txtUsernameoutput.setColumns(10);

		txtLocation = new JTextField();
		txtLocation.setColumns(10);

		lblLocation = new JLabel("Location");

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		lblEmail = new JLabel("Email");

		txtName = new JTextField();
		txtName.setColumns(10);

		lblName = new JLabel("Name");

		txtBirthdate = new JTextField();
		txtBirthdate.setColumns(10);

		lblBirthdate = new JLabel("Birthdate");

		btnEnterUser = new JButton("Add User");

		txtPassword = new JTextField();
		txtPassword.setColumns(10);

		lblPassword = new JLabel("Password");

		lblEnterFields = new JLabel("Enter fields*");
		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(23)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane
										.createSequentialGroup()
										.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 109,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 79,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 98,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(btnUserLibrary)
												.addPreferredGap(
														ComponentPlacement.UNRELATED)
												.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 304,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_contentPane.createSequentialGroup().addGap(37)
																.addComponent(ToggleUserSearch,
																		GroupLayout.PREFERRED_SIZE, 115,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED, 32,
																		Short.MAX_VALUE))
														.addGroup(gl_contentPane.createSequentialGroup().addGap(99)
																.addGroup(gl_contentPane
																		.createParallelGroup(Alignment.TRAILING)
																		.addComponent(lblLocation,
																				GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblUsername,
																				GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblEmail,
																				GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblName, GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblBirthdate,
																				GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblPassword,
																				GroupLayout.PREFERRED_SIZE, 81,
																				GroupLayout.PREFERRED_SIZE))
																.addGap(4)))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(ToggleNewUser, GroupLayout.PREFERRED_SIZE, 115,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtUsernameoutput, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtBirthdate, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 163,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEnterFields, GroupLayout.PREFERRED_SIZE, 100,
														GroupLayout.PREFERRED_SIZE))
										.addGap(22))))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(577, Short.MAX_VALUE)
						.addComponent(btnEnterUser, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUserLibrary, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(textPane,
								GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(47)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(ToggleUserSearch).addComponent(ToggleNewUser))
								.addGap(17).addComponent(lblEnterFields).addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtUsernameoutput, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblUsername))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLocation))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmail))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblName))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtBirthdate, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBirthdate))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPassword))))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(btnEnterUser, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE).addGap(13)
				.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	// User Search Button Selection
	private void UserSearchcomponent() {
		setTitle("ER Querie Displayer");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(UserSearch.class.getResource("/Window/resources/atom (3).png")));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnGames = new JButton("Games");
		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		btnReviews = new JButton("Reviews");

		btnUserLibrary = new JButton("User Library");

		btnWishlist = new JButton("Wishlist");

		btnUsername = new JButton("username");

		textPane = new JTextPane();

		ToggleUSer.setSelected(true);

		lblUsername = new JLabel("Username");

		txtUsernameoutput = new JTextField();
		txtUsernameoutput.setColumns(10);

		txtLocation = new JTextField();
		txtLocation.setColumns(10);

		lblLocation = new JLabel("Location");

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		lblEmail = new JLabel("Email");

		txtName = new JTextField();
		txtName.setColumns(10);

		lblName = new JLabel("Name");

		txtBirthdate = new JTextField();
		txtBirthdate.setColumns(10);

		lblBirthdate = new JLabel("Birthdate");

		txtInputUser = new JTextField();
		txtInputUser.setColumns(10);

		lblEnterUsername = new JLabel("Enter UserName");

		btnSearch = new JButton("Search");
		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(23)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane
										.createSequentialGroup()
										.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 109,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 79,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 98,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(btnUserLibrary)
												.addPreferredGap(
														ComponentPlacement.UNRELATED)
												.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 80,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 304,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(Alignment.TRAILING, gl_contentPane
																.createSequentialGroup().addGap(37)
																.addComponent(ToggleUserSearch,
																		GroupLayout.PREFERRED_SIZE, 115,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		ComponentPlacement.RELATED, 32,
																		Short.MAX_VALUE))
														.addGroup(Alignment.TRAILING,
																gl_contentPane.createSequentialGroup().addGap(99)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(lblLocation,
																						GroupLayout.PREFERRED_SIZE, 81,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblUsername,
																						GroupLayout.PREFERRED_SIZE, 81,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblEmail,
																						GroupLayout.PREFERRED_SIZE, 81,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblName,
																						GroupLayout.PREFERRED_SIZE, 81,
																						GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblBirthdate,
																						GroupLayout.PREFERRED_SIZE, 81,
																						GroupLayout.PREFERRED_SIZE))
																		.addGap(4)))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
														.createParallelGroup(Alignment.LEADING)
														.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 163,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, 163,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(ToggleNewUser, GroupLayout.PREFERRED_SIZE, 115,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txtUsernameoutput, GroupLayout.PREFERRED_SIZE,
																163, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 163,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txtBirthdate, GroupLayout.PREFERRED_SIZE, 163,
																GroupLayout.PREFERRED_SIZE))
														.addGap(12))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblEnterUsername, GroupLayout.PREFERRED_SIZE, 103,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txtInputUser, GroupLayout.PREFERRED_SIZE, 163,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(10))))
				.addGroup(Alignment.TRAILING,
						gl_contentPane.createSequentialGroup().addContainerGap(577, Short.MAX_VALUE)
								.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGames, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ToggleUSer, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReviews, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUserLibrary, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnWishlist, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(textPane,
								GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(47)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(ToggleUserSearch).addComponent(ToggleNewUser))
								.addGap(48)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtUsernameoutput, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblUsername))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLocation))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmail))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblName))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtBirthdate, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBirthdate))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblEnterUsername).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtInputUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE).addGap(13)
				.addComponent(btnUsername, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	// code for creating events
	private void createEvents() {
		try {

			ToggleUSer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Usercomponent();
					do {

						ToggleUserSearch.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								UserSearchcomponent();
								if (ToggleUserSearch.isSelected()) {
									ToggleNewUser.setSelected(false);
								}
								if (ToggleUserSearch.isSelected()) {
									ToggleUserSearch.setSelected(true);
								}

								txtUsernameoutput.setEditable(false);
								txtEmail.setEditable(false);
								txtLocation.setEditable(false);
								txtBirthdate.setEditable(false);
								txtName.setEditable(false);
								textPane.setEditable(false);
								try {
									for (int i = 0; i <= SQLFetcher.queryint(); i++) {
										textPane.setText(SQLFetcher.query4());
									}
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								btnSearch.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										try {

											txtUsernameoutput.setText(SQLFetcher.queryusername(txtInputUser));
											txtEmail.setText(SQLFetcher.queryemail(txtInputUser));
											txtLocation.setText(SQLFetcher.querylocation(txtInputUser));
											txtBirthdate.setText(SQLFetcher.querybirthdate(txtInputUser));
											txtName.setText(SQLFetcher.queryname(txtInputUser));

										} catch (Exception e1) {
											// TODO Auto-generated catch block
											JOptionPane.showMessageDialog(null, " Invalid Input");
										}
									}
								});
							}
						});

						ToggleNewUser.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								UserNewUsercomponent();
								if (ToggleNewUser.isSelected()) {
									ToggleUserSearch.setSelected(false);
								}
								if (ToggleNewUser.isSelected()) {
									ToggleNewUser.setSelected(true);
								}
								textPane.setEditable(false);
								txtBirthdate.setText("YYYY-MM-DD");
								txtPassword.setText("Use up to 10 characters");
								btnEnterUser.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										try {
											
											if (txtPassword.getText().length() <= 10) {
												SQLFetcher.query3(txtUsernameoutput, txtLocation, txtEmail, txtName,
														txtPassword, txtBirthdate);

												JOptionPane.showMessageDialog(null,
														"New User Account has been created!", "Query Result", 1);
											} else {
												txtPassword.setText("Use up to 10 characters");
											}
										} catch (Exception se) {
											se.printStackTrace();
										}
									}
								});
							}
						});

					} while (ToggleUSer.isSelected() == false);
					btnGames.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							ToggleUSer.setSelected(false);
						}
					});
				}
			});
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Invalid Input");
			System.exit(1);
		}

	}
}
