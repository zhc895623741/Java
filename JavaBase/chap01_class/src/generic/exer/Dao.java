package generic.exer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao<T> {
    Map<String,T> map ;

    public Dao() {
        this.map = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Dao{" +
                "map=" + map +
                '}';
    }

    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        T t = map.get(id);
        return t;

    }

    public void update(String id,T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
        throw new RuntimeException("no key");
    }

    public List<T> get_list(){   //返回map中所有存放的T对象
        List list = new ArrayList();
        for(T i: map.values()){
            list.add(i);
        }
        return list;
    }
}
