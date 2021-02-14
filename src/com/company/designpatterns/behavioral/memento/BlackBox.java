package com.company.designpatterns.behavioral.memento;

import java.io.*;

public class BlackBox implements Serializable {
    private long altitude;
    private double speed;
    private int oxyLevels;

    public BlackBox(long altitude, double speed, int oxyLevels) {
        this.altitude = altitude;
        this.speed = speed;
        this.oxyLevels = oxyLevels;
    }

    public byte[] getState() throws IOException {
        ByteArrayOutputStream bos  = new ByteArrayOutputStream();
        ObjectOutput output = null;
        byte[] memento = null;

        try {
            output = new ObjectOutputStream(bos);
            output.writeObject(this);
            output.flush();
            memento = bos.toByteArray();
        } finally {
            try {
                bos.close();
            } catch (IOException ioex) {
                System.out.println("Exception logged : " + ioex.getMessage());
            }
        }

        return memento;
    }

    public BlackBox setState(byte[] memento) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bis = new ByteArrayInputStream(memento);
        ObjectInputStream objectInputStream = new ObjectInputStream(bis);

        BlackBox blackBox = (BlackBox) objectInputStream.readObject();
        objectInputStream.close();
        return blackBox;
    }

    public long getAltitude() {
        return altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public int getOxyLevels() {
        return oxyLevels;
    }
}
