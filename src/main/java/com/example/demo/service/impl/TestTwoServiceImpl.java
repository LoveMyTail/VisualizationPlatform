package com.example.demo.service.impl;

import com.example.demo.dao.TestTwoDao;
import com.example.demo.entity.TestTwo;
import com.example.demo.service.TestTwoService;
import org.codehaus.groovy.runtime.StringGroovyMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TestTwoServiceImpl implements TestTwoService {
    @Autowired
    TestTwoDao testTwoDao;

    // 要获得各个企业单月的入场标单排名
    @Override
    public List<TestTwo> findTaxBidByCompany() {
        List<TestTwo> taxBidByCompany = testTwoDao.findTaxBidByCompany();
        ArrayList<TestTwo> arrayList = new ArrayList<TestTwo>();
        Set<String> set = new HashSet<>();
        return taxBidByCompany;
    }

    // 要获得各个电厂的单月入厂表单（含税）排名
    @Override
    public List<List<TestTwo>> findTaxBidByPlant() {
        List<TestTwo> all = testTwoDao.findTaxBidByPlant();
        // 在listByDate中存放的是通过日期分类过的数据
        List<List<TestTwo>> list = new ArrayList<>();
        list.add(new ArrayList<TestTwo>());
        int cur = 0;
        // 通过日期分类
        for (int i = 0; i < all.size(); i++) {
            if (i == 0)
                list.get(cur).add(all.get(i));
            if (i > 0 && all.get(i).getDatetime().equals(all.get(i - 1).getDatetime())) {
                if(all.get(i).getPowerPlant().equals(all.get(i-1).getPowerPlant())){
                    continue;
                }
                list.get(cur).add(all.get(i));
            } else if (i > 0 && !all.get(i).getDatetime().equals(all.get(i - 1).getDatetime())) {
                System.out.println("当前一条数据的日期为：" + all.get(i).getDatetime() + "前一条数据的日期为：" + all.get(i - 1).getDatetime());
                list.add(new ArrayList<TestTwo>());
                cur++;
                list.get(cur).add(all.get(i));
            }
        }
/*        for (int i = 0; i < list.size();i++) {
            int flag = 0;
            for (int j = 0; j < list.get(i).size();) {
                if (j == 0){
                    j++;
                    continue;
                }
                if (j > 0 && list.get(i).get(j).getBelongs().equals(list.get(i).get(j - 1).getBelongs())) {
                    list.get(i).get(j-1).setTaxBid(list.get(i).get(j).getTaxBid() + list.get(i).get(j - 1).getTaxBid());
                    list.get(i).remove(j);
                }else if(j>0 && !list.get(i).get(j).getBelongs().equals(list.get(i).get(j - 1).getBelongs())){
                    j++;
                }
            }
        }*/
        return list;
    }
}
