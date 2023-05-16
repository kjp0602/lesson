package school;

import java.util.HashMap;
import java.util.Iterator;

public class SubjectMap extends HashMap<String,Integer> {
    public static final String[] KEYS = {"국어", "영어", "수학","사회", "과학"};
    public int getTotalScore(){
        int total = 0;
        Iterator<String> keys = this.keySet().iterator();
        while(keys.hasNext()){
            total += this.get(keys.next());
        }
        return total;
    }

    @Override
    public Integer get(Object key) {
        if(super.get(key) == null) return 0;
        return super.get(key);
    }

    @Override
    public Integer put(String key, Integer value) {
        boolean isSubject = false;
        for(int i = 0; i< KEYS.length; i++) {
            if(key.equals(KEYS[i])) {
                isSubject = true;
                return super.put(key, value);
            }
        }
        try {
            throw new Exception("없는 과목 입력");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
