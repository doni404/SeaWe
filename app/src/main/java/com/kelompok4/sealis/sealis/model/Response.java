package com.kelompok4.sealis.sealis.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by ranug on 31/05/2017.
 */

@Root(name = "Wilayah_Perairan", strict = false)
public class Response {
    @Element(name = "pubDate")
    String pubDate;

    @ElementList(name = "Data")
    List<DataWilayah> dataWilayahList;
}
