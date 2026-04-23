/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid.objects;

import java.time.LocalDateTime;

/**
 *
 * @author ADVAN
 */
public class LogAbsensi {
    
    private String idLog;
    private String sidRfid;
    private LocalDateTime waktuTap;
    private String Status;

    public LogAbsensi(String idLog, String sidRfid, LocalDateTime waktuTap, String Status) {
        this.idLog = idLog;
        this.sidRfid = sidRfid;
        this.waktuTap = waktuTap;
        this.Status = Status;
    }

    public String getIdLog() {
        return idLog;
    }

    public void setIdLog(String idLog) {
        this.idLog = idLog;
    }

    public String getSidRfid() {
        return sidRfid;
    }

    public void setSidRfid(String sidRfid) {
        this.sidRfid = sidRfid;
    }

    public LocalDateTime getWaktuTap() {
        return waktuTap;
    }

    public void setWaktuTap(LocalDateTime waktuTap) {
        this.waktuTap = waktuTap;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
}
