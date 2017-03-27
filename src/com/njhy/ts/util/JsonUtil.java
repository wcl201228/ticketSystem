package com.njhy.ts.util;




import net.sf.json.JSONObject;

public class JsonUtil
{
    
  /*  public static Object toBean(String json, Class beanClass)
    {
        JSONObject jsonObject = JSONObject.fromObject(json);
        Object bean = JSONObject.toBean(jsonObject, beanClass);
        return bean;
        
    }
    */
    public static String toJSON(Object bean)
    {
        JSONObject jsonObject = JSONObject.fromObject(bean);
        String json = jsonObject.toString();
        return json;
    }

  /*  public static List toList(String json, Class beanClass)
    {
        JSONArray jsonObject = JSONArray.fromObject(json);
        List bean = JSONArray.toList(jsonObject, beanClass);
        return bean;
        
    }*/
    
    
  /*  public static String toJSON(List bean)
    {
        JSONArray jsonObject = JSONArray.fromObject(bean);
        String json = jsonObject.toString();
        return json;
    }*/
    
   
    
   
    
}
