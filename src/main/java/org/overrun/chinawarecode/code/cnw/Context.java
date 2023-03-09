package org.overrun.chinawarecode.code.cnw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author baka4n
 * @since 上下文回调
 */
public class Context {
    private final StringTokenizer stringTokenizer;
    private String token;
    private final Map<String, Object> map = new HashMap<>();

    /**
     * @since 解析内容
     * @param text 文本内容
     */
    public Context(String text) {
        stringTokenizer = new StringTokenizer(text);
    }

    /**
     * @since 解析文本
     * @return 返回token
     */
    public String next() {
        if (stringTokenizer.hasMoreTokens()) {
            token = stringTokenizer.nextToken();
        } else {
            token = null;
        }
        return token;
    }

    /**
     * @since 解析token的匹配
     * @param tk 输入token匹配
     * @return true and false
     */
    public boolean equalsWithCommand(String tk) {
        if (tk == null || !tk.equals(token)) {
            return false;
        }
        return true;
    }

    /**
     * @since 获取token内容
     * @return token
     */
    public String getToken() {
        return token;
    }

    public String getTokenContent(String text) {
        String str = text;
        if (str != null) {
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Object obj = map.get(key);
                str = str.replaceAll(key, obj.toString());
            }
        }
        return str;
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public void clear(String key) {
        map.remove(key);
    }
}
