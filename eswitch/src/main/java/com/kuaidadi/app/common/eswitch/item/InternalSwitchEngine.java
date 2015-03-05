package com.kuaidadi.app.common.eswitch.item;

import java.util.Map;

import com.kuaidadi.app.common.eswitch.Item.ItemNotFoundException;
import com.kuaidadi.app.common.eswitch.SwitchEngine;

/**
 * 内部 SwitchEngine 类
 * 
 * @author chenke
 */
public interface InternalSwitchEngine extends SwitchEngine {

    /**
     * 注册.
     */
    void register();

    /**
     * 注销.
     */
    void unregister();

    /**
     * 重新加载远程服务器的开关项
     */
    void reload();

    /**
     * 设置应用名
     * 
     * @param application
     */
    void setApplication(String application);

    /**
     * 获取所有开关项.
     * 
     * @return
     */
    Map<String, InternalItem> getItems();

    /**
     * 获取开关项.
     * 
     * @param name 开关项名
     * @return
     */
    InternalItem getItem(String name) throws ItemNotFoundException;

    /**
     * 保存开关项
     * 
     * @param name
     * @param item
     */
    void setItem(String name, InternalItem item);
}
