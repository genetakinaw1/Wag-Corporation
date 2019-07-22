package com.wagcorporation.java;

public class SerialNumber {
    private static SerialNumber instance;
    private String serialPrefix;
    private int count;
    public synchronized SerialNumber getInstance() {
        if (instance == null) {
            instance = new SerialNumber();
        }
        {
            return instance;
        }
    private SerialNumber() {
        }
        public Sycnorized String getNextSerial (Product type ){
            int value;
            switch (type){
                case Large Gadget;
                count =3467;
                serialPrefix="06LRG";
                value=++ count;
                return serialPrefix +count;
                case MediumGadget;
                count=2356;
                serialPrefix = "04MED";
                value= ++ count;
                return serialPrefix count;


    }


        }











    }
}
