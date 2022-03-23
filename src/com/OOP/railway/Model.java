package com.OOP.railway;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Model {
    public Dictionary stopvalues = new Hashtable();

    int amount=100,timing = 1130;
    Model(){
        stopvalues.put("station1",0);
        stopvalues.put("station2",1);
        stopvalues.put("station3",2);
        stopvalues.put("station4",3);
        stopvalues.put("station5",4);

    }



}
