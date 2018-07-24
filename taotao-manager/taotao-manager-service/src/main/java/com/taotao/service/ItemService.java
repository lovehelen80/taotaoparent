package com.taotao.service;

import com.taotao.pojo.TbItem;

public interface ItemService {
    //获取商品实体
    TbItem getItemById(Long itemId);
}

