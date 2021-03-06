package com.Marissa.FAQ.repository.po;

import javax.persistence.*;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "DownloadRecord")
public class DownloadRecord {
    public static final int STATUS_ERROR = 0;
    public static final int STATUS_SUCCESS = 1;
    @Id
    @GeneratedValue
    private String uid;
    @Column(name = "ip")
    private String ip;
    @Column(name = "port")
    private int port;
    @Column(name = "ua")
    private String ua;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "filePath")
    private String filePath;
    @Column(name = "length")
    private long length;
    @Column(name = "status")
    private int status;
    @Column(name = "startTime")
    private Timestamp startTime;
    @Column(name = "endTime")
    private Timestamp endTime;

    public DownloadRecord() {
    }

    public DownloadRecord(String fileName, String filePath,
                          HttpServletRequest request) {
        this.uid = UUID.randomUUID().toString().replace("-","");
        this.fileName = fileName;
        this.filePath = filePath;
        this.ip = request.getRemoteAddr();
        this.port = request.getRemotePort();
        this.ua = this.ua = request.getHeader("user-agent");
        this.startTime = new Timestamp(System.currentTimeMillis());
    }

    /** getter and setter **/
    public static int getStatusError() {
        return STATUS_ERROR;
    }

    public static int getStatusSuccess() {
        return STATUS_SUCCESS;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}