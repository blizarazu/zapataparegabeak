package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import com.swtdesigner.SwingResourceManager;

public class ProduktuDatuak extends JPanel {

	private JTextField irudiIzena;
	private JComboBox comboBox_2;
	private JTextField eskaintzaEhunekotan;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JTextField stockZenb;
	private JTextField eskaintzaMota;
	private JTextField prezioa;
	private JTextField marka;
	private JTextField kategoria;
	private JTextField estiloa;
	private JTextField kolorea;
	private JTextField generoa;
	private JTextField neurria;
	private JTextField oina;
	private JTextField id;
	
	private String[] baiedoez = new String[]{"Bai","Ez"};
	/**
	 * Create the panel
	 */
	public ProduktuDatuak() {
		super();
		setBorder(new TitledBorder(null, "Produktuaren Datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLUE));

		JLabel idLabel;
		idLabel = new JLabel();
		idLabel.setText("Id:");

		JLabel oinaLabel;
		oinaLabel = new JLabel();
		oinaLabel.setText("Oina:");

		JLabel neurriaLabel;
		neurriaLabel = new JLabel();
		neurriaLabel.setText("Neurria:");

		JLabel generoaLabel;
		generoaLabel = new JLabel();
		generoaLabel.setText("Generoa:");

		JLabel koloreaLabel;
		koloreaLabel = new JLabel();
		koloreaLabel.setText("Kolorea:");

		JLabel estiloaLabel;
		estiloaLabel = new JLabel();
		estiloaLabel.setText("Estiloa:");

		JLabel kategoriaLabel;
		kategoriaLabel = new JLabel();
		kategoriaLabel.setText("kategoria:");

		JLabel markaLabel;
		markaLabel = new JLabel();
		markaLabel.setText("Marka:");

		JLabel prezioaLabel;
		prezioaLabel = new JLabel();
		prezioaLabel.setText("Prezioa:");

		JLabel eskaintzanLabel;
		eskaintzanLabel = new JLabel();
		eskaintzanLabel.setText("Eskaintzan?:");

		JLabel eMotaLabel;
		eMotaLabel = new JLabel();
		eMotaLabel.setText("E. Mota:");

		JLabel bEhunekotanLabel;
		bEhunekotanLabel = new JLabel();
		bEhunekotanLabel.setText("B. Ehunekotan:");

		JLabel stockanLabel;
		stockanLabel = new JLabel();
		stockanLabel.setText("Stockan?:");

		JLabel zenbatLabel;
		zenbatLabel = new JLabel();
		zenbatLabel.setText("Zenbat:");

		id = new JTextField();

		oina = new JTextField();

		neurria = new JTextField();

		generoa = new JTextField();

		kolorea = new JTextField();

		estiloa = new JTextField();

		kategoria = new JTextField();

		marka = new JTextField();

		prezioa = new JTextField();

		eskaintzaMota = new JTextField();

		stockZenb = new JTextField();

		comboBox = new JComboBox(baiedoez);

		comboBox_1 = new JComboBox(baiedoez);

		eskaintzaEhunekotan = new JTextField();

		JLabel label;
		label = new JLabel();
		label.setText("Irudia Du?:");

		comboBox_2 = new JComboBox(baiedoez);

		JLabel label_1;
		label_1 = new JLabel();
		label_1.setText("Irudi Izena:");

		irudiIzena = new JTextField();

		JLabel label_2;
		label_2 = new JLabel();
		label_2.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/zapatak/noimage120.png"));

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuak.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(idLabel)
						.addComponent(oinaLabel)
						.addComponent(neurriaLabel)
						.addComponent(generoaLabel)
						.addComponent(koloreaLabel)
						.addComponent(estiloaLabel)
						.addComponent(kategoriaLabel)
						.addComponent(markaLabel)
						.addComponent(prezioaLabel)
						.addComponent(eskaintzanLabel)
						.addComponent(stockanLabel))
					.addGap(24, 24, 24)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(prezioa, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(marka, GroupLayout.Alignment.LEADING, 53, 53, 53)
										.addComponent(comboBox, GroupLayout.Alignment.LEADING, 0, 53, Short.MAX_VALUE)
										.addComponent(comboBox_1, GroupLayout.Alignment.LEADING, 0, 53, Short.MAX_VALUE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(eMotaLabel)
										.addComponent(zenbatLabel)
										.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
											.addComponent(bEhunekotanLabel)
											.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(label_1)
												.addComponent(label)))))
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(oina, GroupLayout.Alignment.LEADING)
									.addComponent(neurria, GroupLayout.Alignment.LEADING)
									.addComponent(id, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addComponent(generoa, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(kategoria, GroupLayout.Alignment.LEADING)
									.addComponent(estiloa, GroupLayout.Alignment.LEADING)
									.addComponent(kolorea, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(31, 31, 31))
								.addComponent(stockZenb, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(eskaintzaEhunekotan, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
								.addComponent(eskaintzaMota, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
								.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(12, 12, 12)
									.addComponent(atzeraButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(onartuButton))
								.addComponent(irudiIzena, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2)
									.addGap(38, 38, 38)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(idLabel)
						.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(oinaLabel)
						.addComponent(oina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(irudiIzena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(neurriaLabel)
								.addComponent(neurria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(generoaLabel)
								.addComponent(generoa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(koloreaLabel)
								.addComponent(kolorea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(estiloaLabel)
								.addComponent(estiloa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(kategoriaLabel)
								.addComponent(kategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(markaLabel)
								.addComponent(marka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(prezioaLabel)
								.addComponent(prezioa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19, 19, 19)
							.addComponent(label_2)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskaintzanLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(eMotaLabel)
						.addComponent(eskaintzaMota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bEhunekotanLabel)
						.addComponent(eskaintzaEhunekotan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(stockanLabel)
						.addComponent(zenbatLabel)
						.addComponent(stockZenb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(atzeraButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(onartuButton)))
		);
		setLayout(groupLayout);
		//
	}

}
