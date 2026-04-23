/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid.objects;

/**
 *
 * @author ADVAN
 */
public class Siswa {
    private String sidRfid;
    private String idSiswa;
    private String namaLengkap;
    private String kelasSiswa;

    public Siswa(String sidRfid, String idSiswa, String namaLengkap, String kelasSiswa) {
        this.sidRfid = sidRfid;
        this.idSiswa = idSiswa;
        this.namaLengkap = namaLengkap;
        this.kelasSiswa = kelasSiswa;
    }

    public Siswa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSidRfid() {
        return sidRfid;
    }

    public void setSidRfid(String sidRfid) {
        this.sidRfid = sidRfid;
    }

    public String getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(String idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getKelasSiswa() {
        return kelasSiswa;
    }

    public void setKelasSiswa(String kelasSiswa) {
        this.kelasSiswa = kelasSiswa;
    }
    
    
}
