package com.wagcorporation.java;

public class AbstractDevice {
    public abstract class AbstractDevice {
        private int serialNumber;
        private DeviceColor color;
        private DeviceSize size;
        private string name;
        private decimal price;

        public int getSerialNumber() {
            return serialNumber;
        }

        public DeviceColor getColor() {
            return color;
        }

        public DeviceSize getSize() {
            return size;
        }

        public String getName() {
            return name;
        }

        public decimal getPrice() {
            return price;
        }

        public void setSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
        }

        public void setColor(DeviceColor color) {
            this.color = color;
        }

        public DeviceSize setSize(DeviceSize size) {
            this.size = size;
        }

        public String setName(String name) {
            this.name = name;
        }

        public decimal setPrice(decimal price) {
            this.price = price;
        }

        public AbstractDevice() {
            this(DeviceColor.Plain, DeviceSize.Small, 0);
        }

        public AbstractDevice(DeviceColor color) {
            this(color, DeviceSize.Small, 0);
        }

        public AbstractDevice(DeviceSize size) {
            this(DeviceColor.Plain, size, 0);
        }

        public AbstractDevice(DeviceColor color, DeviceSize size) {
            this(color, size, 0);
        }

        public AbstractDevice(DeviceColor color, DeviceSize size, int serialNumber) {
            SerialNumber = serialNumber;
            Color = color;
            Size = size;
        }
    }
}
