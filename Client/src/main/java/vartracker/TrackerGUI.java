package vartracker;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrackerGUI extends JFrame {
	private static final long serialVersionUID = -2201425614015575304L;
	
	
	private JPanel contentPane;
	private JTextField idrange;
	private JTextField filter;
	private JRadioButton tstd;
	private JRadioButton tplayer;
	private JRadioButton tnpc;
	private JRadioButton tcs2;
	private JRadioButton tothers;
	private JComboBox mode;
	private JTextPane console;
	private JTextField timerange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable t) {
			t.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrackerGUI frame = new TrackerGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrackerGUI() {
		setTitle("Configs Tracker By FUNGUS LORD");
		setType(Type.UTILITY);
		setBackground(Color.DARK_GRAY);
		setAutoRequestFocus(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 478, 460);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel ptypes = new JPanel();
		ptypes.setBackground(Color.DARK_GRAY);
		ptypes.setForeground(Color.BLACK);
		
		JScrollPane cpane = new JScrollPane();
		cpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		cpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(cpane, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ptypes, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ptypes, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(cpane, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
		);
		
		console = new JTextPane();
		console.setForeground(Color.GREEN);
		console.setBackground(Color.BLACK);
		cpane.setViewportView(console);
		
		
		JButton bcopy = new JButton("Copy");
		bcopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(console.getText()), null);
				}
				catch (Throwable t) {	
				}
			}
		});
		bcopy.setBackground(Color.DARK_GRAY);
		bcopy.setForeground(Color.BLACK);
		ptypes.add(bcopy);
		
		JButton bclear = new JButton("Clear");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cs2Tracker.clear();
			}
		});
		bclear.setBackground(Color.DARK_GRAY);
		bclear.setForeground(Color.BLACK);
		ptypes.add(bclear);
		
		tstd = new JRadioButton("Track std cfgs");
		tstd.setBackground(Color.DARK_GRAY);
		tstd.setForeground(Color.GREEN);
		tstd.setHorizontalAlignment(SwingConstants.LEFT);
		ptypes.add(tstd);
		
		tplayer = new JRadioButton("Track player cfgs");
		tplayer.setForeground(Color.GREEN);
		tplayer.setBackground(Color.DARK_GRAY);
		tplayer.setHorizontalAlignment(SwingConstants.LEFT);
		ptypes.add(tplayer);
		
		tnpc = new JRadioButton("Track  npc cfgs");
		tnpc.setForeground(Color.GREEN);
		tnpc.setBackground(Color.DARK_GRAY);
		tnpc.setHorizontalAlignment(SwingConstants.LEFT);
		ptypes.add(tnpc);
		
		tcs2 = new JRadioButton("Track cs2 cfgs");
		tcs2.setForeground(Color.GREEN);
		tcs2.setBackground(Color.DARK_GRAY);
		tcs2.setHorizontalAlignment(SwingConstants.LEFT);
		ptypes.add(tcs2);
		
		tothers = new JRadioButton("Track other cfgs");
		tothers.setForeground(Color.GREEN);
		tothers.setBackground(Color.DARK_GRAY);
		ptypes.add(tothers);
		
		JLabel label1 = new JLabel("Id range:");
		label1.setBackground(Color.DARK_GRAY);
		label1.setForeground(Color.RED);
		ptypes.add(label1);
		
		idrange = new JTextField();
		idrange.setHorizontalAlignment(SwingConstants.CENTER);
		idrange.setForeground(Color.RED);
		idrange.setText("0-200000");
		idrange.setBackground(Color.DARK_GRAY);
		ptypes.add(idrange);
		idrange.setColumns(10);
		
		JLabel label4 = new JLabel("Filter:");
		label4.setForeground(Color.GREEN);
		label4.setBackground(Color.DARK_GRAY);
		ptypes.add(label4);
		
		filter = new JTextField();
		filter.setHorizontalAlignment(SwingConstants.CENTER);
		filter.setForeground(Color.GREEN);
		filter.setText("");
		filter.setBackground(Color.DARK_GRAY);
		ptypes.add(filter);
		filter.setColumns(10);
		
		JLabel label2 = new JLabel("Mode:");
		label2.setForeground(Color.BLUE);
		ptypes.add(label2);
		
		mode = new JComboBox();
		mode.setModel(new DefaultComboBoxModel(new String[] {"Read+Write", "Read only", "Write only"}));
		mode.setSelectedIndex(0);
		mode.setBackground(Color.BLUE);
		mode.setForeground(Color.BLUE);
		ptypes.add(mode);
		
		JLabel label3 = new JLabel("Time interval (s):");
		label3.setForeground(Color.ORANGE);
		label3.setBackground(Color.DARK_GRAY);
		ptypes.add(label3);
		
		timerange = new JTextField();
		timerange.setText("200");
		timerange.setForeground(Color.ORANGE);
		timerange.setBackground(Color.DARK_GRAY);
		timerange.setHorizontalAlignment(SwingConstants.CENTER);
		ptypes.add(timerange);
		timerange.setColumns(10);
		
		contentPane.setLayout(gl_contentPane);
		
		
		DefaultCaret caret = (DefaultCaret) console.getCaret();
		caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
	}
	
	
	public boolean trackStd() {
		return tstd.isSelected();
	}
	
	public boolean trackPlayer() {
		return tplayer.isSelected();
	}
	
	public boolean trackNpc() {
		return tnpc.isSelected();
	}
	
	public boolean trackCs2() {
		return tcs2.isSelected();
	}
	
	public boolean trackOthers() {
		return tothers.isSelected();
	}
	
	public int idRange0() {
		try {
			return Integer.parseInt(idrange.getText().split("\\-")[0]);
		}
		catch (Throwable t) {
			return 0;
		}
	}
	
	public int idRange1() {
		try {
			return Integer.parseInt(idrange.getText().split("\\-")[1]);
		}
		catch (Throwable t) {
			return 100000;
		}
	}
	
	public int getMode() {
		int m = mode.getSelectedIndex();
		return m < 0 || m > 2 ? 0 : m;
	}
	
	public int maxTime() {
		try {
			return Integer.parseInt(timerange.getText()) * 1000;
		}
		catch (Throwable t) {
			return 200000;
		}
	}
	
	public String getFilter() {
		return filter.getText().length() > 0 ? filter.getText() : null;
	}
	
	
	public JTextPane getConsole() {
		return console;
	}
}
