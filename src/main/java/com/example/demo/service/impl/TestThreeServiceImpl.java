package com.example.demo.service.impl;

import com.example.demo.dao.TestThreeDao;
import com.example.demo.entity.TestThree;
import com.example.demo.service.TestThreeService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestThreeServiceImpl implements TestThreeService {
    @Autowired
    TestThreeDao testThreeDao;

    @Override
    public List<List<TestThree>> findTaxBidByCompany() {
        List<TestThree> list = testThreeDao.findTaxBidByCompany();
        List<List<TestThree>> listByCompany = new ArrayList<>();
        listByCompany.add(new ArrayList<TestThree>());
        int cur = 0;
        int flag = 0;
        // 依次遍历整个集合，将所有数据按照企业分组
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                listByCompany.get(cur).add(list.get(i));
            }
            if (i > 0 && list.get(i).getBelongs().equals(list.get(i - 1).getBelongs())) {
                // 当前后两条数据属于同一个集团的时候，判断其日期是否是前一条数据日期的下一个月
                // 当前日期是否是前一条数据的日期连贯
                if (list.get(i).getDatetime().equals(DateUtils.addMonths(listByCompany.get(cur).get(flag).getDatetime(), 1))) {
                    // 当前一条数据的日期与前一条数据的日期是连贯的，则将该数据插入
                    listByCompany.get(cur).add(list.get(i));
                    flag++;
                } else {
                    // 日期不连贯，考虑数据重复的情况以及数据缺失的情况
                    if (list.get(i).getDatetime().equals(listByCompany.get(cur).get(flag).getDatetime())) {
                        // 数据重复
                        continue;
                    } else {
                        // 数据缺失
                        TestThree newOne = new TestThree(DateUtils.addMonths(listByCompany.get(cur).get(flag).getDatetime(), 1), listByCompany.get(cur).get(flag).getBelongs(), null);
                        listByCompany.get(cur).add(newOne);
                        flag++;
                        i--;
                    }
                }
            } else if (i > 0 && !list.get(i).getBelongs().equals(list.get(i - 1).getBelongs())) {
                listByCompany.add(new ArrayList<TestThree>());
                flag = 0;
                cur++;
                listByCompany.get(cur).add(list.get(i));
            }
        }
        return listByCompany;
    }
}
