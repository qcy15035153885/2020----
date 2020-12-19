package com.example.myapplication06.bean;

import com.example.myapplication06.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "游戏本手提", "电脑超薄全金属独显", "超薄微边框全金属学生", "电脑四核I7-8559u超薄", "电脑学生RTX2060", "游戏本GTX1650独显","学生游戏本i7-1065G","i5/i7吃鸡游戏本"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "【高配酷睿I7】I7-6700HQ办公用金属游戏本手提商务",
            "【高配十代酷睿i7】2020年新款笔记本电脑超薄全金属独显游戏本",
            "【指纹解锁】2020年新款超薄微边框全金属学生女生款14英寸游戏本",
            "【18万跑分】2020年新款笔记本电脑四核I7-8559u超薄全金属独显高配",
            "【十代酷睿i5+6G独显】2020年新款笔记本电脑学生RTX2060",
            "【十代酷睿i5+30万跑分】笔记本电脑轻薄便携学生游戏本高配GTX1650独显",
            "【十代高配酷睿i7】2020年新款笔记本电脑轻薄便携学生游戏本i7-1065G",
            "Hasee/神舟 战神 Z7 i5/i7吃鸡游戏本GTX独显学生笔记本电脑办公"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {3256, 1365, 2745, 3885, 2854, 3654,1357,2484};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.computer1,R.drawable.computer2, R.drawable.computer3,
            R.drawable.computer4, R.drawable.computer5, R.drawable.computer6,
            R.drawable.computer7,R.drawable.computer8

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.computer1_s, R.drawable.computer2_s, R.drawable.computer3_s,
            R.drawable.computer4_s, R.drawable.computer5_s, R.drawable.computer6_s,
            R.drawable.computer7_s,R.drawable.computer8_s
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
