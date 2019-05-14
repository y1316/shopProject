package com.shop.ssm.sys.or.service.impl;

import com.shop.ssm.sys.ia.service.BaseTestCase;
import com.shop.ssm.sys.or.model.Orstorage;
import com.shop.ssm.sys.or.service.IOrstorageService;
import com.shop.ssm.sys.pd.model.PdProduce;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.OSEnvironment;

import java.util.List;

import static org.junit.Assert.*;

public class OrstorageServiceImplTest extends BaseTestCase {

    @Autowired
    private   IOrstorageService iOrstorageService;
    private Orstorage orstorage;

    @Override
    public void before() {
        orstorage=new Orstorage();
    }

    @Test
    public void deleteByPrimaryKey() {
        orstorage.setStkId(1);
        iOrstorageService.deleteByPrimaryKey(orstorage);
    }

    @Test
    public void insert() {
        for (int i=1;i<20;i++){
            orstorage.setPrid(2);
            orstorage.setStkWarehouse("亲昵蔬菜");
            orstorage.setStkWare("充足可供 亲昵请炫迈");
            orstorage.setStkCount(20);
            orstorage.setStkMemo("非常有意义于人民的日常生活");
            iOrstorageService.insert(orstorage);
        }
    }

    @Test
    public void selectByPrimaryKey() {
        orstorage.setStkId(1);
        iOrstorageService.selectByPrimaryKey(orstorage);
    }

    @Test
    public void updateByPrimaryKey() {
        orstorage.setStkId(1);
        orstorage.setPrid(3);
        orstorage.setStkWarehouse("亲昵蔬菜");
        orstorage.setStkWare("充足可供dsa亲昵请炫迈");
        orstorage.setStkCount(20);
        orstorage.setStkMemo("非常有意义于人民的日常生活");
        iOrstorageService.updateByPrimaryKey(orstorage);
    }

    @Test
    public void listOrstorage() {
        PdProduce pdProduce=new PdProduce();
        pdProduce.setPrid(1);
        List<Orstorage> o = iOrstorageService.listOrstorage(orstorage, pageBean);
        System.out.println(o);
    }
}