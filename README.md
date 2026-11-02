# -BMI-Calculator-with-JavaFX
my personal learning experience building a simple calculator concept using javaFX 

 

Aplikasi desktop sederhana untuk menghitung **Body Mass Index (BMI)** atau Indeks Massa Tubuh menggunakan **Java**, **JavaFX**, dan **Scene Builder** dengan menerapkan arsitektur **MVC (Model-View-Controller)**.

---

## 📸 Tangkapan Layar (Screenshot)

Berikut adalah tampilan antarmuka dari aplikasi Kalkulator BMI:

! Tampilan Aplikasi 
<p align="center">
  <img width="646" height="810" alt="Tampilan Aplikasi Kalkulator BMI" src="https://github.com/user-attachments/assets/c7f840d8-d389-475a-bad6-ccb4b3db031f" />
</p>


---

## 🛠️ Prasyarat (Prerequisites)

Sebelum menjalankan program ini, pastikan komputer Anda sudah terinstal:
* **JDK 17** atau versi di atasnya.
* **Apache Maven** (biasanya sudah include di dalam IDE).
* **IDE** seperti Apache NetBeans, IntelliJ IDEA, atau Eclipse.

---

## 🚀 Cara Menjalankan Program

### Cara 1: Lewat IDE (NetBeans / IntelliJ)
1. **Clone** atau unduh repositori ini ke komputer Anda.
2. Buka IDE Anda (misal: Apache NetBeans), lalu pilih **Open Project** dan arahkan ke folder proyek ini.
3. Klik kanan pada nama proyek di panel kiri, pilih **Clean and Build** untuk memperbarui dependensi Maven.
4. Buka folder `src/main/java/main/`, cari file **`Main.java`**.
5. Klik kanan pada file `Main.java` tersebut, lalu pilih **Run File** (atau klik ikon segitiga hijau).

### Cara 2: Lewat Terminal / Command Prompt
Jika Anda ingin menjalankannya lewat terminal di dalam folder proyek, ketik perintah berikut:
```bash
mvn clean compile exec:java
```

---

## 📂 Struktur Pola MVC Proyek

* **`model/`** : Berisi `BMImodel.java` yang murni mengurus rumus matematika dan logika penentuan kategori BMI.
* **`controller/`** : Berisi `KalkulatorController.java` sebagai jembatan pembaca input teks layar dan pengubah label hasil.
* **`resources/fxml/`** : Berisi `FXML.fxml` sebagai file desain tata letak antarmuka dari Scene Builder.
* **`main/`** : Berisi gerbang utama peluncur aplikasi (`Main.java` & `MainApp.java`).
