package com.example.demo.service.impl;

import com.example.demo.entity.V_SJGT_HEAD_RMJGYBB_MXB;
import com.example.demo.utils.JedisPoolUtils;
import com.example.demo.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private JedisPoolUtils jedisPoolUtils;


    Jedis jedis = jedisPoolUtils.getJedis();

    public void setStr(String key, List<V_SJGT_HEAD_RMJGYBB_MXB> value) {
        setStr(key, value, null);
    }


    public void setStr(String key, Object value, Long time) {
        if (value == null) {
            return;
        }
        if (value instanceof String) {
            String obj = (String) value;
            stringRedisTemplate.opsForValue().set(key, obj);
        } else if (value instanceof List) {
            List obj = (List) value;
            stringRedisTemplate.opsForList().leftPushAll(key, obj);
        } else if (value instanceof Map) {
            Map obj = (Map) value;
            stringRedisTemplate.opsForHash().putAll(key, obj);
        }
        if (time != null)
            stringRedisTemplate.expire(key, time, TimeUnit.SECONDS);
    }

    public Object getKey(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void delKey(String key) {
        stringRedisTemplate.delete(key);
    }


    /**
     * set Object
     */
    public String set(String key, Object object, int second) {
        //jedis.expire(key.getBytes(),20);
        SetParams params = new SetParams();
        params.ex(second);
        return jedis.set(key.getBytes(), SerializeUtil.serialize(object), params);
    }

    /**
     * get Object
     */
    public Object get(String key) {
        jedis.get(key);
        byte[] value = jedis.get(key.getBytes());
        return SerializeUtil.unserialize(value);

    }
    /**
     * delete a key
     **/
    public boolean del(String key) {
        return jedis.del(key.getBytes()) > 0;
    }
}
