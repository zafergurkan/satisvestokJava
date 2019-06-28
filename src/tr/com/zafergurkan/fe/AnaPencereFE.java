package tr.com.zafergurkan.fe;

import tr.com.zafergurkan.interfaces.FeInteraces;

import javax.swing.*;

public class AnaPencereFE extends JFrame implements FeInteraces {
    public AnaPencereFE() {
        initPencere();
    }

    @Override
    public void initPencere() {

        JTabbedPane tabs = initTabs();
        JMenuBar bar = initbar();
        //add(tabs);
        setJMenuBar(bar);
        setTitle("Satış ve Stok Programı");
        setSize(600,450);
        setVisible(true);//görünür yaptık
        setLocationRelativeTo(null);//ekranın ortasında dursun
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel();



        return panel;
    }

    @Override
    public JMenuBar initbar() {
        JMenuBar bar = new JMenuBar();

        JMenu dosyaMenu = new JMenu("Dosya");
        bar.add(dosyaMenu);
        JMenuItem cikisItem= new JMenuItem("Çıkış");
        dosyaMenu.add(cikisItem);

        JMenu urunlerMenu = new JMenu("Ürünler");
        bar.add(urunlerMenu);

        JMenuItem urunEkleItem=new JMenuItem("Ürün Ekle");
        urunlerMenu.add(urunEkleItem);

        JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
        urunlerMenu.add(kategoriEkleItem);

        urunlerMenu.addSeparator();

        JMenuItem urunDuzenleItem = new JMenuItem("Ürünü Düzenle");
        urunlerMenu.add(urunDuzenleItem);

        JMenuItem kategoriDuzenleItem = new JMenuItem("Kategoriyi Düzenle");
        urunlerMenu.add(kategoriDuzenleItem);
        return bar;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }
}
