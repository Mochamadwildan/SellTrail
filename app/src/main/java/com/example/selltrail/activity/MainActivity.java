package com.example.selltrail.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import com.example.selltrail.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Detail(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "HONDA CRF 250CC");
        intent.putExtra("Code", "0");
        intent.putExtra("Ket", "Harga motor trail CRF pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "HONDA CRF 250CC\n"+
                        "Dilengkapi Panel Indikator Digital yang Tampak Begitu Modern\n" +
                "\n" +
                "Selain desain fisik terluarnya, spesifikasi Honda CRF250R ini pun " +
                "juga akan dilengkapi dengan panel instrumen indikator yang cukup menarik. Pasalnya," +
                " Honda akan mengandalkan panel digital yang didesain dengan bentuk yang lebih modern dan " +
                "futuristik sehingga tak ketinggalan jaman.\n"+ "\n" +
                " Dimensi Gagah dengan Rangka Twin-Spar Aluminum Chasis yang Kokoh\n " + "\n"+
                "Menginjak pada sektor berikutnya, kita akan membahas tentang spesifikasi Honda CRF250R terkait dimensinya. Memang, " +
                "sampai saat ini pun cukup disayangkan mengingat ukuran dimensi panjang, lebar, dan tingginya masih belum diketahui. Namun," +
                " yang jelas bahwa menurut ifo yang Mas Sena dapatkan, motor ini akan mengusung rangka Twin-Spar Aluminium Chasis yang dikenal " +
                "sangat kokoh namun ringan sehingga Honda CRF250R ini hanya memiliki bobot 75 Kg saja."
        );
        startActivity(intent);
    }

    public void Detail1(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "KTM EXc-F 250CC");
        intent.putExtra("Code", "1");
        intent.putExtra("Ket", "Harga motor trail KTM pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "KTM EXc-F 250CC\n"+
                "KTM 250 EXC-F Six Days terbaru ini diklaim memiliki bobot yang lebih ringan dibanding sebelumnya." +
                " Salah satu penyebabnya adalah penggantian fork USD dengan produk dari WP XPlor berdiameter 48mm - part ini lebih ringan sekitar " +
                "200 gram dari sebelumnya.\n"+ "\n" + "Untuk urusan mesin - 250 EXC-F Six Days terbaru ini masih mengusung mesin 249,9cc satu silinder," +
                " 4-stroke yang dicangkokkan dengan transmisi 6-speed, sistem kopling basah DDS berteknologi hidrolik dari Brembo.\n"+ "\n" +"Brand Brembo lainnya " +
                "juga mengisi di bagian perangkat rem dengan disc brake berdiameter 260mm (depan) dan 220mm (belakang)"
        );
        startActivity(intent);
    }

    public void Detail2(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "YAMAHA YZ 250CC");
        intent.putExtra("Code", "2");
        intent.putExtra("Ket", "Harga motor trail YZ pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "YAMAHA YZ 250CC\n+" +
                "Yamaha mengklaim rpm-nya mampu tembus 10.000 rpm dengan mudah.Blok silindernya menggunakan tipe ceramic-plated cylinder" +
                " sudah dilengkapi dengan forged piston. Pendingin mesinnya juga mengusung tipe radiator. Powernya diklaim tembus 30,7 dk  pada 10,000 rpm dan torsinya 23,7 Nm " +
                "di 8.000 rpm. Sudah injeksi dan dilengkapi dengan transmisi 6 percepatan.\n" +
                "Sasis dan swing arm-nya super ringan terbuat dari alumunium. Kaki-kakinya, pakai lingkar roda 21 inci dan 18 inci. Sokbraker depannya tipe up side down 46 " +
                "mm yang bisa di adjust ulang sesuai keinginan. Yang belakang juga sama, selain adjustable juga dilengkapi link.  \n" +
                "Desain bodinya bisa dilihat sendiri. Keren kan! Perangkat lalu lintasnya lengkap jadi bisa diajak ngebut di jalanan. Knalpotnya menjulang dan memiliki ground " +
                "clearance 300 mm, trek tanah berbatu hingga kubangan bisa dengan mudah dilalui.\n");
        startActivity(intent);
    }

    public void Detail3(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "KAWASAKI KX 250CC");
        intent.putExtra("Code", "3");
        intent.putExtra("Ket", "Harga motor trail KX pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "KX 250 F\n + " +
                "KX juga tidak dijual bebas di semua diler Kawasaki, melainkan hanya di diler-diler PT Greentech Cakrawala Motorindo yang merupakan rekanan" +
                " Kawasaki Motor Indonesia (KMI) untuk memasarkan KX Series. Direktur PT Greentech, Hendry Suandy menjelaskan KX merupakan trail yang menggunakan spesifikasi mesin untuk kompetisi." +
                " Menurut Hendry, KX tidak bisa digunakan di jalan raya. Berbeda dengan KLX yang bisa dengan bebas dipakai untuk motor harian. Baca juga : Ini Bedanya KLX Khusus " +
                "Off Road \"Karena spek kompetisi, KX tidak bisa untuk pemakaian jalan raya. Itu yang mesti kami jelaskan ke konsumen,");
        startActivity(intent);
    }

    public void Detail4(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "SUZUKI RMZ 250CC");
        intent.putExtra("Code", "4");
        intent.putExtra("Ket", "Harga motor trail RMZ pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "SUZUKI RMZ 250\n" +
                        "Mesin\n" +
                "Untuk area mesinnya, daya puncak ditingkatkan dengan kepala silinder yang dirancang baru dan port masukan dan buang baru yang meningkatkan aliran udara dan efisiensi pembakaran.\n" +
                "Injektor utama masih diposisikan di dalam throttle body, injektor sekunder baru diposisikan lebih dekat ke airbox, memberikan bahan bakar dan udara intake lebih banyak waktu untuk mencampur " +
                "sebelum pembakaran, meningkatkan efisiensi pengisian.\n" +
                "Guna menyalurkan kekuatan mesin RM-Z250 baru ke roda belakang, perubahan pada rasio gir meningkatkan perasaan pengendara dan koneksi throttle. Gigi kedua diubah ke rasio yang lebih tinggi," +
                " pergi dari 30/17 pada model sebelumnya menjadi 29/17 pada mesin 2019. Rasio akhir juga berubah, dari 49/13 menjadi 50/13.\n" +
                "Knalpot yang lebih panjang – 99mm lebih panjang daripada model yang keluar – dan berubah menjadi struktur dan material internal meningkatkan kekuatan di seluruh rentang putaran, tetapi sebagian " +
                "besar meningkatkan tenaga pada putaran mesin yang lebih rendah.\n");
        startActivity(intent);
    }

    public void Detail5(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "HUSQVARNA 250CC");
        intent.putExtra("Code", "5");
        intent.putExtra("Ket", "Harga motor trail HUSQVARNA pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "HUSQVARNA 250CC\n"+
                        "Di website resmi Husqvarna Motorcycle, informasi mengenai power Husqvarna TE 250 memang nggak tersedia. " +
                "Tapi… Hal berbeda terdapat di website Husqvarna Motor Indonesia. Dalam spesifikasi Husqvarna TE 250 di website Husqvarna Motor Indonesia " +
                "justru dideskripsikan dengan jelas kalau motor yang satu ini punya tenaga 52 HP. Sayangnya informasi mengenai torsi nggak tersedia di sana." +
                " Coba bayangkan deh, motor off road punya tenaga segitu gedenya… So, jangan heran kalau Husqvarna TE 250 bisa melibas tanjakan yang sulit dan " +
                "amat sangat curam sekalipun. Apalagi ditopang dengan bobotnya yang super ringan, hanya 104,2 kg saja. Tentu itu berlaku di tangan rider yang sudah " +
                "handal ya… Sebaliknya, di tangan rider pemula, Husqvarna TE 250 bertenaga 52 HP terlalu beringas…\n" +
                "Nah, kalau Husqvarna TE 250 saja memiliki tenaga mencapai 52 HP, terus berapa tenaga saudaranya si Husqvarna TE 300? Ternyata motor 300 cc 2-stroke " +
                "ini memiliki tenaga yang nggak jauh berbeda dengan yang 250 cc 2-stroke. Masih dari sumber yang sama, tenaga Husqvarna TE 300 ada di angka 54 HP atau " +
                "hanya berselisih 2 HP saja. Faktanya, tenaga Husqvarna TE 250/300 itu setara dengan tenaga motor enduro 4-stroke Husqvarna FE 450 (53 HP) dan sedikit di " +
                "bawah Husqvarna FE 501 (58 HP). Secara teori, motor dengan basis mesin dan rangka yang sama, KTM 250 EXC dan KTM 300 EXC, harusnya juga punya power yang" +
                " kurang lebih sama, masing-masing 52 HP dan 54 HP!\n");
        startActivity(intent);
    }

    public void Detail6(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "ODONG-ODONG FIZZ BALAP");
        intent.putExtra("Code", "6");
        intent.putExtra("Ket", "Harga motor trail ODONG-ODONG FIZZ pada model ini memang dibanderol dengan harga yang cukup murah");
        intent.putExtra("Review", "ODONG-ODONG FIZZ BALAP\n" +
                "•\tShockbreaker depan\n" +
                "Shockbreaker standart pada F1ZR jika dipaksakan akan kurang maksimal, maka lebih baiknya diganti dengan shockbreaker milik Yamaha YZ-F yang memiliki diameter yang lebih besar, lebih kuat sehingga peredaman lebih baik.\n" +
                "•\tShockbreaker belakang\n" +
                "Dibagian belakang, anda juga harus mengantinya dengan shockbreaker yang baru, anda bisa menggunakan shochbreaker aftermarket seperti merk KYB, untuk dudukan shockbreaker bagian bawah usahakan majukan 10cm agar lebih sempurna.\n" +
                "•\tMesin\n" +
                "Agar tenaga yang dihasilkan maksimal, anda harus melakukan boreup pada F1ZR anda agar tenaganya lebih kuat, karena jika mengandalkan mesin standart maka akan kesulitan untuk menghadapi track yang berat.\n" +
                "•\tBan\n" +
                "Karena digunakan untuk Grasstrak, maka anda harus menganti ban standart dengan ban model offroad atau ban model pacul.\n" +
                "•\tRubah tampilan eksteriornya\n" +
                "Anda juga harus merubah tampilan eksteriornya agar bisa semirip mungkin dengan motor trail yaitu dengan memasang spakbor depan yang tinggi dan model buntut lancip. Jangan lupa untuk memainkan warna cat yang lebih cerah agar lebih menarik.\n" +
                "•\tKnalpot\n" +
                "Untuk knalpot diganti dengan model yang baru agar lebih maksimal tenaganya.\n");
        startActivity(intent);
    }

    public void Detail7(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("Judul", "KLX 150 BF");
        intent.putExtra("Code", "7");
        intent.putExtra("Ket", "Harga motor trail KLX pada model ini memang dibanderol dengan harga yang cukup mahal");
        intent.putExtra("Review", "KLX 150 BF\n"+
                        "Dilengkapi Panel Indikator Minimalis dengan Kombinasi Instrumen Analog dan Digital\n" +
                "Menginjak pada pembahasan lain, kali ini kita akan mengulas sektor instrument indikator dari spesifikasi Kawasaki KLX 150 BF." +
                " Panel indikator yang akan diusung motor off road ini sebenarnya tak jauh berbeda dengan instrument pada versi KLX sebelumnya." +
                " Secara spesifik, bisa kita ketahui bahwa pada sektor ini, Kawasaki membenamkan desain panel indikator yang simple dan minimalis namun" +
                " tetap menjunjung tinggi ciri khas motor off road. Di mana kedua jenis panel tersebut dibagi menjadi 3 bagian, yaitu kanan, tengah dan kiri. Untuk panel kanan," +
                "tampilan dari indikator spesifikasi KLX 150 BF ini mengusung gaya desain yang minimalis dan simple namun tetap bergaya stylish dan informatif.\n" +
                "\n" +
                "Dimensi\n" +
                "Dimensi Memanjang dengan Ground Clearance yang Tinggi\n" +
                "Sebagai motor off road, tentu merupakan suatu kewajaran jika spesifikasi Kawasaki KLX 150 BF ini memiliki desain yang berbeda dari motor yang menyasar pada " +
                "segmen lain. Sehingga, dengan dimensi tersebut tentunya" +
                " wajar jika bodi pada motor off road besutan Kawasaki ini terkesan memiliki bentuk yang memanjang dan meruncing tipis. Di sisi lain,  jok atau tempat duduk dari " +
                "spesifikasi Kawasaki KLX 150 BF ini tampak cukup tinggi untuk postur tubuh orang Indonesia sehingga akan sedikit membuat beberapa orang yang berpostur pendek" +
                " mengalami kesulitan dalam mengontrol keseimbangan motor ini. Akan tetapi, jika motor off road besutan Kawasaki ini sudah melaju ");
        startActivity(intent);

    }
}