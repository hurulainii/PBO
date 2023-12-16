package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShuttleBookingApp extends JFrame {
    private JTextField nameField, passengersField;
    private JComboBox<String> destinationComboBox;
    private JCheckBox roundTripCheckBox;
    private JButton submitButton;

    public ShuttleBookingApp() {
        // Set judul aplikasi
        super("Aplikasi Pemesanan Shuttle");

        // Set layout untuk frame
        setLayout(new GridLayout(6, 2));

        // Komponen-komponen GUI
        JLabel nameLabel = new JLabel("Nama:");
        nameField = new JTextField();

        JLabel destinationLabel = new JLabel("Tujuan:");
        String[] destinations = {"Bandara", "Hotel", "Kantor"};
        destinationComboBox = new JComboBox<>(destinations);

        JLabel passengersLabel = new JLabel("Jumlah Penumpang:");
        passengersField = new JTextField();

        JLabel roundTripLabel = new JLabel("Pulang-Pergi:");
        roundTripCheckBox = new JCheckBox();

        // Tombol Submit
        submitButton = new JButton("Submit");

        // Menambahkan listener untuk tombol submit
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButtonClicked();
            }
        });

        // Menambahkan komponen-komponen ke frame
        add(nameLabel);
        add(nameField);
        add(destinationLabel);
        add(destinationComboBox);
        add(passengersLabel);
        add(passengersField);
        add(roundTripLabel);
        add(roundTripCheckBox);
        add(new JLabel()); // Placeholder untuk mengisi ruang kosong
        add(submitButton);

        // Set pengaturan frame
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void submitButtonClicked() {
        // Mendapatkan nilai dari input pengguna
        String name = nameField.getText();
        String destination = (String) destinationComboBox.getSelectedItem();
        int passengers = Integer.parseInt(passengersField.getText());
        boolean roundTrip = roundTripCheckBox.isSelected();

        // Menampilkan ringkasan pemesanan
        String message = "Ringkasan Pemesanan:\n"
                + "Nama: " + name + "\n"
                + "Tujuan: " + destination + "\n"
                + "Jumlah Penumpang: " + passengers + "\n"
                + "Pulang-Pergi: " + (roundTrip ? "Ya" : "Tidak");

        JOptionPane.showMessageDialog(this, message, "Ringkasan Pemesanan", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShuttleBookingApp();
            }
        });
    }
}