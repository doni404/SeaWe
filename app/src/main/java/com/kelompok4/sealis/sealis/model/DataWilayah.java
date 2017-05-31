package com.kelompok4.sealis.sealis.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * Created by ranug on 31/05/2017.
 */
@Root(name = "Row", strict = false)
public class DataWilayah {
    @Element(name = "CreateDate")
    String createDate;

    @Element(name = "ModifyDate")
    String modifyDate;

    @Element(name = "Stasiun")
    String stasiun;

    @Element(name = "Wilayah")
    String wilayah;

    @Element(name = "Arah_Angin")
    String arahAngin;

    @Element(name = "Cuaca")
    String cuaca;

    @ElementList(name = "Kec_Angin")
    List<Kecepatan> kecepatanAngin;

    @Element(name = "Angin_Knot")
    String anginKnot;

    @Element(name = "Gelombang_Rata")
    String gelombangRata;

    @Element(name = "Gelombang_Max")
    String gelombangMax;

}

@Root(name = "Kecepatan")
class Kecepatan{
    @Text
    String kecepatan;
}
