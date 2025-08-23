package com.hspedu.homework;

import java.util.*;

/**
 * @Author:李强
 * @Date:2025/4/26
 * @Description:chapter15
 */

public class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
    //遍历map，将map的所有value(entity),封装到ArrayList返回即可
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
