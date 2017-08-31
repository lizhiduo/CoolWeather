package com.example.lizd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lizd on 2017/8/31.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceNmae;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceNmae() {
        return provinceNmae;
    }

    public void setProvinceNmae(String provinceNmae) {
        this.provinceNmae = provinceNmae;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
