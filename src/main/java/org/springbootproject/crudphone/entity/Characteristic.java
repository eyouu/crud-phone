package org.springbootproject.crudphone.entity;

import javax.persistence.*;

@Entity
@Table(name = "characteristic")
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "memory")
    private String memory;

    @Column(name = "screen_diagonal")
    private String screenDiagonal;

    @Column(name = "RAM")
    private String ram;

    @Column(name = "front_camera")
    private String frontCamera;

    @Column(name = "main_camera")
    private String mainCamera;

    @Column(name = "battery")
    private String battery;

    public Characteristic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "id=" + id +
                ", memory='" + memory + '\'' +
                ", screenDiagonal='" + screenDiagonal + '\'' +
                ", ram='" + ram + '\'' +
                ", frontCamera='" + frontCamera + '\'' +
                ", mainCamera='" + mainCamera + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
