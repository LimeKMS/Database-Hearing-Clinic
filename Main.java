package swing;

import java.awt.*;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

public class Main {

	private JFrame frame;
	private JTable table; //For View/Edit
	private JTextField textField; //F Name
	private JTextField textField_1; //M Name
	private JTextField textField_2; //L Name
	private JTextField textField_3; //DOB
	private JTextField textField_4; //Phone
	private JTextField textField_5; //Email
	private JTextField textField_6; //Address
	private JTextField textField_7; //City
	private JTextField textField_8; //Zip code
	private JTextField textField_9; //Photo
	private JTextField textField_10; //SSN
	private JTextField textField_11; //Insurance
	private JTextField textField_12; //Occupation
	private JTextField textField_13; //Edu
	private JTextField textField_14; //Tinnitus Onset
	private JTextField textField_15; //Hyperacusis Onset
	private JTextField textField_16; //Hyperacusis Etiology
	private JTextField textField_17; //Additional comments
	private JTextField textField_18; //Tinnitus Etiology
	private JTextField textField_19; //THC View
	private JTextField textField_20; //Name View
	private JTextField textField_21; //SSN View
	//New Visit
	private JTextField textField_22; //Visit ID
	private JTextField textField_23; //Visit #
	private JTextField textField_24; //Patient name
	private JTextField textField_25; //Problem ID in Interview
	private JTextField textField_26; //THC
	private JTextField textField_27; //Comments
	private JTextField textField_28; //Visit Date
	private JTextField textField_29; //Cat for Interview
	private JTextField textField_30; //Protocol for interview
	private JTextField textField_31; //followup instructions, not needed
	private JTextField textField_32; //instrument type in interview
	private JTextField textField_33; //Next visit in interview
	private JTextField RecomendationVisit; //in interview
	//View/edit Visit
	private JTable tableVisit;
	//Interview
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	//Medication
	private JTextField MedName;
	private JTextField MedDose;
	private JTextField MedDur;
	private JTextField MedCom;
	//initial
	private JTextField Ears;
	private JTextField When;
	private JTextField Freq;
	private JTextField TTreat;
	private JTextField Tprob;
	private JTextField Aware;
	private JTextField Annoyed;
	private JTextField Comments;
	private JTextField FreqST;
	private JTextField TroubleSound;
	private JTextField TimePerc;
	private JTextField TimePercST;
	private JTextField STTreats;
	private JTextField STProb;
	private JTextField CommentsST;
	private JTextField Cate;
	private JTextField Type;
	private JTextField Recomm;
	private JTextField PtnDecision;
	private JTextField NextVisit;
	private JTextField GiveBack;
	private JTextField MainProblem;
	//Follow
	private JTextField textField_108;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_102;
	private JTextField textField_101;
	private JTextField textField_100;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107; //108
	
	//THI
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField THIQ1;
	private JTextField THIQ2;
	private JTextField THIQ3;
	private JTextField THIQ4;
	private JTextField THIQ5;
	private JTextField THIQ6;
	private JTextField THIQ7;
	private JTextField THIQ8;
	private JTextField THIQ9;
	private JTextField THIQ10;
	private JTextField THIQ11;
	private JTextField THIQ12;
	private JTextField THIQ13;
	private JTextField THIQ14;
	private JTextField THIQ15;
	private JTextField THIQ16;
	private JTextField THIQ17;
	private JTextField THIQ18;
	private JTextField THIQ19;
	private JTextField THIQ20;
	private JTextField THIQ21;
	private JTextField THIQ22;
	private JTextField THIQ23;
	private JTextField THIQ24;
	private JTextField THIQ25;
	private JTextField VisitID;
	//audiology
	private JTextField THC;
	private JTextField Date;
	//private JTextField VisitID;
	private JTextField Name;
	private JTextField R25;
	private JTextField R50;
	private JTextField R1;
	private JTextField R2;
	private JTextField R3;
	private JTextField R4;
	private JTextField R6;
	private JTextField R8;
	private JTextField R10;
	private JTextField R12;
	private JTextField L25;
	private JTextField L4;
	private JTextField L6;
	private JTextField L8;
	private JTextField L10;
	private JTextField L12;
	private JTextField L3;
	private JTextField L2;
	private JTextField L1;
	private JTextField L50;
	private JTextField TPR;
	private JTextField TRM;
	private JTextField TLR;
	private JTextField THR;
	private JTextField TRL;
	private JTextField LPR;
	private JTextField LRM;
	private JTextField LLR;
	private JTextField LR;
	private JTextField LRL;
	private JTextField WNR;
	private JTextField WNL;
	private JTextField MRL;
	private JTextField MLB;
	private JTextField MBL;
	private JTextField MRR;
	private JTextField MRB;
	private JTextField MBR;
	private JTextField RSD;
	private JTextField LSD;
	private JTextField LR50;
	private JTextField LR1;
	private JTextField LR2;
	private JTextField LR3;
	private JTextField LR12;
	private JTextField LR10;
	private JTextField LR8;
	private JTextField LR6;
	private JTextField LR4;
	private JTextField LL50;
	private JTextField LLTP;
	private JTextField LL4;
	private JTextField LL6;
	private JTextField LL8;
	private JTextField LL12;
	private JTextField LL10;
	private JTextField LL3;
	private JTextField LL2;
	private JTextField LL1;
	private JTextField LRTP;
	private JTextField CommentAudio;
	//REM
	private JTextField FreqRE;
	private JTextField ThR;
	private JTextField MixRSPL;
	private JTextField MixRSL;
	private JTextField TolRSPL;
	private JTextField TolRSL;
	private JTextField MaxRSPL;
	private JTextField MaxRSL;
	private JTextField TolLSPL;
	private JTextField FreqLE;
	private JTextField TolLSL;
	private JTextField ThLSPL;
	private JTextField MaxLSPL;
	private JTextField MixLSPL;
	private JTextField MixLSL;
	private JTextField MaxLSL;
	//Counseling
	private JTextField CounselDetails;
	//Dianoses and treatment
	private JTextField THCSearch;
	private JTable Dianose;
	private JTable Treatment;
	//Location
	private JTextField AbbCountry;
	private JTextField CountryName;
	private JTextField AbbState;
	private JTextField StateName;
	private JTextField CityCode;
	private JTextField CityName;
	//DemoData
	private JTextField OccupationID;
	private JTextField JobName;
	private JTextField OccupationID2;
	private JTextField EduName;
	private JTextField WorkName;
	private JTextField WorkAbb;
	//MedData
	private JTextField MedID;
	private JTextField DiseaseName;
	private JTextField MedAbb;
	private JTextField MedDesc;
	//PharmData
	private JTextField PharmMedID;
	private JTextField PharmMedName;
	private JTextField PharmMedDesc;
	private JTextField PharmMedDose;
	private JTextField PharmMedChem;
	private JTextField PharmMedDis;
	private JTextField PharmMedGen;
	private JTextField PharmGenID;
	private JTextField PharmGenName;
	private JTextField PharmGenDesc;
	private JTextField PharmDisID;
	private JTextField PharmDisName;
	private JTextField PharmDisDesc;
	private JTextField PharmChemID;
	private JTextField PharmChemName;
	private JTextField PharmChemDesc;
	//InstrData
	private JTextField InstrCateID;
	private JTextField IntrCateName;
	private JTextField InstrTypeID;
	private JTextField InstrTypeName;
	private JTextField InstrTypeCate;
	private JTextField InstrModelID;
	private JTextField InstrModelName;
	private JTextField InstrModelType;
	private JTextField IntrCateAbb;
	private JTextField InstrTypeAbb;
	private JTextField InstrModelAbb;
	private JTextField IntrCateDesc;
	private JTextField InstrTypeDesc;
	private JTextField InstrModelDesc;
	private JTextField PatientState;
	private JTextField PatientCountry;
	private JTextField Visit;
	//Instru
	private JTextField Model;
	private JTextField InstrComments;
	private JTextField InstrCate;
	private JTextField InstrType;
	private JTextField InstrID;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	
	
	public Main() throws Exception {
		JOptionPane.showMessageDialog(null, "Connected to database");
		windowHandler();
		mainPage();
		getConnection();
	}
	
	public static Connection getConnection() throws Exception{
    	try {
    		String url = "jdbc:mysql://cisvm-winsrv-mysql1.unfcsd.unf.edu:3306/Team15";
    		String username = "N01450656";
    		String password = "Fall20210656";
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    		Connection conn = DriverManager.getConnection(url,username,password);
    		System.out.println("Connected");
    		return conn;
    	} catch(Exception e){System.out.println(e);
    }	
    	return null;
    }
	
	/*
	//Integers
	public static void postINT(String Table, String Column,String ID, String var, String var2) throws Exception{
		int INT;
		try {
			INT = Integer.parseInt(ID);
		}catch (NumberFormatException e) {INT = 0;}
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO "+Table+" ("+Column+", "+var+") VALUES ("+INT+", '"+var2+"')");
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void updateINT(String Table, String Column,String ID, String var, String var2) throws Exception{
		int INT;
		try {
			INT = Integer.parseInt(ID);
		}catch (NumberFormatException e) {INT = 0;}
		System.out.println(Column);
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE "+Table+" SET "+var+" = '"+var2+"' WHERE "+Column+" = "+ID);
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed"); //
		}
	}
	
	public static void deleteINT(String Table, String Column,String ID, String var, String var2) throws Exception{
		int INT;
		try {
			INT = Integer.parseInt(ID);
		}catch (NumberFormatException e) {INT = 0;}
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE FROM "+Table+" WHERE "+Column+" =" + INT);
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	//String
	public static void post(String Table, String Column,String ID, String var, String var2) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO "+Table+" ("+Column+", "+var+") VALUES ("+ID+", '"+var2+"')");
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void update(String Table, String Column,String ID, String var, String var2) throws Exception{
		int INT;
		try {
			INT = Integer.parseInt(ID);
		}catch (NumberFormatException e) {INT = 0;}
		System.out.println(Column);
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("UPDATE "+Table+" SET "+var+" = '"+var2+"' WHERE "+Column+" = "+ID);
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed"); //
		}
	}
	
	public static void delete(String Table, String Column,String ID, String var, String var2) throws Exception{
		int INT;
		try {
			INT = Integer.parseInt(ID);
		}catch (NumberFormatException e) {INT = 0;}
		
		try {
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("DELETE FROM "+Table+" WHERE "+Column+" =" + INT);
			posted.executeUpdate();
		}catch(Exception e1) {System.out.println(e1);}	
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	try { //FirstName
					post("Patient", "THC",THC.getText(), "First_name", textField.getText());
					JOptionPane.showMessageDialog(null, "Submitted");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try { //LastName
					post("Patient", "THC",THC.getText(), "Surname", textField_2.getText());
					JOptionPane.showMessageDialog(null, "Submitted");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					post("Patient", "THC",THC.getText(), "SSN", textField_10.getText());
					JOptionPane.showMessageDialog(null, "Submitted");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
	
	
	*/

	
	

	/*try {
		Connection con = getConnection();
		PreparedStatement posted = con.prepareStatement("INSERT INTO "+Table+" ("+Column+", "+var+") VALUES ("+INT+", '"+var2+"')");
		posted.executeUpdate();
	}catch(Exception e1) {System.out.println(e1);}	
	finally {
		System.out.println("Insert Completed");
	*/
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void mainPage() {
		//windowHandler();
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JButton btnNewButton = new JButton("Patients");
		btnNewButton.setBounds(41, 39, 146, 72);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Visits");
		btnNewButton_1.setBounds(245, 39, 146, 72);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Analytics");
		btnNewButton_2.setBounds(41, 146, 146, 72);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Other");
		btnNewButton_3.setBounds(245, 146, 146, 72);
		panel.add(btnNewButton_3);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				patients();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Analytics();
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
	}
	private void patients() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Add New Patients");
		btnNewButton_4.setBounds(41, 80, 146, 72);
		panel.add(btnNewButton_4);
		panel.setVisible(true);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				newPatient();
			}
		});

		
		JButton btnNewButton_5 = new JButton("Edit/View Patients");
		btnNewButton_5.setBounds(245, 80, 146, 72);
		panel.add(btnNewButton_5);
		panel.setVisible(true);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				View();
			}
		});
		
		JButton btnNewButton_895 = new JButton("Back");
		btnNewButton_895.setBounds(245, 200, 100, 32);
		panel.add(btnNewButton_895);
		panel.setVisible(true);
		btnNewButton_895.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				mainPage();
			}
		});
	}
	
	private void newPatient() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		THC = new JTextField();
		THC.setBounds(390, 187, 34, 20);
		panel.add(THC);
		THC.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("THC*:");
		lblNewLabel_15.setBounds(352, 190, 46, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel = new JLabel("First Name*");
		lblNewLabel.setBounds(10, 11, 70, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Name");
		lblNewLabel_1.setBounds(10, 48, 70, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 63, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name*");
		lblNewLabel_2.setBounds(10, 89, 70, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 106, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DOB* (yyyy-mm-dd)");
		lblNewLabel_3.setBounds(10, 131, 105, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 146, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender*");
		lblNewLabel_4.setBounds(10, 169, 46, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 186, 34, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		
		JLabel lblNewLabel_5 = new JLabel("Phone*");
		lblNewLabel_5.setBounds(10, 210, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 224, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(121, 11, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(121, 25, 155, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address*");
		lblNewLabel_7.setBounds(121, 48, 46, 14);
		panel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(121, 63, 155, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("State Code*:");
		lblNewLabel_9.setBounds(121, 131, 70, 14);
		panel.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(121, 106, 105, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Zip");
		lblNewLabel_10.setBounds(121, 169, 46, 14);
		panel.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(121, 187, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Photo");
		lblNewLabel_12.setBounds(285, 11, 46, 14);
		panel.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(286, 25, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("SSN");
		lblNewLabel_13.setBounds(285, 48, 46, 14);
		panel.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(286, 63, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Insurance");
		lblNewLabel_14.setBounds(285, 89, 87, 14);
		panel.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(285, 106, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Save");
		btnNewButton_6.setBounds(238, 145, 83, 21);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New Visit");
		btnNewButton_7.setBounds(238, 185, 83, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Cancel");
		btnNewButton_8.setBounds(325, 144, 89, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Add Demographics");
		btnNewButton_9.setBounds(238, 222, 124, 23);
		panel.add(btnNewButton_9);
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3;
				try {
					INT = Integer.parseInt(PatientCountry.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(PatientState.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(textField_8.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO Patient (THC,Country_ID,State_ID,ZIP_ID,Surname,First_name,SSN,DOB,Insurance) VALUES ('"+THC.getText()+"', "+INT+", "+INT2+", '"+INT3+"','"+textField_2.getText()+"','"+textField.getText()+"','"+textField_10.getText()+"','"+textField_3.getText()+"','"+textField_11.getText()+"')"); //Missing State + Country
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
				
			}
		});
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				patients();
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				demographics();
			}
		});
		PatientState = new JTextField();
		PatientState.setBounds(121, 146, 86, 20);
		panel.add(PatientState);
		PatientState.setColumns(10);
		
		PatientCountry = new JTextField();
		PatientCountry.setBounds(121, 224, 86, 20);
		panel.add(PatientCountry);
		PatientCountry.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Country Code*");
		lblNewLabel_11.setBounds(121, 210, 86, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_8 = new JLabel("City* (Jacksonville)");
		lblNewLabel_8.setBounds(121, 89, 117, 14);
		panel.add(lblNewLabel_8);
	}
	//Insert Needs Drop Down
	private void demographics() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		THC = new JTextField();
		THC.setBounds(352, 37, 34, 20);
		panel.add(THC);
		THC.setColumns(10);
		
		JLabel lblNewLabel_150 = new JLabel("THC*:");
		lblNewLabel_150.setBounds(352, 23, 46, 14);
		panel.add(lblNewLabel_150);
		
		JButton btnNewButton_10 = new JButton("Save");
		btnNewButton_10.setBounds(238, 155, 83, 21);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New Visit");
		btnNewButton_11.setBounds(238, 195, 83, 23);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Cancel");
		btnNewButton_12.setBounds(325, 154, 89, 23);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Back");
		btnNewButton_13.setBounds(325, 195, 83, 23);
		panel.add(btnNewButton_13);
		
		JLabel lblNewLabel = new JLabel("Occupation ID*");
		lblNewLabel.setBounds(28, 23, 76, 14);
		panel.add(lblNewLabel);
		
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Submitted");
				int Occu = 0;
				try {
					Occu = Integer.parseInt(textField_12.getText());
				}catch (NumberFormatException e1) {Occu = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Patient SET Occup_ID = "+Occu+", Tin_when = '"+textField_14.getText()+"', H_when = '"+textField_15.getText()+"', H_background = '"+textField_16.getText()+"', Tin_background = '"+textField_18.getText()+"', T_Ind_comments = '"+textField_17.getText()+"', H_Ind_comments = '"+textField_17.getText()+"' Where THC = '"+THC.getText()+"'");                      //Missing State + Country
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				NewVisits();
			}
		});
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				//visit();
			}
		});
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				newPatient();
			}
		});
		
		textField_12 = new JTextField();
		textField_12.setBounds(28, 37, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Work Status");
		lblNewLabel_14.setBounds(28, 62, 70, 14);
		panel.add(lblNewLabel_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(28, 83, 40, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_15 = new JLabel("Education");
		lblNewLabel_15.setBounds(28, 109, 76, 14);
		panel.add(lblNewLabel_15);
		
		textField_13 = new JTextField();  //dAsd
		textField_13.setBounds(28, 123, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Tinnitus Onset* (yyyy-mm-dd)");
		lblNewLabel_16.setBounds(28, 142, 180, 14);
		panel.add(lblNewLabel_16);
		
		textField_14 = new JTextField();
		textField_14.setBounds(28, 155, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Hyperacusis Onset* (yyyy-mm-dd)");
		lblNewLabel_17.setBounds(28, 179, 186, 14);
		panel.add(lblNewLabel_17);
		
		textField_15 = new JTextField();
		textField_15.setBounds(28, 192, 86, 20);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Hyperacusis Etiology*");
		lblNewLabel_18.setBounds(141, 23, 109, 14);
		panel.add(lblNewLabel_18);
		
		textField_16 = new JTextField();
		textField_16.setBounds(144, 37, 86, 20);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Additional Comments*");
		lblNewLabel_19.setBounds(141, 62, 109, 14);
		panel.add(lblNewLabel_19);
		
		textField_17 = new JTextField();
		textField_17.setBounds(144, 84, 264, 40);
		panel.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Tinnitus Etiology*");
		lblNewLabel_20.setBounds(255, 23, 109, 14);
		panel.add(lblNewLabel_20);
		
		textField_18 = new JTextField();
		textField_18.setBounds(255, 37, 86, 20);
		panel.add(textField_18);
		textField_18.setColumns(10);
		
		
		
	}
	//Needs work status drop down and testing
	private void ViewEdit() {		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_14 = new JButton("Edit");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				EditPatient();
			}
		});
		btnNewButton_14.setBounds(7, 227, 101, 23);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_17 = new JButton("New Visit");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				NewVisits();
			}
		});
		btnNewButton_17.setBounds(118, 227, 101, 23);
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Current Visit");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				ViewVisits();
			}
		});
		btnNewButton_18.setBounds(229, 227, 101, 23);
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_26 = new JButton("Delete");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//function to delete
			}
		});
		btnNewButton_26.setBounds(340, 227, 70, 23);
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_2323 = new JButton("Back");
		btnNewButton_2323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				View();
			}
		});
		btnNewButton_2323.setBounds(340, 187, 70, 23);
		panel.add(btnNewButton_2323);
		
		JLabel lblNewLabel = new JLabel("First Name*");
		lblNewLabel.setBounds(10, 11, 70, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(121, 11, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_12 = new JLabel("Photo");
		lblNewLabel_12.setBounds(285, 11, 46, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("SSN");
		lblNewLabel_13.setBounds(285, 48, 46, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_7 = new JLabel("Address*");
		lblNewLabel_7.setBounds(121, 48, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Name");
		lblNewLabel_1.setBounds(10, 48, 70, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name*");
		lblNewLabel_2.setBounds(10, 89, 70, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("City* (Jacksonville)");
		lblNewLabel_8.setBounds(121, 89, 117, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_14 = new JLabel("Insurance");
		lblNewLabel_14.setBounds(285, 89, 87, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_3 = new JLabel("DOB* (yyyy-mm-dd)");
		lblNewLabel_3.setBounds(10, 131, 105, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_9 = new JLabel("State");
		lblNewLabel_9.setBounds(121, 131, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_4 = new JLabel("Gender*");
		lblNewLabel_4.setBounds(10, 169, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_10 = new JLabel("Zip");
		lblNewLabel_10.setBounds(121, 169, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_5 = new JLabel("Phone*");
		lblNewLabel_5.setBounds(285, 131, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("Country*");
		lblNewLabel_11.setBounds(207, 131, 46, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_15 = new JLabel("THC#");
		lblNewLabel_15.setBounds(192, 169, 46, 14);
		panel.add(lblNewLabel_15);
		
		JTextPane FirstName = new JTextPane();
		FirstName.setBounds(10, 25, 87, 20);
		panel.add(FirstName);
		
		JTextPane MName = new JTextPane();
		MName.setBounds(10, 62, 87, 20);
		panel.add(MName);
		
		JTextPane LastName = new JTextPane();
		LastName.setBounds(10, 103, 87, 20);
		panel.add(LastName);
		
		JTextPane DOB = new JTextPane();
		DOB.setBounds(10, 149, 87, 20);
		panel.add(DOB);
		
		JTextPane Gender = new JTextPane();
		Gender.setBounds(10, 184, 87, 20);
		panel.add(Gender);
		
		JTextPane Email = new JTextPane();
		Email.setBounds(121, 25, 151, 20);
		panel.add(Email);
		
		JTextPane Photo = new JTextPane();
		Photo.setBounds(285, 25, 87, 20);
		panel.add(Photo);
		
		JTextPane SSN = new JTextPane();
		SSN.setBounds(285, 62, 87, 20);
		panel.add(SSN);
		
		JTextPane Address = new JTextPane();
		Address.setBounds(121, 62, 87, 20);
		panel.add(Address);
		
		JTextPane City = new JTextPane();
		City.setBounds(121, 103, 87, 20);
		panel.add(City);
		
		JTextPane Insurance = new JTextPane();
		Insurance.setBounds(285, 103, 87, 20);
		panel.add(Insurance);
		
		JTextPane Zip = new JTextPane();
		Zip.setBounds(121, 184, 52, 20);
		panel.add(Zip);
		
		JTextPane THC = new JTextPane();
		THC.setBounds(187, 184, 87, 20);
		panel.add(THC);
		
		JTextPane State = new JTextPane();
		State.setBounds(121, 149, 52, 20);
		panel.add(State);
		
		JTextPane Country = new JTextPane();
		Country.setBounds(185, 149, 87, 20);
		panel.add(Country);
		
		JTextPane Phone = new JTextPane();
		Phone.setBounds(285, 149, 101, 20);
		panel.add(Phone);
	}
	
	private void View() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("THC #");
		lblNewLabel_21.setBounds(164, 67, 46, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Name");
		lblNewLabel_22.setBounds(255, 67, 46, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("SSN*");
		lblNewLabel_23.setBounds(340, 67, 46, 14);
		panel.add(lblNewLabel_23);
		
		JTextPane THC = new JTextPane();
		THC.setBounds(132, 44, 86, 20);
		panel.add(THC);
		
		
		textField_20 = new JTextField();
		textField_20.setBounds(228, 44, 86, 20);
		panel.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(322, 44, 86, 20);
		panel.add(textField_21);
		textField_21.setColumns(10);
		
		JButton btnNewButton_19 = new JButton("Search");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				THC.setText("null");
			}
		});
		btnNewButton_19.setBounds(10, 58, 101, 23);
		panel.add(btnNewButton_19);
		
		
		
		JButton btnNewButton_89 = new JButton("View");
		btnNewButton_89.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				ViewEdit();
			}
		});
		btnNewButton_89.setBounds(10, 98, 101, 23);
		panel.add(btnNewButton_89);
		
		JButton btnNewButton_2323 = new JButton("Back");
		btnNewButton_2323.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				patients();
			}
		});
		btnNewButton_2323.setBounds(340, 187, 70, 23);
		panel.add(btnNewButton_2323);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 148, 320, 102);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"THC", "Patient Name", "DOB"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane.setViewportView(table);
	}
	
	private void Visits() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_20 = new JButton("Add New Visit");
		btnNewButton_20.setBounds(41, 80, 146, 72);
		panel.add(btnNewButton_20);
		panel.setVisible(true);
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				NewVisits();
			}
		});
		JButton btnNewButton_21 = new JButton("Edit/View Visits");
		btnNewButton_21.setBounds(245, 80, 146, 72);
		panel.add(btnNewButton_21);
		panel.setVisible(true);
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				ViewVisits();
			}
		});
		JButton btnNewButton_895 = new JButton("Back");
		btnNewButton_895.setBounds(245, 200, 100, 32);
		panel.add(btnNewButton_895);
		panel.setVisible(true);
		btnNewButton_895.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				mainPage();
			}
		});
	}
	
	private void NewVisits() {
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 235);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_22 = new JButton("More");
		btnNewButton_22.setBounds(239, 201, 83, 23);
		panel.add(btnNewButton_22);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		
		JButton btnNewButton_23 = new JButton("Back"); //
		btnNewButton_23.setBounds(325, 201, 83, 23);
		panel.add(btnNewButton_23);
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		
		JButton btnNewButton_240 = new JButton("Save"); //
		btnNewButton_240.setBounds(325, 161, 83, 23);
		panel.add(btnNewButton_240);
		btnNewButton_240.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4, INT5, INT6;
				try {
					INT = Integer.parseInt(textField_22.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(textField_23.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(textField_25.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(textField_32.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					INT5 = Integer.parseInt(textField_33.getText());
				}catch (NumberFormatException e1) {INT5 = 0;}
				try {
					INT6 = Integer.parseInt(textField_31.getText());
				}catch (NumberFormatException e1) {INT6 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO Visit (Visit_ID, THC, Visit_nr, Date1) VALUES ("+INT+", '"+textField_26.getText()+"', 0, 0)");
					posted.executeUpdate();
					PreparedStatement posted1 = con.prepareStatement("INSERT INTO Interview (Visit_ID) VALUES ("+INT+")");
					posted1.executeUpdate();
					PreparedStatement posted2 = con.prepareStatement("INSERT INTO Counseling (Visit_ID) VALUES ("+INT+")");
					posted2.executeUpdate();
					PreparedStatement posted3 = con.prepareStatement("INSERT INTO Instrumentation (Instr_ID, Visit_ID, IC_ID, IT_ID, IM_ID) VALUES ("+INT4+", "+INT+", 0, 0,0)");
					posted3.executeUpdate();
					PreparedStatement posted4 = con.prepareStatement("INSERT INTO REM (Instr_ID, Visit_ID) VALUES ("+INT4+", "+INT+")");
					posted4.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally { //
					try {
						Connection con = getConnection();
						PreparedStatement posted = con.prepareStatement("UPDATE Visit Set Visit_nr = "+INT2+", Date1 = '"+textField_28.getText()+"', Comments = textField_27 Where Visit_ID = "+INT);                              
						posted.executeUpdate();
					}catch(Exception e1) {}	
					finally {
						try {
							Connection con = getConnection();
							PreparedStatement posted = con.prepareStatement("UPDATE Interview SET Problem_ID = "+INT3+", IT_ID = "+INT4+", Cat = '"+textField_29.getText()+"', Next_v = "+INT5+", Comments = '"+RecomendationVisit.getText()+"' WHERE Visit_ID = "+INT);
							posted.executeUpdate();
							PreparedStatement posted2 = con.prepareStatement("UPDATE Counseling SET type = '"+textField_31.getText()+"' WHERE Visit_ID = "+INT);
							posted2.executeUpdate();
						}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
						finally {
							JOptionPane.showMessageDialog(null, "Successfully Updated");
						}
					}
				}
				
			}
		});
		
		JLabel lblNewLabel_25 = new JLabel("Visit ID:");
		lblNewLabel_25.setBounds(10, 23, 76, 14);
		panel.add(lblNewLabel_25);
		
		textField_22 = new JTextField();
		textField_22.setBounds(10, 37, 49, 20);
		panel.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Stage:");
		lblNewLabel_26.setBounds(10, 73, 70, 14);
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Visit no.");
		lblNewLabel_27.setBounds(229, 23, 76, 14);
		panel.add(lblNewLabel_27);
		
		textField_23 = new JTextField();
		textField_23.setBounds(221, 37, 49, 20);
		panel.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Patient");
		lblNewLabel_28.setBounds(281, 23, 70, 14);
		panel.add(lblNewLabel_28);
		
		textField_24 = new JTextField();
		textField_24.setBounds(278, 37, 86, 20);
		panel.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Problem");
		lblNewLabel_29.setBounds(10, 118, 86, 14);
		panel.add(lblNewLabel_29);
		
		textField_25 = new JTextField();
		textField_25.setBounds(10, 132, 86, 20);
		panel.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("THC#");
		lblNewLabel_30.setBounds(73, 23, 49, 14);
		panel.add(lblNewLabel_30);
		
		textField_26 = new JTextField();
		textField_26.setBounds(69, 37, 49, 20);
		panel.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Comments");
		lblNewLabel_31.setBounds(141, 62, 109, 14);
		panel.add(lblNewLabel_31);
		
		textField_27 = new JTextField();
		textField_27.setBounds(144, 84, 264, 40);
		panel.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Date");
		lblNewLabel_32.setBounds(132, 23, 55, 14);
		panel.add(lblNewLabel_32);
		
		textField_28 = new JTextField();
		textField_28.setBounds(128, 37, 83, 20);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		JTextPane textPaneStage = new JTextPane();
		textPaneStage.setBounds(10, 84, 76, 23);
		panel.add(textPaneStage);
		
		JLabel lblNewLabel_33 = new JLabel("Category");
		lblNewLabel_33.setBounds(10, 154, 46, 14);
		panel.add(lblNewLabel_33);
		
		textField_29 = new JTextField();
		textField_29.setBounds(64, 151, 32, 20);
		panel.add(textField_29);
		textField_29.setColumns(10);
		
		RecomendationVisit = new JTextField();
		RecomendationVisit.setBounds(132, 202, 86, 20);
		panel.add(RecomendationVisit);
		RecomendationVisit.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("Protocol");
		lblNewLabel_34.setBounds(13, 174, 46, 14);
		panel.add(lblNewLabel_34);
		
		textField_30 = new JTextField();
		textField_30.setBounds(64, 171, 32, 23);
		panel.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(64, 191, 32, 23);
		panel.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("FU:");
		lblNewLabel_35.setBounds(13, 195, 46, 14);
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Instrument:");
		lblNewLabel_36.setBounds(132, 135, 70, 14);
		panel.add(lblNewLabel_36);
		
		textField_32 = new JTextField();
		textField_32.setBounds(195, 132, 32, 20);
		panel.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(307, 132, 86, 20);
		panel.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("Next visit");
		lblNewLabel_37.setBounds(251, 135, 54, 14);
		panel.add(lblNewLabel_37);
		
		
		JLabel lblNewLabel_38 = new JLabel("Recomendation:");
		lblNewLabel_38.setBounds(132, 180, 95, 14);
		panel.add(lblNewLabel_38);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("REM");
		chckbxNewCheckBox.setBounds(252, 154, 70, 40);
		panel.add(chckbxNewCheckBox);
	}
	
	private void ViewVisits() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_24 = new JButton("View");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_24.setBounds(10, 211, 101, 23);
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Edit");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				EditVisit();
			}
		});
		btnNewButton_25.setBounds(118, 211, 101, 23);
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Delete");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_26.setBounds(219, 211, 101, 23);
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("Interview");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_27.setBounds(330, 211, 101, 23);
		panel.add(btnNewButton_27);
		
		JButton btnNewButton_31 = new JButton("Back");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		btnNewButton_31.setBounds(330, 236, 101, 23);
		panel.add(btnNewButton_31);
		
		tableVisit = new JTable();
		tableVisit.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableVisit.setBounds(5, 166, 429, -167);
		panel.add(tableVisit);
		
		JLabel lblNewLabel_39 = new JLabel("Table here");
		lblNewLabel_39.setBounds(184, 61, 50, 14);
		panel.add(lblNewLabel_39);
	}
	
	private void Interview() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel_40 = new JLabel("Visit ID:");
		lblNewLabel_40.setBounds(24, 27, 37, 14);
		panel.add(lblNewLabel_40);
		
		textField_34 = new JTextField();
		textField_34.setBounds(68, 24, 86, 20);
		panel.add(textField_34);
		textField_34.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Date:");
		lblNewLabel_41.setBounds(195, 27, 46, 14);
		panel.add(lblNewLabel_41);
		
		textField_35 = new JTextField();
		textField_35.setBounds(230, 24, 86, 20);
		panel.add(textField_35);
		textField_35.setColumns(10);
		
		JLabel lblNewLabel_42 = new JLabel("Patient THC#");
		lblNewLabel_42.setBounds(24, 68, 71, 14);
		panel.add(lblNewLabel_42);
		
		textField_36 = new JTextField();
		textField_36.setBounds(94, 65, 86, 20);
		panel.add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_43 = new JLabel("THC#");
		lblNewLabel_43.setBounds(207, 68, 34, 14);
		panel.add(lblNewLabel_43);
		
		textField_37 = new JTextField();
		textField_37.setBounds(240, 65, 37, 20);
		panel.add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_44 = new JLabel("Visit no.");
		lblNewLabel_44.setBounds(294, 68, 46, 14);
		panel.add(lblNewLabel_44);
		
		textField_38 = new JTextField();
		textField_38.setBounds(338, 65, 46, 20);
		panel.add(textField_38);
		textField_38.setColumns(10);
		
		JButton btnNewButton_28 = new JButton("Initial/Follow-up interview");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				initialFollow();
			}
		});
		btnNewButton_28.setBounds(10, 108, 186, 28);
		panel.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("Tinnitus Handicap Inv (THI)");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				THI();
			}
		});
		btnNewButton_29.setBounds(10, 147, 186, 28);
		panel.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("Tinnitus Funct. Index (TFI)");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				TFI();
			}
		});
		btnNewButton_30.setBounds(10, 186, 186, 28);
		panel.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("Back");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		btnNewButton_31.setBounds(327, 227, 89, 23);
		panel.add(btnNewButton_31);
		
		JButton Pharma = new JButton("Pharmacology");
		Pharma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Pharmacology();
			}
		});
		Pharma.setBounds(230, 108, 186, 28);
		panel.add(Pharma);
		
		JButton Audio = new JButton("Audiology");
		Audio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Audiology();
			}
		});
		Audio.setBounds(230, 147, 186, 28);
		panel.add(Audio);
		
		JButton Diagnose = new JButton("Counseling");
		Diagnose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Counseling();
			}
		});
		Diagnose.setBounds(230, 186, 186, 28);
		panel.add(Diagnose);
		
		JButton RemInstrument = new JButton("REM/Instrument");
		RemInstrument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				InstruRem();
			}
		});
		RemInstrument.setBounds(10, 225, 186, 25);
		panel.add(RemInstrument);
	}

	private void THI() {
		frame.setBounds(100, 100, 450, 750);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 434, 709);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("1) Is it difficult to concentrate because of tinnitus?");
		lblNewLabel.setBounds(13, 45, 254, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2) Is it difficult for you to hear people because of your tinnitus?");
		lblNewLabel_1.setBounds(13, 70, 304, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0 Never, 2 Sometimes, 4 Always");
		lblNewLabel_2.setBounds(229, 20, 176, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3) Does tinnitus make you angry?");
		lblNewLabel_3.setBounds(13, 95, 304, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4) Does your tinnitus make you feel confused?");
		lblNewLabel_4.setBounds(13, 120, 270, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("5) Do you feel desperate because of your tinnitus?");
		lblNewLabel_5.setBounds(13, 145, 291, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("6) Do you often complain of your tinnitus?");
		lblNewLabel_6.setBounds(13, 170, 254, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("7) Because of your tinnitus, do you have trouble sleeping?");
		lblNewLabel_7.setBounds(13, 195, 304, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("8) Do you feel like you can not escape your tinnitus?");
		lblNewLabel_8.setBounds(13, 220, 270, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("9) Does your tinnitus affect your social life?");
		lblNewLabel_9.setBounds(13, 245, 254, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("10) Do you feel frustrated because of your tinnitus?");
		lblNewLabel_10.setBounds(13, 270, 254, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("11) Do you feel like your tinnitus is a terrible disease?");
		lblNewLabel_11.setBounds(13, 295, 270, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("12) Does your tinnitus make it difficult to enjoy life?");
		lblNewLabel_12.setBounds(13, 320, 254, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("13) Does your tinnitus affect your work or household responsibilities?");
		lblNewLabel_13.setBounds(13, 345, 341, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("14) Because of your tinnitus, do you find that you are often irritable?");
		lblNewLabel_14.setBounds(13, 370, 341, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("15) Does tinnitus affect your ability to read?");
		lblNewLabel_15.setBounds(13, 395, 291, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("16) Does your tinnitus make you upset?");
		lblNewLabel_16.setBounds(13, 420, 228, 14);
		panel.add(lblNewLabel_16);
		
		JButton btnNewButton_28 = new JButton("Submit/Update");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT1, INT2, INT3, INT4, INT5, INT6, INT7, INT8, INT9, INT10, INT11, INT12, INT13, INT14, INT15, INT16, INT17, INT18, INT19, INT20, INT21, INT22, INT23, INT24, INT25;;
				int Sc_T, Sc_F, Sc_E, Sc_C;
				try {//Visit
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {//F
					INT1 = Integer.parseInt(THIQ1.getText());
					INT2 = Integer.parseInt(THIQ2.getText());
					INT4 = Integer.parseInt(THIQ4.getText());
					INT7 = Integer.parseInt(THIQ7.getText());
					INT9 = Integer.parseInt(THIQ9.getText());
					INT12 = Integer.parseInt(THIQ12.getText());
					INT13 = Integer.parseInt(THIQ13.getText());
					INT15 = Integer.parseInt(THIQ15.getText());
					INT18 = Integer.parseInt(THIQ18.getText());
					INT20 = Integer.parseInt(THIQ20.getText());
					INT24 = Integer.parseInt(THIQ24.getText());
				}catch (NumberFormatException e1) {INT1 = 0; INT2 = 0; INT4 = 0; INT7 = 0; INT9 = 0; INT12 = 0; INT13 = 0; INT15 = 0; INT18 = 0; INT20 = 0; INT24 = 0;}
				try {//E
					INT3 = Integer.parseInt(THIQ3.getText());
					INT6 = Integer.parseInt(THIQ6.getText());
					INT10 = Integer.parseInt(THIQ10.getText());
					INT14 = Integer.parseInt(THIQ14.getText());
					INT16 = Integer.parseInt(THIQ16.getText());
					INT17 = Integer.parseInt(THIQ17.getText());
					INT21 = Integer.parseInt(THIQ21.getText());
					INT22 = Integer.parseInt(THIQ22.getText());
					INT25 = Integer.parseInt(THIQ25.getText());
				}catch (NumberFormatException e1) {INT3 = 0; INT6 = 0; INT10 = 0; INT14 = 0; INT16 = 0; INT17 = 0; INT21 = 0; INT22 = 0; INT25 = 0;}
				try {//C
					INT5 = Integer.parseInt(THIQ5.getText());
					INT8 = Integer.parseInt(THIQ8.getText());
					INT11 = Integer.parseInt(THIQ11.getText());
					INT19 = Integer.parseInt(THIQ19.getText());
					INT23 = Integer.parseInt(THIQ23.getText());
				}catch (NumberFormatException e1) {INT5 = 0; INT8 = 0; INT11 = 0; INT19 = 0; INT23 = 0;}
				
				Sc_F = INT1 + INT2 + INT4 + INT7 + INT9 + INT12 + INT13 + INT15 + INT18 + INT20 + INT24;
				Sc_E = INT3 + INT6 + INT10 + INT14 + INT16 + INT17 + INT21 + INT22 + INT25;
				Sc_C = INT5 + INT8 + INT11 + INT19 + INT23;
				
				Sc_T = Sc_F + Sc_E + Sc_C;
				System.out.println(Sc_T);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO THI (Visit_ID) VALUES ("+INT+")");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Warning, Old Visit");}	
				finally {}
					try {
						Connection con = getConnection();
						PreparedStatement posted = con.prepareStatement("UPDATE THI SET Sc_T = "+Sc_T+", Sc_F = "+Sc_F+", Sc_E = "+Sc_E+", Sc_C = "+Sc_C+", F1 = "+INT1+", F2 = "+INT2+", E3 = "+INT3+", F4 = "+INT4+", C5 = "+INT5+", E6 = "+INT6+", F7 = "+INT7+", C8 = "+INT8+", F9 = "+INT9+", E10 = "+INT10+", C11 = "+INT11+", F12 = "+INT12+", F13 = "+INT13+", E14 = "+INT14+", F15 = "+INT15+", E16 = "+INT16+", E17 = "+INT17+", F18 = "+INT18+", C19 = "+INT19+", F20 = "+INT20+", E21 = "+INT21+", E22 = "+INT22+", C23 = "+INT23+", F24 = "+INT24+", E25 = "+INT25+"  WHERE Visit_ID = "+INT+"");
						posted.executeUpdate();
					}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
					finally {
						JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		btnNewButton_28.setBounds(316, 675, 95, 23);
		panel.add(btnNewButton_28);
		
		JLabel lblNewLabel_17 = new JLabel("17) Does your tinnitus put stress on your relationships?");
		lblNewLabel_17.setBounds(13, 445, 279, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("18) Is it difficult to focus on things other than your tinnitus?");
		lblNewLabel_18.setBounds(13, 470, 304, 14);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("19) Do you feel like you have no control over your tinnitus?");
		lblNewLabel_19.setBounds(10, 495, 294, 14);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("20) Because of your tinnitus, do you often feel tired?");
		lblNewLabel_20.setBounds(10, 520, 307, 14);
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("21) Because of your tinnitus, do you feel depressed?");
		lblNewLabel_21.setBounds(10, 545, 257, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("22) Does your tinnitus make you feel anxious?");
		lblNewLabel_22.setBounds(13, 570, 270, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("23) Do you feel like you can no longer cope with your tinnitus?");
		lblNewLabel_23.setBounds(13, 595, 330, 14);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("24) Does your tinnitus worsen under stress?");
		lblNewLabel_24.setBounds(13, 620, 304, 14);
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("25) Does your tinnitus make you feel insecure?");
		lblNewLabel_25.setBounds(10, 645, 307, 14);
		panel.add(lblNewLabel_25);
		
		JButton btnNewButton_29 = new JButton("Back");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_29.setBounds(215, 675, 89, 23);
		panel.add(btnNewButton_29);
		
		JLabel lblNewLabel_26 = new JLabel("Grade:");
		lblNewLabel_26.setBounds(20, 679, 46, 14);
		panel.add(lblNewLabel_26);
		
		JTextPane txtpnGradethi = new JTextPane();
		txtpnGradethi.setText("GradeTHI");
		txtpnGradethi.setBounds(62, 675, 119, 20);
		panel.add(txtpnGradethi);
		
		THIQ1 = new JTextField();
		THIQ1.setText("0");
		THIQ1.setColumns(10);
		THIQ1.setBounds(390, 39, 34, 20);
		panel.add(THIQ1);
		
		THIQ2 = new JTextField();
		THIQ2.setText("0");
		THIQ2.setColumns(10);
		THIQ2.setBounds(390, 64, 34, 20);
		panel.add(THIQ2);
		
		THIQ3 = new JTextField();
		THIQ3.setText("0");
		THIQ3.setColumns(10);
		THIQ3.setBounds(390, 89, 34, 20);
		panel.add(THIQ3);
		
		THIQ4 = new JTextField();
		THIQ4.setText("0");
		THIQ4.setColumns(10);
		THIQ4.setBounds(390, 114, 34, 20);
		panel.add(THIQ4);
		
		THIQ5 = new JTextField();
		THIQ5.setText("0");
		THIQ5.setColumns(10);
		THIQ5.setBounds(390, 139, 34, 20);
		panel.add(THIQ5);
		
		THIQ6 = new JTextField();
		THIQ6.setText("0");
		THIQ6.setColumns(10);
		THIQ6.setBounds(390, 164, 34, 20);
		panel.add(THIQ6);
		
		THIQ7 = new JTextField();
		THIQ7.setText("0");
		THIQ7.setColumns(10);
		THIQ7.setBounds(390, 189, 34, 20);
		panel.add(THIQ7);
		
		THIQ8 = new JTextField();
		THIQ8.setText("0");
		THIQ8.setColumns(10);
		THIQ8.setBounds(390, 214, 34, 20);
		panel.add(THIQ8);
		
		THIQ9 = new JTextField();
		THIQ9.setText("0");
		THIQ9.setColumns(10);
		THIQ9.setBounds(390, 239, 34, 20);
		panel.add(THIQ9);
		
		THIQ10 = new JTextField();
		THIQ10.setText("0");
		THIQ10.setColumns(10);
		THIQ10.setBounds(390, 264, 34, 20);
		panel.add(THIQ10);
		
		THIQ11 = new JTextField();
		THIQ11.setText("0");
		THIQ11.setColumns(10);
		THIQ11.setBounds(390, 289, 34, 20);
		panel.add(THIQ11);
		
		THIQ12 = new JTextField();
		THIQ12.setText("0");
		THIQ12.setColumns(10);
		THIQ12.setBounds(390, 314, 34, 20);
		panel.add(THIQ12);
		
		THIQ13 = new JTextField();
		THIQ13.setText("0");
		THIQ13.setColumns(10);
		THIQ13.setBounds(390, 339, 34, 20);
		panel.add(THIQ13);
		
		THIQ14 = new JTextField();
		THIQ14.setText("0");
		THIQ14.setColumns(10);
		THIQ14.setBounds(390, 364, 34, 20);
		panel.add(THIQ14);
		
		THIQ15 = new JTextField();
		THIQ15.setText("0");
		THIQ15.setColumns(10);
		THIQ15.setBounds(390, 389, 34, 20);
		panel.add(THIQ15);
		
		THIQ16 = new JTextField();
		THIQ16.setText("0");
		THIQ16.setColumns(10);
		THIQ16.setBounds(390, 414, 34, 20);
		panel.add(THIQ16);
		
		THIQ17 = new JTextField();
		THIQ17.setText("0");
		THIQ17.setColumns(10);
		THIQ17.setBounds(390, 439, 34, 20);
		panel.add(THIQ17);
		
		THIQ18 = new JTextField();
		THIQ18.setText("0");
		THIQ18.setColumns(10);
		THIQ18.setBounds(390, 464, 34, 20);
		panel.add(THIQ18);
		
		THIQ19 = new JTextField();
		THIQ19.setText("0");
		THIQ19.setColumns(10);
		THIQ19.setBounds(390, 489, 34, 20);
		panel.add(THIQ19);
		
		THIQ20 = new JTextField();
		THIQ20.setText("0");
		THIQ20.setColumns(10);
		THIQ20.setBounds(390, 514, 34, 20);
		panel.add(THIQ20);
		
		THIQ21 = new JTextField();
		THIQ21.setText("0");
		THIQ21.setColumns(10);
		THIQ21.setBounds(390, 539, 34, 20);
		panel.add(THIQ21);
		
		THIQ22 = new JTextField();
		THIQ22.setText("0");
		THIQ22.setColumns(10);
		THIQ22.setBounds(390, 564, 34, 20);
		panel.add(THIQ22);
		
		THIQ23 = new JTextField();
		THIQ23.setText("0");
		THIQ23.setColumns(10);
		THIQ23.setBounds(390, 589, 34, 20);
		panel.add(THIQ23);
		
		THIQ24 = new JTextField();
		THIQ24.setText("0");
		THIQ24.setColumns(10);
		THIQ24.setBounds(390, 614, 34, 20);
		panel.add(THIQ24);
		
		THIQ25 = new JTextField();
		THIQ25.setText("0");
		THIQ25.setColumns(10);
		THIQ25.setBounds(390, 639, 34, 20);
		panel.add(THIQ25);
		
		VisitID = new JTextField();
		VisitID.setBounds(79, 14, 86, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Visit ID:");
		lblNewLabel_27.setBounds(31, 20, 46, 14);
		panel.add(lblNewLabel_27);
		
	}
	
	private void initialFollow() {
		frame.setBounds(100, 100, 450, 300);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Inital Form");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				initial();
			}
		});
		btnNewButton.setBounds(58, 48, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Follow up Form");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				follow();
			}
		});
		btnNewButton_1.setBounds(58, 98, 111, 39);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_2.setBounds(285, 192, 89, 23);
		panel.add(btnNewButton_2);
	}
	
	private void initial() {
		frame.setBounds(100, 100, 450, 900);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 861);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clinic:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_290 = new JLabel("Visit ID*:");
		lblNewLabel_290.setBounds(280, 53, 46, 14);
		panel.add(lblNewLabel_290);
		
		VisitID = new JTextField();
		VisitID.setBounds(331, 50, 32, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 33, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOB:");
		lblNewLabel_2.setBounds(110, 11, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SSN:");
		lblNewLabel_3.setBounds(110, 33, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Insurance:");
		lblNewLabel_4.setBounds(229, 11, 71, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date:");
		lblNewLabel_5.setBounds(229, 33, 46, 14);
		panel.add(lblNewLabel_5);
		
		JTextPane txtpnClinic = new JTextPane();
		txtpnClinic.setText("Clinic");
		txtpnClinic.setBounds(41, 5, 59, 20);
		panel.add(txtpnClinic);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name");
		txtpnName.setBounds(41, 27, 59, 20);
		panel.add(txtpnName);
		
		JTextPane txtpnDob = new JTextPane();
		txtpnDob.setText("DOB");
		txtpnDob.setBounds(138, 5, 71, 20);
		panel.add(txtpnDob);
		
		JTextPane txtpnSsn = new JTextPane();
		txtpnSsn.setText("SSN");
		txtpnSsn.setBounds(138, 27, 71, 20);
		panel.add(txtpnSsn);
		
		JTextPane txtpnInsurance = new JTextPane();
		txtpnInsurance.setText("Insurance");
		txtpnInsurance.setBounds(287, 5, 92, 20);
		panel.add(txtpnInsurance);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		txtpnDate.setBounds(285, 27, 92, 20);
		panel.add(txtpnDate);
		
		JLabel lblNewLabel_29 = new JLabel("Visit ID*:");
		lblNewLabel_29.setBounds(280, 53, 46, 14);
		panel.add(lblNewLabel_29);
		
		VisitID = new JTextField();
		VisitID.setBounds(331, 50, 32, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("R/L/Both Ears/Head:");
		lblNewLabel_6.setBounds(14, 79, 138, 14);
		panel.add(lblNewLabel_6);
		
		Ears = new JTextField();
		Ears.setBounds(142, 79, 59, 20);
		panel.add(Ears);
		Ears.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("When:");
		lblNewLabel_8.setBounds(219, 79, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Fluctuates:");
		lblNewLabel_9.setBounds(142, 104, 71, 14);
		panel.add(lblNewLabel_9);
		
		When = new JTextField();
		When.setBounds(275, 76, 93, 20);
		panel.add(When);
		When.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\"Bad days\":");
		lblNewLabel_10.setBounds(275, 104, 77, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Frequency:");
		lblNewLabel_11.setBounds(291, 129, 77, 14);
		panel.add(lblNewLabel_11);
		
		Freq = new JTextField();
		Freq.setBounds(355, 126, 73, 20);
		panel.add(Freq);
		Freq.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Activities Affected:");
		lblNewLabel_12.setBounds(14, 129, 113, 14);
		panel.add(lblNewLabel_12);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Concentration");
		rdbtnNewRadioButton.setBounds(18, 150, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sleep");
		rdbtnNewRadioButton_1.setBounds(18, 168, 71, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("QRA");
		rdbtnNewRadioButton_2.setBounds(18, 186, 59, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Work");
		rdbtnNewRadioButton_3.setBounds(18, 204, 59, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Restaurants");
		rdbtnNewRadioButton_4.setBounds(18, 222, 95, 23);
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Sports");
		rdbtnNewRadioButton_5.setBounds(18, 242, 71, 23);
		panel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Social");
		rdbtnNewRadioButton_6.setBounds(18, 260, 71, 23);
		panel.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Other");
		rdbtnNewRadioButton_7.setBounds(18, 281, 64, 23);
		panel.add(rdbtnNewRadioButton_7);
		
		JLabel lblNewLabel_13 = new JLabel("Effect of sound:");
		lblNewLabel_13.setBounds(124, 136, 108, 14);
		panel.add(lblNewLabel_13);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Louder", "Softer"}));
		comboBox.setBounds(224, 132, 64, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_14 = new JLabel("How long?");
		lblNewLabel_14.setBounds(154, 154, 59, 14);
		panel.add(lblNewLabel_14);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"mins", "hours", "days"}));
		comboBox_1.setBounds(219, 154, 73, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_15 = new JLabel("Ear Overprotection:");
		lblNewLabel_15.setBounds(114, 190, 113, 14);
		panel.add(lblNewLabel_15);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2.setBounds(205, 100, 50, 22);
		panel.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_1.setBounds(355, 100, 50, 22);
		panel.add(comboBox_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_2.setBounds(224, 186, 50, 22);
		panel.add(comboBox_2_2);
		
		JLabel lblNewLabel_16 = new JLabel("in quiet:");
		lblNewLabel_16.setBounds(114, 208, 46, 14);
		panel.add(lblNewLabel_16);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_3.setBounds(224, 204, 46, 22);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_17 = new JLabel("Any other T specific treatments:");
		lblNewLabel_17.setBounds(114, 226, 190, 14);
		panel.add(lblNewLabel_17);
		
		TTreat = new JTextField();
		TTreat.setBounds(301, 223, 127, 20);
		panel.add(TTreat);
		TTreat.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Why is T a problem?");
		lblNewLabel_18.setBounds(114, 246, 151, 14);
		panel.add(lblNewLabel_18);
		
		Tprob = new JTextField();
		Tprob.setBounds(234, 243, 194, 20);
		panel.add(Tprob);
		Tprob.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("% of time when Aware:");
		lblNewLabel_19.setBounds(114, 264, 138, 14);
		panel.add(lblNewLabel_19);
		
		Aware = new JTextField();
		Aware.setBounds(247, 261, 32, 20);
		panel.add(Aware);
		Aware.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Annoyed:");
		lblNewLabel_20.setBounds(285, 264, 65, 14);
		panel.add(lblNewLabel_20);
		
		Annoyed = new JTextField();
		Annoyed.setBounds(342, 261, 41, 20);
		panel.add(Annoyed);
		Annoyed.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Severity:");
		lblNewLabel_21.setBounds(14, 311, 101, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Annoyance:");
		lblNewLabel_22.setBounds(14, 328, 101, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Effect on Life:");
		lblNewLabel_23.setBounds(14, 346, 101, 14);
		panel.add(lblNewLabel_23);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(114, 307, 46, 22);
		panel.add(comboBox_4);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_1.setBounds(114, 324, 46, 22);
		panel.add(comboBox_4_1);
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_2.setBounds(114, 342, 46, 22);
		panel.add(comboBox_4_2);
		
		JLabel lblNewLabel_24 = new JLabel("Comments:");
		lblNewLabel_24.setBounds(168, 311, 71, 14);
		panel.add(lblNewLabel_24);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Gradual", "Sudden"}));
		comboBox_5.setBounds(14, 100, 92, 22);
		panel.add(comboBox_5);
		
		Comments = new JTextField();
		Comments.setBounds(234, 308, 203, 23);
		panel.add(Comments);
		Comments.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Sound Tolerance --------------------------------------------------------------------------------");
		lblNewLabel_7.setBounds(14, 371, 423, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_25 = new JLabel("Oversensitivity:");
		lblNewLabel_25.setBounds(14, 396, 90, 14);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Physical discomfort?");
		lblNewLabel_26.setBounds(162, 396, 132, 14);
		panel.add(lblNewLabel_26);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_6.setBounds(107, 392, 45, 22);
		panel.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_7.setBounds(288, 392, 41, 22);
		panel.add(comboBox_7);
		
		JLabel lblNewLabel_10_1 = new JLabel("\"Bad days\":");
		lblNewLabel_10_1.setBounds(14, 425, 77, 14);
		panel.add(lblNewLabel_10_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_1_1.setBounds(94, 421, 50, 22);
		panel.add(comboBox_2_1_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Frequency:");
		lblNewLabel_11_1.setBounds(167, 424, 77, 14);
		panel.add(lblNewLabel_11_1);
		
		FreqST = new JTextField();
		FreqST.setColumns(10);
		FreqST.setBounds(231, 421, 73, 20);
		panel.add(FreqST);
		
		JLabel lblNewLabel_27 = new JLabel("Troublesome sounds:");
		lblNewLabel_27.setBounds(14, 450, 113, 14);
		panel.add(lblNewLabel_27);
		
		TroubleSound = new JTextField();
		TroubleSound.setBounds(137, 447, 167, 20);
		panel.add(TroubleSound);
		TroubleSound.setColumns(10);
		
		JLabel lblNewLabel_12_1 = new JLabel("Activities Affected:");
		lblNewLabel_12_1.setBounds(314, 425, 113, 14);
		panel.add(lblNewLabel_12_1);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Concerts");
		rdbtnNewRadioButton_8.setBounds(306, 437, 109, 23);
		panel.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_8_1 = new JRadioButton("Restaurants");
		rdbtnNewRadioButton_8_1.setBounds(306, 457, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1);
		
		JRadioButton rdbtnNewRadioButton_8_1_1 = new JRadioButton("Housekeeping");
		rdbtnNewRadioButton_8_1_1.setBounds(306, 477, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_1);
		
		JRadioButton rdbtnNewRadioButton_8_2 = new JRadioButton("Shopping");
		rdbtnNewRadioButton_8_2.setBounds(306, 497, 109, 23);
		panel.add(rdbtnNewRadioButton_8_2);
		
		JRadioButton rdbtnNewRadioButton_8_1_2 = new JRadioButton("Driving");
		rdbtnNewRadioButton_8_1_2.setBounds(306, 517, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_2);
		
		JRadioButton rdbtnNewRadioButton_8_1_1_1 = new JRadioButton("Childcare");
		rdbtnNewRadioButton_8_1_1_1.setBounds(306, 537, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_8_1_1_1_1 = new JRadioButton("Other");
		rdbtnNewRadioButton_8_1_1_1_1.setBounds(306, 657, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_8_3 = new JRadioButton("Movies");
		rdbtnNewRadioButton_8_3.setBounds(306, 557, 109, 23);
		panel.add(rdbtnNewRadioButton_8_3);
		
		JRadioButton rdbtnNewRadioButton_8_1_3 = new JRadioButton("Sports");
		rdbtnNewRadioButton_8_1_3.setBounds(306, 577, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_3);
		
		JRadioButton rdbtnNewRadioButton_8_1_1_2 = new JRadioButton("Social");
		rdbtnNewRadioButton_8_1_1_2.setBounds(306, 597, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_8_2_1 = new JRadioButton("Work");
		rdbtnNewRadioButton_8_2_1.setBounds(306, 617, 109, 23);
		panel.add(rdbtnNewRadioButton_8_2_1);
		
		JRadioButton rdbtnNewRadioButton_8_1_2_1 = new JRadioButton("Church");
		rdbtnNewRadioButton_8_1_2_1.setBounds(306, 637, 109, 23);
		panel.add(rdbtnNewRadioButton_8_1_2_1);
		
		JLabel lblNewLabel_28 = new JLabel("% of time:");
		lblNewLabel_28.setBounds(314, 154, 69, 14);
		panel.add(lblNewLabel_28);
		
		TimePerc = new JTextField();
		TimePerc.setBounds(373, 151, 32, 20);
		panel.add(TimePerc);
		TimePerc.setColumns(10);
		
		JLabel lblNewLabel_13_1 = new JLabel("Effect of sound:");
		lblNewLabel_13_1.setBounds(23, 479, 108, 14);
		panel.add(lblNewLabel_13_1);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"None", "Stronger", "Weaker"}));
		comboBox_8.setBounds(123, 475, 64, 22);
		panel.add(comboBox_8);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"mins", "hours", "days"}));
		comboBox_1_1.setBounds(118, 497, 73, 22);
		panel.add(comboBox_1_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("How long?");
		lblNewLabel_14_1.setBounds(53, 497, 59, 14);
		panel.add(lblNewLabel_14_1);
		
		JLabel awdawd = new JLabel("% of time:");
		awdawd.setBounds(178, 533, 69, 14);
		panel.add(awdawd);
		
		TimePercST = new JTextField();
		TimePercST.setColumns(10);
		TimePercST.setBounds(234, 531, 32, 20);
		panel.add(TimePercST);
		
		JLabel lblNewLabel_15_1 = new JLabel("Ear Overprotection:");
		lblNewLabel_15_1.setBounds(13, 533, 113, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("in quiet:");
		lblNewLabel_16_1.setBounds(13, 551, 46, 14);
		panel.add(lblNewLabel_16_1);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_3_1.setBounds(123, 547, 46, 22);
		panel.add(comboBox_3_1);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_2_1.setBounds(123, 529, 50, 22);
		panel.add(comboBox_2_2_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Any other ST specific treatments:");
		lblNewLabel_17_1.setBounds(10, 581, 261, 14);
		panel.add(lblNewLabel_17_1);
		
		STTreats = new JTextField();
		STTreats.setColumns(10);
		STTreats.setBounds(197, 578, 97, 20);
		panel.add(STTreats);
		
		JLabel lblNewLabel_18_1 = new JLabel("Why is ST a problem?");
		lblNewLabel_18_1.setBounds(10, 601, 203, 14);
		panel.add(lblNewLabel_18_1);
		
		STProb = new JTextField();
		STProb.setColumns(10);
		STProb.setBounds(130, 598, 164, 20);
		panel.add(STProb);
		
		JLabel lblNewLabel_21_1 = new JLabel("Severity:");
		lblNewLabel_21_1.setBounds(14, 627, 101, 14);
		panel.add(lblNewLabel_21_1);
		
		JComboBox comboBox_4_3 = new JComboBox();
		comboBox_4_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_3.setBounds(114, 623, 46, 22);
		panel.add(comboBox_4_3);
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		comboBox_4_1_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_1_1.setBounds(114, 640, 46, 22);
		panel.add(comboBox_4_1_1);
		
		JLabel lblNewLabel_22_1 = new JLabel("Annoyance:");
		lblNewLabel_22_1.setBounds(14, 644, 101, 14);
		panel.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_23_1 = new JLabel("Effect on Life:");
		lblNewLabel_23_1.setBounds(14, 662, 101, 14);
		panel.add(lblNewLabel_23_1);
		
		JComboBox comboBox_4_2_1 = new JComboBox();
		comboBox_4_2_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_2_1.setBounds(114, 658, 46, 22);
		panel.add(comboBox_4_2_1);
		
		JLabel lblNewLabel_24_1 = new JLabel("Comments:");
		lblNewLabel_24_1.setBounds(14, 687, 71, 14);
		panel.add(lblNewLabel_24_1);
		
		CommentsST = new JTextField();
		CommentsST.setColumns(10);
		CommentsST.setBounds(76, 684, 203, 23);
		panel.add(CommentsST);
		
		JLabel lblNewLabel_7_1 = new JLabel("Tinnitus ----------------------------------------------------------------------------------------------");
		lblNewLabel_7_1.setBounds(10, 54, 423, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("---------------------------------------------------------------------------------------------------------");
		lblNewLabel_7_2.setBounds(5, 712, 423, 14);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_291 = new JLabel("Hearing Problem?");
		lblNewLabel_291.setBounds(10, 725, 103, 14);
		panel.add(lblNewLabel_291);
		
		JLabel lblNewLabel_30 = new JLabel("Hearing Aids");
		lblNewLabel_30.setBounds(10, 745, 90, 14);
		panel.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Ever recommended");
		lblNewLabel_31.setBounds(10, 764, 103, 14);
		panel.add(lblNewLabel_31);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_9.setBounds(138, 721, 49, 22);
		panel.add(comboBox_9);
		
		JComboBox comboBox_9_1 = new JComboBox();
		comboBox_9_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_9_1.setBounds(138, 741, 49, 22);
		panel.add(comboBox_9_1);
		
		JComboBox comboBox_9_2 = new JComboBox();
		comboBox_9_2.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_9_2.setBounds(138, 760, 49, 22);
		panel.add(comboBox_9_2);
		
		JLabel lblNewLabel_32 = new JLabel("Category:");
		lblNewLabel_32.setBounds(197, 725, 68, 14);
		panel.add(lblNewLabel_32);
		
		Cate = new JTextField();
		Cate.setBounds(268, 722, 61, 20);
		panel.add(Cate);
		Cate.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("Type:");
		lblNewLabel_33.setBounds(197, 745, 46, 14);
		panel.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Recommendation:");
		lblNewLabel_34.setBounds(197, 764, 91, 14);
		panel.add(lblNewLabel_34);
		
		Type = new JTextField();
		Type.setBounds(268, 742, 61, 20);
		panel.add(Type);
		Type.setColumns(10);
		
		Recomm = new JTextField();
		Recomm.setBounds(293, 761, 135, 20);
		panel.add(Recomm);
		Recomm.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("Ranking problems:");
		lblNewLabel_35.setBounds(10, 781, 117, 14);
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Tinnitus:");
		lblNewLabel_36.setBounds(10, 798, 67, 14);
		panel.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Sound tolerance:");
		lblNewLabel_37.setBounds(10, 818, 111, 14);
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Hearing:");
		lblNewLabel_38.setBounds(10, 836, 46, 14);
		panel.add(lblNewLabel_38);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_10.setBounds(110, 794, 46, 22);
		panel.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_11.setBounds(110, 814, 46, 22);
		panel.add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_12.setBounds(110, 832, 46, 22);
		panel.add(comboBox_12);
		
		JLabel lblNewLabel_39 = new JLabel("Ptn Decision:");
		lblNewLabel_39.setBounds(168, 798, 87, 14);
		panel.add(lblNewLabel_39);
		
		PtnDecision = new JTextField();
		PtnDecision.setBounds(244, 795, 95, 20);
		panel.add(PtnDecision);
		PtnDecision.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("Next visit:");
		lblNewLabel_40.setBounds(168, 818, 84, 14);
		panel.add(lblNewLabel_40);
		
		NextVisit = new JTextField();
		NextVisit.setBounds(248, 815, 56, 20);
		panel.add(NextVisit);
		NextVisit.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				initialFollow();
			}
		});
		btnNewButton.setBounds(342, 792, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT1, INT2, INT3, INT4, INT5, INT6;
				try {
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT1 = Integer.parseInt(Freq.getText());
					INT3 = Integer.parseInt(Aware.getText());
					INT4 = Integer.parseInt(Annoyed.getText());
					INT5 = Integer.parseInt(TimePercST.getText());
					INT6 = Integer.parseInt(FreqST.getText());
				}catch (NumberFormatException e1) {INT1 = 0;INT2 = 0;INT3 = 0;INT4 = 0;INT5 = 0;INT6 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Interview SET Tin_Freq = "+INT1+", Tin_Threatm = '"+TTreat.getText()+"', AwT = "+INT3+", AnT = "+INT4+", Tin_comments = '"+Comments+"', DST_Treat = '"+STTreats.getText()+"', DSTT = "+INT5+", DST_Freq = "+INT6+", DST_Comments = '"+CommentsST.getText()+"', Recom = '"+Recomm.getText()+"', HA_Comments = '"+GiveBack+"', Where = '"+Ears.getText()+"', Tin_why_prob = '"+Tprob.getText()+"', DST_why_prob = '"+STProb.getText()+"', Cat = '"+Cate.getText()+"'. type1 = '"+Type.getText()+"', Comments = '"+PtnDecision+"' WHERE Visit_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		btnNewButton_1.setBounds(342, 814, 89, 23);
		panel.add(btnNewButton_1);
	}
	
	private void follow() {
		frame.setBounds(100, 100, 450, 900);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 861);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clinic:");
		lblNewLabel.setBounds(10, 6, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane txtpnInsurance = new JTextPane();
		txtpnInsurance.setText("Insurance");
		txtpnInsurance.setBounds(295, 0, 92, 20);
		panel.add(txtpnInsurance);
		
		JLabel lblNewLabel_4 = new JLabel("Insurance:");
		lblNewLabel_4.setBounds(229, 6, 71, 14);
		panel.add(lblNewLabel_4);
		
		JTextPane txtpnDob = new JTextPane();
		txtpnDob.setText("DOB");
		txtpnDob.setBounds(148, 0, 71, 20);
		panel.add(txtpnDob);
		
		JLabel lblNewLabel_2 = new JLabel("DOB:");
		lblNewLabel_2.setBounds(120, 6, 46, 14);
		panel.add(lblNewLabel_2);
		
		JTextPane txtpnClinic = new JTextPane();
		txtpnClinic.setText("Clinic");
		txtpnClinic.setBounds(51, 0, 59, 20);
		panel.add(txtpnClinic);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name");
		txtpnName.setBounds(51, 22, 59, 20);
		panel.add(txtpnName);
		
		JLabel lblNewLabel_29 = new JLabel("Visit ID*:");
		lblNewLabel_29.setBounds(280, 53, 46, 14);
		panel.add(lblNewLabel_29);
		
		VisitID = new JTextField();
		VisitID.setBounds(331, 50, 32, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("SSN:");
		lblNewLabel_3.setBounds(120, 28, 46, 14);
		panel.add(lblNewLabel_3);
		
		JTextPane txtpnSsn = new JTextPane();
		txtpnSsn.setText("SSN");
		txtpnSsn.setBounds(148, 22, 71, 20);
		panel.add(txtpnSsn);
		
		JLabel lblNewLabel_5 = new JLabel("Date:");
		lblNewLabel_5.setBounds(229, 28, 46, 14);
		panel.add(lblNewLabel_5);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		txtpnDate.setBounds(295, 22, 92, 20);
		panel.add(txtpnDate);
		
		JLabel lblNewLabel_7_1 = new JLabel("Tinnitus ----------------------------------------------------------------------------------------------");
		lblNewLabel_7_1.setBounds(10, 89, 423, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6 = new JLabel("Category:");
		lblNewLabel_6.setBounds(10, 53, 59, 14);
		panel.add(lblNewLabel_6);
		
		JTextPane txtpnCategory = new JTextPane();
		txtpnCategory.setText("Category");
		txtpnCategory.setBounds(65, 53, 45, 20);
		panel.add(txtpnCategory);
		
		JLabel lblNewLabel_7 = new JLabel("Date of initial:");
		lblNewLabel_7.setBounds(123, 53, 96, 14);
		panel.add(lblNewLabel_7);
		
		JTextPane txtpnInitialDate = new JTextPane();
		txtpnInitialDate.setText("Initial Date");
		txtpnInitialDate.setBounds(199, 53, 59, 20);
		panel.add(txtpnInitialDate);
		
		JLabel lblNewLabel_12 = new JLabel("Activities Affected:");
		lblNewLabel_12.setBounds(10, 106, 113, 14);
		panel.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Changes?");
		chckbxNewCheckBox.setBounds(10, 279, 86, 23);
		panel.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Other");
		rdbtnNewRadioButton_7.setBounds(10, 253, 64, 23);
		panel.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Social");
		rdbtnNewRadioButton_6.setBounds(10, 232, 71, 23);
		panel.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Sports");
		rdbtnNewRadioButton_5.setBounds(10, 214, 71, 23);
		panel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Restaurants");
		rdbtnNewRadioButton_4.setBounds(10, 194, 95, 23);
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Work");
		rdbtnNewRadioButton_3.setBounds(10, 176, 59, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sleep");
		rdbtnNewRadioButton_1.setBounds(10, 140, 71, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("QRA");
		rdbtnNewRadioButton_2.setBounds(10, 158, 59, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Concentration");
		rdbtnNewRadioButton.setBounds(10, 122, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_8 = new JLabel("Prior?");
		lblNewLabel_8.setBounds(120, 106, 46, 14);
		panel.add(lblNewLabel_8);
		
		JRadioButton ConcentrationP = new JRadioButton("");
		ConcentrationP.setBounds(120, 122, 21, 23);
		panel.add(ConcentrationP);
		
		JRadioButton SleepP = new JRadioButton("");
		SleepP.setBounds(120, 140, 21, 23);
		panel.add(SleepP);
		
		JRadioButton QraP = new JRadioButton("");
		QraP.setBounds(120, 158, 21, 23);
		panel.add(QraP);
		
		JRadioButton WorkP = new JRadioButton("");
		WorkP.setBounds(120, 176, 21, 23);
		panel.add(WorkP);
		
		JRadioButton SocialP = new JRadioButton("");
		SocialP.setBounds(120, 230, 21, 23);
		panel.add(SocialP);
		
		JRadioButton OtherP = new JRadioButton("");
		OtherP.setBounds(120, 248, 21, 23);
		panel.add(OtherP);
		
		JRadioButton ResP = new JRadioButton("");
		ResP.setBounds(120, 194, 21, 23);
		panel.add(ResP);
		
		JRadioButton SportsP = new JRadioButton("");
		SportsP.setBounds(120, 212, 21, 23);
		panel.add(SportsP);
		
		JLabel lblNewLabel_10 = new JLabel("\"Bad days\":");
		lblNewLabel_10.setBounds(170, 110, 77, 14);
		panel.add(lblNewLabel_10);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_1.setBounds(250, 106, 50, 22);
		panel.add(comboBox_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("Frequency:");
		lblNewLabel_11.setBounds(170, 134, 77, 14);
		panel.add(lblNewLabel_11);
		
		Freq = new JTextField();
		Freq.setColumns(10);
		Freq.setBounds(234, 131, 73, 20);
		panel.add(Freq);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("As Bad?");
		chckbxNewCheckBox_1.setBounds(320, 110, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("As Frequent?");
		chckbxNewCheckBox_2.setBounds(320, 130, 97, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_13 = new JLabel("Effect of sound:");
		lblNewLabel_13.setBounds(170, 162, 108, 14);
		panel.add(lblNewLabel_13);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Louder", "Softer"}));
		comboBox.setBounds(274, 158, 64, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"mins", "hours", "days"}));
		comboBox_1.setBounds(265, 180, 73, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_14 = new JLabel("How long?");
		lblNewLabel_14.setBounds(200, 180, 59, 14);
		panel.add(lblNewLabel_14);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_2.setBounds(280, 215, 50, 22);
		panel.add(comboBox_2_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_3.setBounds(280, 233, 46, 22);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_15 = new JLabel("Ear Overprotection:");
		lblNewLabel_15.setBounds(170, 219, 113, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("in quiet:");
		lblNewLabel_16.setBounds(170, 237, 46, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_28 = new JLabel("% of time:");
		lblNewLabel_28.setBounds(340, 217, 69, 14);
		panel.add(lblNewLabel_28);
		
		TimePerc = new JTextField();
		TimePerc.setColumns(10);
		TimePerc.setBounds(399, 214, 32, 20);
		panel.add(TimePerc);
		
		JLabel lblNewLabel_17 = new JLabel("Any other T specific treatments:");
		lblNewLabel_17.setBounds(103, 282, 190, 14);
		panel.add(lblNewLabel_17);
		
		TTreat = new JTextField();
		TTreat.setColumns(10);
		TTreat.setBounds(290, 279, 127, 20);
		panel.add(TTreat);
		
		JLabel lblNewLabel_19 = new JLabel("% of time when Aware:");
		lblNewLabel_19.setBounds(10, 304, 138, 14);
		panel.add(lblNewLabel_19);
		
		Aware = new JTextField();
		Aware.setColumns(10);
		Aware.setBounds(143, 301, 32, 20);
		panel.add(Aware);
		
		JLabel lblNewLabel_20 = new JLabel("Annoyed:");
		lblNewLabel_20.setBounds(181, 304, 65, 14);
		panel.add(lblNewLabel_20);
		
		Annoyed = new JTextField();
		Annoyed.setColumns(10);
		Annoyed.setBounds(238, 301, 41, 20);
		panel.add(Annoyed);
		
		JLabel lblNewLabel_21 = new JLabel("Severity:");
		lblNewLabel_21.setBounds(287, 311, 101, 14);
		panel.add(lblNewLabel_21);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(387, 307, 46, 22);
		panel.add(comboBox_4);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_1.setBounds(387, 324, 46, 22);
		panel.add(comboBox_4_1);
		
		JLabel lblNewLabel_22 = new JLabel("Annoyance:");
		lblNewLabel_22.setBounds(287, 328, 101, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Effect on Life:");
		lblNewLabel_23.setBounds(287, 346, 101, 14);
		panel.add(lblNewLabel_23);
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_2.setBounds(387, 342, 46, 22);
		panel.add(comboBox_4_2);
		
		JLabel lblNewLabel_24 = new JLabel("Comments:");
		lblNewLabel_24.setBounds(10, 332, 71, 14);
		panel.add(lblNewLabel_24);
		
		Comments = new JTextField();
		Comments.setColumns(10);
		Comments.setBounds(76, 329, 203, 23);
		panel.add(Comments);
		
		JLabel lblNewLabel_7_2 = new JLabel("Sound Tolerance --------------------------------------------------------------------------------");
		lblNewLabel_7_2.setBounds(10, 365, 423, 14);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_27 = new JLabel("Troublesome sounds:");
		lblNewLabel_27.setBounds(10, 382, 113, 14);
		panel.add(lblNewLabel_27);
		
		TroubleSound = new JTextField();
		TroubleSound.setColumns(10);
		TroubleSound.setBounds(133, 379, 167, 20);
		panel.add(TroubleSound);
		
		JLabel lblNewLabel_12_1 = new JLabel("Activities Affected:");
		lblNewLabel_12_1.setBounds(10, 402, 113, 14);
		panel.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Prior?");
		lblNewLabel_8_1.setBounds(120, 402, 46, 14);
		panel.add(lblNewLabel_8_1);
		
		JRadioButton ConcentrationP_1 = new JRadioButton("");
		ConcentrationP_1.setBounds(120, 418, 21, 23);
		panel.add(ConcentrationP_1);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Concentration");
		rdbtnNewRadioButton_8.setBounds(10, 418, 109, 23);
		panel.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Sleep");
		rdbtnNewRadioButton_1_1.setBounds(10, 436, 71, 23);
		panel.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("QRA");
		rdbtnNewRadioButton_2_1.setBounds(10, 454, 59, 23);
		panel.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton SleepP_1 = new JRadioButton("");
		SleepP_1.setBounds(120, 436, 21, 23);
		panel.add(SleepP_1);
		
		JRadioButton QraP_1 = new JRadioButton("");
		QraP_1.setBounds(120, 454, 21, 23);
		panel.add(QraP_1);
		
		JRadioButton WorkP_1 = new JRadioButton("");
		WorkP_1.setBounds(120, 472, 21, 23);
		panel.add(WorkP_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Work");
		rdbtnNewRadioButton_3_1.setBounds(10, 472, 59, 23);
		panel.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("Restaurants");
		rdbtnNewRadioButton_4_1.setBounds(10, 490, 95, 23);
		panel.add(rdbtnNewRadioButton_4_1);
		
		JRadioButton rdbtnNewRadioButton_5_1 = new JRadioButton("Sports");
		rdbtnNewRadioButton_5_1.setBounds(10, 510, 71, 23);
		panel.add(rdbtnNewRadioButton_5_1);
		
		JRadioButton ResP_1 = new JRadioButton("");
		ResP_1.setBounds(120, 490, 21, 23);
		panel.add(ResP_1);
		
		JRadioButton SportsP_1 = new JRadioButton("");
		SportsP_1.setBounds(120, 508, 21, 23);
		panel.add(SportsP_1);
		
		JRadioButton SocialP_1 = new JRadioButton("");
		SocialP_1.setBounds(120, 526, 21, 23);
		panel.add(SocialP_1);
		
		JRadioButton OtherP_1 = new JRadioButton("");
		OtherP_1.setBounds(120, 544, 21, 23);
		panel.add(OtherP_1);
		
		JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("Social");
		rdbtnNewRadioButton_6_1.setBounds(10, 528, 71, 23);
		panel.add(rdbtnNewRadioButton_6_1);
		
		JRadioButton rdbtnNewRadioButton_7_1 = new JRadioButton("Other");
		rdbtnNewRadioButton_7_1.setBounds(10, 549, 64, 23);
		panel.add(rdbtnNewRadioButton_7_1);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Changes?");
		chckbxNewCheckBox_3.setBounds(10, 575, 86, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel_17_1 = new JLabel("Any other ST specific treatments:");
		lblNewLabel_17_1.setBounds(103, 578, 190, 14);
		panel.add(lblNewLabel_17_1);
		
		STTreats = new JTextField();
		STTreats.setColumns(10);
		STTreats.setBounds(290, 575, 127, 20);
		panel.add(STTreats);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_3_1.setBounds(280, 529, 46, 22);
		panel.add(comboBox_3_1);
		
		JComboBox comboBox_2_2_1 = new JComboBox();
		comboBox_2_2_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_2_1.setBounds(280, 511, 50, 22);
		panel.add(comboBox_2_2_1);
		
		TimePercST = new JTextField();
		TimePercST.setColumns(10);
		TimePercST.setBounds(399, 510, 32, 20);
		panel.add(TimePercST);
		
		JLabel lblNewLabel_28_1 = new JLabel("% of time:");
		lblNewLabel_28_1.setBounds(340, 513, 69, 14);
		panel.add(lblNewLabel_28_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("Ear Overprotection:");
		lblNewLabel_15_1.setBounds(170, 515, 113, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("in quiet:");
		lblNewLabel_16_1.setBounds(170, 533, 46, 14);
		panel.add(lblNewLabel_16_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"mins", "hours", "days"}));
		comboBox_1_1.setBounds(265, 476, 73, 22);
		panel.add(comboBox_1_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("How long?");
		lblNewLabel_14_1.setBounds(200, 476, 59, 14);
		panel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("Effect of sound:");
		lblNewLabel_13_1.setBounds(170, 458, 108, 14);
		panel.add(lblNewLabel_13_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"None", "Louder", "Softer"}));
		comboBox_2.setBounds(274, 454, 64, 22);
		panel.add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("As Frequent?");
		chckbxNewCheckBox_2_1.setBounds(320, 426, 97, 23);
		panel.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("As Bad?");
		chckbxNewCheckBox_1_1.setBounds(320, 406, 97, 23);
		panel.add(chckbxNewCheckBox_1_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_2_1_1.setBounds(250, 402, 50, 22);
		panel.add(comboBox_2_1_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("\"Bad days\":");
		lblNewLabel_10_1.setBounds(170, 406, 77, 14);
		panel.add(lblNewLabel_10_1);
		
		FreqST = new JTextField();
		FreqST.setColumns(10);
		FreqST.setBounds(234, 427, 73, 20);
		panel.add(FreqST);
		
		JLabel lblNewLabel_11_1 = new JLabel("Frequency:");
		lblNewLabel_11_1.setBounds(170, 430, 77, 14);
		panel.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_21_1 = new JLabel("Severity:");
		lblNewLabel_21_1.setBounds(10, 609, 101, 14);
		panel.add(lblNewLabel_21_1);
		
		JComboBox comboBox_4_3 = new JComboBox();
		comboBox_4_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_3.setBounds(110, 605, 46, 22);
		panel.add(comboBox_4_3);
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		comboBox_4_1_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_1_1.setBounds(110, 622, 46, 22);
		panel.add(comboBox_4_1_1);
		
		JComboBox comboBox_4_2_1 = new JComboBox();
		comboBox_4_2_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4_2_1.setBounds(110, 640, 46, 22);
		panel.add(comboBox_4_2_1);
		
		JLabel lblNewLabel_22_1 = new JLabel("Annoyance:");
		lblNewLabel_22_1.setBounds(10, 626, 101, 14);
		panel.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_23_1 = new JLabel("Effect on Life:");
		lblNewLabel_23_1.setBounds(10, 644, 101, 14);
		panel.add(lblNewLabel_23_1);
		
		JLabel lblNewLabel_24_1 = new JLabel("Comments:");
		lblNewLabel_24_1.setBounds(170, 606, 71, 14);
		panel.add(lblNewLabel_24_1);
		
		CommentsST = new JTextField();
		CommentsST.setColumns(10);
		CommentsST.setBounds(232, 603, 203, 23);
		panel.add(CommentsST);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Hearing problem----------------------------------------------------------------------------------");
		lblNewLabel_7_2_1.setBounds(10, 666, 423, 14);
		panel.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_34 = new JLabel("Recommendation:");
		lblNewLabel_34.setBounds(10, 686, 91, 14);
		panel.add(lblNewLabel_34);
		
		Recomm = new JTextField();
		Recomm.setColumns(10);
		Recomm.setBounds(106, 683, 135, 20);
		panel.add(Recomm);
		
		JLabel lblNewLabel_9 = new JLabel("The Problem:");
		lblNewLabel_9.setBounds(250, 686, 80, 14);
		panel.add(lblNewLabel_9);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Same", "Better", "Worse"}));
		comboBox_5.setBounds(340, 682, 69, 22);
		panel.add(comboBox_5);
		
		JLabel lblNewLabel_35 = new JLabel("Ranking problems:");
		lblNewLabel_35.setBounds(10, 706, 117, 14);
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Tinnitus:");
		lblNewLabel_36.setBounds(10, 723, 67, 14);
		panel.add(lblNewLabel_36);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_10.setBounds(110, 719, 46, 22);
		panel.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_11.setBounds(110, 739, 46, 22);
		panel.add(comboBox_11);
		
		JLabel lblNewLabel_37 = new JLabel("Sound tolerance:");
		lblNewLabel_37.setBounds(10, 743, 111, 14);
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Hearing:");
		lblNewLabel_38.setBounds(10, 761, 46, 14);
		panel.add(lblNewLabel_38);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_12.setBounds(110, 757, 46, 22);
		panel.add(comboBox_12);
		
		JLabel lblNewLabel_40 = new JLabel("Next visit:");
		lblNewLabel_40.setBounds(170, 720, 77, 14);
		panel.add(lblNewLabel_40);
		
		NextVisit = new JTextField();
		NextVisit.setColumns(10);
		NextVisit.setBounds(250, 717, 80, 20);
		panel.add(NextVisit);
		
		JLabel lblNewLabel_18 = new JLabel("How would you feel if you had to give back your instruments?");
		lblNewLabel_18.setBounds(11, 782, 319, 14);
		panel.add(lblNewLabel_18);
		
		GiveBack = new JTextField();
		GiveBack.setBounds(10, 797, 290, 20);
		panel.add(GiveBack);
		GiveBack.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Main Problems discussed:");
		lblNewLabel_25.setBounds(10, 818, 209, 14);
		panel.add(lblNewLabel_25);
		
		MainProblem = new JTextField();
		MainProblem.setBounds(10, 830, 290, 20);
		panel.add(MainProblem);
		MainProblem.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Are you happy that you started this program?");
		lblNewLabel_26.setBounds(170, 743, 247, 14);
		panel.add(lblNewLabel_26);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Y", "N"}));
		comboBox_6.setBounds(340, 757, 59, 22);
		panel.add(comboBox_6);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				initialFollow();
			}
		});
		btnNewButton.setBounds(328, 797, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT1, INT2, INT3, INT4, INT5, INT6;
				try {
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT1 = Integer.parseInt(Freq.getText());
					INT3 = Integer.parseInt(Aware.getText());
					INT4 = Integer.parseInt(Annoyed.getText());
					INT5 = Integer.parseInt(TimePercST.getText());
					INT6 = Integer.parseInt(FreqST.getText());
				}catch (NumberFormatException e1) {INT1 = 0;INT2 = 0;INT3 = 0;INT4 = 0;INT5 = 0;INT6 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Interview SET Tin_Freq = "+INT1+", Tin_Threatm = '"+TTreat.getText()+"', AwT = "+INT3+", AnT = "+INT4+", Tin_comments = '"+Comments+"', DST_Treat = '"+STTreats.getText()+"', DSTT = "+INT5+", DST_Freq = "+INT6+", DST_Comments = '"+CommentsST.getText()+"', Recom = '"+Recomm.getText()+"', HA_Comments = '"+GiveBack+"', DST_Comments = '"+MainProblem.getText()+"' WHERE Visit_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		btnNewButton_1.setBounds(328, 819, 89, 23);
		panel.add(btnNewButton_1);
		
	}
	
	private void TFI() {
		
		frame.setBounds(100, 100, 450, 950);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 911);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Visit ID*:");
		lblNewLabel.setBounds(10, 11, 79, 14);
		panel.add(lblNewLabel);
		
		textField_109 = new JTextField();
		textField_109.setBounds(80, 8, 91, 20);
		panel.add(textField_109);
		textField_109.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("I. Over The Past Week (0 - Not Strong/Really, 10 - Strong)");
		lblNewLabel_2.setBounds(10, 36, 388, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1. What % of your time awake were you aware of your tinnitus?");
		lblNewLabel_3.setBounds(10, 61, 368, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2. How strong or loud was your tinnitus?");
		lblNewLabel_4.setBounds(10, 86, 320, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3. What % of your time awake were you annoyed by your tinnitus?");
		lblNewLabel_5.setBounds(10, 111, 352, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SC. Over The Past Week (0 - Easy, 10 - Impossible/Never)");
		lblNewLabel_6.setBounds(10, 136, 340, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("4. Did you feel in control in regard to your tinnitus?");
		lblNewLabel_7.setBounds(10, 161, 328, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("5. How easy was it for you to cope with your tinnitus?");
		lblNewLabel_8.setBounds(10, 186, 340, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("6. How easy was it for you to ignore your tinnitus?");
		lblNewLabel_9.setBounds(10, 211, 303, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("C. Over The Past Week (0 - Did not interfere, 10 - Completely Interfered)");
		lblNewLabel_10.setBounds(10, 236, 424, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("7. Your ability to concentrate?");
		lblNewLabel_11.setBounds(10, 261, 193, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("8. Your ability to think clearly?");
		lblNewLabel_12.setBounds(10, 286, 193, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("9. Your ability to focus attention on other things besides your tinnitus?");
		lblNewLabel_13.setBounds(10, 311, 352, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("SL. Over The Past Week (0 - Never, 10 - Always)");
		lblNewLabel_14.setBounds(10, 336, 358, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("10. How often did your tinnitus make it difficult to fall asleep?");
		lblNewLabel_15.setBounds(10, 355, 388, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("11. How often did T prevent you from getting the sleep you needed?");
		lblNewLabel_16.setBounds(10, 380, 388, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("12. How often did T prevent you from deep sleep?");
		lblNewLabel_17.setBounds(10, 405, 340, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_10_1 = new JLabel("A. Over The Past Week (0 - Did not interfere, 10 - Completely Interfered)");
		lblNewLabel_10_1.setBounds(10, 430, 424, 14);
		panel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("14. Your ability to understand people?");
		lblNewLabel_12_1.setBounds(10, 480, 239, 14);
		panel.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("13. Your ability to hear clearly?");
		lblNewLabel_11_1.setBounds(10, 455, 193, 14);
		panel.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("15. Your ability to follow conversations?");
		lblNewLabel_13_1.setBounds(10, 505, 352, 14);
		panel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("R. Over The Past Week (0 - Did not interfere, 10 - Completely Interfered)");
		lblNewLabel_10_1_1.setBounds(10, 530, 424, 14);
		panel.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_18 = new JLabel("16. Your quiet resting activities?");
		lblNewLabel_18.setBounds(10, 555, 239, 14);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("17. Your ability to relax?");
		lblNewLabel_19.setBounds(10, 580, 193, 14);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("18. Your ability to enjoy \"Peace and Quiet\"?");
		lblNewLabel_13_1_1.setBounds(10, 605, 352, 14);
		panel.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("Q. Over The Past Week (0 - Did not interfere, 10 - Completely Interfered)");
		lblNewLabel_10_1_1_1.setBounds(10, 625, 424, 14);
		panel.add(lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_20 = new JLabel("19. Your enjoyment of social activities?");
		lblNewLabel_20.setBounds(10, 650, 352, 14);
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("20. Your enjoyment of life?");
		lblNewLabel_21.setBounds(10, 675, 239, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("21. Your relationships with family and friends?");
		lblNewLabel_22.setBounds(10, 700, 320, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("22. Your work or other task?");
		lblNewLabel_23.setBounds(10, 725, 278, 14);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_10_1_1_2 = new JLabel("E. Over The Past Week (0 - Not at all, 10 - Extremely)");
		lblNewLabel_10_1_1_2.setBounds(10, 750, 424, 14);
		panel.add(lblNewLabel_10_1_1_2);
		
		JLabel lblNewLabel_24 = new JLabel("23. How anxious has T made you feel?");
		lblNewLabel_24.setBounds(10, 775, 251, 14);
		panel.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("24. How upset has Tmade you feel?");
		lblNewLabel_25.setBounds(10, 800, 239, 14);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("25. How depressed has T made you feel?");
		lblNewLabel_26.setBounds(10, 825, 278, 14);
		panel.add(lblNewLabel_26);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				Interview();
				
			}
		});
		btnNewButton.setBounds(61, 864, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT1, INT2, INT3, INT4, INT5, INT6, INT7, INT8, INT9, INT10, INT11, INT12, INT13, INT14, INT15, INT16, INT17, INT18, INT19, INT20, INT21, INT22, INT23, INT24, INT25;;
				int I, SC, C, SL, A, R, Q, E;
				try {//Visit
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {//I + SC + C
					INT1 = Integer.parseInt(THIQ1.getText());
					INT2 = Integer.parseInt(THIQ2.getText());
					INT3 = Integer.parseInt(THIQ4.getText());
					INT4 = Integer.parseInt(THIQ7.getText());
					INT5 = Integer.parseInt(THIQ9.getText());
					INT6 = Integer.parseInt(THIQ12.getText());
					INT7 = Integer.parseInt(THIQ13.getText());
					INT8 = Integer.parseInt(THIQ15.getText());
					INT9 = Integer.parseInt(THIQ18.getText());
					
				}catch (NumberFormatException e1) {INT1 = 0; INT2 = 0; INT3 = 0; INT4 = 0; INT5 = 0; INT6 = 0; INT7 = 0; INT8 = 0; INT9 = 0;}
				try {//SL + A + R
					INT10 = Integer.parseInt(THIQ10.getText());
					INT11 = Integer.parseInt(THIQ11.getText());
					INT12 = Integer.parseInt(THIQ12.getText());
					INT13 = Integer.parseInt(THIQ13.getText());
					INT14 = Integer.parseInt(THIQ14.getText());
					INT15 = Integer.parseInt(THIQ15.getText());
					INT16 = Integer.parseInt(THIQ16.getText());
					INT17 = Integer.parseInt(THIQ17.getText());
					INT18 = Integer.parseInt(THIQ18.getText());
				}catch (NumberFormatException e1) {INT10 = 0; INT11 = 0; INT12 = 0; INT13 = 0; INT14 = 0; INT15 = 0; INT16 = 0; INT17 = 0; INT18 = 0;}
				try {//Q + E
					INT19 = Integer.parseInt(THIQ19.getText());
					INT20 = Integer.parseInt(THIQ20.getText());
					INT21 = Integer.parseInt(THIQ21.getText());
					INT22 = Integer.parseInt(THIQ22.getText());
					INT23 = Integer.parseInt(THIQ23.getText());
					INT24 = Integer.parseInt(THIQ24.getText());
					INT25 = Integer.parseInt(THIQ25.getText());
				}catch (NumberFormatException e1) {INT19 = 0; INT20 = 0; INT21 = 0; INT22 = 0; INT23 = 0; INT24 = 0; INT25 = 0;}
				I = INT1 + INT2 + INT3;
				SC = INT4 + INT5 + INT6;
				C = INT7 + INT8 + INT9;
				SL = INT10 + INT11 + INT12;
				A = INT13 + INT14 + INT15;
				R = INT16 + INT17 + INT18;
				Q = INT19 + INT20 + INT21 + INT22;
				E = INT23 + INT24 + INT25;
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO TFI (Visit_ID) VALUES ("+INT+")");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Warning, Old Visit");}	
				finally {}
					try {
						Connection con = getConnection();
						PreparedStatement posted = con.prepareStatement("UPDATE TFI SET I = "+I+", SC = "+SC+", C = "+C+", A = "+R+", Q = "+Q+", E = "+E+", Q1 = "+INT1+", Q2 = "+INT2+", Q3 = "+INT3+", Q4 = "+INT4+", Q5 = "+INT5+", Q6 = "+INT6+", Q7 = "+INT7+", Q8 = "+INT8+", Q9 = "+INT9+", Q10 = "+INT10+", Q11 = "+INT11+", Q12 = "+INT12+", Q13 = "+INT13+", Q14 = "+INT14+", Q15 = "+INT15+", Q16 = "+INT16+", Q17 = "+INT17+", Q18 = "+INT18+", Q19 = "+INT19+", Q20 = "+INT20+", Q21 = "+INT21+", Q22 = "+INT22+", Q23 = "+INT23+", Q24 = "+INT24+", Q25 = "+INT25+"  WHERE Visit_ID = "+INT+"");
						posted.executeUpdate();
					}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
					finally {
						JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		btnNewButton_1.setBounds(273, 864, 89, 23);
		panel.add(btnNewButton_1);
		
		THIQ1 = new JTextField();
		THIQ1.setText("0");
		THIQ1.setColumns(10);
		THIQ1.setBounds(388, 55, 34, 20);
		panel.add(THIQ1);
		
		THIQ2 = new JTextField();
		THIQ2.setText("0");
		THIQ2.setColumns(10);
		THIQ2.setBounds(388, 80, 34, 20);
		panel.add(THIQ2);
		
		THIQ3 = new JTextField();
		THIQ3.setText("0");
		THIQ3.setColumns(10);
		THIQ3.setBounds(388, 105, 34, 20);
		panel.add(THIQ3);
		
		THIQ4 = new JTextField();
		THIQ4.setText("0");
		THIQ4.setColumns(10);
		THIQ4.setBounds(390, 155, 34, 20);
		panel.add(THIQ4);
		
		THIQ5 = new JTextField();
		THIQ5.setText("0");
		THIQ5.setColumns(10);
		THIQ5.setBounds(390, 180, 34, 20);
		panel.add(THIQ5);
		
		THIQ6 = new JTextField();
		THIQ6.setText("0");
		THIQ6.setColumns(10);
		THIQ6.setBounds(390, 205, 34, 20);
		panel.add(THIQ6);
		
		THIQ7 = new JTextField();
		THIQ7.setText("0");
		THIQ7.setColumns(10);
		THIQ7.setBounds(390, 255, 34, 20);
		panel.add(THIQ7);
		
		THIQ8 = new JTextField();
		THIQ8.setText("0");
		THIQ8.setColumns(10);
		THIQ8.setBounds(390, 280, 34, 20);
		panel.add(THIQ8);
		
		THIQ9 = new JTextField();
		THIQ9.setText("0");
		THIQ9.setColumns(10);
		THIQ9.setBounds(390, 305, 34, 20);
		panel.add(THIQ9);
		
		THIQ10 = new JTextField();
		THIQ10.setText("0");
		THIQ10.setColumns(10);
		THIQ10.setBounds(390, 349, 34, 20);
		panel.add(THIQ10);
		
		THIQ11 = new JTextField();
		THIQ11.setText("0");
		THIQ11.setColumns(10);
		THIQ11.setBounds(390, 374, 34, 20);
		panel.add(THIQ11);
		
		THIQ12 = new JTextField();
		THIQ12.setText("0");
		THIQ12.setColumns(10);
		THIQ12.setBounds(390, 399, 34, 20);
		panel.add(THIQ12);
		
		THIQ13 = new JTextField();
		THIQ13.setText("0");
		THIQ13.setColumns(10);
		THIQ13.setBounds(390, 449, 34, 20);
		panel.add(THIQ13);
		
		THIQ14 = new JTextField();
		THIQ14.setText("0");
		THIQ14.setColumns(10);
		THIQ14.setBounds(390, 474, 34, 20);
		panel.add(THIQ14);
		
		THIQ15 = new JTextField();
		THIQ15.setText("0");
		THIQ15.setColumns(10);
		THIQ15.setBounds(390, 499, 34, 20);
		panel.add(THIQ15);
		
		THIQ16 = new JTextField();
		THIQ16.setText("0");
		THIQ16.setColumns(10);
		THIQ16.setBounds(390, 549, 34, 20);
		panel.add(THIQ16);
		
		THIQ17 = new JTextField();
		THIQ17.setText("0");
		THIQ17.setColumns(10);
		THIQ17.setBounds(390, 574, 34, 20);
		panel.add(THIQ17);
		
		THIQ18 = new JTextField();
		THIQ18.setText("0");
		THIQ18.setColumns(10);
		THIQ18.setBounds(390, 599, 34, 20);
		panel.add(THIQ18);
		
		THIQ19 = new JTextField();
		THIQ19.setText("0");
		THIQ19.setColumns(10);
		THIQ19.setBounds(390, 644, 34, 20);
		panel.add(THIQ19);
		
		THIQ20 = new JTextField();
		THIQ20.setText("0");
		THIQ20.setColumns(10);
		THIQ20.setBounds(390, 669, 34, 20);
		panel.add(THIQ20);
		
		THIQ21 = new JTextField();
		THIQ21.setText("0");
		THIQ21.setColumns(10);
		THIQ21.setBounds(390, 694, 34, 20);
		panel.add(THIQ21);
		
		THIQ22 = new JTextField();
		THIQ22.setText("0");
		THIQ22.setColumns(10);
		THIQ22.setBounds(390, 719, 34, 20);
		panel.add(THIQ22);
		
		THIQ23 = new JTextField();
		THIQ23.setText("0");
		THIQ23.setColumns(10);
		THIQ23.setBounds(390, 769, 34, 20);
		panel.add(THIQ23);
		
		THIQ24 = new JTextField();
		THIQ24.setText("0");
		THIQ24.setColumns(10);
		THIQ24.setBounds(390, 794, 34, 20);
		panel.add(THIQ24);
		
		THIQ25 = new JTextField();
		THIQ25.setText("0");
		THIQ25.setColumns(10);
		THIQ25.setBounds(390, 819, 34, 20);
		panel.add(THIQ25);
		
	}
	
	private void EditPatient() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		THC = new JTextField();
		THC.setBounds(390, 187, 34, 20);
		panel.add(THC);
		THC.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("THC*:");
		lblNewLabel_15.setBounds(352, 190, 46, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel = new JLabel("First Name*");
		lblNewLabel.setBounds(10, 11, 70, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Name");
		lblNewLabel_1.setBounds(10, 48, 70, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 63, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name*");
		lblNewLabel_2.setBounds(10, 89, 70, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 106, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DOB* (yyyy-mm-dd)");
		lblNewLabel_3.setBounds(10, 131, 105, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 146, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender*");
		lblNewLabel_4.setBounds(10, 169, 46, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 186, 34, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		
		JLabel lblNewLabel_5 = new JLabel("Phone*");
		lblNewLabel_5.setBounds(10, 210, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 224, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(121, 11, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(121, 25, 155, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address*");
		lblNewLabel_7.setBounds(121, 48, 46, 14);
		panel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(121, 63, 155, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(121, 106, 105, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Zip");
		lblNewLabel_10.setBounds(121, 169, 46, 14);
		panel.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(121, 187, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Photo");
		lblNewLabel_12.setBounds(285, 11, 46, 14);
		panel.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(286, 25, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("SSN");
		lblNewLabel_13.setBounds(285, 48, 46, 14);
		panel.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(286, 63, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Insurance");
		lblNewLabel_14.setBounds(285, 89, 87, 14);
		panel.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(285, 106, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Update");
		btnNewButton_6.setBounds(238, 145, 83, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New Visit");
		btnNewButton_7.setBounds(238, 185, 83, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Back");
		btnNewButton_8.setBounds(325, 145, 89, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Add Demographics");
		btnNewButton_9.setBounds(238, 222, 124, 23);
		panel.add(btnNewButton_9);
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3;
				try {
					INT = Integer.parseInt(PatientCountry.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(PatientState.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(textField_8.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Patient SET Country_ID = "+INT+", State_ID = "+INT2+", ZIP_ID = "+INT3+", Surname = '"+textField_2.getText()+"', First_name = '"+textField.getText()+"', SSN = '"+textField_10.getText()+"', DOB = '"+textField_3.getText()+"', Insurance = '"+textField_11.getText()+"' WHERE THC ='"+THC.getText()+"'");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		//PreparedStatement posted = con.prepareStatement("UPDATE Patient SET ZIP_ID = '"+textField_8.getText()+"', Surname = '"+textField_2.getText()+"', First_name = '"+textField.getText()+"', SSN = '"+textField_10.getText()+"', DOB = '"+textField_3.getText()+"', Insurance = '"+textField_11.getText()+"' WHERE THC ='"+THC.getText()+"'");
		
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				View();
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				demographics();
			}
		});
		
		PatientState = new JTextField();
		PatientState.setBounds(121, 146, 86, 20);
		panel.add(PatientState);
		PatientState.setColumns(10);
		
		PatientCountry = new JTextField();
		PatientCountry.setBounds(121, 224, 86, 20);
		panel.add(PatientCountry);
		PatientCountry.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Country Code*");
		lblNewLabel_11.setBounds(121, 210, 86, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_8 = new JLabel("City* (Jacksonville)");
		lblNewLabel_8.setBounds(121, 89, 117, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("State Code*:");
		lblNewLabel_9.setBounds(121, 131, 70, 14);
		panel.add(lblNewLabel_9);
		
	}
	
	private void EditVisit() {
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 235);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_22 = new JButton("More");
		btnNewButton_22.setBounds(239, 201, 83, 23);
		panel.add(btnNewButton_22);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		
		JButton btnNewButton_23 = new JButton("Back"); //
		btnNewButton_23.setBounds(325, 201, 83, 23);
		panel.add(btnNewButton_23);
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Visits();
			}
		});
		
		JButton btnNewButton_240 = new JButton("Update"); //
		btnNewButton_240.setBounds(325, 161, 83, 23);
		panel.add(btnNewButton_240);
		btnNewButton_240.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4, INT5, INT6;
				try {
					INT = Integer.parseInt(textField_22.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(textField_23.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(textField_25.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(textField_32.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					INT5 = Integer.parseInt(textField_33.getText());
				}catch (NumberFormatException e1) {INT5 = 0;}
				try {
					INT6 = Integer.parseInt(textField_33.getText());
				}catch (NumberFormatException e1) {INT6 = 0;}
					try {
						Connection con = getConnection();
						PreparedStatement posted = con.prepareStatement("UPDATE Visit Set Visit_nr = "+INT2+", Date1 = '"+textField_28.getText()+"', Comments = textField_27 Where Visit_ID = "+INT);                              
						posted.executeUpdate();
						//PreparedStatement posted3 = con.prepareStatement("INSERT INTO Instrumentation (Instr_ID, Visit_ID, IC_ID, IT_ID, IM_ID) VALUES ("+INT4+", "+INT+", 0, 0,0)");
						//posted3.executeUpdate();
						PreparedStatement posted3 = con.prepareStatement("UPDATE Instrumentation Set Instr_ID = "+INT4+" Where Visit_ID = "+INT);                              
						posted3.executeUpdate();
					}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
					finally {
						try {
							Connection con = getConnection();
							PreparedStatement posted = con.prepareStatement("UPDATE Interview SET Problem_ID = "+INT3+", IT_ID = "+INT4+", Cat = '"+textField_29.getText()+"', Type1 = '"+textField_31+"', Next_v = "+INT5+", Comments = '"+RecomendationVisit.getText()+"' WHERE Visit_ID = "+INT);
							posted.executeUpdate();
						}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
						finally {
							JOptionPane.showMessageDialog(null, "Successfully Updated");
						}
				}
				
			}
		});
		
		JLabel lblNewLabel_25 = new JLabel("Visit ID:");
		lblNewLabel_25.setBounds(10, 23, 76, 14);
		panel.add(lblNewLabel_25);
		
		textField_22 = new JTextField();
		textField_22.setBounds(10, 37, 49, 20);
		panel.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Stage:");
		lblNewLabel_26.setBounds(10, 73, 70, 14);
		panel.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Visit no.");
		lblNewLabel_27.setBounds(229, 23, 76, 14);
		panel.add(lblNewLabel_27);
		
		textField_23 = new JTextField();
		textField_23.setBounds(221, 37, 49, 20);
		panel.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Patient");
		lblNewLabel_28.setBounds(281, 23, 70, 14);
		panel.add(lblNewLabel_28);
		
		textField_24 = new JTextField();
		textField_24.setBounds(278, 37, 86, 20);
		panel.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Problem ID");
		lblNewLabel_29.setBounds(10, 118, 86, 14);
		panel.add(lblNewLabel_29);
		
		textField_25 = new JTextField();
		textField_25.setBounds(10, 132, 86, 20);
		panel.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("THC#");
		lblNewLabel_30.setBounds(73, 23, 49, 14);
		panel.add(lblNewLabel_30);
		
		textField_26 = new JTextField();
		textField_26.setBounds(69, 37, 49, 20);
		panel.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Comments");
		lblNewLabel_31.setBounds(141, 62, 109, 14);
		panel.add(lblNewLabel_31);
		
		textField_27 = new JTextField();
		textField_27.setBounds(144, 84, 264, 40);
		panel.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Date");
		lblNewLabel_32.setBounds(132, 23, 55, 14);
		panel.add(lblNewLabel_32);
		
		textField_28 = new JTextField();
		textField_28.setBounds(128, 37, 83, 20);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		JTextPane textPaneStage = new JTextPane();
		textPaneStage.setBounds(10, 84, 76, 23);
		panel.add(textPaneStage);
		
		JLabel lblNewLabel_33 = new JLabel("Category");
		lblNewLabel_33.setBounds(10, 154, 46, 14);
		panel.add(lblNewLabel_33);
		
		textField_29 = new JTextField();
		textField_29.setBounds(64, 151, 32, 20);
		panel.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("Protocol");
		lblNewLabel_34.setBounds(13, 174, 46, 14);
		panel.add(lblNewLabel_34);
		
		textField_30 = new JTextField();
		textField_30.setBounds(64, 171, 32, 23);
		panel.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(64, 191, 32, 23);
		panel.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("FU:");
		lblNewLabel_35.setBounds(13, 195, 46, 14);
		panel.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Instrument:");
		lblNewLabel_36.setBounds(132, 135, 70, 14);
		panel.add(lblNewLabel_36);
		
		textField_32 = new JTextField();
		textField_32.setBounds(195, 132, 32, 20);
		panel.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(307, 132, 86, 20);
		panel.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_37 = new JLabel("Next visit");
		lblNewLabel_37.setBounds(251, 135, 54, 14);
		panel.add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("Recomendation:");
		lblNewLabel_38.setBounds(132, 180, 95, 14);
		panel.add(lblNewLabel_38);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("REM");
		chckbxNewCheckBox.setBounds(252, 154, 70, 40);
		panel.add(chckbxNewCheckBox);
		
		RecomendationVisit = new JTextField();
		RecomendationVisit.setBounds(132, 202, 86, 20);
		panel.add(RecomendationVisit);
		RecomendationVisit.setColumns(10);
	}
	
	private void Pharmacology() {
		frame.setBounds(100, 100, 900, 300);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 884, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Patient:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane PatName = new JTextPane();
		PatName.setText("Name");
		PatName.setBounds(66, 5, 62, 20);
		panel.add(PatName);
		
		JTextPane PatTHC = new JTextPane();
		PatTHC.setText("THC#");
		PatTHC.setBounds(149, 5, 46, 20);
		panel.add(PatTHC);
		
		JLabel lblNewLabel_1 = new JLabel("Visit");
		lblNewLabel_1.setBounds(233, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JTextPane VisitID = new JTextPane();
		VisitID.setText("VisitID");
		VisitID.setBounds(273, 5, 74, 20);
		panel.add(VisitID);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 864, 180);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Med #", "Medication", "Generic", "Dose", "Duration", "Cat chem", "Action", "Application", "Usual", "T side"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton AddMed = new JButton("Add/Delete Medication");
		AddMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Medication();
			}
		});
		AddMed.setBounds(10, 227, 209, 23);
		panel.add(AddMed);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_1.setBounds(393, 227, 89, 23);
		panel.add(btnNewButton_1);
		
	}
	
	private void Audiology() {
		frame.setBounds(100, 100, 600, 505);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 466);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_43 = new JLabel("THC#");
		lblNewLabel_43.setBounds(504, 14, 34, 14);
		panel.add(lblNewLabel_43);
		
		THC = new JTextField();
		THC.setBounds(537, 11, 37, 20);
		panel.add(THC);
		THC.setColumns(10);
		
		Date = new JTextField();
		Date.setBounds(193, 11, 86, 20);
		panel.add(Date);
		Date.setColumns(10);
		
		JLabel lblNewLabel_41 = new JLabel("Date:");
		lblNewLabel_41.setBounds(157, 14, 46, 14);
		panel.add(lblNewLabel_41);
		
		VisitID = new JTextField();
		VisitID.setBounds(77, 11, 46, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		JLabel lblNewLabel_40 = new JLabel("Visit ID:");
		lblNewLabel_40.setBounds(10, 14, 57, 14);
		panel.add(lblNewLabel_40);
		
		JLabel lblNewLabel_42 = new JLabel("Patient THC#");
		lblNewLabel_42.setBounds(309, 14, 103, 14);
		panel.add(lblNewLabel_42);
		
		Name = new JTextField();
		Name.setBounds(391, 11, 86, 20);
		panel.add(Name);
		Name.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel.setBounds(10, 39, 564, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pure Tone audiogram");
		lblNewLabel_1.setBounds(10, 53, 132, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("R25:");
		lblNewLabel_2.setBounds(10, 78, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("R50:");
		lblNewLabel_3.setBounds(10, 100, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("R1:");
		lblNewLabel_4.setBounds(10, 125, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R2:");
		lblNewLabel_5.setBounds(10, 150, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("R3:");
		lblNewLabel_6.setBounds(10, 175, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("R4:");
		lblNewLabel_7.setBounds(99, 77, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("R6:");
		lblNewLabel_8.setBounds(99, 102, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("R8:");
		lblNewLabel_9.setBounds(99, 127, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("R10:");
		lblNewLabel_10.setBounds(99, 152, 46, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("R12:");
		lblNewLabel_11.setBounds(99, 177, 46, 14);
		panel.add(lblNewLabel_11);
		
		R25 = new JTextField();
		R25.setBounds(44, 75, 46, 20);
		panel.add(R25);
		R25.setColumns(10);
		
		R50 = new JTextField();
		R50.setBounds(44, 97, 46, 20);
		panel.add(R50);
		R50.setColumns(10);
		
		R1 = new JTextField();
		R1.setBounds(44, 122, 46, 20);
		panel.add(R1);
		R1.setColumns(10);
		
		R2 = new JTextField();
		R2.setBounds(44, 147, 46, 20);
		panel.add(R2);
		R2.setColumns(10);
		
		R3 = new JTextField();
		R3.setBounds(44, 172, 46, 20);
		panel.add(R3);
		R3.setColumns(10);
		
		R4 = new JTextField();
		R4.setBounds(133, 74, 46, 20);
		panel.add(R4);
		R4.setColumns(10);
		
		R6 = new JTextField();
		R6.setBounds(133, 99, 46, 20);
		panel.add(R6);
		R6.setColumns(10);
		
		R8 = new JTextField();
		R8.setBounds(133, 124, 46, 20);
		panel.add(R8);
		R8.setColumns(10);
		
		R10 = new JTextField();
		R10.setBounds(133, 149, 46, 20);
		panel.add(R10);
		R10.setColumns(10);
		
		R12 = new JTextField();
		R12.setBounds(133, 174, 46, 20);
		panel.add(R12);
		R12.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("L25:");
		lblNewLabel_2_1.setBounds(201, 75, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		L25 = new JTextField();
		L25.setBounds(235, 72, 46, 20);
		panel.add(L25);
		L25.setColumns(10);
		
		L4 = new JTextField();
		L4.setBounds(324, 71, 46, 20);
		panel.add(L4);
		L4.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("L4:");
		lblNewLabel_7_1.setBounds(290, 74, 46, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel awd = new JLabel("L6:");
		awd.setBounds(290, 99, 46, 14);
		panel.add(awd);
		
		L6 = new JTextField();
		L6.setBounds(324, 96, 46, 20);
		panel.add(L6);
		L6.setColumns(10);
		
		L8 = new JTextField();
		L8.setBounds(324, 121, 46, 20);
		panel.add(L8);
		L8.setColumns(10);
		
		JLabel lblNewLabel_9_1 = new JLabel("L8:");
		lblNewLabel_9_1.setBounds(290, 124, 46, 14);
		panel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("L10:");
		lblNewLabel_10_1.setBounds(290, 149, 46, 14);
		panel.add(lblNewLabel_10_1);
		
		L10 = new JTextField();
		L10.setBounds(324, 146, 46, 20);
		panel.add(L10);
		L10.setColumns(10);
		
		L12 = new JTextField();
		L12.setBounds(324, 171, 46, 20);
		panel.add(L12);
		L12.setColumns(10);
		
		JLabel lblNewLabel_11_1 = new JLabel("L12:");
		lblNewLabel_11_1.setBounds(290, 174, 46, 14);
		panel.add(lblNewLabel_11_1);
		
		L3 = new JTextField();
		L3.setBounds(235, 169, 46, 20);
		panel.add(L3);
		L3.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("L2:");
		lblNewLabel_5_1.setBounds(201, 147, 46, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("L3:");
		lblNewLabel_6_1.setBounds(201, 172, 46, 14);
		panel.add(lblNewLabel_6_1);
		
		L2 = new JTextField();
		L2.setBounds(235, 144, 46, 20);
		panel.add(L2);
		L2.setColumns(10);
		
		L1 = new JTextField();
		L1.setBounds(235, 119, 46, 20);
		panel.add(L1);
		L1.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("L1:");
		lblNewLabel_4_1.setBounds(201, 122, 46, 14);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("L50:");
		lblNewLabel_3_1.setBounds(201, 97, 46, 14);
		panel.add(lblNewLabel_3_1);
		
		L50 = new JTextField();
		L50.setBounds(235, 94, 46, 20);
		panel.add(L50);
		L50.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Right Ear");
		lblNewLabel_12.setBounds(391, 53, 69, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Left Ear");
		lblNewLabel_13.setBounds(492, 53, 68, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblTPr = new JLabel("T PR:");
		lblTPr.setBounds(380, 78, 46, 14);
		panel.add(lblTPr);
		
		JLabel lblNewLabel_14 = new JLabel("T Rm:");
		lblNewLabel_14.setBounds(380, 100, 46, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("T LR:");
		lblNewLabel_15.setBounds(380, 125, 46, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Th R:");
		lblNewLabel_16.setBounds(380, 150, 46, 14);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("T RL:");
		lblNewLabel_17.setBounds(380, 175, 46, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblTPr_1 = new JLabel("L PR:");
		lblTPr_1.setBounds(479, 78, 46, 14);
		panel.add(lblTPr_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("L Rm:");
		lblNewLabel_14_1.setBounds(479, 100, 46, 14);
		panel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("L LR:");
		lblNewLabel_15_1.setBounds(479, 125, 46, 14);
		panel.add(lblNewLabel_15_1);
		
		JLabel LR25 = new JLabel("L R:");
		LR25.setBounds(479, 150, 46, 14);
		panel.add(LR25);
		
		JLabel lblNewLabel_17_1 = new JLabel("L RL:");
		lblNewLabel_17_1.setBounds(479, 175, 46, 14);
		panel.add(lblNewLabel_17_1);
		
		TPR = new JTextField();
		TPR.setBounds(414, 75, 46, 20);
		panel.add(TPR);
		TPR.setColumns(10);
		
		TRM = new JTextField();
		TRM.setBounds(414, 97, 44, 20);
		panel.add(TRM);
		TRM.setColumns(10);
		
		TLR = new JTextField();
		TLR.setBounds(414, 122, 46, 20);
		panel.add(TLR);
		TLR.setColumns(10);
		
		THR = new JTextField();
		THR.setBounds(414, 147, 46, 20);
		panel.add(THR);
		THR.setColumns(10);
		
		TRL = new JTextField();
		TRL.setBounds(414, 172, 46, 20);
		panel.add(TRL);
		TRL.setColumns(10);
		
		LPR = new JTextField();
		LPR.setBounds(514, 74, 46, 20);
		panel.add(LPR);
		LPR.setColumns(10);
		
		LRM = new JTextField();
		LRM.setBounds(514, 96, 44, 20);
		panel.add(LRM);
		LRM.setColumns(10);
		
		LLR = new JTextField();
		LLR.setBounds(514, 121, 46, 20);
		panel.add(LLR);
		LLR.setColumns(10);
		
		LR = new JTextField();
		LR.setBounds(514, 146, 46, 20);
		panel.add(LR);
		LR.setColumns(10);
		
		LRL = new JTextField();
		LRL.setBounds(514, 171, 46, 20);
		panel.add(LRL);
		LRL.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("WNR:");
		lblNewLabel_18.setBounds(380, 200, 46, 14);
		panel.add(lblNewLabel_18);
		
		JLabel WNLawd = new JLabel("WNL:");
		WNLawd.setBounds(479, 200, 46, 14);
		panel.add(WNLawd);
		
		WNR = new JTextField();
		WNR.setBounds(414, 197, 46, 20);
		panel.add(WNR);
		WNR.setColumns(10);
		
		WNL = new JTextField();
		WNL.setBounds(514, 197, 46, 20);
		panel.add(WNL);
		WNL.setColumns(10);
		
		JLabel MRR123 = new JLabel("MRR:");
		MRR123.setBounds(0, 225, 46, 14);
		panel.add(MRR123);
		
		JLabel lblNewLabel_20 = new JLabel("MRB:");
		lblNewLabel_20.setBounds(0, 242, 46, 14);
		panel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("MBR:");
		lblNewLabel_21.setBounds(0, 260, 46, 14);
		panel.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("MRL:");
		lblNewLabel_22.setBounds(109, 225, 46, 14);
		panel.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("MLB:");
		lblNewLabel_23.setBounds(109, 242, 46, 14);
		panel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("MBL:");
		lblNewLabel_24.setBounds(109, 260, 46, 14);
		panel.add(lblNewLabel_24);
		
		MRL = new JTextField();
		MRL.setBounds(141, 222, 57, 20);
		panel.add(MRL);
		MRL.setColumns(10);
		
		MLB = new JTextField();
		MLB.setBounds(141, 239, 57, 20);
		panel.add(MLB);
		MLB.setColumns(10);
		
		MBL = new JTextField();
		MBL.setBounds(141, 257, 57, 20);
		panel.add(MBL);
		MBL.setColumns(10);
		
		MRR = new JTextField();
		MRR.setBounds(44, 222, 57, 20);
		panel.add(MRR);
		MRR.setColumns(10);
		
		MRB = new JTextField();
		MRB.setBounds(44, 239, 57, 20);
		panel.add(MRB);
		MRB.setColumns(10);
		
		MBR = new JTextField();
		MBR.setBounds(44, 257, 57, 20);
		panel.add(MBR);
		MBR.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("R SD:");
		lblNewLabel_25.setBounds(262, 242, 46, 14);
		panel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("L SD:");
		lblNewLabel_26.setBounds(380, 242, 46, 14);
		panel.add(lblNewLabel_26);
		
		RSD = new JTextField();
		RSD.setBounds(290, 239, 76, 20);
		panel.add(RSD);
		RSD.setColumns(10);
		
		LSD = new JTextField();
		LSD.setBounds(414, 239, 76, 20);
		panel.add(LSD);
		LSD.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_27.setBounds(10, 283, 564, 14);
		panel.add(lblNewLabel_27);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pure Tone Loudness");
		lblNewLabel_1_1.setBounds(10, 297, 132, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel LR5023123 = new JLabel("LR50:");
		LR5023123.setBounds(10, 337, 46, 14);
		panel.add(LR5023123);
		
		LR50 = new JTextField();
		LR50.setBounds(44, 334, 46, 20);
		panel.add(LR50);
		LR50.setColumns(10);
		
		LR1 = new JTextField();
		LR1.setBounds(44, 359, 46, 20);
		panel.add(LR1);
		LR1.setColumns(10);
		
		JLabel lblNewLabel_4_2 = new JLabel("LR1:");
		lblNewLabel_4_2.setBounds(10, 362, 46, 14);
		panel.add(lblNewLabel_4_2);
		
		JLabel LR223 = new JLabel("LR2:");
		LR223.setBounds(10, 387, 46, 14);
		panel.add(LR223);
		
		LR2 = new JTextField();
		LR2.setBounds(44, 384, 46, 20);
		panel.add(LR2);
		LR2.setColumns(10);
		
		LR3 = new JTextField();
		LR3.setBounds(44, 409, 46, 20);
		panel.add(LR3);
		LR3.setColumns(10);
		
		JLabel lblNewLabel_6_2 = new JLabel("LR3:");
		lblNewLabel_6_2.setBounds(10, 412, 46, 14);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_11_2 = new JLabel("LR12:");
		lblNewLabel_11_2.setBounds(99, 414, 46, 14);
		panel.add(lblNewLabel_11_2);
		
		LR12 = new JTextField();
		LR12.setBounds(133, 411, 46, 20);
		panel.add(LR12);
		LR12.setColumns(10);
		
		LR10 = new JTextField();
		LR10.setBounds(133, 386, 46, 20);
		panel.add(LR10);
		LR10.setColumns(10);
		
		JLabel lblNewLabel_10_2 = new JLabel("LR10:");
		lblNewLabel_10_2.setBounds(99, 389, 46, 14);
		panel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("LRTP:");
		lblNewLabel_2_2.setBounds(10, 315, 46, 14);
		panel.add(lblNewLabel_2_2);
		
		LR8 = new JTextField();
		LR8.setBounds(133, 361, 46, 20);
		panel.add(LR8);
		LR8.setColumns(10);
		
		JLabel lblNewLabel_9_2 = new JLabel("LR8:");
		lblNewLabel_9_2.setBounds(99, 364, 46, 14);
		panel.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("LR6:");
		lblNewLabel_8_2.setBounds(99, 339, 46, 14);
		panel.add(lblNewLabel_8_2);
		
		LR6 = new JTextField();
		LR6.setBounds(133, 336, 46, 20);
		panel.add(LR6);
		LR6.setColumns(10);
		
		LR4 = new JTextField();
		LR4.setBounds(133, 311, 46, 20);
		panel.add(LR4);
		LR4.setColumns(10);
		
		JLabel lblNewLabel_7_2 = new JLabel("LR4:");
		lblNewLabel_7_2.setBounds(99, 314, 46, 14);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("LLTP:");
		lblNewLabel_2_1_1.setBounds(201, 312, 46, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("LL50:");
		lblNewLabel_3_1_1.setBounds(201, 334, 46, 14);
		panel.add(lblNewLabel_3_1_1);
		
		LL50 = new JTextField();
		LL50.setBounds(235, 331, 46, 20);
		panel.add(LL50);
		LL50.setColumns(10);
		
		LLTP = new JTextField();
		LLTP.setBounds(235, 309, 46, 20);
		panel.add(LLTP);
		LLTP.setColumns(10);
		
		LL4 = new JTextField();
		LL4.setBounds(324, 308, 46, 20);
		panel.add(LL4);
		LL4.setColumns(10);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("LL4:");
		lblNewLabel_7_1_1.setBounds(290, 311, 46, 14);
		panel.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("LL6:");
		lblNewLabel_8_1_1.setBounds(290, 336, 46, 14);
		panel.add(lblNewLabel_8_1_1);
		
		LL6 = new JTextField();
		LL6.setBounds(324, 333, 46, 20);
		panel.add(LL6);
		LL6.setColumns(10);
		
		LL8 = new JTextField();
		LL8.setBounds(324, 358, 46, 20);
		panel.add(LL8);
		LL8.setColumns(10);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("LL8:");
		lblNewLabel_9_1_1.setBounds(290, 361, 46, 14);
		panel.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("LL10:");
		lblNewLabel_10_1_1.setBounds(290, 386, 46, 14);
		panel.add(lblNewLabel_10_1_1);
		
		LL12 = new JTextField();
		LL12.setBounds(324, 408, 46, 20);
		panel.add(LL12);
		LL12.setColumns(10);
		
		LL10 = new JTextField();
		LL10.setBounds(324, 383, 46, 20);
		panel.add(LL10);
		LL10.setColumns(10);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("LL12:");
		lblNewLabel_11_1_1.setBounds(290, 411, 46, 14);
		panel.add(lblNewLabel_11_1_1);
		
		LL3 = new JTextField();
		LL3.setBounds(235, 406, 46, 20);
		panel.add(LL3);
		LL3.setColumns(10);
		
		LL2 = new JTextField();
		LL2.setBounds(235, 381, 46, 20);
		panel.add(LL2);
		LL2.setColumns(10);
		
		LL1 = new JTextField();
		LL1.setBounds(235, 356, 46, 20);
		panel.add(LL1);
		LL1.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("LL1:");
		lblNewLabel_4_1_1.setBounds(201, 359, 46, 14);
		panel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("LL2:");
		lblNewLabel_5_1_1.setBounds(201, 384, 46, 14);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("LL3:");
		lblNewLabel_6_1_1.setBounds(201, 409, 46, 14);
		panel.add(lblNewLabel_6_1_1);
		
		LRTP = new JTextField();
		LRTP.setBounds(44, 312, 46, 20);
		panel.add(LRTP);
		LRTP.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Additional Comments");
		lblNewLabel_28.setBounds(10, 440, 169, 14);
		panel.add(lblNewLabel_28);
		
		CommentAudio = new JTextField();
		CommentAudio.setBounds(133, 437, 279, 20);
		panel.add(CommentAudio);
		CommentAudio.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT1, INT2, INT3, INT4, INT5, INT6, INT7, INT8, INT9, INT10, INT11, INT12, INT13, INT14, INT15, INT16, INT17, INT18, INT19, INT20, INT21, INT22, INT23, INT24, INT25;
				int INT26, INT27, INT28, INT29, INT30, INT31, INT32, INT33, INT34, INT35, INT36, INT37, INT38, INT39, INT40, INT41, INT42, INT43, INT44, INT45, INT46, INT47, INT48, INT49, INT50, INT51;
				int INT52, INT53, INT54, INT55, INT56, INT57, INT58, INT59, INT60, INT61, INT62, INT63, INT64, INT65, INT66, INT67, INT68, INT69, INT70, INT71, INT72, INT73, INT74, INT75, INT76, INT77;
				try {//Visit
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {//I + SC + C
					INT1 = Integer.parseInt(R25.getText());
					INT2 = Integer.parseInt(R50.getText());
					INT3 = Integer.parseInt(R1.getText());
					INT4 = Integer.parseInt(R2.getText());
					INT5 = Integer.parseInt(R3.getText());
					INT6 = Integer.parseInt(R4.getText());
					INT7 = Integer.parseInt(R6.getText());
					INT8 = Integer.parseInt(R8.getText());
					INT9 = Integer.parseInt(R10.getText());
					
				}catch (NumberFormatException e1) {INT1 = 0; INT2 = 0; INT3 = 0; INT4 = 0; INT5 = 0; INT6 = 0; INT7 = 0; INT8 = 0; INT9 = 0;}
				try {//SL + A + R
					INT10 = Integer.parseInt(R12.getText());
					INT11 = Integer.parseInt(L25.getText());
					INT12 = Integer.parseInt(L50.getText());
					INT13 = Integer.parseInt(L1.getText());
					INT14 = Integer.parseInt(L2.getText());
					INT15 = Integer.parseInt(L3.getText());
					INT16 = Integer.parseInt(L4.getText());
					INT17 = Integer.parseInt(L6.getText());
					INT18 = Integer.parseInt(L8.getText());
				}catch (NumberFormatException e1) {INT10 = 0; INT11 = 0; INT12 = 0; INT13 = 0; INT14 = 0; INT15 = 0; INT16 = 0; INT17 = 0; INT18 = 0;}
				try {//Q + E
					INT19 = Integer.parseInt(L10.getText());
					INT20 = Integer.parseInt(L12.getText());
					INT21 = Integer.parseInt(TPR.getText());
					INT22 = Integer.parseInt(TRM.getText()); //dont use int
					INT23 = Integer.parseInt(TLR.getText());
					INT24 = Integer.parseInt(THR.getText());
					INT25 = Integer.parseInt(TRL.getText());
				}catch (NumberFormatException e1) {INT19 = 0; INT20 = 0; INT21 = 0; INT22 = 0; INT23 = 0; INT24 = 0; INT25 = 0;}
				try {//I + SC + C
					INT26 = Integer.parseInt(LPR.getText());  //TPL
					INT27 = Integer.parseInt(LRM.getText()); //TLM Dont use int
					INT28 = Integer.parseInt(LLR.getText()); //T_LL
					INT29 = Integer.parseInt(LR.getText()); //TH_L
					INT30 = Integer.parseInt(LRL.getText()); //T_Ls
					INT31 = Integer.parseInt(WNR.getText());
					INT32 = Integer.parseInt(WNL.getText());
					INT33 = Integer.parseInt(MRR.getText());
					INT34 = Integer.parseInt(MRB.getText());
					INT35 = Integer.parseInt(MBR.getText());
					INT36 = Integer.parseInt(MRL.getText());
					INT37 = Integer.parseInt(MRB.getText()); //MLL
					INT38 = Integer.parseInt(MLB.getText()); //MLB
					INT39 = Integer.parseInt(MBR.getText());//
					INT40 = Integer.parseInt(MBL.getText());
					//INT41 M_BB Empty
					INT42 = Integer.parseInt(RSD.getText());
					INT43 = Integer.parseInt(LSD.getText());
				}catch (NumberFormatException e1) {INT41 = 0; INT42 = 0; INT43 = 0;INT26 = 0; INT27 = 0; INT28 = 0; INT29 = 0; INT30 = 0; INT31 = 0; INT32 = 0; INT33 = 0; INT34 = 0; INT35 = 0; INT36 = 0; INT37 = 0; INT38 = 0; INT39 = 0; INT40 = 0;}
				try {//I + SC + C
					INT44 = Integer.parseInt(LR50.getText());  //TPL
					INT45 = Integer.parseInt(LR1.getText()); //TLM Dont use int
					INT46 = Integer.parseInt(LR2.getText()); //T_LL
					INT47 = Integer.parseInt(LR3.getText()); //TH_L
					INT48 = Integer.parseInt(LR4.getText()); //T_Ls
					INT49 = Integer.parseInt(LR6.getText());
					INT50 = Integer.parseInt(LR8.getText());
					INT51 = Integer.parseInt(LR12.getText());
					INT52 = Integer.parseInt(LRTP.getText());
					INT53 = Integer.parseInt(LL50.getText());
					INT54 = Integer.parseInt(LL1.getText());
					INT55 = Integer.parseInt(LL2.getText());
					INT56 = Integer.parseInt(LL3.getText());
					INT57 = Integer.parseInt(LL4.getText());
					INT58 = Integer.parseInt(LL6.getText());
					INT59 = Integer.parseInt(LL8.getText());
					INT60 = Integer.parseInt(LL12.getText());
					INT61 = Integer.parseInt(LLTP.getText());
				}catch (NumberFormatException e1) {INT41 = 0; INT42 = 0; INT43 = 0; INT44 = 0; INT45 = 0; INT46 = 0; INT47 = 0; INT48 = 0; INT49 = 0; INT50 = 0; INT51 = 0; INT52 = 0; INT53 = 0; INT54 = 0; INT55 = 0; INT56 = 0; INT57 = 0; INT58 = 0; INT59 = 0; INT60 = 0;INT61 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO Audiological (Visit_ID) VALUES ("+INT+")");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Warning, Old Visit");}	
				finally {}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Audiological SET Comments = '"+CommentAudio.getText()+"', R25 = "+INT1+", R50 = "+INT2+", R1 = "+INT3+", R2 = "+INT4+", R4 = "+INT5+", R5 = "+INT6+", R6 = "+INT7+", R8 = "+INT8+", R10 = "+INT9+", R12 = "+INT10+", L25 = "+INT11+", L50 = "+INT12+", L1 = "+INT13+", L2 = "+INT14+", L3 = "+INT15+", L4 = "+INT16+", L6 = "+INT17+", L8 = "+INT18+", L10 = "+INT19+", L12 = "+INT20+", T_PR = "+INT21+", T_LR = "+INT23+", Th_R = "+INT24+", T_RLs = "+INT25+", T_PL = "+INT26+", T_LL = "+INT28+", Th_L = "+INT29+", T_Ls = "+INT30+", WNR = "+INT31+", WNL = "+INT32+", MRR = "+INT33+"  WHERE Visit_ID = "+INT+"");
					posted.executeUpdate();
					PreparedStatement posted2 = con.prepareStatement("UPDATE Audiological SET MRL = "+INT34+", MRB = "+INT35+", MLR = "+INT36+", MLL = "+INT37+", MLB = "+INT38+", MBR = "+INT39+", M_BL = "+INT40+", R_SD = "+INT42+", L_SD = "+INT43+", L_SD = "+INT43+", LR50 = "+INT44+", LR1 = "+INT45+", LR2 = "+INT46+", LR3 = "+INT47+", LR4 = "+INT48+", LR6 = "+INT49+", LR8 = "+INT50+", LR12 = "+INT51+", LRTP = "+INT52+", LL50 = "+INT53+", LL1 = "+INT54+", LL2 = "+INT55+", LL3 = "+INT56+", LL4 = "+INT57+", LL6 = "+INT58+", LL8 = "+INT59+", LL12 = "+INT60+", LLTP = "+INT61+"  WHERE Visit_ID = "+INT+"");
					posted2.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
			}
			}
		});
		btnNewButton.setBounds(449, 330, 111, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(449, 380, 111, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_2.setBounds(449, 430, 111, 29);
		panel.add(btnNewButton_2);
	}
	
	private void Medication() {
		frame.setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patient:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane PatName = new JTextPane();
		PatName.setText("Name");
		PatName.setBounds(66, 5, 62, 20);
		panel.add(PatName);
		
		JTextPane PatTHC = new JTextPane();
		PatTHC.setText("THC#");
		PatTHC.setBounds(149, 5, 46, 20);
		panel.add(PatTHC);
		
		JLabel lblNewLabel_1 = new JLabel("Visit ID:");
		lblNewLabel_1.setBounds(233, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton AddMed = new JButton("Add Medication");
		AddMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4;
				try {
					INT = Integer.parseInt(MedName.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(MedDose.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(MedDur.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO Pharmacology (Medicament_ID, Visit_ID) VALUES ("+INT+","+INT4+")");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Pharmacology SET Dose = "+INT2+", Duration_mo = "+INT3+", Comments = '"+MedCom.getText()+"' WHERE Visit_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
				}
			}
		});
		AddMed.setBounds(10, 227, 169, 23);
		panel.add(AddMed);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Pharmacology();
			}
		});
		btnNewButton_1.setBounds(197, 227, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton DeleteMed = new JButton("Delete Medication");
		DeleteMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4;
				try {
					INT = Integer.parseInt(MedName.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(MedDose.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(MedDur.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From Pharmacology Where Medicament_ID = "+INT+" and VISIT_ID = "+INT4+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Deleted");
				}
			}
		});
		DeleteMed.setBounds(289, 227, 139, 23);
		panel.add(DeleteMed);
		
		MedName = new JTextField();
		MedName.setBounds(10, 76, 86, 20);
		panel.add(MedName);
		MedName.setColumns(10);
		
		MedDose = new JTextField();
		MedDose.setBounds(122, 76, 46, 20);
		panel.add(MedDose);
		MedDose.setColumns(10);
		
		MedDur = new JTextField();
		MedDur.setBounds(189, 76, 86, 20);
		panel.add(MedDur);
		MedDur.setColumns(10);
		
		MedCom = new JTextField();
		MedCom.setBounds(10, 128, 369, 20);
		panel.add(MedCom);
		MedCom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Medication ID:");
		lblNewLabel_2.setBounds(10, 52, 102, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dose:");
		lblNewLabel_3.setBounds(122, 52, 78, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Duration:");
		lblNewLabel_4.setBounds(189, 51, 86, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Comments");
		lblNewLabel_5.setBounds(10, 103, 129, 14);
		panel.add(lblNewLabel_5);
		
		VisitID = new JTextField();
		VisitID.setBounds(281, 8, 86, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
	}
	
	private void InstruRem() {
		frame.setBounds(100, 100, 450, 300);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Instruments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Instruments();
			}
		});
		btnNewButton.setBounds(58, 48, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Rem();
			}
		});
		btnNewButton_1.setBounds(58, 98, 111, 39);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_2.setBounds(285, 192, 89, 23);
		panel.add(btnNewButton_2);
	}

	private void Instruments() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane InstrName = new JTextPane();
		InstrName.setText("Name");
		InstrName.setBounds(50, 5, 65, 20);
		panel.add(InstrName);
		
		JLabel lblNewLabel_1 = new JLabel("THC#:");
		lblNewLabel_1.setBounds(125, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JTextPane InstruTHC = new JTextPane();
		InstruTHC.setText("THC");
		InstruTHC.setBounds(166, 5, 40, 20);
		panel.add(InstruTHC);
		
		JLabel lblNewLabel_2 = new JLabel("Visit ID*:");
		lblNewLabel_2.setBounds(216, 11, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel InstrDate = new JLabel("Date:");
		InstrDate.setBounds(305, 11, 46, 14);
		panel.add(InstrDate);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		txtpnDate.setBounds(351, 5, 73, 20);
		panel.add(txtpnDate);
		
		JLabel lblNewLabel_4 = new JLabel("Instrument categoy*:");
		lblNewLabel_4.setBounds(10, 65, 118, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Instrument Type*:");
		lblNewLabel_5.setBounds(125, 65, 104, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Model*:");
		lblNewLabel_6.setBounds(230, 65, 58, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Comments:");
		lblNewLabel_7.setBounds(303, 65, 100, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				InstruRem();
			}
		});
		btnNewButton_1.setBounds(291, 160, 113, 38);
		panel.add(btnNewButton_1);
		
		Model = new JTextField();
		Model.setBounds(207, 90, 86, 20);
		panel.add(Model);
		Model.setColumns(10);
		
		VisitID = new JTextField();
		VisitID.setBounds(260, 5, 33, 20);
		panel.add(VisitID);
		VisitID.setColumns(10);
		
		InstrComments = new JTextField();
		InstrComments.setBounds(299, 90, 135, 20);
		panel.add(InstrComments);
		InstrComments.setColumns(10);
		
		JButton UpDate = new JButton("Update");
		UpDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4;
				try {
					INT = Integer.parseInt(VisitID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(InstrCate.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(InstrType.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(Model.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted3 = con.prepareStatement("UPDATE Instrumentation Set IC_ID = "+INT2+", IT_ID = "+INT3+", IM_ID = "+INT4+", Comments = '"+InstrComments.getText()+"' Where Visit_ID = "+INT);                              
					posted3.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		UpDate.setBounds(39, 160, 104, 38);
		panel.add(UpDate);
		
		InstrCate = new JTextField();
		InstrCate.setBounds(10, 90, 86, 20);
		panel.add(InstrCate);
		InstrCate.setColumns(10);
		
		InstrType = new JTextField();
		InstrType.setBounds(111, 90, 86, 20);
		panel.add(InstrType);
		InstrType.setColumns(10);
	}

	private void Rem() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(14, 17, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane InstrName = new JTextPane();
		InstrName.setText("Name");
		InstrName.setBounds(54, 11, 65, 20);
		panel.add(InstrName);
		
		JLabel lblNewLabel_1 = new JLabel("Visit#*:");
		lblNewLabel_1.setBounds(128, 17, 46, 14);
		panel.add(lblNewLabel_1);
		
		JButton Search = new JButton("Search Patient");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Search.setBounds(243, 52, 115, 23);
		panel.add(Search);
		
		THC = new JTextField();
		THC.setBounds(170, 11, 40, 20);
		panel.add(THC);
		THC.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Patient's Category:");
		lblNewLabel_2.setBounds(10, 42, 125, 14);
		panel.add(lblNewLabel_2);
		
		JTextPane PatCat = new JTextPane();
		PatCat.setText("Category");
		PatCat.setBounds(120, 36, 73, 20);
		panel.add(PatCat);
		JLabel InstrDate = new JLabel("Date:");
		InstrDate.setBounds(300, 17, 46, 14);
		panel.add(InstrDate);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		txtpnDate.setBounds(351, 11, 73, 20);
		panel.add(txtpnDate);
		
		JLabel lblNewLabel_4 = new JLabel("Instrument categoy:");
		lblNewLabel_4.setBounds(10, 71, 118, 14);
		panel.add(lblNewLabel_4);
		
		JTextPane InstruCate = new JTextPane();
		InstruCate.setText("Category");
		InstruCate.setBounds(120, 67, 83, 20);
		panel.add(InstruCate);
		
		JLabel lblNewLabel_3 = new JLabel("Freq RE:");
		lblNewLabel_3.setBounds(14, 96, 59, 14);
		panel.add(lblNewLabel_3);
		
		FreqRE = new JTextField();
		FreqRE.setBounds(65, 93, 40, 20);
		panel.add(FreqRE);
		FreqRE.setColumns(10);
		
		JLabel lblThRSpl = new JLabel("Th R SPL:");
		lblThRSpl.setBounds(115, 96, 59, 14);
		panel.add(lblThRSpl);
		
		ThR = new JTextField();
		ThR.setBounds(170, 93, 40, 20);
		panel.add(ThR);
		ThR.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mix R SPL:");
		lblNewLabel_5.setBounds(219, 96, 65, 14);
		panel.add(lblNewLabel_5);
		
		MixRSPL = new JTextField();
		MixRSPL.setBounds(272, 93, 40, 20);
		panel.add(MixRSPL);
		MixRSPL.setColumns(10);
		
		JLabel asdasdas = new JLabel("Mix R SL:");
		asdasdas.setBounds(322, 96, 65, 14);
		panel.add(asdasdas);
		
		MixRSL = new JTextField();
		MixRSL.setBounds(373, 93, 51, 20);
		panel.add(MixRSL);
		MixRSL.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tol R SPL:");
		lblNewLabel_3_1.setBounds(14, 124, 59, 14);
		panel.add(lblNewLabel_3_1);
		
		TolRSPL = new JTextField();
		TolRSPL.setColumns(10);
		TolRSPL.setBounds(65, 121, 40, 20);
		panel.add(TolRSPL);
		
		JLabel lblTolRSl = new JLabel("Tol R SL:");
		lblTolRSl.setBounds(115, 124, 59, 14);
		panel.add(lblTolRSl);
		
		TolRSL = new JTextField();
		TolRSL.setColumns(10);
		TolRSL.setBounds(170, 121, 40, 20);
		panel.add(TolRSL);
		
		JLabel lblNewLabel_5_1 = new JLabel("Max R SPL:");
		lblNewLabel_5_1.setBounds(219, 124, 65, 14);
		panel.add(lblNewLabel_5_1);
		
		MaxRSPL = new JTextField();
		MaxRSPL.setColumns(10);
		MaxRSPL.setBounds(272, 121, 40, 20);
		panel.add(MaxRSPL);
		
		JLabel lblNewLabel_6_1 = new JLabel("Max R SL:");
		lblNewLabel_6_1.setBounds(322, 124, 65, 14);
		panel.add(lblNewLabel_6_1);
		
		MaxRSL = new JTextField();
		MaxRSL.setColumns(10);
		MaxRSL.setBounds(373, 121, 51, 20);
		panel.add(MaxRSL);
		
		JLabel lblNewLabel_3_2 = new JLabel("Freq LE:");
		lblNewLabel_3_2.setBounds(14, 150, 59, 14);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Tol L SPL:");
		lblNewLabel_3_1_1.setBounds(14, 178, 59, 14);
		panel.add(lblNewLabel_3_1_1);
		
		TolLSPL = new JTextField();
		TolLSPL.setColumns(10);
		TolLSPL.setBounds(65, 175, 40, 20);
		panel.add(TolLSPL);
		
		FreqLE = new JTextField();
		FreqLE.setColumns(10);
		FreqLE.setBounds(65, 147, 40, 20);
		panel.add(FreqLE);
		
		JLabel lblThLSpl = new JLabel("Th L SPL:");
		lblThLSpl.setBounds(115, 150, 59, 14);
		panel.add(lblThLSpl);
		
		JLabel lblTolLSl = new JLabel("Tol L SL:");
		lblTolLSl.setBounds(115, 178, 59, 14);
		panel.add(lblTolLSl);
		
		TolLSL = new JTextField();
		TolLSL.setColumns(10);
		TolLSL.setBounds(170, 175, 40, 20);
		panel.add(TolLSL);
		
		ThLSPL = new JTextField();
		ThLSPL.setColumns(10);
		ThLSPL.setBounds(170, 147, 40, 20);
		panel.add(ThLSPL);
		
		JLabel lblNewLabel_5_2 = new JLabel("Mix L SPL:");
		lblNewLabel_5_2.setBounds(219, 150, 65, 14);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Max L SPL:");
		lblNewLabel_5_1_1.setBounds(219, 178, 65, 14);
		panel.add(lblNewLabel_5_1_1);
		
		MaxLSPL = new JTextField();
		MaxLSPL.setColumns(10);
		MaxLSPL.setBounds(272, 175, 40, 20);
		panel.add(MaxLSPL);
		
		MixLSPL = new JTextField();
		MixLSPL.setColumns(10);
		MixLSPL.setBounds(272, 147, 40, 20);
		panel.add(MixLSPL);
		
		JLabel lblNewLabel_6_2 = new JLabel("Mix L SL:");
		lblNewLabel_6_2.setBounds(322, 150, 65, 14);
		panel.add(lblNewLabel_6_2);
		
		MixLSL = new JTextField();
		MixLSL.setColumns(10);
		MixLSL.setBounds(373, 147, 51, 20);
		panel.add(MixLSL);
		
		MaxLSL = new JTextField();
		MaxLSL.setColumns(10);
		MaxLSL.setBounds(373, 175, 51, 20);
		panel.add(MaxLSL);
		
		InstrID = new JTextField();
		InstrID.setBounds(260, 11, 30, 20);
		panel.add(InstrID);
		InstrID.setColumns(10);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Max L SL:");
		lblNewLabel_6_1_1.setBounds(322, 178, 65, 14);
		panel.add(lblNewLabel_6_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT0;
				try {
					INT = Integer.parseInt(THC.getText());
					INT0 = Integer.parseInt(InstrID.getText());
				}catch (NumberFormatException e1) {INT = 0; INT0 = 0;}
				int INT1, INT2, INT3, INT4, INT5, INT6, INT7, INT8, INT9, INT10, INT11, INT12, INT13, INT14, INT15; 
				try {
					INT1 = Integer.parseInt(FreqRE.getText());
					INT2 = Integer.parseInt(MixRSPL.getText());
					INT3 = Integer.parseInt(MixRSL.getText());
					INT4 = Integer.parseInt(TolRSPL.getText());
					INT5 = Integer.parseInt(TolRSL.getText());
					INT6 = Integer.parseInt(MaxRSPL.getText());
					INT7 = Integer.parseInt(MaxRSL.getText());
					INT8 = Integer.parseInt(TolLSPL.getText());
					INT9 = Integer.parseInt(FreqLE.getText());
					INT10 = Integer.parseInt(TolLSL.getText());
					INT11 = Integer.parseInt(ThLSPL.getText());
					INT12 = Integer.parseInt(MaxLSPL.getText());
					INT13 = Integer.parseInt(MixLSPL.getText());
					INT14 = Integer.parseInt(MixLSL.getText());
					INT15 = Integer.parseInt(MaxLSL.getText());
				}catch (NumberFormatException e1) {INT1 = 0; INT2 = 0; INT3 = 0; INT4 = 0; INT5 = 0; INT6 = 0; INT7 = 0; INT8 = 0; INT9 = 0; INT10 = 0; INT11 = 0; INT12 = 0; INT13 = 0; INT14 = 0; INT15 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REM SET Freg_RE = "+INT1+", T_R_SPL = "+INT2+", Mix_R_SL = "+INT3+", Tol_R_SPL = "+INT4+", TOL_R_SL = "+INT5+", Max_R_SL = "+INT6+", MAX_R_SPL = "+INT7+", Freg_LE = "+INT8+", Th_L_SPL = "+INT9+", Mix_L_SPL = "+INT10+", Mix_L_SL = "+INT11+", TOL_L_SPL = "+INT12+", Tol_L_SL = "+INT13+", Max_L_SL = "+INT14+", Max_L_SPL = "+INT15+" WHERE Visit_ID = "+INT+" AND Instr_ID = "+INT0+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		btnNewButton.setBounds(223, 215, 89, 23);
		panel.add(btnNewButton);
		
		JButton Update = new JButton("Update");
		Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT0;
				try {
					INT = Integer.parseInt(THC.getText());
					INT0 = Integer.parseInt(InstrID.getText());
				}catch (NumberFormatException e1) {INT = 0; INT0 = 0;}
				int INT1, INT2, INT3, INT4, INT5, INT6, INT7, INT8, INT9, INT10, INT11, INT12, INT13, INT14, INT15; 
				try {
					INT1 = Integer.parseInt(FreqRE.getText());
					INT2 = Integer.parseInt(MixRSPL.getText());
					INT3 = Integer.parseInt(MixRSL.getText());
					INT4 = Integer.parseInt(TolRSPL.getText());
					INT5 = Integer.parseInt(TolRSL.getText());
					INT6 = Integer.parseInt(MaxRSPL.getText());
					INT7 = Integer.parseInt(MaxRSL.getText());
					INT8 = Integer.parseInt(TolLSPL.getText());
					INT9 = Integer.parseInt(FreqLE.getText());
					INT10 = Integer.parseInt(TolLSL.getText());
					INT11 = Integer.parseInt(ThLSPL.getText());
					INT12 = Integer.parseInt(MaxLSPL.getText());
					INT13 = Integer.parseInt(MixLSPL.getText());
					INT14 = Integer.parseInt(MixLSL.getText());
					INT15 = Integer.parseInt(MaxLSL.getText());
				}catch (NumberFormatException e1) {INT1 = 0; INT2 = 0; INT3 = 0; INT4 = 0; INT5 = 0; INT6 = 0; INT7 = 0; INT8 = 0; INT9 = 0; INT10 = 0; INT11 = 0; INT12 = 0; INT13 = 0; INT14 = 0; INT15 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REM SET Freg_RE = "+INT1+", T_R_SPL = "+INT2+", Mix_R_SL = "+INT3+", Tol_R_SPL = "+INT4+", TOL_R_SL = "+INT5+", Max_R_SL = "+INT6+", MAX_R_SPL = "+INT7+", Freg_LE = "+INT8+", Th_L_SPL = "+INT9+", Mix_L_SPL = "+INT10+", Mix_L_SL = "+INT11+", TOL_L_SPL = "+INT12+", Tol_L_SL = "+INT13+", Max_L_SL = "+INT14+", Max_L_SPL = "+INT15+" WHERE Visit_ID = "+INT+" AND Instr_ID = "+INT0+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		Update.setBounds(120, 215, 89, 23);
		panel.add(Update);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				InstruRem();
			}
		});
		btnNewButton_1.setBounds(322, 215, 89, 23);
		panel.add(btnNewButton_1);
		
		InstrID = new JTextField();
		InstrID.setBounds(260, 11, 30, 20);
		panel.add(InstrID);
		InstrID.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Instr. ID:");
		lblNewLabel_6.setBounds(213, 17, 46, 14);
		panel.add(lblNewLabel_6);
	}
	
	private void Counseling() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(14, 17, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane CounselName = new JTextPane();
		CounselName.setText("Name");
		CounselName.setBounds(54, 11, 65, 20);
		panel.add(CounselName);
		
		JLabel lblNewLabel_1 = new JLabel("Visit ID*:");
		lblNewLabel_1.setBounds(128, 17, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Visit's #:");
		lblNewLabel_2.setBounds(338, 17, 65, 14);
		panel.add(lblNewLabel_2);
		
		JTextPane VisitCount = new JTextPane();
		VisitCount.setText("Number");
		VisitCount.setBounds(384, 11, 40, 20);
		panel.add(VisitCount);
		
		JLabel adwawdDate = new JLabel("Date:");
		adwawdDate.setBounds(223, 17, 46, 14);
		panel.add(adwawdDate);
		
		JTextPane CounselDate = new JTextPane();
		CounselDate.setText("Date");
		CounselDate.setBounds(255, 11, 73, 20);
		panel.add(CounselDate);
		
		JLabel lblNewLabel_4 = new JLabel("Follow-up (FU) type:");
		lblNewLabel_4.setBounds(14, 46, 118, 14);
		panel.add(lblNewLabel_4);
		
		JTextPane CounselCate = new JTextPane();
		CounselCate.setText("Category");
		CounselCate.setBounds(124, 42, 83, 20);
		panel.add(CounselCate);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(Visit.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE Counseling SET type1 = '"+CounselCate.getText()+"', Comments = '"+CounselDetails.getText()+"' WHERE Visit_ID = "+INT);					
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		btnNewButton.setBounds(223, 215, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Interview();
			}
		});
		btnNewButton_1.setBounds(322, 215, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Counseling Details:");
		lblNewLabel_3.setBounds(14, 71, 175, 14);
		panel.add(lblNewLabel_3);
		
		CounselDetails = new JTextField();
		CounselDetails.setBounds(14, 88, 410, 20);
		panel.add(CounselDetails);
		CounselDetails.setColumns(10);
		
		Visit = new JTextField();
		Visit.setBounds(168, 11, 46, 20);
		panel.add(Visit);
		Visit.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(Visit.getText());
				}catch (NumberFormatException e1) {INT = 0;}
			}
		});
		btnSearch.setBounds(223, 42, 89, 23);
		panel.add(btnSearch);
	}
	
	private void Analytics() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Predict Diagnosis");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Diagnoses();
			}
		});
		btnNewButton.setBounds(40, 74, 143, 57);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Recommend Treatment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Treatment();
			}
		});
		btnNewButton_1.setBounds(235, 74, 143, 57);
		panel.add(btnNewButton_1);
		
		JButton btnKnowledgeBase = new JButton("Knowledge Base");
		btnKnowledgeBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnKnowledgeBase.setBounds(40, 142, 143, 57);
		panel.add(btnKnowledgeBase);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				mainPage();
			}
		});
		btnNewButton_3.setBounds(235, 165, 120, 34);
		panel.add(btnNewButton_3);
	}
	
	private void Diagnoses() {
		frame.setBounds(100, 100, 745, 370);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 729, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THC#:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		THCSearch = new JTextField();
		THCSearch.setBounds(47, 8, 86, 20);
		panel.add(THCSearch);
		THCSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Need THC#?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				View();
			}
		});
		btnNewButton.setBounds(608, 7, 111, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(166, 7, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				Analytics();
			}
		});
		btnNewButton_2.setBounds(278, 7, 89, 23);
		panel.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 706, 258);
		panel.add(scrollPane);
		
		Dianose = new JTable();
		Dianose.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Category", "Confidence %", "Explaination"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		Dianose.getColumnModel().getColumn(0).setPreferredWidth(45);
		Dianose.getColumnModel().getColumn(2).setPreferredWidth(500);
		Dianose.getColumnModel().getColumn(2).setMinWidth(150);
		scrollPane.setViewportView(Dianose);
	}
		
	private void Treatment() {
		frame.setBounds(100, 100, 745, 370);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 729, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THC#:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		THCSearch = new JTextField();
		THCSearch.setBounds(47, 8, 86, 20);
		panel.add(THCSearch);
		THCSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Need THC#?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				View();
			}
		});
		btnNewButton.setBounds(608, 7, 111, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(166, 7, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				Analytics();
			}
		});
		btnNewButton_2.setBounds(278, 7, 89, 23);
		panel.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 706, 258);
		panel.add(scrollPane);
		
		Treatment = new JTable();
		Treatment.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Patient Profile", "Recommended Actions", "Confidence %"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		Treatment.getColumnModel().getColumn(0).setPreferredWidth(200);
		Treatment.getColumnModel().getColumn(1).setPreferredWidth(300);
		Treatment.getColumnModel().getColumn(1).setMinWidth(150);
		scrollPane.setViewportView(Treatment);
	}
	
	private void Other() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Location Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Location();
			}
		});
		btnNewButton.setBounds(10, 11, 155, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Demographics");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				DemoData();
			}
		});
		btnNewButton_1.setBounds(10, 62, 155, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Medical Data");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Medical();
			}
		});
		btnNewButton_2.setBounds(10, 113, 155, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pharmacology Data");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				PharmData();
			}
		});
		btnNewButton_3.setBounds(10, 164, 155, 40);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Instruments");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				InstruData();
			}
		});
		btnNewButton_4.setBounds(10, 210, 155, 40);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				mainPage();
			}
		});
		btnNewButton_5.setBounds(289, 219, 89, 23);
		panel.add(btnNewButton_5);
	}
	
	private void Location() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Country:");
		lblNewLabel.setBounds(10, 11, 65, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox.setBounds(10, 31, 65, 22);
		panel.add(comboBox);
		
		JButton AddCountry = new JButton("Add");
		AddCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbCountry.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Country (Country_ID, Name1) VALUES ("+INT+",'"+CountryName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddCountry.setBounds(10, 131, 65, 23);
		panel.add(AddCountry);
		
		AbbCountry = new JTextField();
		AbbCountry.setBounds(10, 64, 65, 20);
		panel.add(AbbCountry);
		AbbCountry.setColumns(10);
		
		CountryName = new JTextField();
		CountryName.setBounds(10, 95, 65, 20);
		panel.add(CountryName);
		CountryName.setColumns(10);
		
		JButton DeleteCountry = new JButton("Delete");
		DeleteCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbCountry.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Country Where Country_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteCountry.setBounds(10, 161, 65, 23);
		panel.add(DeleteCountry);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(185, 11, 65, 14);
		panel.add(lblState);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox_1.setBounds(185, 31, 65, 22);
		panel.add(comboBox_1);
		
		AbbState = new JTextField();
		AbbState.setColumns(10);
		AbbState.setBounds(185, 64, 65, 20);
		panel.add(AbbState);
		
		StateName = new JTextField();
		StateName.setColumns(10);
		StateName.setBounds(185, 95, 65, 20);
		panel.add(StateName);
		
		JButton AddState = new JButton("Add");
		AddState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbState.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_State (State_ID, Name1) VALUES ("+INT+",'"+StateName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddState.setBounds(185, 131, 65, 23);
		panel.add(AddState);
		
		JButton DeleteState = new JButton("Delete");
		DeleteState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbState.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_State Where State_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteState.setBounds(185, 161, 65, 23);
		panel.add(DeleteState);
		
		JLabel lblCity = new JLabel("City/Zip:");
		lblCity.setBounds(359, 11, 65, 14);
		panel.add(lblCity);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox_2.setBounds(359, 31, 65, 22);
		panel.add(comboBox_2);
		
		CityCode = new JTextField();
		CityCode.setColumns(10);
		CityCode.setBounds(359, 64, 65, 20);
		panel.add(CityCode);
		
		CityName = new JTextField();
		CityName.setColumns(10);
		CityName.setBounds(343, 95, 81, 20);
		panel.add(CityName);
		
		JButton AddCity = new JButton("Add");
		AddCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(CityCode.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Zip (ZIP_ID, Name1) VALUES ("+INT+",'"+CityName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddCity.setBounds(359, 131, 65, 23);
		panel.add(AddCity);
		
		JButton DeleteCity = new JButton("Delete");
		DeleteCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(CityCode.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_ZIP Where ZIP_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteCity.setBounds(359, 161, 65, 23);
		panel.add(DeleteCity);
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setBounds(109, 67, 90, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(109, 98, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Code:");
		lblNewLabel_3.setBounds(303, 67, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name:");
		lblNewLabel_4.setBounds(303, 98, 46, 14);
		panel.add(lblNewLabel_4);
		
		JButton UpdateCountry = new JButton("Update");
		UpdateCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbCountry.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Country SET Name1 = '"+CountryName.getText()+"' WHERE Country_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateCountry.setBounds(10, 195, 81, 23);
		panel.add(UpdateCountry); //PreparedStatement posted = con.prepareStatement("UPDATE "+REF_Country+" SET Name1 = '"+CountryName.getText()+"' WHERE Country_ID = "+INT);
		
		JButton UpdateState = new JButton("Update");
		UpdateState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(AbbState.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_State SET Name1 = '"+StateName.getText()+"' WHERE State_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateState.setBounds(179, 195, 81, 23);
		panel.add(UpdateState);
		
		JButton UpdateCity = new JButton("Update");
		UpdateCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(CityCode.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_ZIP SET Name1 = '"+CityName.getText()+"' WHERE ZIP_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateCity.setBounds(343, 195, 81, 23);
		panel.add(UpdateCity);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnBack.setBounds(260, 229, 89, 23);
		panel.add(btnBack);
	}
	//Done
	private void DemoData() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Occupation");
		lblNewLabel.setBounds(10, 11, 65, 14);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox.setBounds(10, 31, 65, 22);
		panel.add(comboBox);
		
		JButton AddOcc = new JButton("Add");
		AddOcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Occupation (Occup_ID, Name1) VALUES ("+INT+",'"+JobName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddOcc.setBounds(10, 131, 65, 23);
		panel.add(AddOcc);
		
		OccupationID = new JTextField();
		OccupationID.setBounds(10, 64, 65, 20);
		panel.add(OccupationID);
		OccupationID.setColumns(10);
		
		JobName = new JTextField();
		JobName.setBounds(10, 95, 65, 20);
		panel.add(JobName);
		JobName.setColumns(10);
		
		JButton DeleteOcc = new JButton("Delete");
		DeleteOcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Occupation Where Occup_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteOcc.setBounds(10, 161, 65, 23);
		panel.add(DeleteOcc);
		
		JLabel lblState = new JLabel("Education");
		lblState.setBounds(185, 11, 65, 14);
		panel.add(lblState);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox_1.setBounds(185, 31, 65, 22);
		panel.add(comboBox_1);
		
		OccupationID2 = new JTextField();
		OccupationID2.setColumns(10);
		OccupationID2.setBounds(185, 64, 65, 20);
		panel.add(OccupationID2);
		
		EduName = new JTextField();
		EduName.setColumns(10);
		EduName.setBounds(185, 95, 65, 20);
		panel.add(EduName);
		
		JButton AddEdu = new JButton("Add");
		AddEdu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID2.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Occupation (Occup_ID, Name1) VALUES ("+INT+",'"+EduName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddEdu.setBounds(185, 131, 65, 23);
		panel.add(AddEdu);
		
		JButton DeleteEdu = new JButton("Delete");
		DeleteEdu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID2.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Occupation Where Occup_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteEdu.setBounds(185, 161, 65, 23);
		panel.add(DeleteEdu);
		
		JLabel lblCity = new JLabel("Work Status");
		lblCity.setBounds(359, 11, 75, 14);
		panel.add(lblCity);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Fill", "In"}));
		comboBox_2.setBounds(359, 31, 65, 22);
		panel.add(comboBox_2);
		
		WorkName = new JTextField();
		WorkName.setColumns(10);
		WorkName.setBounds(343, 95, 81, 20);
		panel.add(WorkName);
		
		JButton AddWork = new JButton("Add");
		AddWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(WorkAbb.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_WorkS (WStatus_ID, Name1) VALUES ("+INT+",'"+WorkName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddWork.setBounds(359, 131, 65, 23);
		panel.add(AddWork);
		
		JButton DeleteWork = new JButton("Delete");
		DeleteWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(WorkAbb.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_WorkS Where WStatus_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteWork.setBounds(359, 161, 65, 23);
		panel.add(DeleteWork);
		
		JLabel lblNewLabel_1 = new JLabel("Occupational ID");
		lblNewLabel_1.setBounds(85, 67, 90, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(109, 98, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Work ID:");
		lblNewLabel_3.setBounds(294, 67, 75, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name:");
		lblNewLabel_4.setBounds(303, 98, 46, 14);
		panel.add(lblNewLabel_4);
		
		JButton UpdateOcc = new JButton("Update");
		UpdateOcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Occupation SET Name1 = '"+JobName.getText()+"' WHERE Occup_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateOcc.setBounds(10, 195, 81, 23);
		panel.add(UpdateOcc);
		
		JButton UpdateEdu = new JButton("Update");
		UpdateEdu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(OccupationID2.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Occupation SET Name1 = '"+EduName.getText()+"' WHERE Occup_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateEdu.setBounds(179, 195, 81, 23);
		panel.add(UpdateEdu);
		
		JButton UpdateWork = new JButton("Update");
		UpdateWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(WorkAbb.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_WorkS SET Name1 = '"+WorkName.getText()+"' WHERE WStatus_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			
			}
		});
		UpdateWork.setBounds(343, 195, 81, 23);
		panel.add(UpdateWork);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnBack.setBounds(260, 229, 89, 23);
		panel.add(btnBack);
		
		WorkAbb = new JTextField();
		WorkAbb.setBounds(359, 64, 70, 20);
		panel.add(WorkAbb);
		WorkAbb.setColumns(10);
	}
	
	private void Medical() {
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Code");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Problem Name");
		lblNewLabel_1.setBounds(66, 11, 76, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Abbrev.");
		lblNewLabel_2.setBounds(151, 11, 72, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setBounds(233, 11, 118, 14);
		panel.add(lblNewLabel_3);
		
		MedID = new JTextField();
		MedID.setBounds(10, 31, 37, 20);
		panel.add(MedID);
		MedID.setColumns(10);
		
		DiseaseName = new JTextField();
		DiseaseName.setBounds(66, 31, 80, 20);
		panel.add(DiseaseName);
		DiseaseName.setColumns(10);
		
		MedAbb = new JTextField();
		MedAbb.setBounds(151, 31, 46, 20);
		panel.add(MedAbb);
		MedAbb.setColumns(10);
		
		MedDesc = new JTextField();
		MedDesc.setBounds(215, 31, 136, 20);
		panel.add(MedDesc);
		MedDesc.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(MedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				int INT2;
				try {
					INT2 = Integer.parseInt(MedAbb.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Problem (Problem_ID, Name1) VALUES ("+INT+",'"+DiseaseName.getText()+"')");
					//PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Medicament (Medicament_ID, Name1, Description, Usual_dose) VALUES ("+INT+",'"+DiseaseName.getText()+"', '"+MedDesc.getText()+"', "+INT2+")");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		btnNewButton.setBounds(10, 89, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnNewButton_1.setBounds(319, 215, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(MedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				int INT2;
				try {
					INT2 = Integer.parseInt(MedAbb.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Problem SET Name1 = '"+DiseaseName.getText()+"' WHERE Problem_ID = "+INT);
					//PreparedStatement posted = con.prepareStatement("UPDATE REF_Medicament SET Name1 = '"+DiseaseName.getText()+"', Description = '"+MedDesc.getText()+"', Usual_dose = "+INT2+" WHERE Medicament_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		btnNewButton_2.setBounds(10, 124, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(MedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				int INT2;
				try {
					INT2 = Integer.parseInt(MedAbb.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete from Ref_Problem WHERE Problem_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		btnNewButton_3.setBounds(10, 158, 89, 23);
		panel.add(btnNewButton_3);
	}
	
	private void PharmData() {
		frame.setBounds(100, 100, 650, 300);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 634, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton AddCountry = new JButton("Add");
		AddCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4, INT5;
				try {
					INT = Integer.parseInt(PharmMedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(PharmMedGen.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(PharmMedChem.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(PharmMedDis.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					INT5 = Integer.parseInt(PharmMedDose.getText());
				}catch (NumberFormatException e1) {INT5 = 0;}
				
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Medicament (Medicament_ID, Generic_ID, Chem_ID, Disease_ID,Name1, Description, Usual_Dose) VALUES ("+INT+", "+INT2+", "+INT3+", "+INT4+",'"+PharmMedName.getText()+"','"+PharmMedDesc.getText()+"', "+ INT5+")");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddCountry.setBounds(10, 159, 81, 23);
		panel.add(AddCountry);
		
		JButton DeleteCountry = new JButton("Delete");
		DeleteCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4, INT5;
				try {
					INT = Integer.parseInt(PharmMedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Medicament Where Medicament_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		DeleteCountry.setBounds(10, 193, 81, 23);
		panel.add(DeleteCountry);
		
		JButton AddState = new JButton("Add");
		AddState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmGenID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Generic (Generic_ID, Name1, Description1) VALUES ("+INT+",'"+PharmGenName.getText()+"', '"+PharmGenName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddState.setBounds(215, 159, 81, 23);
		panel.add(AddState);
		
		JButton DeleteState = new JButton("Delete");
		DeleteState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmGenID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Generic Where Generic_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteState.setBounds(215, 193, 81, 23);
		panel.add(DeleteState);
		
		JButton UpdateCountry = new JButton("Update");
		UpdateCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2, INT3, INT4, INT5;
				try {
					INT = Integer.parseInt(PharmMedID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(PharmMedGen.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					INT3 = Integer.parseInt(PharmMedChem.getText());
				}catch (NumberFormatException e1) {INT3 = 0;}
				try {
					INT4 = Integer.parseInt(PharmMedDis.getText());
				}catch (NumberFormatException e1) {INT4 = 0;}
				try {
					INT5 = Integer.parseInt(PharmMedDose.getText());
				}catch (NumberFormatException e1) {INT5 = 0;}
				
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Medicament SET Generic_ID = "+INT2+", Chem_ID = "+INT3+", Disease_ID = "+INT4+", Name1 = '"+PharmMedName.getText()+"', Description = '"+PharmMedName.getText()+"', Usual_Dose = "+INT5+" WHERE Medicanment_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateCountry.setBounds(10, 227, 81, 23);
		panel.add(UpdateCountry);
		
		JButton UpdateState = new JButton("Update");
		UpdateState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmGenID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Generic SET Name1 = '"+PharmGenName.getText()+"', Description1 = '"+PharmGenDesc.getText()+"' WHERE Generic_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateState.setBounds(215, 227, 81, 23);
		panel.add(UpdateState);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnBack.setBounds(535, 227, 89, 23);
		panel.add(btnBack);
		
		JButton AddState_1 = new JButton("Add");
		AddState_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmDisID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Disease (Disease_ID, Name1, Description1) VALUES ("+INT+",'"+PharmDisName.getText()+"', '"+PharmDisName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddState_1.setBounds(329, 159, 81, 23);
		panel.add(AddState_1);
		
		JButton DeleteState_1 = new JButton("Delete");
		DeleteState_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmDisID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Disease Where Disease_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteState_1.setBounds(329, 193, 81, 23);
		panel.add(DeleteState_1);
		
		JButton UpdateState_1 = new JButton("Update");
		UpdateState_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmDisID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Disease SET Name1 = '"+PharmDisName.getText()+"', Description1 = '"+PharmDisDesc.getText()+"' WHERE Disease_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateState_1.setBounds(329, 227, 81, 23);
		panel.add(UpdateState_1);
		
		JButton AddState_2 = new JButton("Add");
		AddState_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmChemID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_CatChem (Chem_ID, Name1, Description1) VALUES ("+INT+",'"+PharmChemName.getText()+"', '"+PharmChemName.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		AddState_2.setBounds(445, 159, 81, 23);
		panel.add(AddState_2);
		
		JButton DeleteState_2 = new JButton("Delete");
		DeleteState_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmChemID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_CatChem Where Chem_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {System.out.println(e1);}	
				finally {
					System.out.println("Delete Completed");
				}
			}
		});
		DeleteState_2.setBounds(445, 193, 81, 23);
		panel.add(DeleteState_2);
		
		JButton UpdateState_2 = new JButton("Update");
		UpdateState_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(PharmChemID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_CatChem SET Name1 = '"+PharmChemName.getText()+"', Description1 = '"+PharmChemDesc.getText()+"' WHERE Chem_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					System.out.println("Insert Completed");
				}
			}
		});
		UpdateState_2.setBounds(445, 227, 81, 23);
		panel.add(UpdateState_2);
		
		JLabel text = new JLabel("Medication");
		text.setBounds(10, 11, 81, 14);
		panel.add(text);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(10, 26, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 51, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desc");
		lblNewLabel_2.setBounds(10, 76, 35, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dose");
		lblNewLabel_3.setBounds(96, 26, 46, 14);
		panel.add(lblNewLabel_3);
		
		PharmMedGen = new JTextField();
		PharmMedGen.setColumns(10);
		PharmMedGen.setBounds(127, 160, 31, 20);
		panel.add(PharmMedGen);
		
		JLabel awdawda_1 = new JLabel("Generic");
		awdawda_1.setBounds(112, 146, 46, 14);
		panel.add(awdawda_1);
		
		JLabel lblNewLabel_4 = new JLabel("Chem Cate.");
		lblNewLabel_4.setBounds(10, 126, 66, 14);
		panel.add(lblNewLabel_4);
		
		PharmMedID = new JTextField();
		PharmMedID.setBounds(40, 23, 46, 20);
		panel.add(PharmMedID);
		PharmMedID.setColumns(10);
		
		PharmMedName = new JTextField();
		PharmMedName.setBounds(41, 48, 117, 20);
		panel.add(PharmMedName);
		PharmMedName.setColumns(10);
		
		PharmMedDesc = new JTextField();
		PharmMedDesc.setBounds(41, 73, 117, 20);
		panel.add(PharmMedDesc);
		PharmMedDesc.setColumns(10);
		
		PharmMedDose = new JTextField();
		PharmMedDose.setBounds(127, 23, 31, 20);
		panel.add(PharmMedDose);
		PharmMedDose.setColumns(10);
		
		PharmMedChem = new JTextField();
		PharmMedChem.setBounds(72, 123, 86, 20);
		panel.add(PharmMedChem);
		PharmMedChem.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Disease");
		lblNewLabel_5.setBounds(10, 101, 46, 14);
		panel.add(lblNewLabel_5);
		
		PharmMedDis = new JTextField();
		PharmMedDis.setBounds(72, 98, 86, 20);
		panel.add(PharmMedDis);
		PharmMedDis.setColumns(10);
		
		JLabel awdawda = new JLabel("Generic");
		awdawda.setBounds(215, 11, 46, 14);
		panel.add(awdawda);
		
		JLabel lblNewLabel_6 = new JLabel("Disease");
		lblNewLabel_6.setBounds(329, 11, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Chemical Category");
		lblNewLabel_7.setBounds(445, 11, 95, 14);
		panel.add(lblNewLabel_7);
		
		PharmGenID = new JTextField();
		PharmGenID.setBounds(210, 48, 86, 20);
		panel.add(PharmGenID);
		PharmGenID.setColumns(10);
		
		PharmGenName = new JTextField();
		PharmGenName.setBounds(210, 73, 86, 20);
		panel.add(PharmGenName);
		PharmGenName.setColumns(10);
		
		PharmGenDesc = new JTextField();
		PharmGenDesc.setBounds(210, 98, 86, 20);
		panel.add(PharmGenDesc);
		PharmGenDesc.setColumns(10);
		
		PharmDisID = new JTextField();
		PharmDisID.setColumns(10);
		PharmDisID.setBounds(324, 48, 86, 20);
		panel.add(PharmDisID);
		
		PharmDisName = new JTextField();
		PharmDisName.setColumns(10);
		PharmDisName.setBounds(324, 73, 86, 20);
		panel.add(PharmDisName);
		
		PharmDisDesc = new JTextField();
		PharmDisDesc.setColumns(10);
		PharmDisDesc.setBounds(324, 98, 86, 20);
		panel.add(PharmDisDesc);
		
		PharmChemID = new JTextField();
		PharmChemID.setColumns(10);
		PharmChemID.setBounds(440, 48, 86, 20);
		panel.add(PharmChemID);
		
		PharmChemName = new JTextField();
		PharmChemName.setColumns(10);
		PharmChemName.setBounds(440, 73, 86, 20);
		panel.add(PharmChemName);
		
		PharmChemDesc = new JTextField();
		PharmChemDesc.setColumns(10);
		PharmChemDesc.setBounds(440, 98, 86, 20);
		panel.add(PharmChemDesc);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setBounds(535, 51, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Name");
		lblNewLabel_9.setBounds(535, 76, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Description");
		lblNewLabel_10.setBounds(535, 101, 89, 14);
		panel.add(lblNewLabel_10);
	}
	
	private void InstruData() {
		frame.setBounds(100, 100, 445, 345);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 429, 306);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton AddCat = new JButton("Add");
		AddCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrCateID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Instr_category (IC_ID, Name, Description1) VALUES ("+INT+",'"+IntrCateName.getText()+"', '"+IntrCateDesc.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		AddCat.setBounds(10, 204, 81, 23);
		panel.add(AddCat);
		
		JButton DeleteCate = new JButton("Delete");
		DeleteCate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrCateID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Instr_category Where IC_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Deleted");
				}
			}
		});
		DeleteCate.setBounds(10, 238, 81, 23);
		panel.add(DeleteCate);
		
		JButton UpdateCate = new JButton("Update");
		UpdateCate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrCateID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Instr_type SET Name1 = '"+IntrCateName.getText()+"', Description1 = '"+IntrCateDesc.getText()+"' WHERE IC_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		UpdateCate.setBounds(10, 272, 81, 23);
		panel.add(UpdateCate);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 450, 300);
				panel.removeAll();
				panel.hide();
				Other();
			}
		});
		btnBack.setBounds(330, 272, 89, 23);
		panel.add(btnBack);
		
		JButton AddType = new JButton("Add");
		AddType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2;
				try {
					INT = Integer.parseInt(InstrTypeID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(InstrTypeCate.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Instr_type (IT_ID, IC_ID, Name1, Description) VALUES ("+INT+", "+INT2+", '"+InstrTypeName.getText()+"', '"+InstrTypeDesc.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		AddType.setBounds(124, 204, 81, 23);
		panel.add(AddType);
		
		JButton DeleteType = new JButton("Delete");
		DeleteType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrTypeID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Instr_type Where IT_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Deleted");
				}
			}
		});
		DeleteType.setBounds(124, 238, 81, 23);
		panel.add(DeleteType);
		
		JButton UpdateType = new JButton("Update");
		UpdateType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT, INT2;
				try {
					INT = Integer.parseInt(InstrTypeID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				try {
					INT2 = Integer.parseInt(InstrTypeCate.getText());
				}catch (NumberFormatException e1) {INT2 = 0;}
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Instr_type SET IC_ID = "+INT2+", Name1 = '"+InstrTypeName.getText()+"', Description1 = '"+InstrTypeDesc.getText()+"' WHERE It_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		UpdateType.setBounds(124, 272, 81, 23);
		panel.add(UpdateType);
		
		JButton AddModel = new JButton("Add");
		AddModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrModelID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("INSERT INTO REF_Instr_model (IM_ID, Name1, Description1) VALUES ("+INT+",'"+InstrModelName.getText()+"', '"+InstrModelDesc.getText()+"')");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Added");
				}
			}
		});
		AddModel.setBounds(240, 204, 81, 23);
		panel.add(AddModel);
		
		JButton DeleteModel = new JButton("Delete");
		DeleteModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrModelID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("Delete From REF_Instr_model Where Im_ID = "+INT+"");
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Deleted");
				}
			}
		});
		DeleteModel.setBounds(240, 238, 81, 23);
		panel.add(DeleteModel);
		
		JButton UpdateModel = new JButton("Update");
		UpdateModel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int INT;
				try {
					INT = Integer.parseInt(InstrModelID.getText());
				}catch (NumberFormatException e1) {INT = 0;}
				System.out.println(INT);
				try {
					Connection con = getConnection();
					PreparedStatement posted = con.prepareStatement("UPDATE REF_Instr_model SET Name1 = '"+InstrModelName.getText()+"', Description1 = '"+InstrModelDesc.getText()+"' WHERE IM_ID = "+INT);
					posted.executeUpdate();
				}catch(Exception e1) {JOptionPane.showMessageDialog(null, "Error: Re-enter");}	
				finally {
					JOptionPane.showMessageDialog(null, "Successfully Updated");
				}
			}
		});
		UpdateModel.setBounds(240, 272, 81, 23);
		panel.add(UpdateModel);
		
		JLabel awdawda = new JLabel("Instr. Category");
		awdawda.setBounds(15, 11, 89, 14);
		panel.add(awdawda);
		
		JLabel lblNewLabel_6 = new JLabel("Instr. Type");
		lblNewLabel_6.setBounds(129, 11, 81, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Instr. Model");
		lblNewLabel_7.setBounds(245, 11, 95, 14);
		panel.add(lblNewLabel_7);
		
		InstrCateID = new JTextField();
		InstrCateID.setBounds(10, 48, 86, 20);
		panel.add(InstrCateID);
		InstrCateID.setColumns(10);
		
		IntrCateName = new JTextField();
		IntrCateName.setBounds(10, 73, 86, 20);
		panel.add(IntrCateName);
		IntrCateName.setColumns(10);
		
		InstrTypeID = new JTextField();
		InstrTypeID.setColumns(10);
		InstrTypeID.setBounds(124, 48, 86, 20);
		panel.add(InstrTypeID);
		
		InstrTypeName = new JTextField();
		InstrTypeName.setColumns(10);
		InstrTypeName.setBounds(124, 73, 86, 20);
		panel.add(InstrTypeName);
		
		InstrTypeCate = new JTextField();
		InstrTypeCate.setColumns(10);
		InstrTypeCate.setBounds(124, 98, 86, 20);
		panel.add(InstrTypeCate);
		
		InstrModelID = new JTextField();
		InstrModelID.setColumns(10);
		InstrModelID.setBounds(240, 48, 86, 20);
		panel.add(InstrModelID);
		
		InstrModelName = new JTextField();
		InstrModelName.setColumns(10);
		InstrModelName.setBounds(240, 73, 86, 20);
		panel.add(InstrModelName);
		
		InstrModelType = new JTextField();
		InstrModelType.setColumns(10);
		InstrModelType.setBounds(240, 98, 86, 20);
		panel.add(InstrModelType);
		
		JLabel lblNewLabel_8 = new JLabel("ID");
		lblNewLabel_8.setBounds(335, 51, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Name");
		lblNewLabel_9.setBounds(335, 76, 46, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Category/Type");
		lblNewLabel_10.setBounds(335, 101, 89, 14);
		panel.add(lblNewLabel_10);
		
		IntrCateAbb = new JTextField();
		IntrCateAbb.setColumns(10);
		IntrCateAbb.setBounds(10, 127, 86, 20);
		panel.add(IntrCateAbb);
		
		InstrTypeAbb = new JTextField();
		InstrTypeAbb.setColumns(10);
		InstrTypeAbb.setBounds(124, 127, 86, 20);
		panel.add(InstrTypeAbb);
		
		InstrModelAbb = new JTextField();
		InstrModelAbb.setColumns(10);
		InstrModelAbb.setBounds(240, 127, 86, 20);
		panel.add(InstrModelAbb);
		
		IntrCateDesc = new JTextField();
		IntrCateDesc.setColumns(10);
		IntrCateDesc.setBounds(10, 157, 86, 20);
		panel.add(IntrCateDesc);
		
		InstrTypeDesc = new JTextField();
		InstrTypeDesc.setColumns(10);
		InstrTypeDesc.setBounds(124, 157, 86, 20);
		panel.add(InstrTypeDesc);
		
		InstrModelDesc = new JTextField();
		InstrModelDesc.setColumns(10);
		InstrModelDesc.setBounds(240, 157, 86, 20);
		panel.add(InstrModelDesc);
		
		JLabel lblNewLabel = new JLabel("Abbreviation");
		lblNewLabel.setBounds(335, 130, 84, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desc.");
		lblNewLabel_1.setBounds(335, 160, 46, 14);
		panel.add(lblNewLabel_1);
	}

	
	//frame.setBounds(100, 100, 450, 300);
	//panel.removeAll();
	//panel.hide();
	//Other();
	//JOptionPane.showMessageDialog(null, "Submitted");
	//JOptionPane.showMessageDialog(null, "Error: Re-enter");
	
	
	private void windowHandler() {
		frame = new JFrame("eTRT");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\n01450656\\Desktop\\eTRT.png");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/Resources/eTRT.png")));
        frame.setResizable(false);
		frame.getContentPane().setLayout(null);
	}
}

