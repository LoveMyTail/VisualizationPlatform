package com.example.demo.controller;

import com.example.demo.entity.TestOne;
import com.example.demo.entity.TestTwo;
import com.example.demo.service.TestTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@CrossOrigin   //防止后端报错 No 'Access-Control-Allow-Origin' header is present on the requested resource
@RestController
@RequestMapping(value = "/api")
public class TestTwoController {
    @Autowired
    TestTwoService testTwoService;

    // 各大集团入厂标单（含税）排名情况 数据
    @RequestMapping(value = "/findTaxBidByCompany11", method = RequestMethod.GET)
    public List<TestTwo> findAll() {

        return testTwoService.findTaxBidByCompany();
    }

    //
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<List<TestTwo>> test() {
        List<TestTwo> all = testTwoService.findTaxBidByCompany();
        // list是最终返回的数据
        ArrayList<TestTwo> list = new ArrayList<>();
        // 在listByDate中存放的是通过日期分类过的数据
        List<List<TestTwo>> listByDate = new ArrayList<>();
        listByDate.add(new ArrayList<TestTwo>());
        int cur = 0;
        // 通过日期分类
        for (int i = 0; i < all.size(); i++) {
            if (i == 0)
                listByDate.get(cur).add(all.get(i));
            if (i > 0 && all.get(i).getDatetime().equals(all.get(i - 1).getDatetime())) {
                listByDate.get(cur).add(all.get(i));
            } else if (i > 0 && !all.get(i).getDatetime().equals(all.get(i - 1).getDatetime())) {
                // System.out.println("当前一条数据的日期为：" + all.get(i).getDatetime() + "前一条数据的日期为：" + all.get(i - 1).getDatetime());
                listByDate.add(new ArrayList<TestTwo>());
                cur++;
                listByDate.get(cur).add(all.get(i));
            }
        }
        // 在根据日期分类之后，在每一组内再根据所属集团名称来分类，将多条数据合为一条数据，入厂标单相加
        for (int i = 0; i < listByDate.size();i++) {
            int flag = 0;
            for (int j = 0; j < listByDate.get(i).size();) {
                if (j == 0){
                    j++;
                    continue;
                }
                if (j > 0 && listByDate.get(i).get(j).getBelongs().equals(listByDate.get(i).get(j - 1).getBelongs())) {
                    listByDate.get(i).get(j-1).setTaxBid(listByDate.get(i).get(j).getTaxBid() + listByDate.get(i).get(j - 1).getTaxBid());
                    listByDate.get(i).remove(j);
                }else if(j>0 && !listByDate.get(i).get(j).getBelongs().equals(listByDate.get(i).get(j - 1).getBelongs())){
                    j++;
                }
            }
        }
        return listByDate;
    }

    @RequestMapping(value = "/findTaxBidByPlant" , method = RequestMethod.GET)
    public List<List<TestTwo>> findTaxBidByPlant(){
        return testTwoService.findTaxBidByPlant();
    }

}
